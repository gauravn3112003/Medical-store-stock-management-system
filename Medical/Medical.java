// Package Medical
package Medical;

import Templates.*;
import java.util.*;

public class Medical {

  Date d1 = new Date();
  Structure s2 = new Structure();
  public String[] mName, exDates, addDates;
  public int noOfMedicines;
  public int[] weight, quantity, price;
  String date = d1.toString();

  public Medical() {
    this.mName = new String[100];
    this.weight = new int[100];
    this.quantity = new int[100];
    this.exDates = new String[100];
    this.addDates = new String[100];
    this.price = new int[100];
    this.noOfMedicines = 0;
  }

  public void addMedicines(
    String name,
    int quantity,
    int mg,
    String eDates,
    int price
  ) {
    this.mName[noOfMedicines] = name;
    this.quantity[noOfMedicines] = quantity;
    this.weight[noOfMedicines] = mg;
    this.price[noOfMedicines] = price;
    this.addDates[noOfMedicines] = date;
    this.exDates[noOfMedicines] = eDates;
    noOfMedicines++;
    System.out.println(name + " has been added!");
    System.out.println();
  }

  public void showAvailableMedicines() {
    if (noOfMedicines == 0) {
      System.out.println("No Medicines Found !");
      System.out.println();
    } else {
      System.out.println("Available Medicines are:");
      for (int i = 0; i < noOfMedicines; i++) {
        if (this.mName[i] == null) {
          continue;
        }
        System.out.println("- Medicine ID: " + (i + 1));
        System.out.println("- Medicine Name : " + this.mName[i]);
        System.out.println("- Medicine Quantity : " + this.quantity[i]);
        System.out.println("- Medicine Weight : " + this.weight[i] + " mg");
        System.out.println("- Medicine Price : " + "$ " + this.price[i]);
        System.out.println("- Medicine Added Date : " + this.addDates[i]);
        System.out.println("- Medicine Expiry Date : " + this.exDates[i]);
        System.out.println();
      }
    }
  }

  public void removeMedicines(String name) {
    int con = 0, i;
    for (i = 0; i < noOfMedicines; i++) {
      if (this.mName[i].equals(name)) {
        con = 1;
        break;
      }
    }
    if (con == 1) {
      System.out.println("The Medicine has been Remove !");
      this.mName[i] = null;
      return;
    } else {
      System.out.println(name + " Medicine does not exist");
      System.out.println();
    }
  }

  public void updateMedicine(String name) {
    int flag = 0;
    int i;
    for (i = 0; i < noOfMedicines; i++) {
      if (this.mName[i].equals(name)) {
        flag = 1;
        break;
      }
    }
    if (flag == 1) {
      s2.updateMedicine();
      this.mName[i] = s2.name;
      this.quantity[i] = s2.qty;
      this.weight[i] = s2.mg;
      this.price[i] = s2.price;
      this.exDates[i] = s2.eDate;
      System.out.println(name + " is updated successfully to " + s2.name);
      System.out.println();
    } else {
      System.out.println(name + " medicine not found !");
      System.out.println();
    }
  }
}
