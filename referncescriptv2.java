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
  
//method to sort an array of integers using bubble sort
 public static void bubbleSort(int[] arr) {
   int n = arr.length;
   
   // loop to traverse through all elements of the array
   for (int i = 0; i < n-1; i++) {
     
     // loop to traverse the unsorted part of the array
     for (int j = 0; j < n-i-1; j++) {
       
       // if current element is greater than the next element, swap them
       if (arr[j] > arr[j+1]) {
         int temp = arr[j];
         arr[j] = arr[j+1];
         arr[j+1] = temp;
       }
     }
   }
 }
 
 // method to print the sorted array
 public static void printArray(int[] arr) {
   int n = arr.length;
   for (int i=0; i<n; ++i)
     System.out.print(arr[i] + " ");
   System.out.println();
 }
 
 // main method to test the sorting algorithm
 public static void main(String args[]) {
   int[] arr = {64, 34, 25, 12, 22, 11, 90};
   bubbleSort(arr);
   System.out.println("Sorted array: ");
   printArray(arr);
 }
