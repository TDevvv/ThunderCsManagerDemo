package com.thundergod.screen;

import com.thundergod.listener.TInputActionListener;
import com.thundergod.util.command.TCommandDataManager;
import com.thundergod.util.command.TInputCommandUtil;
import com.thundergod.util.command.executions.TCommandExecutions;
import com.thundergod.util.command.executions.TExecutionTemplate;

import java.util.Scanner;

public class InputChecker{
    TExecutionTemplate te_util_command_execution_template_class_define= new TExecutionTemplate();
    TInputActionListener inputActionListener = new TInputActionListener();
    TCommandExecutions te_util_command_executions_class_define = new TCommandExecutions();
    TInputCommandUtil te_util_command_class_define = new TInputCommandUtil();
    TCommandDataManager te_util_command_data_class_define = new TCommandDataManager();
    Scanner te_console_scr = new Scanner(System.in);
    public InputChecker(){
    }
    public String  getInput(){
        inputActionListener.inputGot();
        String te_input_variable_input= te_console_scr.next();
        te_util_command_execution_template_class_define.getDefaultTemplate(te_input_variable_input);
        boolean te_screen_manager_variable_boolean =  te_util_command_class_define.readFromData(te_input_variable_input);
        if(te_screen_manager_variable_boolean){

            te_util_command_execution_template_class_define.getValidTemplate(te_input_variable_input);
            inputActionListener.newInput();
        }else {
            te_util_command_execution_template_class_define.getInvalidTemplate(te_input_variable_input);
            inputActionListener.newInput();
        }
        return te_input_variable_input;
    }
    public void getString(String command_message){
        inputActionListener.inputGot();
        loop :while (te_console_scr.hasNext()){
           String s = te_console_scr.next();
            switch (s){
                case "/off":break loop;
                default: System.out.println(command_message+" { "+s+ " }");
            }
        };
       // inputActionListener.newInput();
    }
    public boolean getBoolean(){
        inputActionListener.inputGot();
        boolean te_input_variable_boolean = te_console_scr.nextBoolean();
        inputActionListener.newInput();
        return te_input_variable_boolean;
    }

}
