import org.junit.Test;
import org.junit.Ignore;
import junit.framework.*;
import static org.junit.Assert.assertEquals;

public class TestMessageUtil extends TestCase {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);

   // assigning the values
   protected void setUp(){
      System.out.println("Inside setup()");
   }

   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");     
      assertEquals(message,messageUtil.printMessage());
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
}