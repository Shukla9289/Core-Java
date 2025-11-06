interface Vehicle{
    String name="Royal Enfield Bullet 350";
    int CC=350;
    void start();
    void stop();
    default void color(){
        System.out.println("Batallion Black");
    }
}
class Customer implements Vehicle{
    @Override
     public void start(){
        System.out.println("For Start the vehicle Insert the Key and Kick to start the engine");
    }
     public void stop(){
        System.out.println(" For Stop the vehicle Remove the Key and Turn off the ignition Switch");
    }
    public static void main(String[] args) {
        Customer c=new Customer();
        c.start();
        c.stop();
        c.color();
    }
}
