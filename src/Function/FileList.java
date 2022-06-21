package Function;

import java.io.File;

public class FileList extends Variable{

	File input;

	public FileList() {
		
	}
	
	public void viewList() {
		input = new File(input_path);
		
		if(input.exists()) {
			File[] input_list = input.listFiles();
			
				for(File f : input_list) {
					if(f.isDirectory()) {
						System.out.println(f.getName() + "/");
					} else {
						System.out.println(f.getName());
					}
					//System.out.println(f.getPath());
				}
			} else {
				System.out.println("No such file of directory");
				input_path = input_path.substring(0, input_path.lastIndexOf("/", input_path.length()-2)) + "/";
			}
		System.out.println(input_path);
		}
	
	void viewList(String path) {
		if(path.equals("..") && input_path.lastIndexOf("/", input_path.length()-2) != -1) {
			input_path = input_path.substring(0, input_path.lastIndexOf("/", input_path.length()-2)) + "/";
			viewList();
		} else if(path.equals("..") && input_path.lastIndexOf("/", input_path.length()-2) == -1) { 
			viewList();
		} else {
			input_path += path + "/";
			viewList();
		}
	}
}
