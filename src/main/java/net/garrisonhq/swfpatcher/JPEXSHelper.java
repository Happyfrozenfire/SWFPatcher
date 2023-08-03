/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.garrisonhq.swfpatcher;

/**
 *
 * @author gusjg
 */
public class JPEXSHelper 
{
    public static void jpexsMain(String[] args)
    {
        try
        {
            JPEXSAPI.Methods.Main$main.invoke(null, (Object)args);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void parseArgs(String[] args)
    {
        try
        {
            JPEXSAPI.Methods.CLAP$parseArguments.invoke(null, (Object)args);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
