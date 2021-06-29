package com.company;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ghi {
    public static void main(String[]args)throws Exception{
        try {
            ArrayList<Nguoi>nguois=new ArrayList<Nguoi>();
            FileWriter fileWriter=new FileWriter("nguoi.txt");

            for (int i = 0; i <nguois.size() ; i++) {
                fileWriter.write(String.valueOf(nguois.get(i)));
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
