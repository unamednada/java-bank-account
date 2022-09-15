package com.betrybe.acc.java.bankaccount;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String formattedAccount = String.valueOf(literalAccountNumber);
    if (formattedAccount.length() > 6) {
      formattedAccount = formattedAccount.substring(formattedAccount.length() - 6);
    } else {
      while (formattedAccount.length() < 6) {
        formattedAccount = "0".concat(formattedAccount);
      }
    }
    return formattedAccount;
  }

}