package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length > 0)
        {
            BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
            String filename = name.readLine();
            name.close();
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            String line = reader.readLine();
            ArrayList<String> array = new ArrayList<String>();
//            int max_id = 0;
            while (line != null)
            {
                String currentId = line.substring(0, 8).trim();
                String argsId = args[1].trim();
                if (Integer.parseInt(currentId) == Integer.parseInt(argsId))
                {
                    if (args[0].equals("-u"))
                    {
                        String id = currentId;
                        while (id.length() < 8)
                            id += ' ';
                        String productName = args[2];
                        if(productName.length() > 30) productName = productName.substring(0, 30);
                        while (productName.length() < 30)
                            productName += ' ';
                        String price = args[3];
                        if(price.length() > 8) price = price.substring(0, 8);
                        while (price.length() < 8)
                            price += ' ';
                        String quantity = args[4];
                        if(quantity.length() > 4) quantity = quantity.substring(0, 4);
                        while (quantity.length() < 4)
                            quantity += ' ';
                        array.add(id+productName+price+quantity+"\n");
                    }
                }
                else
                {
                    array.add(line+"\n");
                }
                line = reader.readLine();
            }
            reader.close();
            for (int i = 0; i < array.size(); i++)
                writer.write(array.get(i));
//                writer.write("\n"+id+productName+price+quantity);
            writer.close();
        }
    }
}
