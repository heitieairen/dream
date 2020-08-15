package com.grizz.dream.common;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GCITFEOD008
 * @date 2020-08-16 01:46
 */
public class Inspiration {

    /**
     * @author @GCITFEOD008
     * @description 冒泡排序 
     * @date 2020/8/16 1:48 
     * @param 
     * @return void
     **/
    @Test
    void bubbleSort(){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(7);
        list.add(6);
        list.add(8);
        System.out.println("排序前的当前顺序为" + list);
        for(int i = 0; i < list.size(); i++){
            for(int z = i+1; z<list.size(); z++){
                Integer obj1 = list.get(i);
                Integer obj2 = list.get(z);
                if(obj1 > obj2){
                    list.set(i, obj2);
                    list.set(z, obj1);
                }
            }
        }
        System.out.println("排序结束后的顺序为" + list);
    }


}
