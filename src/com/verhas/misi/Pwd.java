package com.verhas.misi;

import java.io.File;
import java.io.IOException;

public class Pwd implements Command {

	@Override
	public File execute(File wd, String[] params) throws IOException {
		System.out.println(wd.getCanonicalPath());
		return wd;
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return "pwd";
	}

}
