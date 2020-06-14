package com.hangguo.utils;

import java.util.Random;

/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class RandomUtil {
    //私有化方法为类所有,获取0-1之间的随机数
    public static Integer getInteger0_1(){
        Random random = new Random();
        int i = random.nextInt(2)%(1-0+1)+0;//
        return i;
    }
    //私有化方法获取1-5之间的随机数
    public static Integer getInteger1_5(){
        Random random = new Random();
        int i = random.nextInt(5)%(5-0+1)+1;//
        return i;
    }
}
