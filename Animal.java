abstract class Animal{
    void legs(){
        System.out.println("All Animals have four legs");
    }
    abstract void eat();
    abstract void sound();
}
class dog extends Animal{
    @Override
    void eat(){
        System.out.println("Eats Non veg");
    }
    void sound(){
        System.out.println("Barks");
    }
}
class Cow extends Animal{
    @Override
    void eat(){
        System.out.println("Eats Grass");
    }
    void sound(){
        System.out.println("Moo Moo");
    }
}
class abs{
    public static void main(String[] args) {
        dog d=new dog();
        Cow c=new Cow();
        d.eat();
        d.sound();
        c.eat();
        c.sound();
    }
    
}