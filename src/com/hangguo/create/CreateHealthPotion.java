package com.hangguo.create;

import com.hangguo.sence.HealthPotion;
import com.hangguo.sence.Room;

import java.util.List;

/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class CreateHealthPotion {
    public HealthPotion getHealthPotion(List<Room> rooms){
        HealthPotion hp = new HealthPotion(0);
        hp.appear(rooms);
        return hp;
    }
}
