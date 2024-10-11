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

    public void printErrorMessage(String errorCode){

        String errorMessage = "";
        switch (errorCode) {
            case "selectAllCategory" : errorMessage="카테고리 전체 조회에 실패하였습니다.";
        }

        System.out.println(errorMessage);
    }

}
