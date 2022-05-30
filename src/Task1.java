public class Task1 {
    Task1() {
        I1 i1 = a -> {};
        i1.myMethod(10);

        I2 i2 = a -> String.valueOf(a);
        String str = i2.myMethod(0xba);

        I3 i3 = (a, b) -> {};
        i3.myMethod(31, 32);

        I4 i4 = (a, b) -> a * b;
        int x = i4.myMethod(41, 42);
    }
}
