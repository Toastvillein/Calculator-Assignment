package example;
import java.util.Enumeration;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArithmeticCalculator calculator = new ArithmeticCalculator();

        while (true) {
            System.out.println("첫번째 수를 입력하세요: ");
            Number a = sc.nextDouble();

            System.out.println("사칙연산 기호를 입력해주세요: ");
            String charAt= sc.next();

            System.out.println("두번째 수를 입력하세요:");
            Number b = sc.nextDouble();

            OperatorType operator = OperatorType.of(charAt);
            System.out.println("결과: " + operator.getOp((double)a,(double)b));

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if(answer.equals("exit")){
                break;
            }


        }

    }
}
