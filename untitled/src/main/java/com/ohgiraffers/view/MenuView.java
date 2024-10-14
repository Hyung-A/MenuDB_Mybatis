package com.ohgiraffers.view;

import com.ohgiraffers.common.DTO.MenuDTO;
import com.ohgiraffers.controller.MenuController;

import java.lang.invoke.SwitchPoint;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MenuView {


    public void startMenu() {

        Scanner sc = new Scanner(System.in);

        MenuController menuController = new MenuController();

        do {
            System.out.println("============= 메뉴 관리 =============");
            System.out.println("1. 메뉴 전체 조회");
            System.out.println("2. 신규 메뉴 추가");
            System.out.println("3. 메뉴 수정");
            System.out.println("4. 메뉴 삭제");
            System.out.println("9. 이전 메뉴로 돌아가기");
            System.out.print("메뉴 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : menuController.selectAllMenu(); break;
                case 2 : menuController.registMenu(inputMenu()); break;
                case 3 : menuController.modifyMenu(inputModifyMenu()); break;
                case 4 : menuController.deleteMenu(deleteMenu()); break;
                case 9 : return;
                default:
                    System.out.println("잘못된 메뉴를 선택하였습니다.");
            }

        } while (true);
    }

    private static Map<String, String> inputMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("메뉴 가격을 입력하세요 : ");
        String price= sc.nextLine();
        System.out.print("카테고리 코드를 입력하세요 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("price", price);
        parameter.put("categoryCode", categoryCode);

        return parameter;
    }

    private static Map<String, String> inputModifyMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 메뉴 코드를 입력하세요 : ");
        String code = sc.nextLine();
        System.out.println("수정할 메뉴 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("수정할 메뉴 가격을 입력하세요 : ");
        String price = sc.nextLine();
        System.out.println("수정할 카테고리 코드를 입력하세요 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("price", price);
        parameter.put("categoryCode", categoryCode);

        return parameter;
    }

    private static Map<String, String> deleteMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 메뉴 코드를 입력하세요 : ");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;
    }
}
