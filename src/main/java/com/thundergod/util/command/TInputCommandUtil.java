package com.thundergod.util.command;

import com.thundergod.listener.TInputActionListener;
import com.thundergod.util.command.executions.TCommandExecutions;

import java.io.*;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TInputCommandUtil {
    TCommandExecutions te_util_command_executions_class_define = new TCommandExecutions();
    TCommandDataManager te_util_command_data_class_define = new TCommandDataManager();
    public File te_util_filesys_creating_dir = new File(System.getProperty("user.dir")+"/dat");
    public File te_util_filesys_creating_file=new File(System.getProperty("user.dir")+"/dat/command.text");
    public final File te_util_filesys_creating_file_dat=new File(System.getProperty("user.dir")+"/dat/command_data.text");
    private boolean te_util_variable_boolean_comparehelper;


    public TInputCommandUtil(){
       te_util_filesys_creating_dir.mkdirs();
        try {
            te_util_filesys_creating_file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean readFromData(String te_util_command_commandtext){
        Scanner te_util_filesys_reader_scanner;
        try {
             te_util_filesys_reader_scanner = new Scanner(te_util_filesys_creating_file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i <25;i++) {
            String s = new String(te_util_filesys_reader_scanner.next());
            //System.out.println(s);
           boolean te_util_variable_boolean_compare =s.equals(te_util_command_commandtext);
            te_util_variable_boolean_comparehelper = te_util_variable_boolean_compare;
           if(te_util_variable_boolean_compare){
             String te_util_command_substring_text = te_util_filesys_reader_scanner.next();
             //System.out.println(te_util_command_substring_text);
              TCommandDataManager commandDataManager = new TCommandDataManager();
              commandDataManager.setData(te_util_command_commandtext, Integer.parseInt(te_util_command_substring_text));
              te_util_command_executions_class_define.commandExecutor(Integer.parseInt(te_util_command_substring_text));
              commandDataManager.saveData(te_util_command_commandtext);
               break;
           }
           else {
               //System.out.println("bu degil");
           }
           if(i==24){
               return false;
           }
        }


        return te_util_variable_boolean_comparehelper;
    }
    public boolean compare(String te_util_compare_string_1,String te_util_compare_string_2){
        return te_util_compare_string_1.equals(te_util_compare_string_2);
    }
    public void saveFromData(HashMap<String,Integer> hashmap,String dat){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(te_util_filesys_creating_file_dat,true));
            writer.write(dat+">"+hashmap.get(dat));
            writer.newLine();
            writer.close();
            System.out.println("info/- Command Seed : "+hashmap.get(dat));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
