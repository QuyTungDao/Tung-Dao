package java_23_5_2024;

import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
           /* FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\test.txt");
            int i = 0;
            while((i = fis.read()) !=-1){
                System.out.print((char)i);
            }
            fis.close();*/

            /*FileInputStream a = new FileInputStream("C:\\Users\\Admin\\Downloads\\Untitled.png");
            FileOutputStream b = new FileOutputStream("C:\\Users\\Admin\\Desktop\\test.png");
            int i = 0;
            while((i = a.read()) != -1) {
                b.write(i);
            }

            a.close();
            b.close();*/

            /*FileReader fileReader = new FileReader("C:\\Users\\Admin\\Desktop\\list-img.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();*/

            String imagePath = "https://hoanghamobile.com/tin-tuc/wp-content/uploads/2023/07/anh-dep-thien-nhien-2-1.jpg";
            URL url = new URL(imagePath);

            BufferedInputStream in = new BufferedInputStream(url.openStream());
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Admin\\Desktop\\test1.jpg");
            int i = 0 ;
            while ((i = in.read()) != -1) {
                fileOutputStream.write(i);
            }
            fileOutputStream.flush();

            in.close();
            fileOutputStream.close();



        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
