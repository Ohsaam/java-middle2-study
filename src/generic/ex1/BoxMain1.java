package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        StringBox stringBox = new StringBox();
        stringBox.set("Hello");
        System.out.println(stringBox.get());

        IntegerBox integerBox = new IntegerBox();
        integerBox.set(123);
        System.out.println(integerBox.get());
    }
}
