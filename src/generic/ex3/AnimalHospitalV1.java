package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;

public class AnimalHospitalV1 {
    private Animal animal;
    
    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물이름: " + animal.getName());
        System.out.println("동물크기: " + animal.getSize());
        animal.sound();
    }

    public Cat bigger(Cat cat1, Cat cat2) {
        if (cat1.getSize() > cat2.getSize()) {
            return cat1;
        } else {
            return cat2;
        }
    }
}
