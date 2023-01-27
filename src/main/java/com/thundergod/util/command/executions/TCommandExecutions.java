package com.thundergod.util.command.executions;

import com.thundergod.screen.InputChecker;
import com.thundergod.screen.TScreenManager;

public class TCommandExecutions {
    public TCommandExecutions(){

    }
    public void commandExecutor(int commandNumber){
        switch (commandNumber){
            case 1 :{
             System.exit(0);
            }
            case 2:{
                InputChecker te_screen_input_checker_class_define = new InputChecker();
                te_screen_input_checker_class_define.getString("Printing->");
            }

        }
    }
    public void commandExecutionPrint(){





    }
}
