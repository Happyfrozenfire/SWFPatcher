/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package net.garrisonhq.swfpatcher;

import java.io.*;
import java.lang.reflect.*;
import java.net.*;
import org.update4j.DynamicClassLoader;

/**
 *
 * @author gusjg
 */
public class SWFPatcher {
    
    public static DynamicClassLoader classLoader = (DynamicClassLoader)ClassLoader.getSystemClassLoader();
    public static Class mainClass;
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String[] args2 = new String[] 
        { 
            "C:\\Users\\gusjg\\OneDrive\\Documents\\GitHub\\jpexs-decompiler\\dist\\ffdec.jar"
        };
        
        
        try
        {
            File file = new File(args2[0]); 
            if(!file.exists())
            {
                throw new FileNotFoundException(args2[0] + " does not exist."); //FileNotFoundException
            }
            
            classLoader.appendToClassPathForInstrumentation(args2[0]);
            
            mainClass = Class.forName("com.jpexs.decompiler.flash.gui.Main", true, classLoader);
            Method mainMethod = mainClass.getDeclaredMethod("main", String[].class);
            
            mainMethod.invoke(null, (Object)new String[0]);
            
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Could not locate " + args2[0]);
            return;
        }
        catch(IOException e)
        {
            System.out.println("Could not access " + args2[0]);
            return;
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Could not locate com.jpexs.decompiler.flash.gui.Main in " + args2[0]);
            return;
        }
        catch(NoSuchMethodException e)
        {
            System.out.println("Could not locate main(string[] args) in com.jpexs.decompiler.flash.gui.Main in " + args2[0]);
            return;
        }
        catch(IllegalAccessException e)
        {
            e.printStackTrace();
            return;
        }
        catch(InvocationTargetException e)
        {
            e.printStackTrace();
            return;
        }
    }
}
