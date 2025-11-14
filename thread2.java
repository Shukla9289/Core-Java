//Creaton and definition of thread by implementing runnable interface

class A implements Runnable{
    public void run(){
        try{
        for(int i=1;i<=5;i++){
            System.out.println("Hello i am Child Thread");
            Thread.sleep(1000);
        }
        }
    catch(InterruptedException i){

        }
    }
}
class B{
    public static void main(String[] args) throws InterruptedException {
        A r=new A();
        Thread t=new Thread(r);//r is object reference here 
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello i am main thread");
            Thread.sleep(1000);
        }
        
    }
}