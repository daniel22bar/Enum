package enum_exercises;

public class Redirection implements HttpRequest {
    @Override
    public void doSomething() {
        System.out.println(getClass().getSimpleName());
    }
}
