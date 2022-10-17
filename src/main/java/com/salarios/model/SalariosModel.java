package com.salarios.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;


public class SalariosModel {
   

     public static void LerArquivo(String path) throws IOException {
        File arquivo = new File(path);
        arquivo.createNewFile();
        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        
        
        ArrayList<String> salarios = new ArrayList<>();
        Scanner in = new Scanner(new FileReader(path));

        while (in.hasNextLine()) 
        {
            String line = in.nextLine();
            //System.out.println(line);
            String array[] = line.split(" ");

            salarios.addAll(Arrays.asList(array));
           
        }
// System.out.println(salarios);
    }

  
    
   
}