package com.ohgiraffers.view;

import com.ohgiraffers.controller.PaymentController;

import java.util.Scanner;

public class PaymentApplication {

    public void runPaymentApp() {

        Scanner sc = new Scanner(System.in);

        PaymentController paymentController = new PaymentController();

        do {
            System.out.println("========= Payment 정보 관리 ===========");
            System.out.println("1. Payment 정보 전체 조회 ");
            System.out.println("2. Payment 정보 추가");
            System.out.println("3. Payment 정보 수정");
            System.out.println("4. Payment 정보 삭제");
            System.out.println("Payment 정보 관리 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    paymentController.selectAllPaymentInfo();
                    break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다");
                    break;
            }

        } while (true);
    }

}
