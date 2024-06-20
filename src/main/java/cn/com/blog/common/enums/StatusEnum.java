package cn.com.blog.common.enums;

/**
 * @author gejj
 * @version 1.0
 * @create 2024年06月20日 10:30
 */
public enum StatusEnum {
    SUCCESS(200,"成功"),
    FAIL(400,"失败")
    ;

    private int code;
    private String value;

    StatusEnum(int code,String value){
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
