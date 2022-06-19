package Function;

import java.io.File;

public class FileDeleter extends Variable{

	File input;
	String d_path = "";
	
	public String getD_path() {
		return d_path;
	}

	public void setD_path(String d_path) {
		this.d_path = d_path;
	}

	public FileDeleter() {
		// TODO Auto-generated constructor stub
	}

	void deletefile(String path) {;
		input = new File(path);
		
		if(input.exists()) {
			File[] file_list = input.listFiles();
			
			for(File f : file_list) {
				if(f.isFile()) {
					System.out.println(f.getName() + "파일 삭제");
					f.delete();
				} else {
					deletefile(f.getPath());
				}
				f.delete();
			}
			input.delete();
		} else {
			System.out.println("No such file or directory");
		}
	}
}
