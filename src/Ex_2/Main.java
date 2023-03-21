//Створіть файл, запишіть у нього довільні дані та закрийте файл.
// Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.

package Ex_2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File myFile = new File("E:\\Java_Course\\IT Generation\\04_Java Professional\\Homework_3\\src\\Ex_2\\myFile.txt");
        try {
            PrintWriter out = new PrintWriter(myFile);
            out.println("Hello World !!!");
            out.print("777");
            out.close();
            FileReader in = new FileReader(myFile);
            BufferedReader bufferedReader = new BufferedReader(in);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}




