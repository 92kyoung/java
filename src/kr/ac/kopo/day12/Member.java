package kr.ac.kopo.day12;

public class Member {
	private String name;
	private String phone;

	public Member() {
		super();

	}

	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	

/*
	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	
	*/
	
	
	
	
	/*
	
//	public boolean equals(Object obj = new Member("홍길동","010-1111-222")) //묵시적형변환	
	@Override
	public boolean equals(Object obj) {  //alt shift s +v 하고 equals선택함
		if(obj == null) {
			return false;
		} 
		Member m = (Member)obj; //오브젝트는 멤버 클래스의 변수  name을 쓸 수 없으니까 명시적 형변환을 해준다
		//or this.name.equals(Member(obj)).name;
		
		if(this.name !=null && !this.name.equals(m.name)) {
			return false;
		} 
		if(!this.phone.equals(m.phone)) { //this.name !=null && 안써도됨
			return false;
		} 
		return true;
	}

	*/

}
