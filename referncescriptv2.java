import java.util.ArrayList;

public class referncescriptv2 {
  public static void main(String[] args) {
    // Variables
    int count = 0;
    int sum = 0;
    ArrayList<Integer> numbers = new ArrayList<>();

    // Adding elements to the list
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    // Loops
    // For loop to calculate the sum of elements in the list
    for (int number : numbers) {
      sum += number;
    }

    // While loop to count the number of iterations
    while (count < 5) {
      count++;
    }

    // Methods
    printResult(sum, count);
  }

  // Method to print the sum and count
  public static void printResult(int sum, int count) {
    System.out.println("The sum of the elements in the list is: " + sum);
    System.out.println("The count of iterations in the while loop is: " + count);
  }
}
