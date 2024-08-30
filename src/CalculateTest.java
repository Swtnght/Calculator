import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {
    //Field scan of type Scanner - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    Calculate calculate = new Calculate(0, 0);

    @Test
    public void testSum() throws Exception {
        int result = calculate.Sum();
        Assert.assertEquals(0, result);
    }
}

// Generated with love by TestMe :) Please raise issues & feature requests at: https://weirddev.com/forum#!/testme
