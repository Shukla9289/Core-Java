//Method Overloading 
class A{
    void add(){
        int a=10,b=5,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,int y){
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(int x,double y){
        double c;
        c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        A r=new A();
        r.add();
        r.add(5,7);
        r.add(4,5.96);
    }
}