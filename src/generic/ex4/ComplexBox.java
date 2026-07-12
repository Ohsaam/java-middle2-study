public class ComplexBox<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <Z> Z printAndReturn(Z z) {
        System.out.println("printAndReturn() 호출");
        return z;
    }
}
