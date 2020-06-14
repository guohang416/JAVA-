package com.hangguo.utils;

import com.hangguo.role.Monster;
import com.hangguo.role.Person;
import com.hangguo.sence.HealthPotion;
import com.hangguo.sence.Room;
import com.hangguo.sence.Scene;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class Play {
    //记录回合数
    private static Integer rounds = 0;

    public static Boolean play(Scene scene, List<Room> rooms) {
        rounds++;
        Person person = scene.getPerson();
        Monster monster1 = scene.getMonster();
        HealthPotion hp = scene.getHp();
        Scanner in = new Scanner(System.in);
        System.out.println("第" + rounds + "回合");
        if (rounds % 3 == 0 || !hp.isInit()) {
            System.out.println("血瓶刷新了！！");
            hp.setId(rounds);
            hp.setInit(true);
            hp.appear(rooms);
        }
        if (person.getInitialRoom().equals(monster1.getBornRoom())) {
            System.out.println("不好了遇见怪物了！！");
            while (monster1.getLifeValue() > 0 && person.getLifeValue() > 0) {
                System.out.println("怪物的状态：" + monster1.toString());
                System.out.println("玩家的状态：" + person.toString());
                String information = hp.toString();
                System.out.println(information);
                System.out.println("请选择战斗/逃跑");
                String chose = in.nextLine();
                if (chose.equals("战斗")) {
                    System.out.println("战斗的方式有：砍/喝血瓶");
                    System.out.println("输入战斗的方式：");
                    String battleMethod = in.nextLine();
                    if (battleMethod.equals("砍")) {
                        person.chopMonster(monster1);
                        System.out.println("你砍了怪物，怪物血量-10");
                    } else if (battleMethod.equals("喝血瓶")) {
                        if (person.getInitialRoom().equals(hp.getAppearRoom())) {
                            person.drinkHealthPotion(person, hp);
                            hp.setId(rounds);
                            hp.setInit(true);
                            hp.appear(rooms);
                        } else {
                            System.out.println("这个房间没有血瓶");
                        }
                    }
                    Random ra = new Random();
                    int i = ra.nextInt(3);
                    if (i == 0) {
                        monster1.bitePerson(person);
                        System.out.println("怪物咬了你，生命值-20");
                    } else if (i == 1 || i == 2) {
                        monster1.catchPerson(person);
                        System.out.println("怪物抓了你，生命值-5");
                    }
                } else if (chose.equals("逃跑")) {
                    System.out.println("输入逃跑的方向：" + person.getInitialRoom().getDirection());
                    String dir = in.nextLine();
                    person.walkRoom(dir);
                    break;
                }
            }

        } else {
            person.toString();
            System.out.println("请输入你要去的方向");
            System.out.println("=================");
            String dir = in.nextLine();
            person.walkRoom(dir);
        }

        return false;
    }
}
