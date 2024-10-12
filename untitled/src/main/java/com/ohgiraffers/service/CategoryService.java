package com.ohgiraffers.service;

import com.ohgiraffers.common.DTO.CategoryDTO;
import com.ohgiraffers.dao.CategoryMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class CategoryService {

    // 모든 카테고리 조회
    public List<CategoryDTO> selectAllCategory(){

        SqlSession sqlSession = getSqlSession();

        CategoryMapper mapper = sqlSession.getMapper(CategoryMapper.class);

        List<CategoryDTO> categoryList = mapper.selectAllCategory();

        sqlSession.close();

        return categoryList;
    }

    // 새로운 카테고리 추가
    public boolean insertNewCategory(CategoryDTO category){

        SqlSession sqlSession = getSqlSession();

        CategoryMapper mapper = sqlSession.getMapper(CategoryMapper.class);

        int result = mapper.insertNewCategory(category);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }

    // 카테고리 수정
    public boolean updateCategory(CategoryDTO category){

        SqlSession sqlSession = getSqlSession();

        CategoryMapper mapper = sqlSession.getMapper(CategoryMapper.class);

        int result = mapper.updateCategory(category);

        if(result > 0 ){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }


}
