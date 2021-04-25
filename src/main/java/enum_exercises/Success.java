package enum_exercises;

public class Success implements HttpRequest {
    @Override
    public void doSomething() {System.out.println(getClass().getSimpleName());

    }
}
