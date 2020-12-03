package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        // Program inital Top Description
        Text letsLearnSpanishText = new Text("Let's Learn Spanish!");
        letsLearnSpanishText.setFont(new Font("Verdana", 20));
        letsLearnSpanishText.setFill(Color.BLACK);

        // Button Section
        Button startButton = new Button("Start");

        // Button Choices
        Button colorsButton = new Button("Colors");
        colorsButton.setOnAction(e->
        {
            // Azul = Blue
            // Label, TextField, HBox
            Label azulColorLabel= new Label("Azul");
            TextField azulColorTextField = new TextField();
            HBox azulColorHBox= new HBox(10, azulColorLabel, azulColorTextField );
            azulColorHBox.setAlignment(Pos.CENTER);
            azulColorHBox.setPadding(new Insets(10));

            Button doneButton = new Button("Done");

            doneButton.setOnAction(ee ->
            {
                String userAnswer = azulColorTextField.getText();

                if(userAnswer.equalsIgnoreCase("Blue"))
                {
                    azulColorLabel.setText("Correct!");

                }
                else
                {
                    azulColorLabel.setText("Inorrect!");
                }

            });

            VBox colorVBox = new VBox(10, azulColorHBox, doneButton);
            colorVBox.setAlignment(Pos.CENTER);
            colorVBox.setPadding(new Insets(10));


            Scene colorScene = new Scene(colorVBox,  500, 500);
            colorScene.setFill(Color.BLUE);

            primaryStage.setScene(colorScene);
            primaryStage.setTitle("WHAT COLOR IS THIS?");
            primaryStage.show();



        });

        Button animalsButton = new Button("Animals");
        //startButton.setOnAction(e->{});

        Button foodButton = new Button("Food");
        //startButton.setOnAction(e->{});
        startButton.setOnAction(e->
        {
            Text chooseACategoryText = new Text("Choose a Category!");
            chooseACategoryText.setFont(new Font("Verdana", 20));
            chooseACategoryText.setFill(Color.BLACK);

            VBox categoryVBox = new VBox(10, chooseACategoryText, colorsButton, animalsButton, foodButton);
            categoryVBox.setAlignment(Pos.CENTER);
            categoryVBox.setPadding(new Insets(10));

            Scene categoryScene = new Scene(categoryVBox, 500, 500);

            // Stage
            primaryStage.setScene(categoryScene);
            primaryStage.setTitle("CATEGORIES");
            primaryStage.show();

        });

//
//        // Labels & TextField controls
//        Label Label1 = new Label("");
//        Label Label2 = new Label("");
//        TextField textField = new TextField();
//        Label resultsLabel = new Label();
//        HBox searchForNameHBox = new HBox(10);
//        searchForNameHBox.setAlignment(Pos.CENTER);
//        searchForNameHBox.setPadding(new Insets(10));
//
//        VBox nameLabelAndControlsVBox = new VBox(10 );
//        nameLabelAndControlsVBox.setAlignment(Pos.CENTER);
//        nameLabelAndControlsVBox.setPadding(new Insets(10));
//
//        // Button & Event Handling
//        Button searchButton = new Button("Search");
//        searchButton.setOnAction(e->{


//       });

        // start screen container
        VBox startScreenVBox = new VBox(10, letsLearnSpanishText, startButton );
        startScreenVBox.setAlignment(Pos.CENTER);
        startScreenVBox.setPadding(new Insets(10));

        // Scene
        Scene scene = new Scene(startScreenVBox, 500, 500);

        // Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("LEARN SPANISH NOW FOR FREE");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
