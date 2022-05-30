public class Task2 {
    Task2() {
        Func func = new Func();

        I1 i1 = func::f1;
        i1.myMethod(10);

        I2 i2 = func::f2;
        String str = i2.myMethod(20);

        I3 i3 = func::f3;
        i3.myMethod(31, 32);

        I4 i4 = func::f4;
        int x = i4.myMethod(41, 42);
    }
}
