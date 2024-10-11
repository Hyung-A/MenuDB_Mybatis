package com.ohgiraffers.view;

import com.ohgiraffers.controller.OrderController;

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
            }

        }while(true);




    }

}
