package unitConverterGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

class TemperatureConverterGUI implements ActionListener {

    private JTextField userInputTemperature, resultOfCalculation;
    private JButton celsiusToFahrenheit, celsiusToKelvin, celsiusToRankine, fahrenheitToCelsius, fahrenheitToKelvin, fahrenheitToRankine, kelvinToCelsius, kelvinToFahrenheit, kelvinToRankine, rankineToCelsius, rankineToFahrenheit, rankineToKelvin;

    void buildConverterGUI(){
        Font font = new Font("SansSerif", Font.BOLD, 20);

        JFrame converterGUI = new JFrame("Primordial Temperature Converter");
        JLabel labelForTemperature = new JLabel("Enter your temperature here:");
        labelForTemperature.setBounds(105, 30, 165, 20);
        converterGUI.add(labelForTemperature);

        JLabel labelForResult = new JLabel("Result of conversion is:");
        labelForResult.setBounds(405, 30, 135, 20);
        converterGUI.add(labelForResult);

        userInputTemperature = new JTextField();
        userInputTemperature.setBounds(50,50,275,50);
        userInputTemperature.setFont(font);
        userInputTemperature.setHorizontalAlignment(SwingConstants.CENTER);
        converterGUI.add(userInputTemperature);

        resultOfCalculation = new JTextField();
        resultOfCalculation.setBounds(335,50,275,50);
        resultOfCalculation.setFont(font);
        resultOfCalculation.setHorizontalAlignment(SwingConstants.CENTER);
        converterGUI.add(resultOfCalculation);

        celsiusToFahrenheit = new JButton("Celsius to Fahrenheit");
        celsiusToFahrenheit.setBounds(50,130,180,30);
        celsiusToFahrenheit.addActionListener(this);
        celsiusToFahrenheit.setFocusPainted(false);
        converterGUI.add(celsiusToFahrenheit);

        celsiusToKelvin = new JButton("Celsius to Kelvin");
        celsiusToKelvin.setBounds(240,130,180,30);
        celsiusToKelvin.addActionListener(this);
        celsiusToKelvin.setFocusPainted(false);
        converterGUI.add(celsiusToKelvin);

        celsiusToRankine = new JButton("Celsius to Rankine");
        celsiusToRankine.setBounds(430,130,180,30);
        celsiusToRankine.addActionListener(this);
        celsiusToRankine.setFocusPainted(false);
        converterGUI.add(celsiusToRankine);

        fahrenheitToCelsius = new JButton("Fahrenheit to Celsius");
        fahrenheitToCelsius.setBounds(50,170,180,30);
        fahrenheitToCelsius.addActionListener(this);
        fahrenheitToCelsius.setFocusPainted(false);
        converterGUI.add(fahrenheitToCelsius);

        fahrenheitToKelvin = new JButton("Fahrenheit to Kelvin");
        fahrenheitToKelvin.setBounds(240,170,180,30);
        fahrenheitToKelvin.addActionListener(this);
        fahrenheitToKelvin.setFocusPainted(false);
        converterGUI.add(fahrenheitToKelvin);

        fahrenheitToRankine = new JButton("Fahrenheit to Rankine");
        fahrenheitToRankine.setBounds(430,170,180,30);
        fahrenheitToRankine.addActionListener(this);
        fahrenheitToRankine.setFocusPainted(false);
        converterGUI.add(fahrenheitToRankine);

        kelvinToCelsius = new JButton("Kelvin to Celsius");
        kelvinToCelsius.setBounds(50,210,180,30);
        kelvinToCelsius.addActionListener(this);
        kelvinToCelsius.setFocusPainted(false);
        converterGUI.add(kelvinToCelsius);

        kelvinToFahrenheit = new JButton("Kelvin to Fahrenheit");
        kelvinToFahrenheit.setBounds(240,210,180,30);
        kelvinToFahrenheit.addActionListener(this);
        kelvinToFahrenheit.setFocusPainted(false);
        converterGUI.add(kelvinToFahrenheit);

        kelvinToRankine = new JButton("Kelvin to Rankine");
        kelvinToRankine.setBounds(430,210,180,30);
        kelvinToRankine.addActionListener(this);
        kelvinToRankine.setFocusPainted(false);
        converterGUI.add(kelvinToRankine);

        rankineToCelsius = new JButton("Rankine to Celsius");
        rankineToCelsius.setBounds(50,250,180,30);
        rankineToCelsius.addActionListener(this);
        rankineToCelsius.setFocusPainted(false);
        converterGUI.add(rankineToCelsius);

        rankineToFahrenheit = new JButton("Rankine to Fahrenheit");
        rankineToFahrenheit.setBounds(240,250,180,30);
        rankineToFahrenheit.addActionListener(this);
        rankineToFahrenheit.setFocusPainted(false);
        converterGUI.add(rankineToFahrenheit);

        rankineToKelvin = new JButton("Rankine to Kelvin");
        rankineToKelvin.setBounds(430,250,180,30);
        rankineToKelvin.addActionListener(this);
        rankineToKelvin.setFocusPainted(false);
        converterGUI.add(rankineToKelvin);

        converterGUI.setSize(680,350);

        resultOfCalculation.setEditable(false);
        converterGUI.setLayout(null);
        converterGUI.setVisible(true);
        converterGUI.setResizable(false);
        converterGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent eventActionListener) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        String userInputTemperature = this.userInputTemperature.getText();

        double enterTemperature = Double.parseDouble(userInputTemperature);
        double calculateTemperature = 0;

        if (eventActionListener.getSource() == celsiusToFahrenheit) {
            calculateTemperature = (enterTemperature * 1.8) + 32;
        } else if (eventActionListener.getSource() == celsiusToKelvin) {
            calculateTemperature = enterTemperature + 273.15;
        } else if (eventActionListener.getSource() == celsiusToRankine) {
            calculateTemperature = (enterTemperature + 273.15) * 1.8;
        } else if (eventActionListener.getSource() == fahrenheitToCelsius) {
            calculateTemperature = (enterTemperature - 32) / 1.8;
        } else if (eventActionListener.getSource() == fahrenheitToKelvin) {
            calculateTemperature = (enterTemperature + 459.67) * (5.0 / 9.0);
        } else if (eventActionListener.getSource() == fahrenheitToRankine) {
            calculateTemperature = enterTemperature + 459.67;
        } else if (eventActionListener.getSource() == kelvinToCelsius) {
            calculateTemperature = enterTemperature - 273.15;
        } else if (eventActionListener.getSource() == kelvinToFahrenheit) {
            calculateTemperature = (enterTemperature * 1.8) - 459.67;
        } else if (eventActionListener.getSource() == kelvinToRankine) {
            calculateTemperature = enterTemperature * 1.8;
        } else if (eventActionListener.getSource() == rankineToCelsius) {
            calculateTemperature = (enterTemperature - 491.67) * (5.0 / 9.0);
        } else if (eventActionListener.getSource() == rankineToFahrenheit) {
            calculateTemperature = enterTemperature - 459.67;
        } else if (eventActionListener.getSource() == rankineToKelvin) {
            calculateTemperature = enterTemperature * (5.0 / 9.0);
        }

        String result = decimalFormat.format(calculateTemperature);
        this.resultOfCalculation.setText(result);
    }
}
