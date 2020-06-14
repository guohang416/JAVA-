package com.hangguo.sence;

import com.hangguo.utils.RandomUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:生命药水
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class HealthPotion {
    //血瓶属性
    private int id;
    private boolean init = true;
    private Room appearRoom;//出现的房间
    //构造方法和get set 方法
    public HealthPotion(int id) {
        this.id = id;
    }

    public HealthPotion(int id, boolean init, Room appearRoom) {
        this.id = id;
        this.init = init;
        this.appearRoom = appearRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isInit() {
        return init;
    }

    public void setInit(boolean init) {
        this.init = init;
    }

    public Room getAppearRoom() {
        return appearRoom;
    }

    public void setAppearRoom(Room appearRoom) {
        this.appearRoom = appearRoom;
    }

    //便于打印血瓶的信息
    @Override
    public String toString() {
        return "血瓶的id为："+id+"\t血瓶出现的房间为："+appearRoom;
    }

    //设置血瓶出现的房间
    public void appear(List<Room> list) {
        Room room = new Room();
        this.appearRoom = list.get(RandomUtil.getInteger1_5()-1);
    }
}
