package kr.ac.kopo.day08.extend;

public class ExtendsMain01 {
	public static void main(String[] args) {
		Employee e = new Employee ("홍길동",3300,"사원");
		Employee e2 = new Employee ("강길동",3500,"사원");
		Employee e3 = new Employee ("윤길동",4200,"대리");
		Employee e4 = new Employee ("한길동",4300,"대리");
		Employee e5 = new Employee ("구길동",5200,"과장");
		
		Employee[] empList = {e,e4,e5};
		//Manager01 m = new Manager01 ("나최고",9000,"부장",empList);
		//Manager02 m = new Manager02 ("나최고",9000,"부장",empList);
		Manager03 m = new Manager03 ("나최고",9000,"부장",empList);
		e.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		
		m.info();
		
	}
	
}
