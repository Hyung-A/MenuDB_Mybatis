package com.ohgiraffers.view;

import com.ohgiraffers.common.DTO.CategoryDTO;
import com.ohgiraffers.common.DTO.MenuDTO;

import java.util.List;

public class CategoryPrintResult {

    public void printAllCategory(List<CategoryDTO> categoryList){

        for(CategoryDTO category : categoryList){
            System.out.println(category);
        }

    }

    public void printSuccessMessage(String successCode){
        String successMessage = "";
        switch (successCode){
            case "insertNewCategory" : successMessage = "새로운 카테고리 추가에 성공하였습니다."; break;

        }
        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode){

        String errorMessage = "";
        switch (errorCode) {
            case "selectAllCategory" : errorMessage = "카테고리 전체 조회에 실패하였습니다."; break;
            case "insertNewCategory" : errorMessage = "새로운 카테고리 추가에 실패하였습니다."; break;

        }

        System.out.println(errorMessage);
    }

}
