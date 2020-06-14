package com.hangguo.role;

import com.hangguo.sence.HealthPotion;
import com.hangguo.sence.Room;

/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class Person extends Role{
    //人拥有房间,初始化房间
    private Room initialRoom;

    //提供构造方法和get和set方法
    public Person(Room initialRoom) {
        this.initialRoom = initialRoom;
    }

    public Person(String id, String name, int lifeValue) {
        super(id, name, lifeValue);
    }

    public Room getInitialRoom() {
        return initialRoom;
    }

    public void setInitialRoom(Room initialRoom) {
        this.initialRoom = initialRoom;
    }

    //走房间
    public void walkRoom(String id){
        //Room nextRoom = initialRoom.getRoom(dir);
    }

    //覆盖toString方法显示人物信息
    @Override
    public String toString() {
        return "你的id为:" + getId() + ", 姓名为:" + getName() + ", 生命值为:" + getLifeValue() ;
    }

    //人对怪物的伤害行为（砍怪）
    public void chopMonster(Monster monster) {
        int lifeValue=monster.getLifeValue()-10;
        monster.setLifeValue(lifeValue);
    }

    //人物打血
    public void drinkHealthPotion(Person person, HealthPotion hp) {
        int lifeValue=person.getLifeValue()+20;
        if(lifeValue > 100) {
            person.setLifeValue(100);
            System.out.println("你喝了血瓶，已恢复满血，生命值+"+(120-lifeValue));
        }
        else {
            person.setLifeValue(lifeValue);
            System.out.println("你喝了血瓶，生命值+20");
        }
        hp.setInit(false);
    }


}
