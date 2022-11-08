import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VTtest {
    public static void main(String[] args) {
        ExecutorService executor1 = Executors.newVirtualThreadPerTaskExecutor();
        ExecutorService executor2 = Executors.newVirtualThreadPerTaskExecutor();
        executor1.submit(() -> System.out.println("1111"));
        executor2.submit(() -> System.out.println("2222"));
    }
}
