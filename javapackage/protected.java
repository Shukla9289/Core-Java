//Use of Protected Access Modifier
package javapackage;
class A{
    protected void show(){
        System.out.print("Name is Satyam Shukla");
    }
}
class B extends  A{
    public static void main(String[] args) {
        A r=new A();
        r.show();
    }
}