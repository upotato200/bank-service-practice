package com.bank;

public class Account {

    // TODO 1: 필드 3개 선언하기
    //   - accountNo  (계좌번호)  String
    //   - ownerName  (예금주명)  String
    //   - balance    (잔액)      int

    // 1. 필드
    private String accountNo;
    private String ownerName;
    private int balance;

    // TODO 2: 생성자 만들기
    //   - 파라미터: accountNo, ownerName, balance
    //   - this.필드 = 파라미터 로 값 저장

    // 2. 생성자
    public Account(String accountNo, String ownerName, int balance) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // TODO 3: Getter / Setter 만들기
    //   - getAccountNo()
    //   - getOwnerName()
    //   - getBalance()
    //   - setBalance(int balance)   ← 잔액은 입출금 때 바뀌므로 setter 필요


    // 3. Getter
    public String getAccountNo() {
        return accountNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

    // 4. Setter (잔액)
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
