package com.example.demo4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONArray;

import java.io.File;
import java.io.IOException;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {







                System.out.println("Hello world!");
                JSONObject jo = new JSONObject();
                jo.put("Imię", "Marek");
                jo.put("Nazwisko","Sobków");
                jo.put("Wiek", "18");
                jo.put("Klasa", "4TD");
                jo.put("nr", "22");
                jo.put("adres", "Wyszyńskiego 15");
                jo.put("miejscowosc", "Wrocław");
                jo.put("telefon", "998");
                jo.put("mail", "misiaczekpysiu@gmail.com");

                String brzydkie = jo.toString();


              String ladne =
                        " imie: " +   jo.getString("Imię") + "\n" +
                                " nazwisko: " +   jo.getString("Nazwisko") + "\n" +
                                " Wiek: " +  jo.getString("Wiek") + "\n" +
                                " Klasa: " +  jo.getString("Klasa") + "\n" +
                                " Numer dziennika: " +  jo.getString("nr") + "\n" +
                                " Adres: " +  jo.getString("adres") + "\n" +
                                " Miejscowosc: " + jo.getString("miejscowosc") + "\n" +
                                " Telefon: " +  jo.getString("telefon") + "\n" +
                                " Mail: " +  jo.getString("mail");


        Text text = new Text();
        Text text1 = new Text();
        text1.setText(brzydkie);
        text1.setY(100);
        text1.setX(200);
        text.setText(ladne);
        text.setX(50);
        text.setY(50);
        Group root  = new Group(text,text1);
        Scene scene = new Scene(root,600,300);
        stage.setScene(scene);
        stage.show();
            }




    public static void main(String[] args) {
        launch();
    }
}