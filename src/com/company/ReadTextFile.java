package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadTextFile {
    public static void main(String[] args) {
        try{
            File dir = new File("Nguoi.txt");
            if(!dir.exists()){
            dir.mkdir();
            }
            File file=new File("Nguoi.txt");
            FileReader fileReader=new FileReader(file);

            BufferedReader reader=new BufferedReader(fileReader);

            String line=null;

            while ((line= reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        }catch (Exception e){
            System.out.println("Lỗi");
        }
    }
}
