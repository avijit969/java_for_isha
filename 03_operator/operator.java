class Student {
  String Name;
}

class Teacher {
  String Name;
}

public class operator {
  public static void main(String[] args) {
    // unary operator
    // int a=20;
    // System.out.println(a--);
    // System.out.println(a);
    // // arithmetic operator
    // System.out.println(10+20);
    // System.out.println(10-20);
    // System.out.println(10*20);
    // System.out.println(10/20);
    // System.out.println(10%20);
    // System.out.println(20/10*10);

    // shift operator
    System.out.println(20 << 2);
    System.out.println(20 >> 2);
    System.out.println(-20 >>> 2);
    // 1073741819
    Student s1 = new Student();
    Teacher t1 = new Teacher();
    System.out.println(t1 instanceof Teacher);
    // System.out.println( "avi" instanceof Object);

    // bitwise operator
    System.out.println(10 & 20);
    System.out.println(10 | 20);
    System.out.println(10 ^ 20);

    // logical operator
    System.out.println(10 < 90 && true);
    System.out.println(10 < 20 || true);

    // ternary operator
    int a = 60, b = 30;
    String res = (a > b) ? "a is greater" : "B is greater";
    System.out.println(res);
    int c = 20;
    c &= 10;
    System.err.println(c);

  }

}
