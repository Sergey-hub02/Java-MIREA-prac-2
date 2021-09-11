package ru.mirea.classes;

public class Ball {
  private double x;
  private double y;

  /**
   * Конструктор по умолчанию
   */
  public Ball() {
    this.x = 0.0;
    this.y = 0.0;
  }

  /**
   * Конструктор, создающий полноценный объект класса Ball
   * @param x         координата мяча по оси абсцисс
   * @param y         координата мяча по оси ординат
   */
  public Ball(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Геттер для поля x
   * @return      координата мяча по оси абсцисс
   */
  public double getX() {
    return this.x;
  }

  /**
   * Сеттер для поля x
   * @param x       новая координата по оси абсцисс
   */
  public void setX(double x) {
    this.x = x;
  }

  /**
   * Геттер для поля y
   * @return        координата мяча по оси ординат
   */
  public double getY() {
    return this.y;
  }

  /**
   * Сеттер для поля y
   * @param y       новая координата мяча по оси ординат
   */
  public void setY(double y) {
    this.y = y;
  }

  /**
   * Задаёт положение мяча на координатной плоскости
   * @param x       координата по оси абсцисс
   * @param y       координата по оси ординат
   */
  public void setXY(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Задаёт движение мяча на координатной плоскости
   * @param xDisp       приращение координаты по оси абсцисс
   * @param yDisp       приращение координаты по оси ординат
   */
  public void move(double xDisp, double yDisp) {
    this.x += xDisp;
    this.y += yDisp;
  }

  /**
   * Объединяет информацию об объекте в одну строку
   * @return        строка с информацией об объекте
   */
  public String toString() {
    return "\tКоордината по оси X: " + this.x
         + "\n\tКоордината по оси Y: " + this.y;
  }
}
