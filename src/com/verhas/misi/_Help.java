package com.verhas.misi;

import java.io.File;
import java.io.IOException;

public class _Help implements Command {

	@Override
	public File execute(File wd, String[] params) throws IOException {
		System.out.println("•  exit: kilép a programból.\n" +
			"•  reclist: rekurzívan kilistázza a könyvtár tartalmát \n" +
			"•  pwd: kiírja az aktuális könyvtár elérési útját \n" +
			"•  cd <dir>: az aktuális könyvtárból átlép a benne levõ, <dir> nevû alkönyvtárba. Ha\n" +
			"<dir> értéke \"..\", akkor egy szinttel feljebb lép. \n" +
			"•  ls: kilistázza az aktuális könyvtárban levõ fájlok és könyvtárak neveit.\n" +
			"lehetséges paraméterek: \n" +
			"-l: mint a fenti, de a listában megjeleníti a fájlok méretét és típusát\n" +
			"(d - könyvtár, f - sima fájl)\n" +
			"•  rm <file>: törli a <file> nevû fájlt.\n" +
			"mkdir <dir>: létrehozza az aktuális könyvtárban a <dir> nevû könvytárat\n" +
			"•  cp <file1> <file2>: <file1>-et átmásolja <file2>-be.\n" +
			"•  head -n <n><file>: kiírja a <file> nevû fájl elsõ <n>sorát. Ha az opcionális -n\n" +
			"paraméter hiányzik, <n>értéke 10.\n" +
			"•  mv <file1> <file2>: <file1> fájlt átnevezi <file2>-re.\n" +
			"•  cat <file>: kiírja a <file> nevû fájl tartalmát soronként a szabványos kimenetre.\n" +
			"•  wc <file>: kiírja a <file> nevû fájl statisztikai adatait: sorok száma, szavak száma,\n" +
			"betûk száma.\n" +
			"•  length <file>: kiírja a <file> nevû fájl hosszát.\n" +
			"•  tail -n <n><file>: kiírja a <file> nevû fájl utolsó <n>sorát. Ha az opcionális\n" +
			"-n paraméter hiányzik, <n> értéke 10.\n" +
			"•  grep <pattern> <file>: kiírja a <file> nevû fájl tartalmából a <pattern>-re\n" +
			"illeszkedõ sorokat.");
		return wd;
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return "help";
	}

}
