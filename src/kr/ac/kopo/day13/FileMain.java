package kr.ac.kopo.day13;

import java.io.File;

public class FileMain {
	public static void main(String[] args) {
		
		File dirObj = new File("iotest");
		if(dirObj.exists()) {
			
			File[] list = dirObj.listFiles();  //파일을 list형태로 저장
			for(File f : list) {
				System.out.println(f.getName());
				System.out.println(f.isDirectory() ? "디렉토리" : "파일");
			
			
//			String[] list = dirObj.list();
//			for(String data : list) {
//				System.out.println(data);
//				File fileObj = new File(dirObj.getName() + "/" + data);
//				System.out.println(fileObj.isDirectory() 
//						? "디렉토리" : "파일");
//			}
		}
		}
		
		/*
		File dirObj = new File("iotest/강아지/리트리버");  //강아지 폴더가 존재해야 리트리버 폴더가 생성되는데 강아지 폴더가 없어서 리트리버 폴더가 생성되지 않는다.
		
		System.out.println("존재여부 : " + dirObj.exists());
		System.out.println("디렉토리여부 : " + dirObj.isDirectory());
		System.out.println("파일여부 : " + dirObj.isFile());
		
		if(!dirObj.exists()) {
			dirObj.mkdirs();  //강아지,리트리버까지 한번에 생성
		}
		
		*/
		
		
		/*
		  File fileObj = new File("iotest/a.txt"); //내가 돌리고있는 JAVA 프로젝트의 iotest폴더의 a
		  파일을 의미함
		  
		  String fileName = fileObj.getName(); String parent = fileObj.getParent();
		  
		  System.out.println("파일명 : " + fileName); System.out.println("부모 : " +
		  parent);
		  
		  System.out.println("파일 존재여부 : " + fileObj.exists());
		  
		  long fileSize = fileObj.length(); //length()반환형 = long
		  System.out.println("파일 크기 : "+fileSize+"byte(s)");
		  
		  System.out.println(fileObj.canRead()? "읽기 가능" : "읽기 불가능"); //canRead() 읽을 수
		  있는지 여부 boolean 형태로 반환 System.out.println(fileObj.canWrite()? "쓰기 가능" :
		  "쓰기 불가능");
		  
		  long lastTime = fileObj.lastModified(); //리턴타입 == long
		  
		  String pattern = "yyyy-MM-dd HH:mm:ss"; SimpleDateFormat sdf = new
		  SimpleDateFormat(pattern); System.out.println("마지막 수정시간 : " + sdf.format(new
		  Date(lastTime)));
		 */
		
	}
}
