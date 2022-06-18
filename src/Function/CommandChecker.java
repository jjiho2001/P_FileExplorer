package Function;

public class CommandChecker {

	FileList f_list = new FileList();
	
	public CommandChecker() {
		
	}

	void commandCheck(String[] command) {
		
		if(command[0].equals("ls")) {
			f_list.viewList();
		} else if (command[0].equals("cd")){
			f_list.viewList(command[1]);
		} else if (command[0].equals("mkdir")){
			
		} else {
			System.out.println("command not found");
		}
	}
}
