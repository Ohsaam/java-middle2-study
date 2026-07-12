package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer intValue = (Integer) integerBox.get();
        System.out.println(intValue);
        

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("Hello");
        String strValue = (String) stringBox.get();
        System.out.println(strValue);

        integerBox.set("Not an Integer"); // 잘못된 인수 전달
        

    }
}
