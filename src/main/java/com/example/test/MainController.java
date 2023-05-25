package com.example.test;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private VBox mainContent;

    @FXML
    private Button resetButton;

    @FXML
    private Button instrucButton;

    public char[] instruction = {'D','A','D','A','D','A','D','A','A'};

    public static GridPane GenerateGrid(int size){
        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(true);

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                Rectangle cell = createCell(50);
                gridPane.add(cell, col, row);
            }
        }

        gridPane.setRotate(180);
        return gridPane;
    }

    private static Rectangle createCell(int size) {
        Rectangle cell = new Rectangle(size, size);
        cell.setStyle("-fx-stroke: black; -fx-fill: white;");
        return cell;
    }

    private static void changeOrientation(Vacuum vacuum, Group group){
        switch (vacuum.getOrientation()) {
            case 'N' -> group.setRotate(180);
            case 'O' -> group.setRotate(90);
            case 'E' -> group.setRotate(270);
            case 'S' -> group.setRotate(0);
        }
    }
    private static void resetVacuum(Vacuum vacuum, GridPane grid, Group group){
        vacuum.setX(4);
        vacuum.setY(4);
        vacuum.setOrientation('N');
        changeOrientation(vacuum, group);
        grid.getChildren().remove(group);
        grid.add(group, vacuum.getX(), vacuum.getY());
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        GridPane grid = GenerateGrid(10);

        Circle circle = new Circle(25);
        circle.setStyle("-fx-stroke: black; -fx-fill: #1f5bf3;");

        Polygon arrow = new Polygon();
        arrow.getPoints().addAll(
                0.0, -15.0,
                10.0, 0.0,
                -10.0, 0.0
        );
        arrow.setFill(Color.BLACK);

        Group group = new Group(circle, arrow);

        // The index of the grid start at 0 so for a display 5,5 position we need to retire 1
        Vacuum vacuum = new Vacuum(4, 4, 'N');
        changeOrientation(vacuum, group);

        grid.add(group, vacuum.getX(), vacuum.getY());

        mainContent.getChildren().add(grid);

        Platform.runLater(() -> {
            Scene scene = mainContent.getScene();

            instrucButton.setOnMouseClicked((event) -> {
                resetVacuum(vacuum, grid, group);

                for (char c : instruction) {
                    switch (c) {
                        case 'A', 'Q' -> {
                            vacuum.move();
                            System.out.println("On avance, position : " + (vacuum.getX() + 1) + " " + (vacuum.getY() + 1));
                        }
                        case 'D' -> {
                            vacuum.rotate("D");
                            System.out.println("On tourne à droite , orientation : " + vacuum.getOrientation());
                        }
                        case 'G' -> {
                            vacuum.rotate("G");
                            System.out.println("On tourne à gauche , orientation : " + vacuum.getOrientation());
                        }
                    }

                    changeOrientation(vacuum, group);

                    grid.getChildren().remove(group);
                    grid.add(group, vacuum.getX(), vacuum.getY());

                }
            });

            resetButton.setOnMouseClicked((event) -> {
              resetVacuum(vacuum, grid, group);
            });

            scene.setOnKeyPressed(event -> {
                KeyCode keyCode = event.getCode();

                switch (keyCode) {
                    case A, Q -> {
                        vacuum.move();
                        // We add one because we start at 0
                        System.out.println("On avance, position : " + (vacuum.getX() + 1) + " " + (vacuum.getY() + 1));
                    }
                    case D -> {
                        vacuum.rotate("D");
                        System.out.println("On tourne à droite , orientation : " + vacuum.getOrientation());
                    }
                    case G -> {
                        vacuum.rotate("G");
                        System.out.println("On tourne à gauche , orientation : " + vacuum.getOrientation());
                    }
                }

                changeOrientation(vacuum, group);

                grid.getChildren().remove(group);
                grid.add(group, vacuum.getX(), vacuum.getY());
            });
        });

    }
}