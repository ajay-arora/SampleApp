import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)
@Suite.SuiteClasses({ 
   TestMessageUtil.class ,ClientTest.class
})
public class JunitTestSuite {
}