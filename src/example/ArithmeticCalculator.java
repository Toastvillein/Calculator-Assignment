
package example;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {
    private List<T> result = new ArrayList<>();


//    public double sum(T a, T b) { //int 와 double을 받을 수 있게 확장
//      return a.doubleValue() + b.doubleValue();
//    }
//
//    public int sub(int a, int b) {
//        return a - b;
//    }
//
//    public int mul(int a, int b) {
//        return a * b;
//    }
//
//    public int div(int a, int b) {
//        return a / b;
//    }

    // 리스트 이용해서 리턴값 컬렉션에 저장

    public void addResult(T a){
           result.add(a);
    }

    public List<T> getResult(){
        return this.result;
    }

    public void setResult(List<T> a){
        this.result = a;
    }

    // 가장 먼저 저장된 데이터를 삭제하는 기능

    public void removeResult(T a){
        try{
            result.remove(0);
        } catch(NullPointerException e){
            System.out.println("저장된 결과가 없습니다.");
        }

    }



}
