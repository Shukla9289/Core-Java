import java.util.LinkedList;
class javacollections{
    public static void main(String[] args) {
        LinkedList<String>SurNames=new LinkedList<String>();
        SurNames.add("Shukla");
        SurNames.add("Mishra");
        SurNames.add("Pandey");
        System.out.println(SurNames);
        SurNames.addFirst("Sharma");//Linkedlist method to add in first
        SurNames.addLast("Dwivedi");//LinkedList method to add in Last
        System.out.println(SurNames);
        SurNames.add(3, "Trivedi");
        for(String str:SurNames){ //3Use of for each loop to print surnames
            System.out.println(str);
        }
    }
}
