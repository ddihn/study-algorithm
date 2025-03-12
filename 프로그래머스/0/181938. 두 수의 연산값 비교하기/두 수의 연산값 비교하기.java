class Solution {
    public int solution(int a, int b) {
        //문자열 -> 숫자, 숫자 -> 문자열 메소드 암기 .valueOf       
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        
        String result = strA + strB;
        int strToint = Integer.valueOf(result);
        int biggerValue = strToint;
        int twiceValue = 2*a*b;
        if(strToint< twiceValue)
            biggerValue = twiceValue;
        return biggerValue;
    }
}