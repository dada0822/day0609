package day0609;

import java.util.Scanner;

/* 현재의 상태 : ___
 * 글자를 추측하시오 : 입력
 * 현재의 상태 : __d__
 * 
 *  */
public class Exam1 {
	public static void main(String[] args) {
		// java count school book student programmer
		
//		Scanner sc = new Scanner(System.in);
//		
//		// 단어 목록
//		String[] words = {"java", "count", "school", "book", "student", "programmer"};
//
//
//		int n = (int)(Math.random()*6);		
//	System.out.println(words[n]);
			
//		StringBuffer sb = new StringBuffer(); // 단어
//		StringBuffer answer = new StringBuffer(); // _
//			
//		sb.append(words[n]);
//			
//		for(int i=0; i<words[n].length(); i++) {
//				answer.append("_");
//		}
//			
//			while(true) {
//				System.out.println("현재의 상태 : " + answer);
//			
//				System.out.print("글자를 추측하시오 : ");
//				String input = sc.next();
//			
//				while(true) {
//					if(sb.indexOf(input) != -1) {
//						answer.replace(sb.indexOf(input), sb.indexOf(input)+1, input);
//					}
//					
//					if(sb == answer) {
//						System.out.println("정답입니다");
//						break;
//					}
//				}
//				
//				if(sb == answer) {
//					System.out.println("정답입니다");
//					break;
//				}
//			}
		
		
		Scanner sc = new Scanner(System.in);
		
		// 단어 목록
		String[] words = {"java", "count", "school", "book", "student", "programmer"};
		int index = (int)(Math.random()*6);	
//		int index = (new Random()).nextInt(words.length);

		String text = words[index];
		StringBuffer answer = new StringBuffer(text.length());
		
		for (int i=0; i<text.length(); i++) {
			answer.append("_");
		}

		while (true) {
			System.out.println("현재 상태 : " + answer);
				
			if(text.equals(answer.toString())) {
				System.out.println("정답 !!");
				break;
			}
			
			System.out.print("글자를 추측하시오 : ");
			
			char s = sc.next().charAt(0);
			
			for(int i=0; i<text.length(); i++) {
				if(s == text.charAt(i)) {
					answer.setCharAt(i, s);
				}
			}
			
		}
	}			
}
