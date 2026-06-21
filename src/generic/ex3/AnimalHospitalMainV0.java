package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        
        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //Q1: 개 병원에 고양이를 넣고 싶다면?
        // dogHospital.set(cat) // 다른 타입 입력 : 컴파일 오류남
        dogHospital.bigger(new Dog ("멍멍이2", 200));
    }
}
