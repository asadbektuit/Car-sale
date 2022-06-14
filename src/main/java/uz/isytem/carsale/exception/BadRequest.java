package uz.isytem.carsale.exception;

public class BadRequest extends RuntimeException {
    public BadRequest(String message){
        super(message);
    }
}
