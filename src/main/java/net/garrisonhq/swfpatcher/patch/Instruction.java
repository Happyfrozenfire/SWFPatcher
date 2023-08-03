/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.garrisonhq.swfpatcher.patch;

/**
 *
 * @author gusjg
 */
public abstract class Instruction 
{
    protected final String name;
    
    protected Instruction(String name)
    {
        this.name = name;
    }
    
    public abstract void execute();
}
