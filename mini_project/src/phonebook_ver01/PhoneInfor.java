package phonebook_ver01;

public class PhoneInfor {
	/*
	 * 변수 데이터 타입: String로 통일
	 * @name:이름
	 * @phoneNumber:전화번호
	 * @birthday:생년월일
	 */
	String name;
	String phoneNumber;
	String birthday;
	
	//초기화 생성자
	PhoneInfor(){
		this.name=null;
		this.phoneNumber=null;
		this.birthday=null;
	}
	
	//@생성자 - 데이터 저장기능
	//이름, 전화번호, 생년월일 입력했을때 
	PhoneInfor(String name,String phoneNumber,String birthday){
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthday=birthday;
	}
	
	//이름, 전화번호만 입력했을때 
	PhoneInfor(String name,String phoneNumber){
		this(name,phoneNumber," ");
	}
	
	//@print: 출력기능
	public void print() {
		System.out.println("•이름"+'\t'+name);
		System.out.println("•전화번호"+'\t'+phoneNumber);
		System.out.println("•생년월일"+'\t'+birthday);
		System.out.println();
	}
	
	//@getName: 이름정보 가져오는 기능
	public String getName() {
		return name;
	}

	
}
