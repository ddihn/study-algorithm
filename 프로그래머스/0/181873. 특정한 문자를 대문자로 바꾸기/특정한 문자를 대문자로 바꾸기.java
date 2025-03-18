class Solution {
    public String solution(String my_string, String alp) {
        my_string = my_string.replaceAll(alp, alp.toUpperCase());
        return my_string;
        //자바의 문자열에서는 index로 접근하고 싶다면 chatAt(0)을 사용해야 한다...ㅡㅡ
    }
}