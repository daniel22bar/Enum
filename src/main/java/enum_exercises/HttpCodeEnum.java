package enum_exercises;

public enum HttpCodeEnum {
   INFORMATION(new Information(), 1),SUCCESS(new Success(), 2),
   REDIRECTION(new Redirection(), 3),CLIENT_ERROR(new ClientError(), 4)
   ,SERVER_ERROR(new ServerError(), 5);
   final HttpRequest httpRequest;
   final int index;

   HttpCodeEnum(HttpRequest httpRequest, int index){
      this.httpRequest = httpRequest;
      this.index = index;
   }

   public static HttpCodeEnum getHttpHandlerByCode(int statusCode){
      HttpCodeEnum[] codes = values();
      try {
         return codes[(statusCode/100) -1];
      }catch (Exception ex){
         throw new IllegalStateException(statusCode + " not supported" );
      }
      /*for (HttpCodeEnum code : codes) {
         if(statusCode/100 == code.index)
            return code;

      }
        throw new IllegalStateException(statusCode + " not supported" + ex.toString());

      */
   }



}
