package stringExample;

public class   stringExample1 {
    public static void main(String[] args) {
        // 1
        // литерал -> StringPool

        String a = "hello";
        String b = "hello";

        // сравнение по значению у String переменных equals

        System.out.println("a.equals(b) = " + a.equals(b));

        // сравнение по ссылке ==
        System.out.println("a == b = " + (a == b));
        System.out.println("hashcode a = " + Integer.toHexString(a.hashCode()));
        System.out.println("hashcode b = " + Integer.toHexString(b.hashCode()));


        // 2
        // не как литерал а с ключевым словом new

        String c = new String("hello");
        String d = new String("hello");

        // сравнение по значению у String переменных equals

        System.out.println("c.equals(d) = " + a.equals(d));

        // сравнение по ссылке ==
        System.out.println("c == d = " + (c == d));
        System.out.println("hashcode c = " + Integer.toHexString(c.hashCode()));
        System.out.println("hashcode d = " + Integer.toHexString(d.hashCode()));
    }
}
