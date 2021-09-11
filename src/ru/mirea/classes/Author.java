package ru.mirea.classes;

public class Author {
  private String name;
  private String email;
  private char gender;

  /**
   * Конструктор, создающий полноценный объект класса Author
   * @param name            имя автора
   * @param email           email автора
   * @param gender          пол автора
   */
  public Author(String name, String email, char gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  /**
   * Геттер для поля name
   * @return        имя автора
   */
  public String getName() {
    return this.name;
  }

  /**
   * Геттер для поля email
   * @return        email автора
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Сеттер для поля email
   * @param email       новый email автора
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Геттер для поля gender
   * @return      пол автора
   */
  public char getGender() {
    return this.gender;
  }

  /**
   * Объединяет информацию об объекте в одну строку
   * @return        строка с информацией об объекте
   */
  public String toString() {
    return this.name + " (" + this.gender + ") at " + this.email;
  }
}
