package com.twu.biblioteca.controller.shell;

import java.util.Map;

public class Router {
    private Map<String,MyCommand> originMapper;
    private Map<String,MyCommand> currentMapper;

    public MyCommand getCommand(String str){
        return currentMapper.get(str);
    }
}
