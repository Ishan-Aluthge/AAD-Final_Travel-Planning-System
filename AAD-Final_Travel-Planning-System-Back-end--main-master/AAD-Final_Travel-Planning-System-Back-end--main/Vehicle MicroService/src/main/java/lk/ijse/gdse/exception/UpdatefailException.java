package lk.ijse.gdse.exception;

public class UpdatefailException extends Exception{
    public UpdatefailException(String message){
        super(message);
    }
    public UpdatefailException(String message,Throwable cause){
        super(message,cause);
    }
}
