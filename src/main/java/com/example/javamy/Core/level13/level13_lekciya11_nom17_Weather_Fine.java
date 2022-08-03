package com.example.javamy.Core.level13;

public class level13_lekciya11_nom17_Weather_Fine {
    public static void main(String[] args) {

     //   System.out.println(new Today(WeatherType.CLOUDY));
      //  System.out.println(new Today(WeatherType.FOGGY));
      //  System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today /*implements  Weather*/ {
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }

        public String getWeatherType(){return type;}

        interface Weather{

            String getWeatherType();
        }
    }

}























