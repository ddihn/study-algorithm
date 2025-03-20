public class Solution {

	public int solution(int n, int w, int num) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("n 입력:");
//        int n = sc.nextInt();
//        System.out.println("w 입력:");
//        int w = sc.nextInt();
//        System.out.println("num 입력:");
//        int num = sc.nextInt();
//        
		int floor = n / w + 1;
		int[][] wholeFloor = new int[floor][w]; //4,6
        int floorNum = 1;
        int pntX = 0; //배열의 좌표를 담을 공간
        int pntY = 0; 
        int colCnt = 0;
        
        for(int i = 0; i < floor; i++){
            
            if(i%2==0) {
            	for(int j = 0; j < w; j++) {
            		if(floorNum>n) 
                    	break;
            		if(floorNum == num) { // 찾는 박스 좌표 저장
            			pntX = i;
            			pntY = j;
            		}
            		wholeFloor[i][j] = floorNum++;
            	}
            }
            
            else {
            	for(int j = w-1; j >= 0; j--) {
            		if(floorNum>n) 
                    	break;
            		if(floorNum == num) {
            			pntX = i;
            			pntY = j;
            			}
            		wholeFloor[i][j] = floorNum++;
            	}
            }
            
        }
//        // 배열 출력
//        for(int i = 0; i < floor; i++){
//            for(int j = 0; j < w; j++){
//                if(num == n)
//                    break;
//                System.out.printf("%3d",wholeFloor[i][j]);
//            }
//            System.out.println();
//        }
        // 꺼낼 박스 윗 열에 0이 아닌 박스가 몇 개 있는지 확인 
        for(int i = pntX ; i < floor; i++) { 
        	if(wholeFloor[i][pntY]!=0) {
        		System.out.println("wholeFloor["+i+"]["+pntY+"]: "+wholeFloor[i][pntY]);
        		colCnt++;
        	}
        }
//       System.out.println("치워야 하는 박스 수: "+colCnt);
        return colCnt;
    }
}
