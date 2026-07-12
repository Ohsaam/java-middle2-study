package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("objMethod() 호출");
        return obj;
    }

    public static <T extends Number> T genericMethod(T obj) {
        System.out.println("genericMethod () 호출");
        return obj;
    }    
}
