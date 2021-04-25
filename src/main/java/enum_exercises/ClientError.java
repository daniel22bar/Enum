package enum_exercises;

public class ClientError implements HttpRequest {
    @Override
    public void doSomething() {
        System.out.println(getClass().getSimpleName());
    }
}
