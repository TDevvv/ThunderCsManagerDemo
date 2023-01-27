package com.thundergod.screen;


import com.thundergod.listener.TInputActionListener;
import com.thundergod.util.command.TCommandDataManager;
import com.thundergod.util.command.TInputCommandUtil;
import com.thundergod.util.command.executions.TCommandExecutions;
import com.thundergod.util.command.executions.TExecutionTemplate;

import java.util.Scanner;

public class TScreenManager {
    TExecutionTemplate te_util_command_execution_template_class_define= new TExecutionTemplate();
    TInputActionListener inputActionListener = new TInputActionListener();
    TCommandExecutions te_util_command_executions_class_define = new TCommandExecutions();
    TInputCommandUtil te_util_command_class_define = new TInputCommandUtil();
    TCommandDataManager te_util_command_data_class_define = new TCommandDataManager();
    InputChecker te_screen_manager_class_define = new InputChecker();
    Scanner te_console_scr = new Scanner(System.in);
    public TScreenManager(){

        if(inputActionListener.current){
            System.out.println("\n");
            System.out.print("\r>ThndrC/*-> ");
            System.out.println("finish"+"->"+te_screen_manager_class_define.getInput());
        }
    }
    public void getInputScreen(){

    }


}
