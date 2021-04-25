package enum_exercises;

public class Information implements HttpRequest {
    @Override
    public void doSomething() {
        System.out.println(getClass().getSimpleName());
    }
}
