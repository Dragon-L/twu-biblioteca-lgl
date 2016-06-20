package com.twu.biblioteca.controller.commandRouter;

import com.twu.biblioteca.controller.command.MyCommand;

import java.util.Map;

public class Router {
    private MyCommand rootCommand;

    private Map<String,MyCommand> originMapper;
    private Map<String,MyCommand> currentMapper;

    public Router(Map<String,MyCommand> mapper,MyCommand rootCommand){
        this.originMapper = mapper;
        this.currentMapper = mapper;
        this.rootCommand = rootCommand;
    }


    public MyCommand getCommand(String str){
        return currentMapper.get(str);
    }

    public void setCurrentMapper(Map<String,MyCommand> mapper){
        currentMapper = mapper;
    }

    public void setOriginMapper(){ currentMapper = originMapper; }

    public String excuteRootCommand(){
        return rootCommand.execute(this);
    }
}
