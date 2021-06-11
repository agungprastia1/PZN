package app;

import excpt.BlankException;
import excpt.ValidationException;
import util.ValidationUtil;

import static util.ValidationUtil.validate;
import static util.ValidationUtil.validateRuntime;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername("Agung");
        loginRequest.setPassword(null );

        try{
            validate(loginRequest);
            System.out.println("valid");
        }catch (ValidationException e){
            System.out.println("Terjadi kesalahan "+e.getMessage());

        }

        LoginRequest loginRequest1 = new LoginRequest();
        loginRequest1.setUsername("agung");
        loginRequest1.setPassword("cool");
        ValidationUtil.validateRuntime(loginRequest1);
        System.out.println("sukses");


    }
}
