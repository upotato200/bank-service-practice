package com.bank;

import java.util.ArrayList;

public class BankService {

    // TODO 1: Account 목록을 담을 ArrayList 필드 선언하기
    //   - 이름: accounts
    //   - 타입: ArrayList<Account>
    //   - 선언과 동시에 new ArrayList<>() 로 초기화

    // TODO 2: 계좌번호 자동 발급용 숫자 필드 선언하기
    //   - 이름: nextNo
    //   - 타입: int
    //   - 초기값: 1  (첫 번째 계좌 = 1001, 두 번째 = 1002 ...)

    // TODO 3: openAccount(String ownerName) 메서드 만들기
    //   - 계좌번호 생성: "100-" + nextNo  (예: "100-1")
    //   - nextNo 1 증가
    //   - 새 Account 객체 생성 (잔액 0원으로 시작)
    //   - accounts 리스트에 추가
    //   - 생성된 계좌번호를 return

    // TODO 4: deposit(String accountNo, int amount) 메서드 만들기
    //   - accounts 리스트에서 accountNo 와 일치하는 계좌 찾기
    //   - 못 찾으면 "존재하지 않는 계좌입니다" 출력 후 return
    //   - amount 가 0 이하면 "금액은 0원 초과여야 합니다" 출력 후 return
    //   - 찾은 계좌의 balance 에 amount 더하기 (setBalance 사용)
    //   - 입금 후 잔액 출력

    // TODO 5: withdraw(String accountNo, int amount) 메서드 만들기
    //   - accounts 리스트에서 accountNo 와 일치하는 계좌 찾기
    //   - 못 찾으면 "존재하지 않는 계좌입니다" 출력 후 return
    //   - amount 가 0 이하면 "금액은 0원 초과여야 합니다" 출력 후 return
    //   - 잔액 < amount 이면 "잔액이 부족합니다" 출력 후 return
    //   - 찾은 계좌의 balance 에서 amount 빼기 (setBalance 사용)
    //   - 출금 후 잔액 출력

    // TODO 6: getBalance(String accountNo) 메서드 만들기
    //   - accounts 리스트에서 accountNo 와 일치하는 계좌 찾기
    //   - 못 찾으면 "존재하지 않는 계좌입니다" 출력 후 return
    //   - 찾은 계좌의 예금주, 계좌번호, 잔액 출력

    // TODO 7: printAllAccounts() 메서드 만들기
    //   - accounts 가 비어 있으면 "개설된 계좌가 없습니다" 출력 후 return
    //   - for 문으로 accounts 를 순회하며 각 계좌 정보 출력
    //   - 출력 형식: "계좌번호 | 예금주 | 잔액"

}
