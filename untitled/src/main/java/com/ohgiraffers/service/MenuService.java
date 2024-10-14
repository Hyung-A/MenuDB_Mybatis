package com.ohgiraffers.service;

import com.ohgiraffers.common.DTO.MenuDTO;
import com.ohgiraffers.dao.MenuMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class MenuService {

    public List<MenuDTO> selectAllMenu() {

        SqlSession sqlSession = getSqlSession();

        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menuList = menuMapper.selectAllMenu();

        sqlSession.close();

        return menuList;
    }

    public boolean registMenu(MenuDTO menuDTO) {

        SqlSession sqlSession = getSqlSession();

        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);

        int result = menuMapper.insertMenu(menuDTO);

        if (result > 0) {
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean modifyMenu(MenuDTO menuDTO) {

        SqlSession sqlSession = getSqlSession();

        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);

        int result = menuMapper.modifyMenu(menuDTO);

        if (result > 0) {
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean deleteMenu(int code) {

        SqlSession sqlSession = getSqlSession();

        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);

        int result = menuMapper.deleteMenu(code);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

}
