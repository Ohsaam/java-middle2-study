package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Object obj1 = GenericMethod.objMethod(100);
        Integer int1 = (Integer) obj1;
        System.out.println(int1);

        // 타입 인자 명시적 전달

        Integer result = GenericMethod.<Integer>genericMethod(200);
        System.out.println(result);

        Integer result2 = GenericMethod.genericMethod(300);
        System.out.println(result2);

        Double result3 = GenericMethod.genericMethod(3.14);
        System.out.println(result3);
    }
}
