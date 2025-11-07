//Multiple inheritance is only achieved by the help of interface

interface A{
    default void show(){
        System.out.println("Hello Satyam Shukla");
    }
}
interface B {
    default void show(){
        System.out.println("How are You?");
    }
}
class C implements A,B{
    public void show(){
        A.super.show();
        B.super.show();
        System.out.println("Hope You are Fine!");
    }
    public static void main(String[] args) {
        C r=new C();
        r.show();
    }
    

}
   
    

