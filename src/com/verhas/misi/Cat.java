package com.verhas.misi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Cat implements Command {

	@Override
	public File execute(File wd, String[] params) throws IOException {
		if(params.length < 2 ||
				!Arrays.asList(wd.list()).contains(params[1])){
			throw new IOException("No such file or directory!");
		}else{
			BufferedReader br = new BufferedReader(
					new FileReader(
							new File(wd, params[1])));
			while(br.ready()){
				System.out.println(br.readLine());
			}
			br.close();
			
			return wd;
		}
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return "cat";
	}

}
