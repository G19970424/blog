package cn.com.blog.common.result;

import cn.com.blog.common.enums.StatusEnum;

import java.util.List;

/**
 * @author gejj
 * @version 1.0
 * @create 2024年06月20日 10:28
 */
public class ResultApi {

    public static Result ok(){
        return new Result(StatusEnum.SUCCESS);
    }
    public static Result ok(List<Object> data){
        return new Result(StatusEnum.SUCCESS,data,true);
    }

    public static Result fail(){
        return new Result(StatusEnum.FAIL);
    }

}
