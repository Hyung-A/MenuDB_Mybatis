package com.ohgiraffers.dao;

import com.ohgiraffers.common.DTO.CategoryDTO;

import java.util.List;

public interface CategoryMapper {

    List<CategoryDTO> selectAllCategory();

    int insertNewCategory(CategoryDTO category);

}
