package com.ohgiraffers.view;

import com.ohgiraffers.controller.CategoryController;

import java.util.Scanner;

public class CategoryView {


    public static void startCategory(){

        CategoryController categoryController = new CategoryController();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("================ Category 테이블 메뉴 ================");
            System.out.println("1. 전체 Category 정보 조회");
            System.out.println("2. Category 정보 추가");
            System.out.println("3. Category 정보 수정");
            System.out.println("4. Category 정보 삭제");
            System.out.println("9. 이전 메뉴로 돌아가기");
            System.out.print("메뉴를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    categoryController.selectAllCategory();
                    break;
                case 9:
                    return;
            }
        }while(true);



    }



}
