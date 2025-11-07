class Boy{
    void gender(){
        System.out.println("he is a boy");
    }
}
class Name extends Boy{
    void name(){
        System.out.println("His name is Satyam");
    }
}
class Profession extends Boy{
    void prof(){
        System.out.println("He is a Software Engineer");
    }
}
class last{
    public static void main(String[] args) {
        Name r=new Name();
        Profession p=new Profession();

        r.name();
        p.prof();
        p.gender();
        r.name();
    }
}