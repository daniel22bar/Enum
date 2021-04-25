package enum_exercises;

public class Main {
    public static void main(String[] args) {
        HttpCodeHandler httpCodeHandler = new HttpCodeHandler();
        httpCodeHandler.handleHttpCode(400);
        httpCodeHandler.handleHttpCode(201);
        httpCodeHandler.handleHttpCode(199);
        httpCodeHandler.handleHttpCode(403);
    }
}
