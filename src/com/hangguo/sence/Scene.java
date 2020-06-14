package com.hangguo.sence;

import com.hangguo.role.Monster;
import com.hangguo.role.Person;

/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class Scene {
    //场景中的组成部分
    private Person person;
    private Monster monster;
    private HealthPotion hp;
    //提供构造方法和get set方法
    public Scene(Person person, Monster monster, HealthPotion hp) {
        this.person = person;
        this.monster = monster;
        this.hp = hp;
    }

    public Scene() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public HealthPotion getHp() {
        return hp;
    }

    public void setHp(HealthPotion hp) {
        this.hp = hp;
    }

}
