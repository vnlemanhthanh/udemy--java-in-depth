class BasicsDemo {
  int id1 = 0;
  int id = 0;
  int Id = 0;

  void foo() {;};


  static void print() {
    System.out.println("\nInside print() ...");

  }

  // client test
  public static void main(String[] args) {
    print();

    int i =6;
    double j =2.5;
    System.out.println(i + j);
    System.out.println(i - j);
    System.out.println(i * j);
    System.out.println(i / j);
    System.out.println(i % j);
    // System.out.println(i ** j);


  }

}