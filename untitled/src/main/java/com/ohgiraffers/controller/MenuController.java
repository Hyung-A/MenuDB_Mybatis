package com.ohgiraffers.controller;

import com.ohgiraffers.common.DTO.MenuDTO;
import com.ohgiraffers.service.MenuService;
import com.ohgiraffers.view.MenuPrintResult;
import com.ohgiraffers.view.MenuView;

import java.util.List;
import java.util.Map;

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
            printResult.printErrorMessage("selectAllMenu");
        }
    }

    public void registMenu(Map<String, String> parameter) {

        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        MenuDTO menuDTO = new MenuDTO();
        menuDTO.setName(name);
        menuDTO.setPrice(price);
        menuDTO.setCategoryCode(categoryCode);

        if(menuService.registMenu(menuDTO)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }

    }
}
