import java.io.File;

public class App {
         public static void main(String[] args) throws Exception {
            FileTasks fileEd = new FileTasks();
            File file = new File("nameHolder.txt");
            if (file.isFile()){
                 System.out.println("Name file exists");
            } else {
               fileEd.CreateFile("nameHolder.txt");
               }
            fileEd.enterName();
            fileEd.nameCheck();
         }
}
