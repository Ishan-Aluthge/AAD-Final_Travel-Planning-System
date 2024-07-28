package lk.ijse.gdse.aad.exception;

public class CreateFailException extends Exception{

    public CreateFailException(String message, Throwable cause) {
        super(message+" :( "+ cause.getMessage(), cause);
    }

}
