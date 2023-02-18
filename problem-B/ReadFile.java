import java.io.*;
import java.util.Scanner;
import java.io.File;
class ReadFile{
public static void main(String[] args) throws IOException {
        //launch();

        File file = new File("text.txt");
        Scanner scanner = new Scanner(file);
        String[] arr = new String[1000];
        int counter = 0;

        while(scanner.hasNextLine()){
            arr[counter] = scanner.nextLine();
            counter++;
        }

        String[] result = new String[counter];

        for(int i = 0; i < counter; i++){
            result[i] = arr[i];
        }

        for (int i = 0; i < counter; i++) {
            System.out.println("[" + i + "]: " + result[i]);
        }




        
    }
}
