import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Interview1 {
    public static void main(String[] args) {
//        List<Integer> list = IntStream.rangeClosed(1,20).filter(e->e%2==0).mapToObj(e->e*e)
//                .collect(Collectors.toList());
//        System.out.println(list);
        Thread t1 = new Thread(new MyThread("Hello"));

        Thread t2 = new Thread(new MyThread("World"));
        t1.start();
        t2.start();
    }
}

/// Thread class
class MyThread implements Runnable {
    private String s;
    MyThread(String s){
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println(this.s);
    }
}
