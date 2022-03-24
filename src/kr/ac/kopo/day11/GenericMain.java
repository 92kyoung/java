package kr.ac.kopo.day11;

import java.util.Random;

class A {
	private Object data;
	
	A(Object data){
		this.data=data;
	}
	
	Object getData() {
		return data;
	}
	void setData(Object data) {
		this.data=data;
	}
}


class B<T> {  //T는 타입
	private T data;
	
	B(T data) {
		this.data = data;
	}
	
	T getData() {
		return data;
	}
	
	void setData(T data) {
		this.data = data;
	}
}


public class GenericMain {
	public static void main(String[] args) {
		B<String> b = new B<String>(new String("hello"));
		System.out.println("길이 : " + b.getData().length());
		
		B<Random> b2 = new B<Random>(new Random());
		System.out.println("추출된 정수 : " + b2.getData().nextInt(10) + 1);
		
		
		A a = new A(new String("HELLO"));
		String data = (String)a.getData(); //getData해서 가져오는 타입이 오브젝트인데 안에 들어있는거는 스트링 객체니까 
		                                  //오브젝트를 스트링으로 형변환해준다
		System.out.println("길이: "+data.length());
		
		A a2 = new A(new Random()); //a2에 랜덤 객체 저장
		int random=((Random)a2.getData()).nextInt(10)+1;
		System.out.println("추출한 정수:"+random);
	}
}
