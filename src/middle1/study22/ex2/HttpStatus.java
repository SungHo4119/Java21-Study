package middle1.study22.ex2;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");


    private final int code;
    private final String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int statusCode) {
        for (HttpStatus status : HttpStatus.values()) {
            if (status.getCode() == statusCode) {
                return status;
            }
        }
        return null;
    }

    public Boolean isSuccess() {
        if (this.code >= 200 && this.code <= 299) {
            return true;
        }
        return false;
    }
}
