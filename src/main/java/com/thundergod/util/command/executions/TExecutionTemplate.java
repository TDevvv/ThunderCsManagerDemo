package com.thundergod.util.command.executions;

public class TExecutionTemplate {
    public TExecutionTemplate(){


    }
    public void getDefaultTemplate(String command){
        System.out.println("ThndrExec./*/- "+"["+command+"]");
    }
    public void getInvalidTemplate(String command){
        System.out.println("ThndrErr./*--"+"["+command+"]"+" cause: invalid command or token.");
    }
    public void getValidTemplate(String command){
        System.out.println( "ThndrRun./**-"+"["+command+"]"+" running command.");
    }
}
