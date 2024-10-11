package com.ohgiraffers.controller;

import com.ohgiraffers.common.DTO.CategoryDTO;
import com.ohgiraffers.service.CategoryService;
import com.ohgiraffers.view.CategoryPrintResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    public void insertNewCategory(Map<String, String> parameter){

//        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));
        String categoryName = parameter.get("categoryName");
        int refCategoryCode= Integer.parseInt(parameter.get("refCategoryCode"));

        CategoryDTO category = new CategoryDTO();
//        category.setCategoryCode(categoryCode);
        category.setCategoryName(categoryName);
        category.setRefCategoryCode(refCategoryCode);

        if(categoryService.insertNewCategory(category)){
            categoryPrintResult.printSuccessMessage("insertNewCategory");
        } else {
            categoryPrintResult.printErrorMessage("insertNewCategory");
        }
    }



}
