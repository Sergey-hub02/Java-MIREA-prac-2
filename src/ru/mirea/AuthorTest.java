package ru.mirea;

import java.util.Scanner;
import ru.mirea.classes.Author;


public class AuthorTest {
  private static final Scanner IN = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Введите имя автора: ");
    String name = IN.nextLine();

    System.out.print("Введите email автора: ");
    String email = IN.next();

    System.out.print("Введите пол автора: ");
    char gender = IN.next().toCharArray()[0];

    Author author = new Author(name, email, gender);

    System.out.println();
    System.out.println("Информация об авторе:");
    System.out.println(author);
  }
}
