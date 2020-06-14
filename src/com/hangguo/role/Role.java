package com.hangguo.role;

/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */

public class Role {
    //定义角色属性
    private String id;
    private String name;
    private int lifeValue;
    //提供有参无参构造方法以及get和set方法

    public Role() {
    }

    public Role(String id, String name, int lifeValue) {
        this.id = id;
        this.name = name;
        this.lifeValue = lifeValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        this.lifeValue = lifeValue;
    }
}
