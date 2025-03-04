package example;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> result = new ArrayList<>();

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    // 리스트 이용해서 리턴값 컬렉션에 저장

    public void addResult(int a){
           result.add(a);
    }

    public ArrayList<Integer> getResult(){
        return this.result;
    }

    public void setResult(ArrayList<Integer> a){
        this.result = a;
    }

    // 가장 먼저 저장된 데이터를 삭제하는 기능

    public void removeResult(int a){
        result.remove(0);
    }



}
