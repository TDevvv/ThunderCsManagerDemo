package com.thundergod;

import com.thundergod.screen.TScreenManager;
import com.thundergod.util.command.TCommandDataManager;
import com.thundergod.util.command.TInputCommandUtil;


public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10;) {
            init();
        }
        /*
        TCommandDataManager dataManager = new TCommandDataManager();
        dataManager.saveData("exit");
       System.out.println(dataManager.getData("exit"));
       /*/



    }

    public static void init(){
     TScreenManager screenManager = new TScreenManager();
    }
}