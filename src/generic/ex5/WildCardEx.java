import generic.animal.Animal;

public class WildCardEx {
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("T = " + t.getName() + ", size = " + t.getSize());
    }
}
