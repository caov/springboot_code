package com.wisely.highlight_spring4.ch3.conditional;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 3:39 2017/7/6 0006
 */
public class LinuxListService implements  ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
