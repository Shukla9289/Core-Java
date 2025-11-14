// Read File from java
import java.io.*;
class filereader{
public static void main(String[] args){
    try {
        FileReader r=new FileReader("C:\\Users\\shukl\\s.txt");
        try{
            int i;
            while((i=r.read())!=-1){
                System.out.print((char)i);
            }
        }
        finally{
            r.close();
        }
    }
    catch(IOException e){
        System.out.println("Exception Handled");
    }
 }
}