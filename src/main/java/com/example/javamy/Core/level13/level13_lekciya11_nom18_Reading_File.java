package com.example.javamy.Core.level13;

import java.io.*;
import java.util.Scanner;



// ЧТЕНИЕ ИЗ ФАЙЛА ПРИМЕР
// ТУТ много примеров https://rukovodstvo.net/posts/id_745/#scanner
public class level13_lekciya11_nom18_Reading_File {
   /* public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String way = reader.readLine();
        FileReader fileReader = new FileReader(way);
        Scanner scc = new Scanner(fileReader);
        StringBuilder sb = new StringBuilder();
        while ( scc.hasNextLine()){
          sb =  sb.append(scc.nextLine()).append("\n");

        }
        System.out.println(sb.toString());
        scc.close();
        reader.close();
        fileReader.close();


    }*/

    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String way = reader.readLine();
    FileInputStream fileReader = new FileInputStream(way);
  //  FileReader fileReader = new FileReader(way);
    Scanner scc = new Scanner(fileReader);
    StringBuilder sb = new StringBuilder();
        while ( scc.hasNextLine()){
        sb =  sb.append(scc.nextLine()).append("\n");

    }
        System.out.println(sb.toString());
        scc.close();
        reader.close();
       // fileReader.close();
}
}

/*

public class FileRead{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("/root/2/Files.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String name;
        String line;
        System.out.println("Print File "+f.getName()+"? y/n");
        name = br.readLine();
        if(name.equals("y"))
            while ((line = fin.readLine()) != null) System.out.println(line);
    }
}*/
