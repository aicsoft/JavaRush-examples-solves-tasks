package com.example.javamy.Syntax.VSE_VSE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort_trex_chisel {

    public static void main(String[] args) throws IOException {


    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());


        if ((a>=b)&&(a>=c)&&(b>=c)) {
            System.out.print(a + " "+b+" "+ c); }

        else if ((a>=b)&&(a>=c)&&(b<=c)) {
            System.out.print(a + " "+c+" "+ b);}

        else if ((b>=a)&&(b>=c)&&(a>=c)) {
            System.out.print(b + " "+a+" "+ c); }

        else if ((b>=a)&&(b>=c)&&(a<=c)) {
            System.out.print(b + " "+c+" "+ a);}

        else if ((c>=b)&&(c>=a)&&(a>=b)) {
            System.out.print(c + " "+a+" "+ b); }

        else if ((c>=b)&&(c>=a)&&(a<=b)) {
            System.out.print(c + " "+b+" "+ a);}

/*    if ((a<b)&&(a<c)&&(b<c)) {
             System.out.print(a + " "+b+" "+ c); }

    else if ((a<b)&&(a<c)&&(b>c)) {
            System.out.print(a + " "+c+" "+ b);}

    else if ((b<a)&&(b<c)&&(a<c)) {
            System.out.print(b + " "+a+" "+ c); }

    else if ((b<a)&&(b<c)&&(a>c)) {
            System.out.print(b + " "+c+" "+ a);}

    else if ((c<b)&&(c<a)&&(a<b)) {
            System.out.print(c + " "+a+" "+ b); }

    else if ((c<b)&&(c<a)&&(a>b)) {
            System.out.print(c + " "+b+" "+ a);}*/

    }
}