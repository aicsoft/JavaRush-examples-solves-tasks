package com.example.javamy.Syntax.level8;

import java.util.HashSet;
import java.util.Set;

public class level8_lekcia3_set_hashset {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.size();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        for (String str:set){
            System.out.println(str);
        }
        System.out.println(set.size());
    }
}
