package Function;

public class CommandChecker extends Variable{

	FileList f_list = new FileList();
	FileCreater f_create = new FileCreater();
	FileDeleter f_delete = new FileDeleter();
	
	public CommandChecker() {
		
	}

	void commandCheck(String[] command) {
		int c_mode;
		
		switch(command[0]) {
			case "ls": f_list.viewList(); break;
			case "cd": f_list.viewList(command[1]); break;
			case "mkdir": {
				c_mode = 0;
				if(command.length >= 2) {
					String r_path = "";
					for(int i = 1; i < command.length; i++) r_path += command[i] + "/";
					f_create.FileCreate(r_path, c_mode);
				}
				else System.out.println("command not found");
			} break;
			case "touch": {
				c_mode = 1;
				f_create.FileCreate(command[1], c_mode);
			} break;
			case "rm": f_delete.deletefile(input_path + command[1]); break;
			default : System.out.println("command not found");
				
		}
	}
}
