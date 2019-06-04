package com.zxf.demo.service;

import java.util.HashMap;
import java.util.Iterator;

public class TestSet {
    public  static void main(String[]args){
        HashMap<String,String> stringSet = new HashMap<String,String>();
        String a = "a";
        String b = "a";
        stringSet.put(a,"1");
        stringSet.put(b,"2");
        stringSet.put("c","2");
        stringSet.put("b","3");

        Iterator<String> it = stringSet.keySet().iterator();
        while (it.hasNext()){
            String k = it.next();
            String v = stringSet.get(k);

              // it.remove();


            System.out.println(k+v);
        }
    }
}
