package com.verhas.misi;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Cd implements Command {

	@Override
	public File execute(File wd, String[] params) throws IOException {
		if(params.length < 2){
			throw new IOException("No such file or directory!");
		}else if(params[1].equals("..")){
			return wd.getParentFile();
		}else if(Arrays.asList(wd.list()).contains(params[1])){
			return new File(wd, params[1]);
		}else{
			throw new IOException("No such file or directory!");
		}
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return "cd";
	}

}
