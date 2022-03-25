import java.util.Scanner;

public class Array_Proplem {
    public static void main(String[] args) {
        // [1]: Scaaner를 이용한 입력값 받기
        Scanner stdIn = new Scanner(System.in);
        System.out.println("행의 갯수를 입력하고 [Enter] 치세요 ");
        int row = stdIn.nextInt();
        System.out.println("열의 갯수를 입력하고 [Enter] 치세요 ");
        int column = stdIn.nextInt();

        //[2] : char 2차원 배열 선언 -> 사용자로부터 배열의 크기 입력받아 -> arr [row][column]생성
        char[][] arr = new char[row][column];

        //[3] 사용자 입력을 받아서 저장할 String 뱌열 선언 -> 이 때 크기를 [row]로 해주도록한다!!
        //크기를 row만큼 해주면 되는 이유 -> 어차피 사용자가 입력하는 값은 안쪽 for문을 돌면서 2차원 배열에 입력하기 때문이다다
        String[] strAr = new String[row];

        //[4] 2차원 배열요소 -> 사용자가 입력하는 값 세팅
       for(int i = 0 ; i < arr.length; i++) {
           System.out.println((i+1)+"번째 행에 입력할 문자 3개를 차례대로 입력하고 Enter를 치세요");
           //i 번째 해당하는 문자열 담아주기
           strAr[i] = stdIn.next();
           for(int j = 0 ; j < arr[i].length; j++) {
               arr[i][j] = strAr[i].charAt(j);
            }
        }
    }
}
