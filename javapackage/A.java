// Use of PVT access Modifier
package javapackage;
class A{
    private void show(){
        System.out.print("Name is Satyam Shukla");
    }
    public static void main(String[] args) {
        A r=new A();
        r.show();
    }
}
//It is not accessible an another class because it is private