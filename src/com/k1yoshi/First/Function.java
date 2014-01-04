/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.k1yoshi.First;

import javax.swing.JComponent;

/**
 *
 * @author cixneo
 */
public abstract class Function<E> {
    public JComponent This;
    public Function(){}
    public void ini(E e)
    {
        if(e instanceof Yoshi)
        {
            Yoshi y = (Yoshi)e;
            This = y.This;
            internal((E)y);
        }else{
           internal(e);
        }
    }
    public abstract void internal(E d);
}
