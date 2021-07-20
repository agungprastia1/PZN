package util;

import app.LoginRequest;
import excpt.BlankException;
import excpt.ValidationException;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException{
        if (loginRequest.getUsername() == null){
            throw new ValidationException("Username is null");
        }else if(loginRequest.getUsername().isBlank()){
            throw new ValidationException("Username is blank");
        }else if (loginRequest.getPassword() == null){
            throw new ValidationException("Password is null");
        }else if(loginRequest.getPassword().isBlank()){
            throw new ValidationException("Password is blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest){
        if (loginRequest.getUsername() == null){
            throw new BlankException("Username is null");
        }else if(loginRequest.getUsername().isBlank()){
            throw new BlankException("Username is blank");
        }else if (loginRequest.getPassword() == null){
            throw new BlankException("Password is null");
        }else if(loginRequest.getPassword().isBlank()){
            throw new BlankException("Password is blank");
        }
    }
}
