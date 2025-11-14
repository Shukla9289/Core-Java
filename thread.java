//Thread Creation by Extending thread class 
class A extends Thread{
    @Override
    public void run(){
       try
       { for(int i=1;i<=5;i++){
            System.out.println("Your name is Satyam");
            Thread.sleep(1000);
           }
       }
catch(InterruptedException i){

       }
    }
}
class B{
    public static void main(String[] args) throws InterruptedException {
        A t =new A();
        t.start();
        for(int i=1;i<=5;i++){
            System.out.println("Your Last name is Shukla");
            Thread.sleep(1000);
        }
    }
}