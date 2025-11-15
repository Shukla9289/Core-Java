//Java Collections Example
import java.util.ArrayList;

class javacollections{
    public static void main(String[] args) {
        
        ArrayList<String>Names=new ArrayList<String>();
        Names.add("Satyam");
        Names.add("Shivam");
        Names.add("Sundaram");
        System.out.println(Names);
        Names.add("Abhisek");
        Names.add(2,"Ankit"); //2 is the index in which it adds
        System.out.println(Names);
        System.out.println(Names.get(3));//Print the Element which is present at 3rd Index


    }
}