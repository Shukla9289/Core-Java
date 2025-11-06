class Test {
  static {
    System.out.println("Static block");
  }
  {
    System.out.println("Instance block");
  }
  Test() {
    System.out.println("Constructor");
  }
  public static void main(String[] args) {
    Test t1 = new Test();
    Test t2 = new Test();
  }
}
