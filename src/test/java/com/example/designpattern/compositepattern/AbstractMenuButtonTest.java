package com.example.designpattern.compositepattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractMenuButtonTest {

    @Test
    void menuTest(){
        Menu userMenu = new Menu("用户管理", "🧑", 2);
        Button createUser = new Button("新增用户");
        Button updateUser = new Button("修改用户");
        Button deleteUser = new Button("删除用户");
        userMenu.add(createUser);
        userMenu.add(updateUser);
        userMenu.add(deleteUser);

        Menu logMenu = new Menu("操作日志", "📃", 2);
        Button export = new Button("导出Excel");
        logMenu.add(export);

        Menu systemMenu = new Menu("系统管理", "🔨", 1);
        systemMenu.add(userMenu);
        systemMenu.add(logMenu);

        systemMenu.print();
    }

}