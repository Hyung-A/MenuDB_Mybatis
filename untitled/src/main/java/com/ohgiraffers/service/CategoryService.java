package com.ohgiraffers.service;

import com.ohgiraffers.common.DTO.CategoryDTO;
import com.ohgiraffers.dao.CategoryMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class CategoryService {

    public List<CategoryDTO> selectAllCategory(){

        SqlSession sqlSession = getSqlSession();

        CategoryMapper mapper = sqlSession.getMapper(CategoryMapper.class);

        List<CategoryDTO> categoryList = mapper.selectAllCategory();

        sqlSession.close();

        return categoryList;
    }

}
