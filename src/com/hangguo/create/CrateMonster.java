package com.hangguo.create;

import com.hangguo.role.Monster;
import com.hangguo.sence.Room;
import com.hangguo.utils.RandomUtil;

import java.util.List;

/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class CrateMonster {
    public Monster getMonster(List<Room> rooms){
        Monster monster = new Monster("1","Monster1",20);
        Room bornRoom = new Room();
        bornRoom = rooms.get(RandomUtil.getInteger1_5()-1);
        monster.setBornRoom(bornRoom);
        return monster;
    }
}
