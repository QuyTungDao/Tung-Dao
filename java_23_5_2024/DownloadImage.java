    package java_23_5_2024;

    import java.io.*;
    import java.net.URL;

    public class DownloadImage {

        public static void DownloadImageJPG(String src, int count) {
            try{
                URL url = new URL(src);
                BufferedInputStream bis = new BufferedInputStream(url.openStream());
                FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\abc\\"+count+" Anh.jpg");
                int i = 0;

                while ((i = bis.read()) != -1) {
                    fos.write(i);
                }
                fos.flush();
                fos.close();
                bis.close();
            }catch (Exception e){
                System.out.println("Failed to download image");
            }
        }

        public static void DownloadImageJPEG(String src, int count) {
            try{
                URL url = new URL(src);
                BufferedInputStream bis = new BufferedInputStream(url.openStream());
                FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\abc\\"+count+" Anh.jpeg");
                int i = 0;

                while ((i = bis.read()) != -1) {
                    fos.write(i);
                }
                fos.flush();
                fos.close();
                bis.close();
            }catch (Exception e){
                System.out.println("Failed to download image");
            }
        }

        public static void DownloadImageSVG(String src, int count) {
            try{
                URL url = new URL(src);
                BufferedInputStream bis = new BufferedInputStream(url.openStream());
                FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\abc\\"+count+" Anh.svg");
                int i = 0;

                while ((i = bis.read()) != -1) {
                    fos.write(i);
                }
                fos.flush();
                fos.close();
                bis.close();
            }catch (Exception e){
                System.out.println("Failed to download image");
            }
        }

        public static void DownloadImageGIF(String src, int count) {
            try{
                URL url = new URL(src);
                BufferedInputStream bis = new BufferedInputStream(url.openStream());
                FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\abc\\"+count+" Anh.gif");
                int i = 0;

                while ((i = bis.read()) != -1) {
                    fos.write(i);
                }
                fos.flush();
                fos.close();
                bis.close();
            }catch (Exception e){
                System.out.println("Failed to download image");
            }
        }

        public static void main(String[] args) {
            try{
                FileReader filereader = new FileReader("C:\\Users\\Admin\\Desktop\\list-img.txt");
                BufferedReader bufferedReader = new BufferedReader(filereader);
                String line = "";
                int count = 1;

                while((line = bufferedReader.readLine()) !=null){
                    String imagePath = line;
                    if ("jpg".equals(imagePath.substring(imagePath.length() - 3))
                    ){
                        DownloadImageJPG(imagePath,count);
                    } else if ("svg".equals(imagePath.substring(imagePath.length() - 3))
                    ) {
                        DownloadImageSVG(imagePath,count);
                    } else if ("gif".equals(imagePath.substring(imagePath.length() - 3))
                    ) {
                        DownloadImageGIF(imagePath,count);
                    }else{
                        DownloadImageJPEG(imagePath,count);
                    }
                    count++;
                }
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("File not found");
            }
        }
    }
