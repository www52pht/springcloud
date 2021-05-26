import java.time.ZonedDateTime;

/**
 * @author www
 * @version 1.0
 * @create 2021/5/26 14:52
 */
public class T {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); //默认时区
        System.out.println(zbj);

        //2021-05-26T14:53:50.713+08:00[Asia/Shanghai]
    }
}
