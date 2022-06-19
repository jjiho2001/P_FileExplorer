package Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExplorerStarter extends Variable{

	CommandChecker check = new CommandChecker();
	
	public ExplorerStarter() {
		start();
	}

	void start() {
		InputStreamReader inputStream = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(inputStream);
		String temp_command = "";
		
		while(true) {
			System.out.print("$ ");
			try {
				temp_command = buffer.readLine();
				if(temp_command.equals("exit")) break;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			String[] command = temp_command.split(" ");
			check.commandCheck(command);
		}
	}
}
