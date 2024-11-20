package frc.robot;

public class Random_Number {
    private double number0;
    private int number2;
    private double number1;

    public Random_Number () {}

    public double getRandomNumber () {
        number0 = Math.random()*10;
        number0 = number2;
        if (number0 <= 3) {
        number1 = Math.subtractExact(3, number2);
        number0 += number1;
        }
        number0 /= 10;
        return number0;
    }
}
