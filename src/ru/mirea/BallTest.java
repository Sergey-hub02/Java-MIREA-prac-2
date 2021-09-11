package ru.mirea;

import java.util.Scanner;
import ru.mirea.classes.Ball;


public class BallTest {
  private static final Scanner IN = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Введите координаты мяча: ");

    double x = IN.nextDouble();
    double y = IN.nextDouble();

    Ball ball = new Ball();
    ball.setXY(x, y);

    System.out.println("Мяч сдвинулся на 4.5 единицы по оси X, 3.23 единицы по оси Y");
    ball.move(4.5, 3.23);

    System.out.println();
    System.out.println("Теперь его координаты таковы:");
    System.out.println(ball);
  }
}
