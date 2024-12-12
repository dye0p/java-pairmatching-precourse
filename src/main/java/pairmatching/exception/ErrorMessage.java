package pairmatching.exception;

public enum ErrorMessage {

    ERROR_SIGNATURE("[ERROR] "),
    INVALID_OPTION("존재하지 않는 기능 입니다. 다시 입력해 주세요");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getErrorMessage() {
        return ERROR_SIGNATURE.message + this.message;
    }
}
