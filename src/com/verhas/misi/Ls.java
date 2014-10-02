package com.verhas.misi;

import java.io.File;
import java.io.IOException;

public class Ls implements Command {

	@Override
	public File execute(File wd, String[] params) throws IOException {
		for(File file : wd.listFiles()){
			System.out.print(file.getCanonicalPath());
			if(params.length > 1 && params[1].equals("-l")){
				System.out.print(" " + file.length());
				if(file.isDirectory()){
					System.out.print(" " + "D");
				}else{
					System.out.print(" " + "F");
				}
			}
			System.out.println();
		}
		return wd;
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return "ls";
	}

}
