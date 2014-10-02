package com.verhas.misi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

public class Cp implements Command {

	@Override
	public File execute(File wd, String[] params) throws IOException {
		if(params.length < 3 || !Arrays.asList(wd.list()).contains(params[1])){
			throw new IOException("No such file or directory!");
		}else{
			Writer writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(params[2])));
			Reader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(params[1])));
			while(reader.ready()){
				writer.write(reader.read());
			}
			writer.close();
			reader.close();
		}
		return wd;
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return "cp";
	}

}
