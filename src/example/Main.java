package example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        while (true) {
            System.out.println("첫번째 수를 입력하세요: ");
            int a = sc.nextInt();

            System.out.println("사칙연산 기호를 입력해주세요: ");
            String charAt= sc.next();

            System.out.println("두번째 수를 입력하세요:");
            int b = sc.nextInt();

            if(charAt.equals("+")){
                System.out.println("결과: "+(a+b));
            } else if(charAt.equals("-")){
                System.out.println("결과: "+ (a-b));
            } else if(charAt.equals("*")){
                System.out.println("결과: "+ (a*b));
            } else if(charAt.equals("/") && b!=0){
                System.out.println("결과: "+(a/b));
            } else if(charAt.equals("/") && b==0){
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                System.out.println("잘못된 값을 입력하셨습니다.");
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if(answer.equals("exit")){
                break;
            }

        }





    }
}
