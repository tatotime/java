import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;

import java.io.IOException;
public class Second {
    static boolean isVerify;
    public static void main(String[] args){
        System.out.println("New Work Schedule Manager!");
        System.out.println("First, Enter your name, then whether u want to check or update your Work Schedule!");
        File f = new File("nameHolder.txt");
        try {
            if (f.createNewFile()){
                System.out.println("Name Holding File Created");
            }
            else{
                System.out.println("Name File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error has occurred with creating a name file.");
            e.printStackTrace();
        }
        Scanner nameAcceptor = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = nameAcceptor.nextLine();
        try {
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                if (data == name) {
                    System.out.println("Verified");
                    myReader.close();
                    Second.isVerify = true;
                    nameAcceptor.close();
                    myReader.close();
                }
                continue;
            }
                }
                catch (FileNotFoundException e) {
                    System.out.println("An error occurred with the reader.");
                    e.printStackTrace();
                }
        if (Second.isVerify == true){
            Scanner checkOrUpdate = new Scanner(System.in);
            System.out.println("Check or Update?");
            String cN = checkOrUpdate.nextLine();
            if (cN != "Update"){
                
            }
            
        }
    public void Cry(){
        System.out.println("SOBBING!!!!!!!");
    }
}