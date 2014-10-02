package com.verhas.misi;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class FileManager {
	private HashMap<String, Command> commands;
	private File workDirectory;
	
	public void process(String[] params) throws IOException{
		if(params.length > 0 && commands.containsKey(params[0])){
			workDirectory = commands.get(params[0]).execute(workDirectory, params);
		}
		else{
			throw new IOException("Wrong command, sorry m8.");
		}
	}
	
	public  Command put(Command value){
		return commands.put(value.getCommand(), value);
	}
	
	public Command remove(String key){
		return commands.remove(key);
	}
	
	public void clear(){
		commands.clear();
	}
}
