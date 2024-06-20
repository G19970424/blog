package cn.com.blog.service.base.impl.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gejj
 * @version 1.0
 * @create 2024年06月20日 16:00
 */
public class Permission implements Serializable {

    private static final long serialVersionUID = -8235559251827773344L;

    private int id;
    private String text;
    private String href;
    private int pid;
    private List<Permission> nodes = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getHref() {
        return href;
    }

    public int getPid() {
        return pid;
    }

    public List<Permission> getNodes() {
        return nodes;
    }
}
