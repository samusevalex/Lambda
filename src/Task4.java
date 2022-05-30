public class Task4 {
    Task4(){
        Argument argument = new Argument();

        IArgument arg1 = (n) -> {};
        arg1.myMethod(argument);

        IArgument arg2 = argument::myMethod;
        arg2.myMethod(argument);
    }
}
