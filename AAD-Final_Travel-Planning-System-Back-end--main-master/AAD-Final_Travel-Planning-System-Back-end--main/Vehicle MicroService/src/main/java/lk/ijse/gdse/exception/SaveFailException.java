package lk.ijse.gdse.exception;

public class SaveFailException extends Exception{
    public SaveFailException(String message, Throwable cause) {
    super(message + " : "+cause.getMessage(), cause);
    }
}
