package carDBPrac.main;

import java.util.Scanner;

public class CarDBPracMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("========CarInfo=========");
		System.out.println("번호를 입력하세요.............");
		System.out.println("1. 자동차 정보 보기...........");
		System.out.println("2. 자동차 정보 입력...........");
		System.out.println("3. 자동차 정보 수정...........");
		System.out.println("4. 자동차 정보 삭제...........");
		System.out.println("========================");

		while (true) {
			int inputNum = sc.nextInt();
			if (inputNum == 1) {
				System.out.println(inputNum + "을 입력하였습니다.");
				break;
			}
			if (inputNum == 2) {
				System.out.println(inputNum + "을 입력하였습니다.");
				break;
			}
			if (inputNum == 3) {
				System.out.println(inputNum + "을 입력하였습니다.");
				break;
			}
			if (inputNum == 4) {
				System.out.println(inputNum + "을 입력하였습니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
		sc.close();
		System.out.println("종료합니다.");
	}
}
