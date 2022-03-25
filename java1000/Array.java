import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        /*
         *  배열 복사하기
         *  arrayCopy() 메서드 사용 -> 사용법 System.arrayCopy(원본배열명,???,복사배열명,???,길이); ???는 인덱스 값
         * */
        int[] test = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] test2 = new int[]{1, 2, 3, 4, 5,};
        System.arraycopy(test2, 2, test, 4, 3); //[1,2,3,4,3,4,5,8,9,10]
        System.out.println(Arrays.toString(test));

        /*
         * 1,2 차원의 배열 생성 및 출력을 다양한 예제로 구현해보자
         * String 탕비의 참조변수 3개를 저장하기위한 공간생성 -> 이 때 참조형 변수 각 요소는 기본값 - > null로 초기화
         * */
        String[] province = new String[3];
        System.out.println("sssss :: " + province[0]);


        //2차원배열 2*3
        String[][] asiaNations = {
                {"한국", "중국", "일본"},
                {"태국", "베트남", "필리핀"}
        };
        System.out.println(asiaNations[0]); // 1차원 배열의 주소를 참조하는 값이 출력
        System.out.println(asiaNations[0][0]); // 한국
        System.out.println(asiaNations.length); //2
        System.out.println(asiaNations[0].length); //3
        System.out.println(asiaNations[1].length); //3
        System.out.println(Arrays.toString(asiaNations));

        //반복문을 사용한 String 2차원 배열 값 출력
        for(int i = 0; i < asiaNations.length; i++ ){
            for(int j = 0; j < asiaNations[i].length; j++){
                String loop = asiaNations[i][j];
                System.out.print(" "+loop);
            }
            System.out.println();
        }

        // charAt()메서드 사용 -> 해당 인덱스에 있는 값을 반환 -> 단어를 char배열에 한글자씩 저장할 수 있음
        String[] strAr = {"hong", "kim", "park"};
        for(int i = 0 ; i < strAr.length; i++) {
            for(int j = 0; j < strAr[i].length(); j++) {
                System.out.print(strAr[i].charAt(j));
            }
        }
        System.out.println(" ");

        //length - 배열의 길이 vs length() - 문자열의 길이
        int[] aaa = new int[10];
        System.out.println("aaaaa ::" + aaa.length);
        String bbb = "Welcome to Seoul";
        System.out.println("bbbbb : " + bbb.length());
    }
}
