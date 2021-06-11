package PZN.Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            var host = properties.getProperty("database.host");
            var port = properties.getProperty("database.port");
            var username = properties.getProperty("database.username");
            var password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);

        }catch (FileNotFoundException exception){
            System.out.println("Eror Mengambil File "+exception);
        }catch (IOException exception){
            System.out.println("Eror Load file "+exception);
        }



    }
}
