import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class notepad extends JFrame{
	JTextArea t;
	MenuBar m;
	notepad p;
	Frame a;
	Menu m1,m2,m3;
	MenuItem m11,m12,m13,m21,m22,m23,m31,m32,m33;
	Font f;
	String str1,str7,str8,str9,str6;
	notepad(String str)
	{
		super(str);
	}
	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
			String str=(String)e.getActionCommand();
			
			int pos1;
			if(str.equals("New"))
			{
				dispose();
				notepad note1 = new notepad("Untitled-Notepad");
				note1.setComponents();
				note1.setSize(500,500);
				note1.setVisible(true);
			}
			try{
			if(str.equals("Save as"))
			{
			FileDialog dialog1=new FileDialog(p,"Save As",FileDialog.SAVE);
			dialog1.setVisible(true);
			str7=dialog1.getDirectory();   //getting directory where file is stored
			str8=dialog1.getFile();         // Getting file name
			str9=str7+str8;                   // concatenate directory and filename
			str6=t.getText();            // getting textarea content
			int len1=str6.length();          // getting length of textarea
			byte buf[]=str6.getBytes();        // converting to bytes
			File f1=new File(str9);            // Making empty file with in the directory where user want to make
			FileOutputStream fobj1=new FileOutputStream(f1);  //making object of file to write data into it
			for(int k=0;k<len1;k++)
			{
			fobj1.write(buf[k]);                    // Writing data into file
			}
			fobj1.close();            //closing file after write
			setTitle(str8);           //setting title of notepad given by user
			}}
			catch(Exception g){}
			if(str.equals("Quit"))
			{
			System.exit(0);
			}
			if(str.equals("copy"))
			{
			str1=t.getSelectedText();
			}
			if(str.equals("paste"))
			{
			pos1=t.getCaretPosition();
			t.insert(str1,pos1);
			}
			if(str.equals("undo"))
			{
			
			}
			if(str.equals("small"))
			{
			f=new Font("",Font.BOLD,12);
			t.setFont(f);
			}
			if(str.equals("Large"))
			{
			f=new Font("",Font.BOLD,24);
			t.setFont(f);	
			}
			if(str.equals("medium"))
			{
			f=new Font("",Font.BOLD,18);
			t.setFont(f);
			}
		}
	}
	public void setComponents()
	{
		t=new JTextArea();
		a=new Frame();
		m=new MenuBar();
		m1=new Menu("File");
		m2=new Menu("Edit");
		m3=new Menu("View");
		m11=new MenuItem("New");
		m12=new MenuItem("Save as");
		m13=new MenuItem("Quit");
		m21=new MenuItem("copy");
		m22=new MenuItem("paste");
		m23=new MenuItem("undo");
		m31=new MenuItem("small");
		m32=new MenuItem("medium");
		m33=new MenuItem("Large");
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
		m3.add(m31);
		m3.add(m32);
		m3.add(m33);
		m.add(m1);
		m.add(m2);
		m.add(m3);
		setMenuBar(m);
		add(t);
		m11.addActionListener(new Handler());
		m12.addActionListener(new Handler());
		m13.addActionListener(new Handler());
		m21.addActionListener(new Handler());
		m22.addActionListener(new Handler());
		m23.addActionListener(new Handler());
		m31.addActionListener(new Handler());
		m32.addActionListener(new Handler());
		m33.addActionListener(new Handler());	
	}
	public static void main(String args[])
	{
		 notepad p=new notepad("notepad");
		p.setComponents();
		//p.setLayout(null);
		p.setSize(500,500);	
		p.setVisible(true);
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
