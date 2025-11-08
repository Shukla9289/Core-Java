//Code for creation of File in File handling
import java.io.*;
class createFile{
    public static void main(String[] args){
        File f=new File("C:\\Users\\shukl\\s.txt");
        try{
        if(f.createNewFile()){
            System.out.println("File Successfully Created");
        }
        else{
            System.out.println("File is already available");
        }
        }
        catch(IOException e){
            System.out.println("Error Ocurred:");
        }

    }
}