package com.ohgiraffers.run;


import com.ohgiraffers.view.*;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuView menu = new MenuView();
        OrderView order = new OrderView();
        CategoryView ct = new CategoryView();
        PaymentApplication pay = new PaymentApplication();


        System.out.println("====오지랖 식당 관리자 메뉴====");
        System.out.println("1. 메뉴 관리");
        System.out.println("2. 주문 관리");
        System.out.println("3. 카테고리 관리");
        System.out.println("4. 결제 관리");
        System.out.print("원하시는 번호를 입력하세요. : ");
        int no = sc.nextInt();

        switch (no){
            case 1 :
                menu.startMenu();
                break;
            case 2 :
                order.orderStart();
                break;
            case 3 :
                ct.startCategory();
                break;
            case 4 :
                pay.runPaymentApp();
                break;
        }
    }
}