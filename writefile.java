//Code to write a file in Java
import java.io.*;
class fileWriter{
    public static void main(String[] args) {
        try {
           FileWriter f=new FileWriter("C:\\Users\\shukl\\s.txt");
           try {
               f.write("Shree Krishnay Namah");
           } 
           finally{
            f.close();
           }
           System.out.println("Data Written Successfully");
           }
           catch(IOException i){
            System.out.println(i);
           }
        } 
        }
    