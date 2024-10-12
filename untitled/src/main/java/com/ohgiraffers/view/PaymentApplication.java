package com.ohgiraffers.view;

import com.ohgiraffers.controller.PaymentController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaymentApplication {

    public static void main(String[] args) {


//        public void runPaymentApp(){


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
                case 1 : paymentController.selectAllPaymentInfo(); break;
                case 2 : paymentController.registPayment(inputPayment());
                case 3 : paymentController.modifyPayment(inputModifyPayment()); break;
                case 4 : paymentController.deletePayment(inputPaymentCode()); break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다");
                    break;
            }

        } while (true);
    }

    private static Map<String, String> inputPaymentCode(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Payment 코드를 입력하세요 : ");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("payment_code", code);

        return parameter;
    }

    private static Map<String, String> inputPayment() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Payment 날짜를 입력하세요 : ");
        String date = sc.nextLine();
        System.out.println("Payment 시간을 입력하세요 : ");
        String time = sc.nextLine();
        System.out.println("Payment 가격을 입력하세요 : ");
        String price = sc.nextLine();
        System.out.println("Payment 방식을 입력하세요 : ");
        String type = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("payment_date", date);
        parameter.put("payment_time", time);
        parameter.put("payment_price", price);
        parameter.put("payment_type", type);

        return parameter;
    }

    private static  Map<String, String> inputModifyPayment(){

        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 Payment 코드를 입력하세요 : ");
        String code = sc.nextLine();
        System.out.println("수정할 Payment 날짜를 입력하세요 : ");
        String date = sc.nextLine();
        System.out.println("수정할 Payment 시간을 입력하세요 : ");
        String time = sc.nextLine();
        System.out.println("수정할 Payment 가격을 입력하세요 : ");
        String price = sc.nextLine();
        System.out.println("수정할 Payment 방식을 입력하세요 : ");
        String type = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("payment_code", code);
        parameter.put("payment_date", date);
        parameter.put("payment_time", time);
        parameter.put("payment_price", price);
        parameter.put("payment_type", type);

        return parameter;
    }

}
