import java.util.ArrayDeque;
class javacollections4{
    public static void main(String[] args){
        ArrayDeque<Integer>Number=new ArrayDeque<>();
        Number.add(1);
        Number.add(2);
        Number.add(3);
        Number.add(4);
        Number.add(5);
    System.out.println(Number);
    Number.remove();// Follows FIFO Concept
    System.out.println(Number);
    }
}