package FIle;

import java.io.File;
import java.io.FileFilter;

public class FileUtil {
	public void myListFiles(String dir) {
		File directory=new File(dir);
		if(!directory.isDirectory()) {
			System.out.println("No directory provided");
			return;
		}
		
		File[] files=directory.listFiles(fileFilter);
		
		for(File f:files) {
			System.out.println(f.getName());
		}
		
	}
	public void myListFolders(String dir) {
		File directory=new File(dir);
		if(directory.isDirectory()) {
			File[] files=directory.listFiles(fileFilter);
			
			for(File f:files) {
				if(f.isDirectory()) {
				System.out.println(f.getName());
				}
			}
		}
		
		
		
	}
	FileFilter fileFilter=new FileFilter() {
		
		@Override
		public boolean accept(File pathname) {
			// TODO Auto-generated method stub
//			if(pathname.getName().endsWith(".txt")) {
//				return true;
//			}
			return true;
		}
	};
	public static void main(String[] args) {
		
		FileUtil fu=new FileUtil();
		fu.myListFiles("C:\\git");
		System.out.println("************");
		fu.myListFolders("C:\\git");
		
	}

}
