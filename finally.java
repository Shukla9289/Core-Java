class K{
    public static void main(String[] args) {
        try {
            int x=10/0;
        } 
        catch (Exception e) {
            System.out.println("Error");
        }
        finally{
            System.err.println("Always Executed because i am in finally block");
        }
    }
}