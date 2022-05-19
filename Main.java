// Main .java
import Medical.*;
import Templates.*;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    int ch;
    Scanner sc = new Scanner(System.in);
    Medical medicalStores = new Medical();
    Structure s1 = new Structure();
    System.out.println();
    System.out.println(
      "*********** MEDICAL STORE STOCK MANAGEMENT SYSTEM ***********"
    );
    System.out.println();
    do {
      System.out.println("______________________________________________________________");
      System.out.println();
      System.out.println(
        "\t1.\t VIEW MEDICINES \n\t2.\t ADD MEDICINES \n\t3.\t REMOVE MEDICINES \n\t4.\t UPDATE MEDICINE \n\t5.\t EXIT "
      );
      System.out.println("______________________________________________________________");
      System.out.println();
      System.out.print("Enter the choice : ");
      ch = sc.nextInt();
      System.out.println();

      sc.nextLine();
      switch (ch) {
        case 1:
          medicalStores.showAvailableMedicines();
          break;
        case 2:
          s1.Medicine();
          medicalStores.addMedicines(
            s1.name,
            s1.qty,
            s1.mg,
            s1.eDate,
            s1.price
          );
          break;
        case 3:
          System.out.println("********* REMOVE BOOK *********");
          System.out.print("Enter the Medicine Name : ");
          s1.name = sc.nextLine();
          medicalStores.removeMedicines(s1.name);
          break;
        case 4:
          System.out.println("********* UPDATE BOOK *********");
          System.out.print("Enter the Medicine Name : ");
          s1.name = sc.nextLine();
          medicalStores.updateMedicine(s1.name);
          break;
        case 5:
          System.out.println("Exit You !");
          System.out.println();
          break;
        default:
          System.out.println("Invalid Selection !");
          break;
      }
    } while (ch != 5);
    sc.close();
  }
}
