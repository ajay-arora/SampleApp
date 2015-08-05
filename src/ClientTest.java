import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ClientTest {
   @Test
   public void testA() {
      String str= "abc";
      assertEquals("abc",str);
   }
   @Test
   public void testB() {
      String str= "xyzth";
      assertEquals("zdf",str);
   }
   @Test
   public void testC() {
      String str= "mno";
      assertEquals("mno",str);
   }
}
