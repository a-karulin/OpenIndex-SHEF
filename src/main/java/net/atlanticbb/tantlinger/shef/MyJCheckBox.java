package net.atlanticbb.tantlinger.shef;

import javax.swing.*;

/**
 * Created by Administrator on 23.07.2017.
 */
public class MyJCheckBox extends JCheckBox {
    private String description;

    public MyJCheckBox(String text, String description) {
        super(text);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
