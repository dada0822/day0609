package day0609;

import java.util.Random;

//주사위를 던지는 클래스 생성
class Game {
	private int sides; // 주사위면의 개수
	private static Random rand = new Random();
	
	public Game(int sides) {
		this.sides = sides;
	}
	
	public int roll() {
//		return (int)(Math.random()*6)+1;
		return rand.nextInt(sides) + 1; // 1~6까지의 랜덤수(주사위면에 맞춰서)
	}
}

public class Exam2 {
	public static void main(String[] args) {
		
		/* 두 개의 주사위를 던져 그 합을 출력하는 프로그램 작성
		 * 두 주사위를 100번 던졌을 때
		 * 주사위의 합을 출력하시오 
		 * 2 : 
		 * 3 :
		 * ..
		 * 12 : */ 
		
		// 주사위를 던지는 클래스 생성 (객체 생성2개 던진 값 저장하는 배열 두 숫자의 합계 그 배열 +1씩 증가)
		
//		int[] num = new int[12]; // 던진 값 저장하는 배열
//	
//		for(int i=0; i<100; i++) {
//			int n1 = (int)(Math.random()*6)+1;
//			int n2 = (int)(Math.random()*6)+1;
//			
////			System.out.println(n1);
////			System.out.println(n2);
//			
//			int sum = n1 + n2;
//			
//			for(int j=2; j<=12; j++) {
//				if(sum == j) {
//					num[j-2]++;
//				}
//			}
//		}
//		for(int i=1; i<num.length; i++) {
//			System.out.printf("%2d : %d%n", i+1, num[i-1]);
//		}
		
		Game gameA = new Game(6);
		Game gameB = new Game(6);
		
		// 주사위의 합을 기록할 배열 (0~12)
		int[] counts = new int[13];
		
		// 주사위를 100번 던지기
		for(int i = 0; i<100; i++) {
			int a = gameA.roll();
			int b = gameB.roll();
			int sum = a + b;
			counts[sum]++;
		}
		
		// 결과 출력
		for(int i=2; i<counts.length; i++) {
			// 숫자로 결과값 표시
			System.out.printf("%2d : %d%n", i, counts[i]);
			
			// 결과 횟수만큼 "#'으로 표시
			System.out.printf("%2d : ", i);
			for(int j=0; j<counts[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
