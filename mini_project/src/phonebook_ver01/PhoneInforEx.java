package phonebook_ver01;

import java.util.Scanner;

public class PhoneInforEx {

	public static void main(String[] args) {
		//배열 생성
		PhoneInfor[] arr = new PhoneInfor[100];
		
		System.out.println("어떤 기능을 사용하시겠습니까?");
		System.out.println("[1.저장] [2.검색] [3.삭제]");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		if(choice==1) {
			//저장
			scanner.nextLine();
			System.out.println("저장할 데이터를 입력해 주십시오");
			System.out.println("이름: ");
			String nameInput = scanner.nextLine();
			System.out.println("전화번호: ");
			String phoneNInput = scanner.nextLine();
			System.out.println("생년월일: ");
			String birthInput = scanner.nextLine();
			save(arr,nameInput,phoneNInput,birthInput);
		} else if(choice==2) {
			//검색
			System.out.print("검색할 이름 입력해 주십시오: ");
			String nameInput = scanner.nextLine();
			search(arr,nameInput);
		} else if(choice==3) {
			//삭제
			System.out.print("삭제할 사람의 이름을 입력해 주십시오: ");
			String nameInput = scanner.nextLine();
			delete(arr,nameInput);
		} else {
			System.out.println("잘못된 입력, 다시 입력해주십시오.");
			choice = scanner.nextInt();
		}
	

	}
	
	//@delete: 이름을 입력받이 데이터를 찾아 정보를 삭제
	//삭제 뒤, 데이터 순차적으로 재정리
	private static void delete(PhoneInfor[] arr,String nameInput) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getName().equals(nameInput)) {
				arr[i] = new PhoneInfor();
				
				for(int j=i+1; j<=arr.length; j++) {
					arr[i]=arr[j];
				}
			}
		}
		
	}
	
	//@search: 이름을 입력받아 데이터를 찾아 정보를 출력하는 기능
	private static void search(PhoneInfor[] arr,String nameInput) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getName().equals(nameInput)) {
				arr[i].print();
			}
		}
		
	}

	//@save: 정보를 입력받아 저장하는 기능
	private static void save(PhoneInfor[] arr,String nameInput,String phoneNInput,String birthInput) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==null) {
					arr[i].name=nameInput;
					arr[i].phoneNumber=phoneNInput;
					arr[i].birthday=birthInput;
				System.out.println("성공적으로 저장하였습니다!");
					break;
				}
			}
	}

}
