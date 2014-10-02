package com.verhas.misi;

import java.io.File;

public class Exit implements Command {

	@Override
	public File execute(File wd, String[] params) {
		System.exit(0);
		return wd;
	}

	@Override
	public String getCommand() {
		return "exit";
	}

}
