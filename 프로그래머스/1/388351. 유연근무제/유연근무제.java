class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
     int[] logCheck = new int[schedules.length]; // 직원들의 지각 횟수 카운트를 위한 배열
        int awardCnt = 0; // 지각하지 않은 직원 수 카운트
        int[] weekdaysIdx = {5, 4, 3, 2, 1, 0, 6}; // 요일 인덱스를 설정 (0: 월요일, 6: 일요일)

        for (int i = 0; i < schedules.length; i++) {
            int perTime = schedules[i] + 10; // 허용 시간: 지정 시간 + 10분
            // 분 단위가 60 이상일 때의 시간 처리 (ex. 7:60 -> 8:00)
            if (perTime % 100 >= 60) { 
                perTime += 40;
            }
            
            int cnt = 0; // 직원의 지각 횟수 초기화
            for (int j = 0; j < timelogs[i].length; j++) {
                // 주말 제외 (금요일이 시작일이라면 토요일, 일요일 제외)
                if ((j != weekdaysIdx[(startday - 1)]) && (j != weekdaysIdx[(startday + 5) % 7])) { 
                    // 로그 시간이 허용 시간을 넘는 경우 지각으로 카운트
                    if (timelogs[i][j] > perTime) {
                        cnt++;
                    }
                }
            }
            logCheck[i] = cnt; // 지각 횟수를 배열에 저장
        }
        
        for (int i = 0; i < logCheck.length; i++) {
            // 지각 횟수가 0이면 awardCnt 증가
            if (logCheck[i] == 0) {
                awardCnt++;
            }
        }
        return awardCnt; // 지각하지 않은 직원 수 출력
    }
}