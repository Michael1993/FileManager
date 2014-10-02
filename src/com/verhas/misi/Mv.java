package com.verhas.misi;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Mv implements Command {

	@Override
	public File execute(File wd, String[] params) throws IOException {
		if(params.length < 3 ||
				!Arrays.asList(wd.list()).contains(params[1]))
			throw new IOException("No such file or directory!");
		else{
			File f = new File(wd, params[1]);
			if(!f.renameTo(new File(wd,params[2]))){
				throw new IOException("The task failed.");
			}
		}
		return wd;
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return "mv";
	}

}
