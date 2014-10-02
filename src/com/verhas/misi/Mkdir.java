package com.verhas.misi;

import java.io.File;
import java.io.IOException;

public class Mkdir implements Command {

	@Override
	public File execute(File wd, String[] params) throws IOException {
		if(params.length < 2){
			throw new IOException("Can't create the directory!");
		}else{
			File f = new File(wd, params[1]);
			if(!f.mkdir()){
				throw new IOException("Can't create the directory!");
			}
		}
		return wd;
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return "mkdir";
	}

}
