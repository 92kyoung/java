package kr.ac.kopo.day02;
import java.util.Random;
public class LottoUtil {
	
	public void todayProbability() {
		Random r= new Random();
		int p=r.nextInt(101); //0~100사이의 난수 출력
		System.out.println("오늘의 로또확률은"+p+"%입니다");
	}

}
