package com.ohgiraffers.controller;

import com.ohgiraffers.common.DTO.MenuDTO;
import com.ohgiraffers.service.MenuService;
import com.ohgiraffers.view.MenuPrintResult;
import com.ohgiraffers.view.MenuView;

import java.util.List;

public class MenuController {

    private final MenuPrintResult printResult;

    private final MenuService menuService;

    public MenuController() {
        printResult = new MenuPrintResult();
        menuService = new MenuService();
    }

    public void selectAllMenu() {

        List<MenuDTO> menuList = menuService.selectAllMenu();

        if(menuList != null) {
            printResult.printMenuList(menuList);
        } else {
            printResult.errorMesssage("selectAllMenu");
        }
    }
}
