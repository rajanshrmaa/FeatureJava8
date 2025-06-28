package FunctionaInterface;
interface square{
    int claculate(int x);
}
public class Parent {
    public static void main(String[] args) {
        square s = (x) -> x * x;
        int result = s.claculate(5);
        System.out.println("The square of 5 is: " + result);
    }
}
