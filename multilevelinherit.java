class Vehicle{
    void basicdetails(){
        String company_name="Mahindra";
        String Vehicle_type="Car";
        System.out.println("Company"+company_name);
        System.out.println("Vehicle Type"+Vehicle_type);

    }
}
class Car extends Vehicle{
    void intermediate_details(){
        int seats=5;
        String Fuel_type="Diesel";
        System.out.println("No.of Seats: "+seats);
        System.out.println("Fuel Type:"+Fuel_type);
    }
}
class Xuv extends Car{
    void advance_details(){
        int top_speed=250;
        int mileage=10;
        System.out.println("Top Speed :"+top_speed);
        System.out.println("Mileage :"+mileage);
    }
    public static void main(String[] args) {
        Xuv r=new Xuv();
        r.basicdetails();
        r.intermediate_details();
        r.advance_details();

    }
}