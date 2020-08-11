import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

public class MyTest {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }
}
