package dodatkowe_zadania.java_podstawy_dzien_trzeci;

public class VisibilityExample {

    public static int publicVisibility;


    private void someMethod() {
        publicVisibility = 3;
    }

    private void someOtherMethod() {
        publicVisibility = 2;
    }
}
