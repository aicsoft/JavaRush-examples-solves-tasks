package com.example.javamy.Core.level13;

public class level13_lekciya11_nom26_SimpleObject {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

  static class StringObject implements SimpleObject<String>  {

      @Override
      public SimpleObject<String> getInstance() {
          return null;
      }
  }

}
