package generic.ex2;

public class ContainerTest {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        System.out.println("빈 값 확인: " + stringContainer.isEmpty());
        stringContainer.setItem("data1");

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(10);
        



    }
}
