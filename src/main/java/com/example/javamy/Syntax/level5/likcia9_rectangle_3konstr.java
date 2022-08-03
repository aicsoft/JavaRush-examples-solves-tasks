package com.example.javamy.Syntax.level5;

public class likcia9_rectangle_3konstr {
    class Rectangle{
        int top, width, left, height;

        public Rectangle(int top, int left, int width, int height){
            this.top=top;
            this.left=left;
            this.width=width;
            this.height=height;
        }

        public Rectangle(int top, int left){
            this.top=top;
            this.left=left;
            this.width=0;
            this.height=0;
        }

        public Rectangle(int top, int left, int width){
            this.top=top;
            this.left=left;
            this.width=width;
            this.height=this.width;
        }

        public Rectangle(Rectangle rectangle){
            this.top= rectangle.top;
            this.left=rectangle.left;
            this.width=rectangle.width;
            this.height=rectangle.height;
        }




    }
}
