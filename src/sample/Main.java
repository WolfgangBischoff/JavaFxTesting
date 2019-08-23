package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Hello World");


        //Button
        Button btn = new Button();
        btn.setText("Say Hello");
        btn.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                System.out.println("Hello Wolfgang");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        //grid.add(btn, 0, 0);

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);




        //primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
