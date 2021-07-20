package app;


public class StackTraceApp {
    public static void main(String[] args) {
        try{
            String[] name = {
                    "Agung "," Prasetia "," S.kom"
            };
            System.out.println(name[100]);
        }catch (Throwable throwable){
            StackTraceElement[] stackTraceElements= throwable.getStackTrace();

            throwable.printStackTrace();
        }
    }
}
