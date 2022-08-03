package com.example.javamy.Core.level12;

public class level12_lekciya12_nom35_Izomorfy {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //напишите тут ваш код
        int MAX= Integer.MIN_VALUE;
        int indexMax =0;
        int MIN= Integer.MAX_VALUE;
        int indexMin =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
        //        if(array[i]>  array[j]){  int max = array[i]; array[i]= array[j]; array[j] = max; }
                if (array[j]>MAX){  MAX = array[j];            }
                if (array[j]<MIN){  MIN = array[j];             }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == MAX){indexMax=i;}
            if (array[i] == MIN){indexMin=i;}

        }

        return new Pair<Integer, Integer>(MIN, indexMin);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}





