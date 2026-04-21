import java.util.*;

public class Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the array size:");
    int i;
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the Array elements:");
    for (i = 0; i < n; i++) {
      System.out.print("a[" + i + "]=");
      a[i] = sc.nextInt();
    }
    System.out.println("Enter the element to search:");
    int k = sc.nextInt();
    for (i = 0; i < n; i++) {
      if (a[i] == k) {
        System.out.println(i);
        break;
      }
    }
    if (i == n) {
      System.out.println("-1");
    }
    sc.close();
  }
}