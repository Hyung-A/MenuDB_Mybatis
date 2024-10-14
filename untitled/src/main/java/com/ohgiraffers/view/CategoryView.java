package com.ohgiraffers.view;

import com.ohgiraffers.common.DTO.CategoryDTO;
import com.ohgiraffers.controller.CategoryController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CategoryView {

    public void startCategory(){

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
                case 1 : categoryController.selectAllCategory(); break;
                case 2 : categoryController.insertNewCategory(inputCategory()); break;
                case 3 : categoryController.updateCategory(inputUpdateCategory()); break;
                case 4 : categoryController.deleteCategory(whichCategory()); break;
                case 9 : return;
            }
        }while(true);

    }

    // 새로운 카테고리 추가
    private static Map<String, String> inputCategory(){

        Scanner sc = new Scanner(System.in);
//        System.out.println("추가할 카테고리 코드를 입력해주세요 : ");
//        String categoryCode = sc.nextLine();
        System.out.println("추가할 카테고리 이름을 입력해주세요 : ");
        String categoryName = sc.nextLine();
        System.out.println("추가할 참조 카테고리 코드를 입력해주세요(1.식사, 2.음료, 3.디저트) : ");
        String refCategoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
//        parameter.put("categoryCode", categoryCode);
        parameter.put("categoryName", categoryName);
        parameter.put("refCategoryCode", refCategoryCode);

        return parameter;
    }

    // 카테고리 수정
    private static Map<String, String> inputUpdateCategory(){

        Scanner sc = new Scanner(System.in);
        System.out.println("수정하고싶은 카테고리 코드를 입력해주세요 : ");
        String categoryCode = sc.nextLine();
        System.out.println( categoryCode + "번 카테코리 코드의 수정할 이름을 입력해주세요 : ");
        String categoryName = sc.nextLine();
        System.out.println("수정할 참조 카테고리 코드를 입력해주세요(1.식사, 2.음료, 3.디저트) : ");
        String refCategoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("categoryCode", categoryCode);
        parameter.put("categoryName", categoryName);
        parameter.put("refCategoryCode", refCategoryCode);

        return parameter;
    }


    // 카테고리 삭제
    private static Map<String, String> whichCategory(){
        CategoryController categoryController = new CategoryController();

        Scanner sc = new Scanner(System.in);
        categoryController.selectAllCategory();
        System.out.println("삭제하고싶은 카테고리 코드를 입력해주세요 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("categoryCode", categoryCode);

        return parameter;
    }



}
