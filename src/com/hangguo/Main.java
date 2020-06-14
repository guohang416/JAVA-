package com.hangguo;



import com.hangguo.create.CrateMonster;
import com.hangguo.create.CreateHealthPotion;
import com.hangguo.create.CreatePerson;
import com.hangguo.create.CreateRoom;
import com.hangguo.role.Monster;
import com.hangguo.role.Person;
import com.hangguo.sence.HealthPotion;
import com.hangguo.sence.Room;
import com.hangguo.sence.Scene;
import com.hangguo.utils.*;

import java.util.List;

/**
 * @description: 有5个妖怪和一个人物进行大战，细节如information中信息所示
 */
public class Main {
    public static void main(String[] args) {
        //制造房间
        CreateRoom createRoom = new CreateRoom();
        List<Room> rooms = createRoom.getRooms();
        //创建一个人物
        CreatePerson createPerson = new CreatePerson();
        Person person = createPerson.getPerson(rooms);
        //创建妖怪
        CrateMonster crateMonster = new CrateMonster();
        Monster monster = crateMonster.getMonster(rooms);

        //创建血瓶
        CreateHealthPotion createHealthPotion = new CreateHealthPotion();
        HealthPotion healthPotion = createHealthPotion.getHealthPotion(rooms);

        //创建场景
        Scene scene = new Scene(person,monster,healthPotion);

        //判断游戏是否继续进行
        while (JudeIsOver.judeIsOver(scene)){
            Play.play(scene,rooms);
        }

        //游戏结束
        System.out.println("感谢您的光临。再见！");
    }
}
