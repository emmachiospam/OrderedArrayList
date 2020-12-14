public class tester{

  public static void main(String[] args) {
    OrderedArrayList<String> test = new OrderedArrayList<String>();
    test.add("0");
    System.out.println(test);
    test.add("1");
    System.out.println(test);
    test.add("3");
    // test.add(2, null);
    System.out.println(test);
    test.add("2");
    System.out.println(test);
    System.out.println(test.set(1,"7"));
    System.out.println(test);
    test.add("1");
    System.out.println(test);
    test.add("1");
    System.out.println(test);
    test.add("1");
    System.out.println(test);
  }
}
