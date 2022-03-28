package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
콘솔모드에서
java IOMain04_1 Koala.jpg Koala2.jpg 입력시
Koala.jpg -> Koala2.jpg 복사됨
 */
public class IOMain04_1 {
	public static void main(String[] args) {
		
		
		
		FileInputStream fis = null;  //fis,fos를 try랑 finally에서 둘다 써야되므로 위에서 변수 선언해야함 (try에서 선언한 변수를 파이널리가 모름)
	    FileOutputStream fos = null;
		
	    BufferedInputStream bis = null;
	    BufferedOutputStream bos = null;
	    
	    /*
	     run>run configuration > arguments > program arguments > d:/Koala.jpg d:/Koala_copy.jpg >apply > run
	                                                            //절대 경로 설정 d:/
	     */
		try {
			fis = new FileInputStream(args[0]);
			bis = new BufferedInputStream (fis); //속도 향상을 위해 fis에 버퍼를 껴주겠다
			
			fos = new FileOutputStream(args[1]);
			bos = new BufferedOutputStream (fos); 
		
			long start = System.currentTimeMillis();
			
			
		    //외부장치에서 바로 외부장치로 가서 저장될 수 없다 //꼭 ram을 거쳐서 가야한다
			while(true) {
			
			int c = bis.read(); //필터 클래스(버퍼)로 읽음  
			
			if(c==-1) break; //파일 크기 만큼 저장완료
			bos.write(c); // 필터 클래스(버퍼)로 씀
			}
			
			
			
			fos.flush(); // 버퍼에 남아 있는거 방지
			
			long end=System.currentTimeMillis();
			System.out.println("소요시간: "+(end-start)/1000. +"초");//한 바이트씩 처리하니까 소요시간이 오래 걸림
			
			
		} catch (/*FileNotFound*/Exception e) { //묵시적 형변환
			e.printStackTrace();
		} 
		
		
		
		try {
			if(fis != null)
				fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		/*
		finally {
			//연결 후 close로 연결을 해재해주어야 다른 애들이 연결할 수 있음
			//트라이문 같이 쓰면 안된다. 하나가 예외 발생해도 다른 하나는 예외되면 안되서
			
			if(bis!=null) {
			try {
				bis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
			
			
			try {
				if(fis!=null)
					fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
			try {
				if(fos!=null)
					fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		*/
		System.out.println("파일 복사가 완료되었습니다");
		
	}
}
