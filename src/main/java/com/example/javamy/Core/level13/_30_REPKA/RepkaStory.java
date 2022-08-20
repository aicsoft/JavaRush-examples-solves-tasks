package com.example.javamy.Core.level13._30_REPKA;


import java.util.ArrayList;
import java.util.List;

public class RepkaStory {
    static void tell(ArrayList<Person> items) {
        Person first;
        Person second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i - 1);
            second = items.get(i);
            second.pull(first);
        }
    }
}

