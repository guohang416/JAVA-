package com.hangguo.create;

import com.hangguo.role.Person;
import com.hangguo.sence.Room;

import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class CreatePerson {
    public Person getPerson(List<Room> rooms){
        System.out.println("请输入你的姓名和id(例如:郭航:201701000):");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] words = line.split(":");
        Person person = new Person(words[0],words[1],20);
        person.setInitialRoom(rooms.get(0));//将第一个房间设置为初始化房间
        System.out.println("你现在的位置是:"+person.getInitialRoom().toString());
        System.out.println("出口有："+person.getInitialRoom().getDirection());
        return person;
    }


}
