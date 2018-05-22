package main.java.iwp.Main;

public class GetSet<T>  {
    private T t;

    public  GetSet(T t){
        this.t = t;
    }

    public T getValue() {
        return t;
    }

    public void setValue(T t) {
        this.t =t;
    }

    public static void main(String[] args) {
        GetSet<Integer> getSet1 = new GetSet<>(5);
        System.out.println(getSet1.getValue());
        GetSet<String> getSet2 = new GetSet<>("Hi there");
        System.out.println(getSet2.getValue());
    }

}
