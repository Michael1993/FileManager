package com.verhas.misi;

import java.io.File;
import java.io.IOException;

public class _Help implements Command {

	@Override
	public File execute(File wd, String[] params) throws IOException {
		System.out.println("�  exit: kil�p a programb�l.\n" +
			"�  reclist: rekurz�van kilist�zza a k�nyvt�r tartalm�t \n" +
			"�  pwd: ki�rja az aktu�lis k�nyvt�r el�r�si �tj�t \n" +
			"�  cd <dir>: az aktu�lis k�nyvt�rb�l �tl�p a benne lev�, <dir> nev� alk�nyvt�rba. Ha\n" +
			"<dir> �rt�ke \"..\", akkor egy szinttel feljebb l�p. \n" +
			"�  ls: kilist�zza az aktu�lis k�nyvt�rban lev� f�jlok �s k�nyvt�rak neveit.\n" +
			"lehets�ges param�terek: \n" +
			"-l: mint a fenti, de a list�ban megjelen�ti a f�jlok m�ret�t �s t�pus�t\n" +
			"(d - k�nyvt�r, f - sima f�jl)\n" +
			"�  rm <file>: t�rli a <file> nev� f�jlt.\n" +
			"mkdir <dir>: l�trehozza az aktu�lis k�nyvt�rban a <dir> nev� k�nvyt�rat\n" +
			"�  cp <file1> <file2>: <file1>-et �tm�solja <file2>-be.\n" +
			"�  head -n <n><file>: ki�rja a <file> nev� f�jl els� <n>sor�t. Ha az opcion�lis -n\n" +
			"param�ter hi�nyzik, <n>�rt�ke 10.\n" +
			"�  mv <file1> <file2>: <file1> f�jlt �tnevezi <file2>-re.\n" +
			"�  cat <file>: ki�rja a <file> nev� f�jl tartalm�t soronk�nt a szabv�nyos kimenetre.\n" +
			"�  wc <file>: ki�rja a <file> nev� f�jl statisztikai adatait: sorok sz�ma, szavak sz�ma,\n" +
			"bet�k sz�ma.\n" +
			"�  length <file>: ki�rja a <file> nev� f�jl hossz�t.\n" +
			"�  tail -n <n><file>: ki�rja a <file> nev� f�jl utols� <n>sor�t. Ha az opcion�lis\n" +
			"-n param�ter hi�nyzik, <n> �rt�ke 10.\n" +
			"�  grep <pattern> <file>: ki�rja a <file> nev� f�jl tartalm�b�l a <pattern>-re\n" +
			"illeszked� sorokat.");
		return wd;
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return "help";
	}

}
