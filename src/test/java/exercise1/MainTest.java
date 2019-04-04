package exercise1;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created  by liuqingjie on 2019/3/19 .
 */
public class MainTest {
    @Test
    public void solve() throws Exception {
        System.out.println("git modify");
        String sum = Main.Solve("22+11");
        Assert.assertEquals("22+11=33",sum);
    }

}