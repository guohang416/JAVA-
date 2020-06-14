package com.hangguo.utils;

import com.hangguo.role.Monster;
import com.hangguo.role.Person;
import com.hangguo.sence.Scene;


/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class JudeIsOver {
    public static Boolean judeIsOver(Scene scene){
        Person person = scene.getPerson();
        Monster monster = scene.getMonster();
        if(person.getLifeValue() <= 0 &&monster.getLifeValue() > 0) {
            System.out.println("你赢了！");
            return false;
        }
        else if(monster.getLifeValue() <= 0 && person.getLifeValue() > 0) {
            System.out.println("你输了！");
            return false;
        }else {
            return true;
        }
    }


}
