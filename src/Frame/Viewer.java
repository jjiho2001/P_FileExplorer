package Frame;

import java.awt.Container;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

import Function.FileList;

public class Viewer extends JFrame{

	public Viewer() {
		setTitle("P file-explorer");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = new Container();
		BoxLayout fl = new BoxLayout(c, BoxLayout.Y_AXIS);
		setLayout(fl);
		setVisible(true);
		
		viewStart();
	}
	
	void viewStart() {
		FileList f_list = new FileList();
		f_list.viewList();
	}

}
