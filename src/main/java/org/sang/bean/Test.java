package org.sang.bean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test {


    public static void main(String[] args) {
         Integer  i =544;
         i.byteValue();
        System.out.println( ""+Integer.toBinaryString(i));
        Iterator<String>  iterator= Arrays.asList(Integer.toBinaryString(i).split("  ")).iterator();

        System.out.println(numOfEven(i));
        System.out.println(i>>1+1);
        System.out.println(fun(8));
    }



    private  static  Integer getOneNum(Integer  num){
        String  str=  Integer.toBinaryString(num);
        String[] arr= str.split("");


        return  null;
    }
    public static int numOfEven(int x) {
//递归必须要有基准，不然不会结束推进
        if(x==0){
            return 0;
        }else if(x%2 != 0){
            return numOfEven(x>>1) + 1;
        }else {	//可以用while减少遍历次数，也可以直接多几次遍历
/* while (x%2==0) {
x=x>>1;
}*/
            return numOfEven(x>>1);
        }
    }




    public static int fun(int m) {
        if (m < 2) {
            return 1;
        } else {
            System.out.println(m);
            return fun(m - 1) + fun(m - 2);
        }
    }
    }
