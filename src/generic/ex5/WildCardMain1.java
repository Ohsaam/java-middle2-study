public class WildCardMain1 {
    
    public static void main(String[] args) {
        Box<Animal> animalBox = new Box<>(new Animal());
        Box<Dog> dogBox = new Box<>(new Dog());
        Box<Cat> catBox = new Box<>(new Cat());

        dogBox.set(new Dog("멍멍이", 10));
        catBox.set(new Cat("야옹이", 5));

        WildCardEx.printGenericV1(animalBox);
        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printGenericV1(catBox);
    }
}
