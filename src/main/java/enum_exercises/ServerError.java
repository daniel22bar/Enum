package enum_exercises;

public class ServerError implements HttpRequest {
    @Override
    public void doSomething() {
        System.out.println(getClass().getSimpleName());
    }
}
