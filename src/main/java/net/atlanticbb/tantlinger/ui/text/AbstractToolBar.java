/**
 * AbstractToolBar.java
 * $Id: AbstractToolBar.java 1998 2013-01-22 02:37:19Z andy $
 * Copyright (C) 2007-2012, Andreas Rudolph
 */
package net.atlanticbb.tantlinger.ui.text;

import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.*;

import org.bushe.swing.action.ActionUIFactory;

/**
 * AbstractToolBar.
 * <br/>$Id: AbstractToolBar.java 1998 2013-01-22 02:37:19Z andy $
 * @author Andreas Rudolph
 */
public abstract class AbstractToolBar extends JToolBar
{
  public static HashMap<String, JComponent> hashMap = new HashMap<String, JComponent>();
  private static int counter = 0;

  protected AbstractToolBar()
  {
    super();
    build();
  }

  protected void addToToolBar( Action act )
  {
    AbstractButton button = ActionUIFactory.getInstance().createButton( act );
    configToolbarButton( button );
    add( button );
    addButtonToMap(counter+"", button);
    counter++;
  }

  public static void addButtonToMap(String description, JComponent ab){
    hashMap.put(description, ab);
  }

  private void build()
  {
    setFloatable( false );
    setFocusable( false );
  }

  protected void configToolbarButton( AbstractButton button )
  {
    button.setText( null );
    button.setMnemonic( 0 );
    button.setMargin( new Insets( 1, 1, 1, 1 ) );
    button.setMaximumSize( new Dimension( 22, 22 ) );
    button.setMinimumSize( new Dimension( 22, 22 ) );
    button.setPreferredSize( new Dimension( 22, 22 ) );
    button.setFocusable( false );
    button.setFocusPainted( false );
    //button.setBorder(plainBorder);
    Action a = button.getAction();
    if (a != null)
    {
      button.setToolTipText( a.getValue( Action.NAME ).toString() );
    }
  }
  public static void setButtonVisible(String description, boolean isVisibleButton){
    JComponent ab = hashMap.get(description);
    ab.setVisible(isVisibleButton);
  }
}