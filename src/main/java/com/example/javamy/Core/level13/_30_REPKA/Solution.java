package com.example.javamy.Core.level13._30_REPKA;

import java.util.ArrayList;
import java.util.List;

/*
Репка
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}

