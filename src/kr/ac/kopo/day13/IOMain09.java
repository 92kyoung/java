package kr.ac.kopo.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.ac.kopo.util.FileClose;

public class IOMain09 {

	public static void write() {
		Icecream ice = new Icecream("월드콘", 2000, "롯데"); // 이 객체를 파일에 저장하고 싶다
		// 아이스크림 클래스에 Serializable이라는 인터페이스 상속 받아야지만 객체 직렬화가 발생해서 오류가 나지 않는다

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("iotest/object.txt");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(ice);// 객체가 가지고 있는 값을 저장하겠다  //묵시적형변환 오브젝트=아이스크림

			System.out.println("object.txt 파일 생성완료...");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			FileClose.close(oos, fos);
		}

	}

	public static void read() {
		Icecream ice = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("iotest/object.txt");
			ois = new ObjectInputStream(fis);
			
			ice = (Icecream) ois.readObject(); //아이스크림 객체에 대해서 알고 싶은 것이기 때문에 묵시적 형변환을 사용. ice=object 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(ois, fis);
		}
	System.out.println(ice);
	}

	public static void main(String[] args) {
		read();
		//write();
	}

}
