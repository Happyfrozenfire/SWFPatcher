/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.garrisonhq.swfpatcher;

import java.lang.reflect.*;

/**
 *
 * @author gusjg
 */
public class JPEXSAPI 
{
    public static class Classes
    {
        public static Class Main, CLAP;
    }
    
    public static class Methods
    {
        public static Method Main$main, CLAP$parseArguments;
    }
    
    public static void initClasses() throws ClassNotFoundException
    {
        Classes.Main = Class.forName("com.jpexs.decompiler.flash.gui.Main", true, SWFPatcher.classLoader);
        Classes.CLAP = Class.forName("com.jpexs.decompiler.flash.console.CommandLineArgumentParser", true, SWFPatcher.classLoader);
    }
    
    public static void initMethods() throws NoSuchMethodException
    {
        Methods.Main$main = Classes.Main.getDeclaredMethod("main", String[].class);
        Methods.CLAP$parseArguments = Classes.CLAP.getDeclaredMethod("parseArguments", String[].class);
    }
}
