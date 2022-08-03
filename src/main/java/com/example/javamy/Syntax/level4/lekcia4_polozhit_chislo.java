package com.example.javamy.Syntax.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lekcia4_polozhit_chislo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String cifr_simvol= reader.readLine();
        int cifr1 = Integer.parseInt(reader.readLine());
        int cifr2 = Integer.parseInt(reader.readLine());
        int cifr3 = Integer.parseInt(reader.readLine());
//        int a=0; int b=0;int  c=0; int summa=0, minus_summa=0;
        int a=0, b=0, aa=0, bb=0,cc=0, c=0, summa=0, minus_summa=0;
        if (cifr1 >0)  {   a++;   }
        if (cifr2 >0)  {   b++;   }
        if (cifr3 >0)  {   c++;   }
        if (cifr1 <0)  {   aa++;   }
        if (cifr2 <0)  {   bb++;   }
        if (cifr3 <0)  {   cc++;   }
        summa = a+b+c;
        minus_summa= aa+bb+cc;
        System.out.println("количество положительных чисел: "+summa);
        System.out.println("количество отрицательных чисел: "+minus_summa);

/*
summa = a+b+c;
        System.out.println(summa);
*/

 /*       if ((cifr1>0)&&(cifr2>0) && (cifr3>0)){ System.out.println(3);}
        if ((cifr1>0)&&(cifr2<0) && (cifr3>0)){ System.out.println(2);}
        if ((cifr1>0)&&(cifr2>0) && (cifr3<0)){ System.out.println(2);}

        if ((cifr1<0)&&(cifr2>0) && (cifr3>0)){ System.out.println(2);}
        if ((cifr1<0)&&(cifr2>0) && (cifr3>0)){ System.out.println(3);}
        if ((cifr1>0)&&(cifr2>0) && (cifr3>0)){ System.out.println(3);}

        if ((cifr1>0)&&(cifr2>0) && (cifr3>0)){ System.out.println(3);}
        if ((cifr1>0)&&(cifr2>0) && (cifr3>0)){ System.out.println(3);}
        if ((cifr1>0)&&(cifr2>0) && (cifr3>0)){ System.out.println(3);}*/
    }

}
