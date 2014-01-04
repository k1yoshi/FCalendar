/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.k1yoshi.First;

import java.awt.Component;
import java.awt.Container;
import java.util.HashMap;
import javax.swing.JComponent;

/**
 *
 * @author cixneo
 */
public class FString {
    
    public static HashMap<String, String> Controls = new HashMap();
    public static String[] Selectors = {"*",">",","};
    public FString()
    {
        ini();
    }
    public static void ini()
    {
        if(Controls.isEmpty())
        {
            Controls.put("button", "JButton");
            Controls.put("text", "JTextField");
            Controls.put("label", "JLabel");
            Controls.put("password", "JPasswordField");
            Controls.put("text-pane", "JTextPane");
            Controls.put("panel", "JPanel");
            Controls.put("radio", "JRadioButton");
            Controls.put("checked", "JCheckBox");
            Controls.put("select", "JComboBox");
            Controls.put("list", "JList");
            Controls.put("scroll", "JScrollBar");
            Controls.put("slider", "JSlider");
            Controls.put("table", "JTable");
            Controls.put("editor-pane", "JEditorPane");
            Controls.put("tree", "JTree");
            Controls.put("progress", "JProgressBar");
        }
    }
    public static F<Yoshi> $FirstString(Component[] component, String selector)
    {
        ini();
        F<Yoshi> yoshis = new F();
        getAll(component, yoshis, selector);
        return yoshis;
    }
    public static void $FirstNext(F<Yoshi> yoshis, String selector)
    {
        int cant_items = yoshis.size();
        if(cant_items > 0)
        {
            JComponent[] jcomponents = new JComponent[cant_items];
            for(int i = 0; i < cant_items; i++)
            {
                jcomponents[i] = yoshis.get(i).This;
            }
            yoshis.clear();
            getNext(jcomponents, yoshis, selector);
        }
    }
    private static void getNext(JComponent[] jcomponents,F<Yoshi> yoshis,String selector)
    {
        if(jcomponents.length > 0)
        {
            for(int i = 0; i < jcomponents.length; i++)
            {
                Component[] component = jcomponents[i].getComponents();
                for(Component com : component)
                {
                    String paquete,tipo;
                    paquete = com.getClass().getName().substring(0, 11);
                    tipo = com.getClass().getSimpleName();
                    if(paquete.equals("javax.swing") && !tipo.equals("JRootPane") && tipo.equals(Controls.get(selector)))
                        yoshis.add((JComponent)com);
                }
            }
        }
    }
    public static void $FirstAll()
    {
        
    }
    
    private static void getAll(Component[] component,F<Yoshi> yoshis,String selector)
    {
        if(component.length > 0)
        {
            for(Component com : component)
            {
                String paquete,tipo;
                paquete = com.getClass().getName().substring(0, 11);
                tipo = com.getClass().getSimpleName();
                if(paquete.equals("javax.swing") && !tipo.equals("JRootPane") && tipo.equals(Controls.get(selector)))
                    yoshis.add((JComponent)com);
                Container ct = (Container)com;
                if(ct.getComponentCount() > 0)
                    getAll(ct.getComponents(),yoshis, selector);
            }
        }
    }
    
}
