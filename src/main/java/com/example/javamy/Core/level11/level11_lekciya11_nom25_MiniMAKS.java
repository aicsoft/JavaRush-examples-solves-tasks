package com.example.javamy.Core.level11;

public class level11_lekciya11_nom25_MiniMAKS {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }
        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i; j < inputArray.length ; j++) {
                if (Min>inputArray[j]){
                    Min=inputArray[j];
                    }
                if (Max<inputArray[j]){
                    Max=inputArray[j];
                }
            }
        }


        // напишите тут ваш код

        return new Pair(Min, Max);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}


