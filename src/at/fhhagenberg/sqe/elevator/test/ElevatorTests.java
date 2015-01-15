package at.fhhagenberg.sqe.elevator.test;
import junit.framework.*;
import junit.textui.*;

public class ElevatorTests extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public ElevatorTests(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(ElevatorTests0.class));
    result.addTest(new TestSuite(ElevatorTests1.class));
    result.addTest(new TestSuite(MyTest0.class));
    
    return result;
  }

}
