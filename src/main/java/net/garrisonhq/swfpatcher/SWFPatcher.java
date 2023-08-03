/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package net.garrisonhq.swfpatcher;

import java.io.*;
import java.util.Stack;
import net.garrisonhq.swfpatcher.patch.*;
import org.update4j.DynamicClassLoader;

/**
 *
 * @author gusjg
 */
public class SWFPatcher {
    
    public static DynamicClassLoader classLoader = (DynamicClassLoader)ClassLoader.getSystemClassLoader();
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String[] args2 = new String[] 
        { 
            "C:\\Users\\gusjg\\OneDrive\\Documents\\GitHub\\jpexs-decompiler\\dist\\ffdec.jar",
            "-help"
        };
        
        Stack<String> arguments = new Stack<>();
        for (int i = args2.length - 1; i >= 0; i--) {
            String arg = args2[i];
            if (arg.length() > 0) {
                arguments.add(arg);
            }
        }
        
        String jpexsLocation = arguments.pop();
        
        try
        {
            File file = new File(jpexsLocation); 
            if(!file.exists())
            {
                throw new FileNotFoundException(jpexsLocation + " does not exist."); //FileNotFoundException
            }
            
            classLoader.appendToClassPathForInstrumentation(jpexsLocation);
            
            JPEXSAPI.initClasses();
            
            JPEXSAPI.initMethods();
            
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Could not locate " + jpexsLocation);
            return;
        }
        catch(IOException e)
        {
            System.out.println("Could not access " + jpexsLocation);
            return;
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Could not locate com.jpexs.decompiler.flash.gui.Main in " + jpexsLocation);
            return;
        }
        catch(NoSuchMethodException e)
        {
            System.out.println("Could not locate main(string[] args) in com.jpexs.decompiler.flash.gui.Main in " + jpexsLocation);
            return;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return;
        }
        
        args2 = new String[args2.length - 1];
        for(int i = 0; !arguments.isEmpty(); i++)
        {
            args2[i] = arguments.pop();
        }
        
        Instruction instruction = new CommandInstruction(args2);
        instruction.execute();
    }
}
