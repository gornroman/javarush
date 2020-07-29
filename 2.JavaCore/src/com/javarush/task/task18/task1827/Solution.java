package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length > 0)
        {
            if (args[0].equals("-c") && args.length == 4)
            {
                BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
                String filename = name.readLine();
                name.close();
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
                String line = reader.readLine();
                int max_id = 0;
                while (line != null)
                {
                    String temp = line.substring(0, 8).trim();
                    if (Integer.parseInt(temp) > max_id)
                    {
                        max_id = Integer.parseInt(temp);
                    }
                    line = reader.readLine();
                }
                reader.close();
                String id = Integer.toString(max_id + 1);
                while (id.length() < 8)
                    id += ' ';
                String productName = args[1];
                if(productName.length() > 30) productName = productName.substring(0, 30);
                while (productName.length() < 30)
                    productName += ' ';
                String price = args[2];
                if(price.length() > 8) price = price.substring(0, 8);
                while (price.length() < 8)
                    price += ' ';
                String quantity = args[3];
                if(quantity.length() > 4) quantity = quantity.substring(0, 4);
                while (quantity.length() < 4)
                    quantity += ' ';
                writer.write("\n"+id+productName+price+quantity);
                writer.close();
            }
        }
    }
}
