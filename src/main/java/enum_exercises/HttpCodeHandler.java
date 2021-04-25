package enum_exercises;

public class HttpCodeHandler {
    public void handleHttpCode(int httpCode) {
        HttpCodeEnum.getHttpHandlerByCode(httpCode).httpRequest.doSomething();
    }
}
