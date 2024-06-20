package cn.com.blog.common.result;

import cn.com.blog.common.enums.StatusEnum;

import java.util.Date;
import java.util.List;

/**
 * @author gejj
 * @version 1.0
 * @create 2024年06月20日 10:26
 */
public class Result<T> {

    private int code;
    private String message;
    private List<T> data;
    private boolean success;
    private Date date;

    public Result() {
    }

    public Result(StatusEnum code) {
        this.code = code.getCode();
        this.message = code.getValue();
        this.date = new Date();
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
        this.date = new Date();
    }

    public Result(StatusEnum code, List<T> data, boolean success) {
        this.code = code.getCode();
        this.message = code.getValue();
        this.data = data;
        this.success = success;
        this.date = new Date();
    }

    public Result(int code, String message, List<T> data, boolean success) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.success = success;
        this.date = new Date();
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public List<T> getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public Date getDate() {
        return date;
    }
}
