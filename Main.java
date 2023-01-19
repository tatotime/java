
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    boolean verify;
    String userName;
    
    public void UserCheck(){
        Scanner userChecker = new Scanner(System.in);
        System.out.println("Enter Name:");

        String userName = userChecker.nextLine();
        System.out.println(userName);
        this.ReadNameFile();
        if (f.exists()){
            
        }
        this.WriteToName();
        userChecker.close();
    }
    public void VerifyStatus(boolean verify){
        System.out.println("Verification Status: "+ verify);
    }
    public void CreateNameFile(){
        File f = new File("nameHolder.txt");
        try {
            if (f.createNewFile()){
            System.out.println("File Created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void ReadNameFile(){
        try {
            File f = new File("nameHolder.txt");
            Scanner Reader = new Scanner(f);
            while (Reader.hasNextLine()){
                String data = Reader.nextLine();
                if (data == userName){
                    System.out.println("Name Verified");
                    verify = true;
                    break;
                }
            if (verify != true){
                System.out.println("New name detected, would u like to create a new schedule?");
            }
            }
        Reader.close();
        } catch (IOException e) {
            System.out.println("The file could not be read.");
            e.printStackTrace();
        }
    }
    public boolean isVerify() {
        return verify;
    }
    public void setVerify(boolean verify) {
        this.verify = verify;
    }
    public void WriteToName(){
        try {
            FileWriter writer = new FileWriter("nameHolder.txt");
            writer.write(userName);
            System.out.println(userName + "Has been added to the file.");
            writer.close();
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        Main newRun = new Main();
        newRun.UserCheck();
        newRun.CreateNameFile();
    }
}
// An Attribute is a variable of a class