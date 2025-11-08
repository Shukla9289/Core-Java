//Method overriding example
class A{
    void welcome(){
        System.out.println("Welcome to class A");
    }
}
class B extends A{
    
    void welcome(){
        System.out.println("Welcome to class B");
    }
}
class demo{
    public static void main(String[] args) {
    A r=new B();
    r.welcome();
    }
}