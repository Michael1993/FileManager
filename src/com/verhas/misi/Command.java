package com.verhas.misi;

import java.io.File;
import java.io.IOException;

public interface Command {
	public File execute(File wd, String[] params) throws IOException;
	
	public String getCommand();
}
