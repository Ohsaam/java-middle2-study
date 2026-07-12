public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("멍멍이", 10);
        Dog dog2 = new Dog("뽀삐", 20);
        Cat cat1 = new Cat("야옹이", 5);
        Cat cat2 = new Cat("나비", 15);

        ComplexBox<Dog> dogBox = new ComplexBox<>(dog1);
        ComplexBox<Cat> catBox = new ComplexBox<>(cat1);
    }
}
