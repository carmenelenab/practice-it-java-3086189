package _03_05b;

public class ForLoops {

  public static void main(String[] args) {
    // Write a for loop that prints out the phrase "I love for loops" 5 times
    for (int i = 0; i < 5; ++i) {
      System.out.print("I love for loops;" + " ");
    }
    System.out.println();
    // Write a for loop that prints out the numbers 1 to 10
    for (int i = 1; i <= 10; ++i) {
      System.out.print(i + " ");
    }
    System.out.println();
    // Write a for loop that prints out the numbers 10 to 1
    for (int i = 10; i > 0; --i) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
