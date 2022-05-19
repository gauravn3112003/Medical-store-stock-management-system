// Package Templates
package Templates;

import java.util.*;

public class Structure {

  public String name, eDate;
  public int price, qty, mg;
  public Scanner sc = new Scanner(System.in);

  public void Medicine() {
    System.out.println("*********** ADD MEDICINES ***********");
    System.out.print("Enter the Name of Medicines : ");
    name = sc.nextLine();
    System.out.print("Enter the Quantity of Medicines : ");
    qty = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter the Weight of Medicines : ");
    mg = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter the Price of Medicines : ");
    price = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter the Expiry Date of Medicines : ");
    eDate = sc.nextLine();
  }

  public void updateMedicine() {
    System.out.println("*********** UPDATE MEDICINES ***********");
    System.out.print("Enter the Name of Medicines : ");
    name = sc.nextLine();
    System.out.print("Enter the Quantity of Medicines : ");
    qty = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter the Weight of Medicines : ");
    mg = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter the Price of Medicines : ");
    price = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter the Expiry Date of Medicines : ");
    eDate = sc.nextLine();
  }
}
