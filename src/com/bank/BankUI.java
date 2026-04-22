package com.bank;

import java.util.Scanner;

public class BankUI {

    // TODO 1: 필드 2개 선언하기
    //   - service : BankService  (기능을 처리해줄 객체)
    //   - scanner : Scanner      (키보드 입력 받는 객체)

    // TODO 2: 생성자 만들기
    //   - service = new BankService()
    //   - scanner = new Scanner(System.in)

    // TODO 3: start() 메서드 만들기  ← Main 에서 이 메서드 하나만 호출
    //   - while(true) 로 무한 반복
    //   - printMenu() 호출해서 메뉴 출력
    //   - 번호 입력 받기 (scanner.nextInt())
    //   - switch 문으로 각 번호에 맞는 메서드 호출
    //     1 → openAccount()
    //     2 → deposit()
    //     3 → withdraw()
    //     4 → getBalance()
    //     5 → printAllAccounts()
    //     0 → "종료합니다" 출력 후 return (루프 탈출)
    //     그 외 → "잘못된 번호입니다" 출력

    // TODO 4: printMenu() 메서드 만들기
    //   - 아래 형식으로 메뉴 출력
    //   ============================
    //    Mini Bank System
    //   ============================
    //   1. 계좌 개설
    //   2. 입  금
    //   3. 출  금
    //   4. 잔액 조회
    //   5. 전체 계좌 목록
    //   0. 종  료

    // TODO 5: openAccount() 메서드 만들기
    //   - "예금주명을 입력하세요: " 출력
    //   - 이름 입력 받기
    //   - service.openAccount(이름) 호출
    //   - "계좌가 개설되었습니다. 계좌번호: " + 반환된 계좌번호 출력

    // TODO 6: deposit() 메서드 만들기
    //   - "계좌번호를 입력하세요: " 출력 → 계좌번호 입력 받기
    //   - "입금액을 입력하세요: " 출력 → 금액 입력 받기
    //   - service.deposit(계좌번호, 금액) 호출

    // TODO 7: withdraw() 메서드 만들기
    //   - "계좌번호를 입력하세요: " 출력 → 계좌번호 입력 받기
    //   - "출금액을 입력하세요: " 출력 → 금액 입력 받기
    //   - service.withdraw(계좌번호, 금액) 호출

    // TODO 8: getBalance() 메서드 만들기
    //   - "계좌번호를 입력하세요: " 출력 → 계좌번호 입력 받기
    //   - service.getBalance(계좌번호) 호출

    // TODO 9: printAllAccounts() 메서드 만들기
    //   - service.printAllAccounts() 호출

}
