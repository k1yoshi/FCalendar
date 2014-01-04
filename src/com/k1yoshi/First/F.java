/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.k1yoshi.First;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JComponent;

/**
 *
 * @author cixneo
 */
public class F<E> extends ArrayList<E> {
    public void each(Function<Yoshi> function)
    {
        for(int i = 0; i < size(); i++)
        {
            function.ini((Yoshi) get(i));
        }
    }
    public F<E> add(E... e)
    {
        addAll(Arrays.asList(e));
        return this;
    }
    public F<E> add(JComponent... jcomponent)
    {
        for(int i = 0; i < jcomponent.length; i++)
        {
            Yoshi y = new Yoshi(jcomponent[i]);
            add((E)y);
        }
        return this;
    }
    public JComponent[] getComponents()
    {
        ArrayList<JComponent> components = new ArrayList();
        try{
            for(int i = 0; i < size(); i++)
            {
                Yoshi yoshi = (Yoshi)get(i);
                components.add(yoshi.This);
            }
            JComponent[] result = new JComponent[components.size()];
            for(int i = 0; i < components.size(); i ++)
            {
                result[i] = components.get(i);
            }
            return result;
        }catch(Exception ex){
            System.out.println("Error en getComponents\n"+ex.getMessage());
            return null;
        }
    }
}
