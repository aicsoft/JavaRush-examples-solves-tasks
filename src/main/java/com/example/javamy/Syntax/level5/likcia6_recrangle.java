package com.example.javamy.Syntax.level5;

public class likcia6_recrangle {
    class Rectangle{
        int top, width, left, height;

        public void initialize(int top, int left, int width, int height){
            this.top=top;
            this.left=left;
            this.width=width;
            this.height=height;
        }

        public void initialize(int top, int left){
            this.top=top;
            this.left=left;
            this.width=0;
            this.height=0;
        }

        public void initialize(int top, int left, int width){
            this.top=top;
            this.left=left;
            this.width=width;
            this.height=this.width;
        }

        public void initialize(Rectangle rectangle){
            this.top= rectangle.top;
            this.left=rectangle.left;
            this.width=rectangle.width;
            this.height=rectangle.height;
        }




    }


}
