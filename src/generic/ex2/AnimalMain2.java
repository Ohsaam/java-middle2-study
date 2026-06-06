package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("바둑이", 10);
        Cat cat = new Cat("나비", 5);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);
        System.out.println(animalBox.get().getName() + "의 크기는 " + animalBox.get().getSize());

        
    }
}
