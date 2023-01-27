package com.thundergod.listener;

public class TInputActionListener {
    public boolean current = true;

    public TInputActionListener() {

    }
    public void invalidInput(){
        System.out.println("unvalid command or token.");
    }

    public void inputGot(){
current = false;
    }
    public void newInput(){
      current = true;}

}
