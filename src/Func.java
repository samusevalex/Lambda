public class Func {
    void f1(int a){}

    String f2(int a){
        return String.valueOf(a);
    }

    void f3(int a, int b){
        b^=(a^=b);
        a^=b;
    }

    int f4(int a, int b){
        return a*b;
    }

    static void fs1(int a){}

    static String fs2(int a){
        return String.valueOf(a);
    }

    static void fs3(int a, int b){
        b^=(a^=b);
        a^=b;
    }

    static int fs4(int a, int b){
        return a*b;
    }
}
