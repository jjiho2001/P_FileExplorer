package Function;

import java.io.File;
import java.io.IOException;

public class FileCreater extends Variable{
	
	File input;
	
	public FileCreater() {
		
	}
	
	void FileCreate(String name, int mode) {
		input = new File(input_path + name);
		
		if(!input.exists()) {
			switch(mode) {
				case 0 : input.mkdirs();
				case 1 : {
					try {
						input.createNewFile();
					} catch (IOException  e) {
						e.printStackTrace();
					}
				}
			}
			
		}
	}
}
