public class Task3 {
    Task3() {

        I1 i1 = Func::fs1;
        i1.myMethod(10);

        I2 i2 = Func::fs2;
        String str = i2.myMethod(20);

        I3 i3 = Func::fs3;
        i3.myMethod(31, 32);

        I4 i4 = Func::fs4;
        int x = i4.myMethod(41, 42);
    }

}
