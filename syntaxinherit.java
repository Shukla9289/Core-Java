//Basic Syntax of inheritance
class A{
    public void name(){
        System.out.println("Name is Satyam Shukla");
    }
}
class B extends A{
    public void profession(){
        System.out.print("Software Engineer");
    }
    public void age(){
        System.out.println("Age is Twenty two");
    }
    
    public static void main(String[] args) {
        B b=new B();
        b.name();
        b.age();
        b.profession();

    }
}