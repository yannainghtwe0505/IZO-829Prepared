package FIle;

import java.io.File;

public class FileDelte {
    public static void deleter(File f) { // プログラムは単純で、空の参照の判断はありません！
	if (f.isFile()) { // fがファイルの場合
	    f.delete();
	} else if (f.isDirectory()) { // fがディレクトリ(フォルダ)の場合
	    File[] file = f.listFiles();
	    for (File file2 : file) {
		deleter(file2); // 自身を呼び出します(再帰です！)
		file2.delete(); // サブフォルダーを削除(内部にファイルがない場合は削除可能)
//f.delete()がここに記述されている場合、V5フォルダーはなくなります。
	    }
	}
    }

    public static void main(String[] args) {
	File f = new File("D:/V5"); // DドライブのV5フォルダを削除する場合
	deleter(f);
	System.out.println("削除しました！");
    }

}
