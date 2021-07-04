package java_renew_inflearn;

public class StaticCount {
    static int count = 0; // count 값이 공유
    StaticCount() {
        this.count++;
        System.out.println(this.count);
    }

    public static void main(String[] args) {
    	StaticCount c1 = new StaticCount();
    	StaticCount c2 = new StaticCount();
    }
}
