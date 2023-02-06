
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;


public class FileTasks {
    String name;
    boolean verify;
    public void CreateFile(String fileName){
        File f = new File(fileName);
        try {
            if (f.createNewFile()) {
                System.out.println("A new file has been created.");
            }
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
    public void enterName(){
        Scanner userNameScanner = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = userNameScanner.nextLine();
        userNameScanner.close();
        this.WriteToFile("nameHolder.txt", name);
    }
    public void nameCheck(){
        try {
            File f = new File("nameHolder.txt");
            Scanner readScanner = new Scanner(f);
            while (readScanner.hasNextLine()){
                String data = readScanner.nextLine();
                if (data.equals(name)){
                    System.out.println("Verified");
                    verify = true;
                    readScanner.close();
                    break;
                }
            }
            if (verify == false) {
                System.out.println("New user detected.");
                this.WriteToFile("nameHolder.txt", name);
            } 
        } catch (FileNotFoundException e){
        System.out.println("This file does not exist");
        e.printStackTrace();
    }
}
    public void schedOverview(){
                File file = new File("Schedule.txt");
                if (file.exists());
                    System.out.println("Do you want to update, check, or clear your schedule?");
                    Scanner schedScanner = new Scanner(System.in);
                    String updateOrCheckt = schedScanner.nextLine();
                    String updateOrCheck = updateOrCheckt.toLowerCase();
                    if (updateOrCheck.equals("update")){
                        this.UpdateSched("Schedule.txt");
                    } else if (updateOrCheck.equals("check")) {
                        this.CheckSched("Schedule.txt");
                    } else if (updateOrCheck.equals("clear")) {
                        this.ClearSched("Schedule.txt");
                    } else {
                        System.out.println("an error occurred with the schedule handling");
                    }
                    schedScanner.close();
 
            }
    public void WriteToFile(String fileName, String x){
        try{
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(x);
            System.out.println("Successfully wrote to name file.");
            myWriter.close();
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void MakeNewSched(String fileName){
        File f = new File(fileName);
        try {
            if (f.createNewFile()) {
                System.out.println("A new schedule file has been created.");
            }
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
    public void UpdateSched(String fileName){
        try {
            FileWriter myWriter2 = new FileWriter(fileName);
            Scanner myScanner = new Scanner(System.in);
            for (int i = 6; i<0; i--);
                System.out.println("Please input Work hours");
                String x = myScanner.nextLine();
                myWriter2.write(x);
                System.out.println("Successfully wrote to file.");
            myScanner.close();
            myWriter2.close();
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void ClearSched(String fileName){
        File myObj = new File(fileName); 
        if (myObj.delete()) { 
        System.out.println("Deleted the file: " + myObj.getName());
        } else {
        System.out.println("Failed to delete the file.");
        }
    }
    public void CheckSched(String fileName){
        File f = new File(fileName);
        try {
            Scanner schedReadScanner = new Scanner(f);
            while (schedReadScanner.hasNextLine()){
                String schedule = schedReadScanner.nextLine();
                System.out.println(schedule);
            schedReadScanner.close();
    }
            } catch (IOException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
            }
        }
}
