class Student{
    int roll_number,marks;
    String name;
    void input(){
        System.out.println("Enter the Name ,Roll number and Marks of the Student");
    }
}
class Satyam extends Student{
    void disp(){
        roll_number=8;
        name="Satyam Shukla";
        marks=87;
        System.out.println("Name is"+name);
        System.out.println("Marks is"+marks);
        System.out.println("Roll number is"+roll_number);
    }
    public static void main(String[] args) {
        Satyam r =new Satyam();
        r.input();
        r.disp();
    }

}