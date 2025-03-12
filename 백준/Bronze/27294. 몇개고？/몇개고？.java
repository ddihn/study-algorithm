import java.util.Scanner;

public class Main {
//점심 시간 아닐 때 or 술+초밥 -> 280알, 점심시간일 때 320알
//T가 11이하이면 아침 12~16이면 점심 그렇지 않으면 저녁
//S가 1이면 술과 함께 0이면 술 없이
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int S = sc.nextInt();
	int riceCnt = 0;
	
	if((T >= 12 && T <= 16) && S==0) {
		riceCnt = 320;
	} else
		riceCnt = 280;
	
	System.out.println(riceCnt);
	}
}
