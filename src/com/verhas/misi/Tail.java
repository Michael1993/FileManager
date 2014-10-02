package com.verhas.misi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class Tail implements Command {

	@Override
	public File execute(File wd, String[] params) throws IOException {
		int n = 0;
		File f = null;
		if(params.length < 4 && params.length != 2){
			throw new IOException("No such file or directory!");
		}else if(params.length == 2 &&
				Arrays.asList(wd.list()).contains(params[1])){
			n = 10;
			f = new File(wd,params[1]);
		}else if(Arrays.asList(wd.list()).contains(params[3])){
			if(params[1].equals("-n")){
				try{
					n = Integer.parseInt(params[2]);
				}catch(NumberFormatException e){
					n = 10;
				}
			}else{
				n = 10;
			}
		}
		if(f.equals(null)){
			throw new IOException("No such file or directory!");
		}
		LinkedList<String> ls = new LinkedList<String>();
		BufferedReader br = new BufferedReader(new FileReader(f));
		while(br.ready()){
			ls.add(br.readLine());
		}
		br.close();
		
		for(int i = ls.size() - n; i < ls.size(); i++){
			System.out.println(ls.get(i));
		}
		
		return wd;
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return "tail";
	}

}
