package com.alinares.colorselectorfx;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorChooserController {

    // Sliders
    @FXML
    private Slider redSlider;
    @FXML
    private Slider greenSlider;
    @FXML
    private Slider blueSlider;
    @FXML
    private Slider alphaSlider;

    // Textfields
    @FXML
    private TextField redTextField;
    @FXML
    private TextField greenTextField;
    @FXML
    private TextField blueTextField;
    @FXML
    private TextField alphaTextField;

    // Rectangle
    @FXML
    private Rectangle colorRectangle;

    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1;

    public void initialize() {
        redTextField.textProperty().bind(
                redSlider.valueProperty().asString("%.0f"));
        greenTextField.textProperty().bind(
                greenSlider.valueProperty().asString("%.0f"));
        blueTextField.textProperty().bind(
                blueSlider.valueProperty().asString("%.0f"));
        alphaTextField.textProperty().bind(
                alphaSlider.valueProperty().asString("%.0f"));
        
        redSlider.valueProperty().addListener((o, old, newValue) -> {
            red = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
        greenSlider.valueProperty().addListener((o, old, newValue) -> {
            green = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
        blueSlider.valueProperty().addListener((o, old, newValue) -> {
            blue = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
        alphaSlider.valueProperty().addListener((o, old, newValue) -> {
            alpha = newValue.doubleValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });

    }

}
