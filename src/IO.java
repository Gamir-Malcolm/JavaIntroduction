/* Session on 3rd Feb 2021 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class IO {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name --> ");

        try{ //use for handling users entering wrong type of data
            String name = sc.next(); //reading data entered by user
            FileOutputStream fileoutputStream = new FileOutputStream("names"); //creating instance of file
            BufferedOutputStream bufferedStream = new BufferedOutputStream(fileoutputStream); //enhances performance

            byte[] b = name.getBytes();

            bufferedStream.write(b);
            bufferedStream.flush(); //clears buffered file stream
            bufferedStream.close();
            fileoutputStream.close();

            System.out.println("Success in writing to file!");

            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("names")); //same as lines 16 & 17
            int i;

            while((i = inputStream.read()) != -1){
                System.out.println((char)i);
            }
            inputStream.close();

        } catch(Exception ex) {
            System.out.println(ex);
        }


    }
}
