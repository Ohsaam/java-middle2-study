package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>();
        catBox.set(new Cat("나비", 5));
        System.out.println(catBox.get().getName() + "의 크기는 " + catBox.get().getSize());

        Box<Dog> dogBox = new Box<>();
        dogBox.set(new Dog("바둑이", 10));
        System.out.println(dogBox.get().getName() + "의 크기는 " + dogBox.get().getSize());
    
        Box<Animal> animalBox = new Box<>();
        animalBox.set(new Cat("나비", 5));
        System.out.println(animalBox.get().getName() + "의 크기는 " + animalBox.get().getSize());
    }
}
