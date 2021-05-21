package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import collection.DescCompatrator;

public class TestFile {

	public static void main(String[] args) {
//		Comparator<File> comp = (o1,  o2) ->{
//			if(o1.length() == o2.length()) {
//				return 0;
//			}else 
//				return 
//			o1.length() < o2.length() ? -1 : 1;
//			};
//		}
		
		
		Set<File> fileSet = new TreeSet<File>(new Comparator<File>() {

			@Override
			public int compare(File o1, File o2) {
				if(o1.length() < o2.length()) {
					return -1;
				}else if(o1.length() < o2.length()){
					return 1;
				}else 
					return 0;
				}
//				if(o1.length() = o2.length()) {
//					return 0;
//				}else 
//					return o1.length() < o2.length()? -1 : 1;
//			}
			});
		File dir = new File("C:\\java");
		File[] list = dir.listFiles();
		int counter = 0;
		long size = 0;
		for(File f :list ) {
			
			System.out.println(f.getName()+",是目錄嗎"+f.isDirectory());
			long lastModified = f.lastModified();  //檔案的修改日期
			Date date = new Date(lastModified); 
			SimpleDateFormat format = new SimpleDateFormat("yyyy/M/dd H:mm");
			System.out.println(format.format(date));
			if(!f.isDirectory()) {
				counter ++;
				size +=f.length();
				fileSet.add(f);
			}
		}
	
		System.out.println("檔案總數="+counter);
		System.out.println("檔案大小="+size+"bytes");
		System.out.println("===================");
		 
		for(File f : fileSet) {
			System.out.println("檔案名稱:"+f.getName()+"\t"+",大小"+f.length());
		}
	}

}
