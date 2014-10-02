package com.verhas.misi;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Length implements Command {

	@Override
	public File execute(File wd, String[] params) throws IOException {
		if(params.length < 2 ||
				!Arrays.asList(wd.list()).contains(params[1])){
			throw new IOException("No such file or directory!");
		}else{
			System.out.println("Length: " + new File(wd,params[1]).length());
		}
		return wd;
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return "length";
	}

}
