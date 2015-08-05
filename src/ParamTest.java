import java.util.Arrays;
import java.util.Collection;
 
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Before;

@RunWith(Parameterized.class)
public class ParamTest {
   private String inputNumber;
   private Boolean expectedResult;

   @Before
   public void initialize() {
   }

   // Each parameter should be placed as an argument here. Every time runner triggers, it will pass the arguments from parameters we defined in primeNumbers() method
   public ParamTest(String inputNumber, Boolean expectedResult) {
      this.inputNumber = inputNumber;
      this.expectedResult = expectedResult;
   }

   @Parameters(name="browser_{0}_expected_{1}")
   public static Iterable<Object[]> data() {
      return Arrays.asList(new Object[][] {
         { "firefox", true },
         { "chrome", false },
         { "ie", true },
         { "safari", false },
         { "edge", true }
      });
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test
   public void MyTest() {
      System.out.println("Parameterized Number is : " + inputNumber);
      System.out.println("Expected Result is : " + expectedResult);
   }
}