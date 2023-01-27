package com.thundergod.util.command;

import java.util.HashMap;

public class TCommandDataManager {
    HashMap<String,Integer> te_util_command_datamanager = new HashMap<String,Integer>();

    public TCommandDataManager(){

    }

    public void setData(String te_util_command_datamanager_variable_string,int te_util_command_datamanager_variable_int) {
        te_util_command_datamanager.put(te_util_command_datamanager_variable_string,te_util_command_datamanager_variable_int);
    }
    public Integer getData(String te_util_command_datamanager_variable_string_2) {
        return te_util_command_datamanager.get(te_util_command_datamanager_variable_string_2);
    }
    public void saveData(String data){
        TInputCommandUtil util =new TInputCommandUtil();
        util.saveFromData(te_util_command_datamanager,data);
    }

}
