package com.ohgiraffers.view;

import com.ohgiraffers.common.DTO.MenuDTO;
import com.ohgiraffers.controller.MenuController;

import java.lang.invoke.SwitchPoint;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MenuView {

    public static void main(String[] args) {

        startMenu();
    }

    public static void startMenu() {

        Scanner sc = new Scanner(System.in);

        MenuController menuController = new MenuController();

        do {
            System.out.println("============= 메뉴 관리 =============");
            System.out.println("1. 메뉴 전체 조회");
            System.out.println("2. 메뉴코드로 전체 조회");
            System.out.println("3. 신규 메뉴 추가");
            System.out.println("4. 메뉴 수정");
            System.out.println("5. 메뉴 삭제");
            System.out.print("메뉴 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : menuController.selectAllMenu(); break;
                default:
                    System.out.println("잘못된 메뉴를 선택하였습니다.");
            }

        } while (true);
    }
}
