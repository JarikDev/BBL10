import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File dir = new File(".");

        String[] names = dir.list();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

        File fileTwo=new File("secondFile.txt");
        System.out.println(fileTwo.length());

        FileInputStream fis= new FileInputStream(fileTwo);
        int stLength=fis.available();
        System.out.println(stLength);
        byte[]ftdata=new byte[stLength];
        fis.read(ftdata);
        String ftText=new String(ftdata);
        System.out.println(ftText);

        FileOutputStream sfFos= new FileOutputStream("secondFile.txt",true);
        String appStr= "add me to second file please";
        byte[]stB=appStr.getBytes();
        sfFos.write(stB);
        sfFos.close();

       /* File file = new File("myFile.txt");
        System.out.println(file.length());

        FileInputStream input = new FileInputStream(file);
        int length = input.available();
        System.out.println(length);

        byte[]data=new byte[length];
        input.read(data);

       String text = new String(data);

        System.out.println(text);

        PrintWriter writer = new PrintWriter("secondFile.txt","UTF-8");
        writer.println("first line");
        writer.print("second line");*/


     /*   PrintWriter writer = new PrintWriter("myFile.txt","UTF-8");
        writer.println("first line");
        writer.print("second line");

        writer.close();
        FileOutputStream fos  = new FileOutputStream("myFile.txt",true);

        String newText="<!-- Hello world! File output stream operates -->";
        byte[] newTextBytes= newText.getBytes();
        fos.write(newTextBytes);
        fos.close();*/

    }
}
