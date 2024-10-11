package com.ohgiraffers.controller;

import com.ohgiraffers.common.DTO.CategoryDTO;
import com.ohgiraffers.service.CategoryService;
import com.ohgiraffers.view.CategoryPrintResult;

import java.util.ArrayList;
import java.util.List;

public class CategoryController {

    private final CategoryPrintResult categoryPrintResult;
    private final CategoryService categoryService;

    public CategoryController (){

        categoryService = new CategoryService();

        categoryPrintResult = new CategoryPrintResult();

    }

    // Category 테이블 전체 조회
    public void selectAllCategory(){

        List<CategoryDTO> categoryList = categoryService.selectAllCategory();

        if(categoryList != null){
            categoryPrintResult.printAllCategory(categoryList);
        } else {
            categoryPrintResult.printErrorMessage("selectAllCategory");
        }

    }



}
