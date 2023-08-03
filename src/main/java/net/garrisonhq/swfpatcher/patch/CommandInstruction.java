/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.garrisonhq.swfpatcher.patch;

import net.garrisonhq.swfpatcher.JPEXSHelper;

/**
 *
 * @author gusjg
 */
public class CommandInstruction extends Instruction
{
    protected String[] args;
    
    public CommandInstruction(String[] args) {
        super("command");
        this.args = args;
    }

    @Override
    public void execute() 
    {
        JPEXSHelper.parseArgs(args);
    }
}
