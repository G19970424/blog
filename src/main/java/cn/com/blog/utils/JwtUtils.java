package cn.com.blog.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;

/**
 * @author gejj
 * @version 1.0
 * @create 2024年06月20日 16:31
 */
public class JwtUtils {
    public static final String TOKEN_HEADER="Authorization"; //token请求头
    public static final String TOKEN_PREFIX="Bearer";//token前缀
    public static final long EXPIRATION=60*60*1000; //token有效期
    public static final String SUBJECT="piconjo"; //签名主题
    public static final String HEADER_STRING="Passport"; //配置token在http heads中的键值
    public static final String APPSECRET_KEY="piconjo_secret"; //应用密钥
    public static final String ROLE_CLAIMS="role"; //角色权限声明

    //生成token
    public static String createToken(String username,String role){
        HashMap<String, Object> map = new HashMap<>();
        map.put(ROLE_CLAIMS,role);
        String token=Jwts.builder()
                .setSubject(username)
                .setClaims(map)
                .claim("username",username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRATION))
                .signWith(SignatureAlgorithm.HS512,APPSECRET_KEY)
                .compact();
        return token;
    }

    //校验token
    public static Claims checkJWT(String token){
        try{
            Claims claims = Jwts.parser().setSigningKey(APPSECRET_KEY).parseClaimsJws(token).getBody();
            return claims;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    //从Token中获取username
    public static String getUsername(String token){
        Claims claims = Jwts.parser().setSigningKey(APPSECRET_KEY).parseClaimsJws(token).getBody();
        return claims.get("username").toString();
    }

    //从Token中获取用户角色
    public static String getUserRole(String token){
        Claims claims = Jwts.parser().setSigningKey(APPSECRET_KEY).parseClaimsJws(token).getBody();
        return claims.get("role").toString();
    }

    //校验Token是否过期
    public static boolean isExpiration(String token){
        Claims claims = Jwts.parser().setSigningKey(APPSECRET_KEY).parseClaimsJws(token).getBody();
        return claims.getExpiration().before(new Date());
    }
}
