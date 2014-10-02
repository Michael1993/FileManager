package com.verhas.misi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Grep implements Command {

	@Override
	public File execute(File wd, String[] params) throws IOException {
		if(params.length < 3 ||
				!Arrays.asList(wd.list()).contains(params[2])){
			throw new IOException("No such file or directory!");
		}else{
			BufferedReader br = new BufferedReader(
					new FileReader(
							new File(wd, params[2])));
			while(br.ready()){
				String string = br.readLine();
				if(string.matches(params[1])){
					System.out.println(string);
				}
			}
			br.close();
			
			return wd;
		}
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return "grep";
	}

}
