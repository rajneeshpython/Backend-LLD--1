package Generics;

public class GenericPair <T, U> {
    private T first;
    private U second;

    public T getFirst() {
        return first;
    }
    public U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }
    public void setSecond(U second) {
        this.second = second;
    }

    public static <S, K> S doSomething(S data, K data1){
        System.out.println("Generic Pair Static method");
        System.out.println(data);
        System.out.println(data1);
        return data;
    }
}
