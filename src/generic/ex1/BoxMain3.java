package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(10);
        Integer intValue = integerBox.get();
        System.out.println(intValue);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("Hello");
        String strValue = stringBox.get();
        System.out.println(strValue);   
    }

}
