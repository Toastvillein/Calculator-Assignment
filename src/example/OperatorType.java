
package example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.DoubleBinaryOperator;

public enum OperatorType {
    SUM("+",(a,b) -> a+b)
    ,
    SUB("-",(a,b)->a-b)
    ,
    MUL("*",(a,b)-> a*b)
    ,
    DIV("/",(a,b)->{if(b==0){
        throw new IllegalArgumentException();}else return a/b;});

    private final DoubleBinaryOperator op;

    private final String symbol;

    OperatorType(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    public double getOp(double a, double b) {
        return op.applyAsDouble(a,b);
    }

    // 추상메서드 필요



    // 사칙연산 기호 받아오는 메서드(for문)
//    public static OperatorType getOperatorType(String symbol) {
//        for(OperatorType type : OperatorType.values()) {
//            if (type.symbol.equals(symbol)) {
//                return type;
//            }
//        } throw new IllegalArgumentException("잘못된 기호입니다: "+symbol);
//    }

    // 사칙연산 기호 받아오는 메서드(스트림활용)
    // 정적 팩토리 메소드 패턴
   public static OperatorType of(String symbol) {
        return Arrays.stream(OperatorType.values())
                .filter(type -> type.symbol.equals(symbol)) // 중간 연산
                .findFirst()//최종연산
                .orElseThrow(()-> new IllegalArgumentException("잘못된 기호입니다: " + symbol));
   }

}
