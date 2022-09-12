package com.tnsif.applet;

import java.applet.Applet;

import java.awt.Button;
import java.awt.Event;
import java.awt.TextField;

public class Applet2 extends Applet{
	Button b1,b2;
	TextField t;
	public void init() {
		add(b1 = new Button("Click"));
		add(t = new TextField(9));
		add(b2 = new Button("Clear"));
		
	}
	public boolean action(Event e, Object o) {
		if(e.target.equals(b1))
			t.setText("Vaibhavi");
		if(e.target.equals(b2))
			t.setText("");
		return false;
	}

}
