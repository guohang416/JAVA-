package com.hangguo.role;

import com.hangguo.sence.Room;

/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class Monster extends Role{
    //怪物的出生房间
    private Room bornRoom;
    //构造和get set方法
    public Room getBornRoom() {
        return bornRoom;
    }

    public void setBornRoom(Room bornRoom) {
        this.bornRoom = bornRoom;
    }

    public Monster(String id, String name, int lifeValue) {
        super(id, name, lifeValue);
    }

    //覆盖方法便于打印信息
    @Override
    public String toString() {
        return "怪物Id为：" + getId() + ", 名字为：" + getName() + ", 血量为：" + getLifeValue();
    }

    //怪物的对人的战斗行为
    public void bitePerson(Person person) {
        int lifeValue=person.getLifeValue()-20;
        person.setLifeValue(lifeValue);
    }
    public void catchPerson(Person person) {
        int lifeValue=person.getLifeValue()-5;
        person.setLifeValue(lifeValue);
    }
}
