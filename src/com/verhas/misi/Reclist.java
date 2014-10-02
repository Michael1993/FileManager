package com.verhas.misi;

import java.io.File;
import java.io.IOException;

public class Reclist implements Command {

	@Override
	public File execute(File wd, String[] params) throws IOException{
		reclist(wd,"");
		return wd;
	}

	private void reclist(File file, String indent) throws IOException {
		for(File f : file.listFiles()){
			System.out.println(f.getCanonicalPath());
			if(f.isDirectory())
				reclist(f, indent + "   ");
		}
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return "reclist";
	}

}
