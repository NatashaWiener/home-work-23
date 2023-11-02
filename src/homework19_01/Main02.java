package homework19_01;

import java.util.Scanner;

// yrok19

public class Main02 {
  public static int getDaysAmount(String month) {
    switch (month) {
      case "February":
      return 28;
      case "April":
      case "June":
      case "September":
      case "November":
        return 30;
      case "Januar":
      case "Marth":
      case "Mai":
      case "July":
      case "August":
      case "October":
      case "Dezember":
        return 31;
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String  month = scanner.next();
    System.out.println(getDaysAmount(month));
  }

}
