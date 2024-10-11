package com.ohgiraffers.view;

import com.ohgiraffers.common.DTO.OrderDTO;
import com.ohgiraffers.controller.OrderController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderView {
    public static void main(String[] args) {
        OrderView orderView = new OrderView();
        orderView.orderStart();
    }

    public void orderStart(){
        Scanner sc = new Scanner(System.in);
        OrderController orderController = new OrderController();

        do{
            System.out.println("=======주문 조회========");
            System.out.println("1. 전체 주문 조회");
            System.out.println("2. 주문 번호로 조회");
            System.out.println("3. 주문 내역 추가");
            System.out.println("4. 주문 내역 수정");
            System.out.println("5. 주문 내역 삭제");
            System.out.println("9. 나가기");
            System.out.println("조회하실 내용을 선택해주세요.");
            int no = sc.nextInt();
            switch (no){
                case 1 :  orderController.selectAllOrder(); break;
                case 2 :  orderController.selectOrderByCode(inputOrderCode()); break;
                case 3 :  orderController.insertOrder(inputOrderInfo()); break;
                case 4 :  orderController.modifyOrder(modifyOrderInfo()); break;
            }

        }while(true);




    }

    private Map<String, String> modifyOrderInfo() {
        Scanner sc = new Scanner(System.in);
        Map<String, String> orderInfo = new HashMap<>();
        System.out.println("수정할 코드를 입력해주세요 : ");
        String code = sc.nextLine();
        System.out.println("수정할 주문내역의 date를 입력해주세요 : ");
        String date = sc.nextLine();
        System.out.println("수정할 주문내역의 time를 입력해주세요 : ");
        String time = sc.nextLine();
        System.out.println("수정할 주문내역의 총 판매액을 입력해주세요 : ");
        String totalPrice = sc.nextLine();

        orderInfo.put("code", code);
        orderInfo.put("date", date);
        orderInfo.put("time", time);
        orderInfo.put("totalPrice", totalPrice);

        return orderInfo;
    }

    private Map<String, String> inputOrderInfo() {
        Scanner sc = new Scanner(System.in);
        Map<String, String> orderInfo = new HashMap<>();
        System.out.println("추가할 주문내역의 date를 입력해주세요 : ");
        String date = sc.nextLine();
        System.out.println("추가할 주문내역의 time를 입력해주세요 : ");
        String time = sc.nextLine();
        System.out.println("추가할 주문내역의 총 판매액을 입력해주세요 : ");
        String totalPrice = sc.nextLine();

        orderInfo.put("date", date);
        orderInfo.put("time", time);
        orderInfo.put("totalPrice", totalPrice);

        return orderInfo;
    }

    private Map<String, String> inputOrderCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("조회하실 주문 번호를 입력해주세요 : ");
        String orderCode = sc.nextLine();

        Map<String, String> code = new HashMap<>();
        code.put("orderCode", orderCode);

        return code;
    }

}
