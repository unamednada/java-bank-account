package com.betrybe.acc.java.bankaccount;

import java.util.Scanner;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Informe o número da conta:\n");
    int rawAcountNumber = scan.nextInt();
    AccountNumberFormatter accountFormatter = new AccountNumberFormatter();
    String formattedAccountNumber = accountFormatter.formatAccountNumber(rawAcountNumber);
    System.out.println("\nNumero da conta: " + formattedAccountNumber);
    scan.close();
  }

}
