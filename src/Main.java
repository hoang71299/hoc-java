public class Main {
    static boolean isString;
    static String className = "123";

    public static void main(String[] args) {

        boolean isString2 = false;
        ;
        int a = 1;
        System.out.println(a++);
        System.out.println(++a);

        System.out.println(isString);
        System.out.println(isString2);


        int b = a == 1 ? 2 : 3;
        System.out.println("--User instanceof");
        String test = "123";
        boolean result;
        result=test instanceof  String;
        System.out.println(result);

        System.out.println("ep kieu");
        float c = a;
        System.out.println(c);

        int d = (int)c ;
        long e = 10;

        c = e;

        char chr = 'a';
        System.out.println((int)chr);
    }
}
