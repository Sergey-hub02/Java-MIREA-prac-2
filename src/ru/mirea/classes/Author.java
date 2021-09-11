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
}
