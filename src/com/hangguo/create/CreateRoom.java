package com.hangguo.create;

import com.hangguo.sence.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class CreateRoom {
    Room live, lobby, pub, study, bedroom;
    public List<Room> getRooms(){
        List<Room> list = new ArrayList<>();
        //	制造房间
        live = new Room("101","客厅");
        lobby= new Room("102","大堂");
        pub = new Room("103","小酒吧");
        study = new Room("104","书房");
        bedroom = new Room("105","卧室");

        //	初始化房间的出口
        live.setExits("east",lobby);
        live.setExits("south",study);
        live.setExits("west",pub);
        lobby.setExits("west",live);
        pub.setExits("east",live);
        study.setExits("north", live);
        study.setExits("east",bedroom);
        bedroom.setExits("west", study);

        //添加到集合中
        list.add(live);
        list.add(lobby);
        list.add(pub);
        list.add(study);
        list.add(bedroom);

        return list;
    }



}
