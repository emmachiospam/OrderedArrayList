public class tester{

  public static void main(String[] args) {
    NoNullArrayList<String> test = new NoNullArrayList<String>();
    test.add("0");
    test.add("1");
    test.add(null);
    test.add("2");
    System.out.println(test);
  }
}
