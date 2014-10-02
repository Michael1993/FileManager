package com.verhas.misi;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Rm implements Command {

	@Override
	public File execute(File wd, String[] params) throws IOException {
		if(params.length < 2 || !Arrays.asList(wd.list()).contains(params[1])){
			throw new IOException("No such file or directory!");
		}else{
			File f = new File(wd, params[1]);
			if(!f.delete())
				throw new IOException("Can't delete!");
		}		
		return wd;
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return "rm";
	}

}
