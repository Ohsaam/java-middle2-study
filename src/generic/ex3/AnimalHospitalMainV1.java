package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 animalHospital = new AnimalHospitalV1();
        Cat cat = new Cat("나비", 3);
        Dog dog = new Dog("뽀삐", 5);

        animalHospital.set(cat);
        animalHospital.checkup();

        animalHospital.set(dog);
        animalHospital.checkup();

        Cat cat1 = new Cat("나비", 3);
        Cat cat2 = new Cat("냥이", 5);
        Cat biggerCat = animalHospital.bigger(cat1, cat2);
        System.out.println("크기가 더 큰 고양이: " + biggerCat.getName() + ", 크기: " + biggerCat.getSize());
    }
}
