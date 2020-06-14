package com.hangguo.sence;

import java.util.HashMap;

/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class Room {
    //房间属性
    private String id;
    private String name;
    private String direction;
    //房间集合
    private HashMap<String, Room> exits = new HashMap<>();

    //构造方法和get set方法
    public Room() {
        super();
    }

    public Room(String id, String name) {
        super();
        this.id = id;
        this.name = name;
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

    //设置出口
    public void setExits(String dir,Room room) {
        exits.put(dir, room);
    }

    //覆盖方法，便于打印房间信息
    @Override
    public String toString() {
        return "房间号为：" + id + ", "+"房间名为：" + name ;
    }

    //获取方向
    public String getDirection() {
        StringBuffer sb=new StringBuffer();
        for(String dir:exits.keySet()) {
            sb.append(dir);
            sb.append(" ");
        }
        return sb.toString();
    }
}

