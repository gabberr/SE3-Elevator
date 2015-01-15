package at.fhhagenberg.sqe.elevator.test;

import junit.framework.*;

public class MyTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test1");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.getElevatorButton(0, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test2");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getElevatorFloor(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test3");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getElevatorDoorStatus((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test4");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.getElevatorButton(10, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test5");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getElevatorFloor((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test6");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var0.getElevatorDoorStatus(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test7");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(1, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.getElevatorButton((-1), 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test8");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(1, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCommittedDirection(10, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test9");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var0.getTarget(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test10");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var4.getElevatorButton(100, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test11");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getElevatorDoorStatus(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test12");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var0.getTarget(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test13");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getElevatorPosition(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test14");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    java.util.ArrayList var4 = var0.getCarts();
    int var5 = var0.getFloorHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test15");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var12 = var11.getFloors();
    var0.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var12);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var14 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var15 = var14.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var26 = var25.getFloors();
    var14.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var26);
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var29 = var28.getFloorHeight();
    java.util.ArrayList var30 = var28.getCarts();
    var14.setFloorButtonsUp(var30);
    at.fhhagenberg.sqe.elevator.model.Elevator var32 = new at.fhhagenberg.sqe.elevator.model.Elevator(var12, var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var35 = var32.getElevatorButton(0, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test16");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    boolean var8 = var1.getElevatorButton(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test17");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)0);
    boolean var3 = var1.getElevatorButton((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test18");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    int var29 = var21.getElevatorDir();
    var21.setElevatorSpeed(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test19");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    var1.moveUp();

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test20");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var4.getTarget(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test21");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var5 = var4.getFloors();
    java.util.ArrayList var6 = var4.getCarts();
    var0.setCarts(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var0.getTarget((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test22");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    int var29 = var21.getElevatorDir();
    int var30 = var21.getElevatorAccel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test23");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var5 = var4.getFloorHeight();
    java.util.ArrayList var6 = var4.getCarts();
    var3.setFloorButtonsDown(var6);
    var0.setFloorButtonsUp(var6);
    java.util.ArrayList var9 = var0.getFloorButtonsDown();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test24");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    java.util.ArrayList var2 = var0.getCarts();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTarget(10, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test25");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(1, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getTarget(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test26");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var4 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var5 = var4.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var15 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var16 = var15.getFloors();
    var4.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var16);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var19 = var18.getFloorHeight();
    java.util.ArrayList var20 = var18.getCarts();
    var4.setFloorButtonsUp(var20);
    var0.setCarts(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var25 = var0.getElevatorButton(100, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test27");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    boolean var4 = var0.getServicesFloors((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test28");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    var1.setSpeed(10);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test29");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var26 = var25.getFloorHeight();
    java.util.ArrayList var27 = var25.getCarts();
    int var28 = var25.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var29 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var30 = var29.getFloors();
    java.util.ArrayList var31 = var29.getCarts();
    var25.setCarts(var31);
    var21.setElevatorPressedButtons(var31);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var34 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var35 = var34.getFloorButtonsDown();
    java.util.ArrayList var36 = var34.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var37 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var39 = var38.getFloorHeight();
    java.util.ArrayList var40 = var38.getCarts();
    var37.setFloorButtonsDown(var40);
    var34.setFloorButtonsUp(var40);
    var21.setElevatorPressedButtons(var40);
    int var44 = var21.getElevatorWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 10);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test30");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    boolean var5 = var0.getFloorButtonUp((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var0.getElevatorFloor(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test31");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    var21.addElevatorPressedButtons(true);
    int var31 = var21.getElevatorDoorStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 10);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test32");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.stop();
    var1.deleteObservers();

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test33");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    var21.addElevatorPressedButtons(true);
    var21.setElevatorWeight(0);
    var21.addElevatorPressedButtons(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test34");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonUpPressed();
    var0.setFloorButtonUpPressed(false);
    int var4 = var0.getFloorId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test35");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getElevatorDoorStatus(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test36");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getCommittedDirection((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test37");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var5 = var0.getElevatorCapacity(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var0.getTarget(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test38");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    boolean var5 = var0.getFloorButtonDown(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var0.getTarget(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test39");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var0.setServicesFloors(0, 10, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.getElevatorButton(0, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test40");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    var0.setServicesFloors((-1), 2, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test41");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var5 = var0.getElevatorCapacity(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCommittedDirection(0, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test42");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    var21.setElevatorDir(10);
    int var26 = var21.getElevatorDoorStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test43");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    boolean var7 = var1.getElevatorButton(0);
    var1.moveUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test44");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var5 = var0.getElevatorSpeed(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test45");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    boolean var5 = var0.getFloorButtonUp((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var0.getElevatorPosition(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test46");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorAccel();
    var21.setElevatorWeight(0);
    int var27 = var21.getTargetFloor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test47");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var5 = var4.getFloors();
    java.util.ArrayList var6 = var4.getCarts();
    var0.setCarts(var6);
    int var8 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCommittedDirection(2, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test48");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var0.getElevatorFloor(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test49");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    int var3 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getElevatorDoorStatus(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test50");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var0.setCommittedDirection(1, 0);
    var0.setTarget(100, (-1));
    var0.setCommittedDirection(11, 11);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test51");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    boolean var5 = var0.getFloorButtonDown(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var0.getElevatorPosition(11);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test52");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    int var3 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getElevatorPosition(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test53");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    var21.setElevatorDir(10);
    var21.setElevatorCapacity(2);
    int var28 = var21.getElevatorAccel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test54");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var6 = var4.getElevatorAccel((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var4.getElevatorFloor(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test55");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    long var3 = var0.getClockTick();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test56");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    int var3 = var0.getFloorNum();
    int var4 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var0.getElevatorFloor(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test57");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var5 = var4.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var4.getElevatorPosition(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test58");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.stop();
    var1.readValues();
    var1.start();

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test59");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var5 = var4.getFloors();
    java.util.ArrayList var6 = var4.getCarts();
    var0.setCarts(var6);
    int var9 = var0.getElevatorCapacity(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var0.getTarget(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test60");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.stop();
    var1.readValues();
    var1.deleteObservers();

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test61");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    int var1 = var0.getFloorId();
    boolean var2 = var0.isFloorButtonDownPressed();
    int var3 = var0.getFloorId();
    var0.setFloorId(0);
    int var6 = var0.getFloorId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test62");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    boolean var5 = var0.getFloorButtonUp((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.getElevatorButton(10, 11);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test63");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    int var29 = var21.getElevatorDir();
    var21.setElevatorCapacity(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test64");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    var1.setSpeed(10);
    int var9 = var1.getDoorStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test65");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var4.getCommittedDirection(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test66");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    int var3 = var0.getFloorNum();
    int var4 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var0.getTarget(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test67");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var8 = var0.getFloorButtonUp(100);
    boolean var11 = var0.getElevatorButton(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test68");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getElevatorFloor(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test69");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    var21.setElevatorDir(10);
    var21.setElevatorCapacity(2);
    var21.setElevatorWeight(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test70");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    int var29 = var21.getElevatorDir();
    java.util.ArrayList var30 = var21.getElevatorPressedButtons();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test71");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    boolean var7 = var1.getElevatorButton(0);
    int var8 = var1.getCurrentFloor();
    boolean var10 = var1.getElevatorButton(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test72");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(1, 100);
    boolean var5 = var0.getFloorButtonUp(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test73");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    boolean var4 = var0.getServicesFloors(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test74");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getElevatorPosition(11);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test75");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    int var24 = var21.getElevatorPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test76");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    int var8 = var0.getElevatorAccel(10);
    int var10 = var0.getElevatorFloor((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test77");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var9 = var0.getServicesFloors((-1), 0);
    var0.setTarget(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test78");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    int var22 = var21.getElevatorSpeed();
    java.util.ArrayList var23 = var21.getElevatorPressedButtons();
    java.util.ArrayList var24 = var21.getElevatorPressedButtons();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test79");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    java.util.ArrayList var4 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var6 = var5.getFloorButtonsDown();
    java.util.ArrayList var7 = var5.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var17 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var18 = var17.getFloorButtonsDown();
    java.util.ArrayList var19 = var17.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var20 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var22 = var21.getFloorHeight();
    java.util.ArrayList var23 = var21.getCarts();
    var20.setFloorButtonsDown(var23);
    var17.setFloorButtonsUp(var23);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var26 = var5.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var23);
    var0.setFloors(var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCommittedDirection(2, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test80");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var4.getCommittedDirection(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test81");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.deleteObservers();
    var1.stop();

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test82");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    int var1 = var0.getFloorId();
    boolean var2 = var0.isFloorButtonDownPressed();
    int var3 = var0.getFloorId();
    var0.setFloorId(0);
    boolean var6 = var0.isFloorButtonDownPressed();
    var0.setFloorId((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test83");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getCarts();
    java.util.ArrayList var3 = var0.getCarts();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getCommittedDirection((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test84");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonDownPressed();
    boolean var2 = var0.isFloorButtonDownPressed();
    var0.setFloorId(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test85");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var5 = var4.getFloors();
    java.util.ArrayList var6 = var4.getCarts();
    var0.setCarts(var6);
    int var8 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var0.getTarget((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test86");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.moveDown();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test87");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var5 = var0.getElevatorCapacity(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var0.getElevatorFloor(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test88");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    var21.setElevatorDir(10);
    var21.setElevatorCapacity(2);
    int var28 = var21.getElevatorWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test89");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    var1.moveUp();
    int var8 = var1.getSpeed();
    int var9 = var1.getNextDestination();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test90");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    int var7 = var1.getElevatorDirection();
    var1.addDestination((java.lang.Integer)1);
    var1.moveUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test91");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getCarts();
    java.util.ArrayList var3 = var0.getCarts();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getElevatorPosition(11);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test92");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getCarts();
    java.util.ArrayList var3 = var0.getCarts();
    int var5 = var0.getElevatorWeight(1);
    int var6 = var0.getElevatorNum();
    int var7 = var0.getFloorNum();
    int var8 = var0.getElevatorNum();
    int var10 = var0.getElevatorWeight(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test93");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    int var7 = var1.getElevatorDirection();
    var1.moveDown();
    var1.addDestination((java.lang.Integer)11);
    var1.setSpeed((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test94");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    boolean var5 = var0.getFloorButtonDown(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.getElevatorButton((-1), 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test95");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorPosition((-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var0.setServicesFloors(2, 0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test96");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    int var7 = var1.getElevatorDirection();
    var1.moveDown();
    int var9 = var1.getDoorStatus();
    var1.addDestination((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test97");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTarget(11, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test98");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    java.util.ArrayList var29 = var21.getElevatorPressedButtons();
    int var30 = var21.getElevatorDir();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test99");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var8 = var0.getFloorButtonUp(100);
    long var9 = var0.getClockTick();
    int var11 = var0.getElevatorPosition(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test100");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    java.util.ArrayList var2 = var0.getCarts();
    boolean var5 = var0.getServicesFloors(10, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.getElevatorButton(100, 2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test101");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCommittedDirection(0, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test102");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    long var3 = var0.getClockTick();
    int var5 = var0.getElevatorWeight(10);
    var0.setServicesFloors(0, 11, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test103");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getCarts();
    java.util.ArrayList var3 = var0.getCarts();
    int var5 = var0.getElevatorWeight(1);
    int var6 = var0.getElevatorNum();
    int var7 = var0.getFloorNum();
    int var8 = var0.getElevatorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var0.getCommittedDirection(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test104");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var3 = var0.getElevatorCapacity(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getTarget(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test105");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    int var4 = var1.getCurrentPayload();
    int var5 = var1.getNextDestination();
    int var6 = var1.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test106");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    java.util.ArrayList var4 = var0.getCarts();
    int var5 = var0.getElevatorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCommittedDirection(11, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test107");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var1 = var0.getElevatorNum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test108");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var6 = var4.getElevatorAccel((-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorData var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var8 = var7.getFloorButtonsUp();
    java.util.ArrayList var9 = var7.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var19 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var20 = var19.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var22 = var21.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var23 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var22);
    var7.addElevatorBox(0, 100, (-1), 100, 10, 1, 0, 100, 100, var20);
    var4.setCarts(var20);
    int var26 = var4.getElevatorNum();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test109");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var10 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var11 = var10.getFloorButtonsDown();
    java.util.ArrayList var12 = var10.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var13 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var14 = var13.getFloorButtonsDown();
    java.util.ArrayList var15 = var13.getElevatorBoxesList();
    var10.setFloorButtonsDown(var15);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var17 = var0.new ElevatorBox(10, 10, 0, 100, 100, (-1), 1, 0, 0, var15);
    int var18 = var17.getElevatorClosestFloor();
    var17.setElevatorPosition((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test110");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    var21.addElevatorPressedButtons(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test111");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    int var22 = var21.getElevatorSpeed();
    int var23 = var21.getElevatorCapacity();
    var21.setTargetFloor((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test112");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var2 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var2.start();
    int var4 = var2.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test113");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var6 = var4.getElevatorAccel((-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorData var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var8 = var7.getFloorButtonsUp();
    java.util.ArrayList var9 = var7.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var19 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var20 = var19.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var22 = var21.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var23 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var22);
    var7.addElevatorBox(0, 100, (-1), 100, 10, 1, 0, 100, 100, var20);
    var4.setCarts(var20);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var26 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var27 = var26.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var37 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var38 = var37.getFloors();
    var26.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var38);
    at.fhhagenberg.sqe.elevator.model.Elevator var40 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var41 = var40.getFloorHeight();
    java.util.ArrayList var42 = var40.getCarts();
    var26.setFloorButtonsUp(var42);
    java.util.ArrayList var44 = var26.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var46 = var45.getClockTick();
    java.util.ArrayList var47 = var45.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var48 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var49 = var48.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var59 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var60 = var59.getFloors();
    var48.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var60);
    at.fhhagenberg.sqe.elevator.model.Elevator var62 = new at.fhhagenberg.sqe.elevator.model.Elevator(var47, var60);
    at.fhhagenberg.sqe.elevator.model.Elevator var63 = new at.fhhagenberg.sqe.elevator.model.Elevator(var44, var47);
    var4.setCarts(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test114");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var9 = var0.getServicesFloors((-1), 0);
    int var11 = var0.getElevatorFloor(100);
    int var12 = var0.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var13 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test115");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    int var22 = var21.getElevatorSpeed();
    java.util.ArrayList var23 = var21.getElevatorPressedButtons();
    var21.setElevatorWeight(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test116");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var0.setCommittedDirection(1, 0);
    int var6 = var0.getElevatorDoorStatus((-1));
    int var7 = var0.getElevatorNum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test117");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var4 = var3.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test118");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    int var7 = var1.getElevatorDirection();
    var1.setSpeed(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test119");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var5 = var0.getElevatorCapacity(10);
    int var6 = var0.getElevatorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.getCommittedDirection(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test120");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    java.util.ArrayList var2 = var0.getCarts();
    boolean var5 = var0.getServicesFloors(10, (-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorData var6 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var7 = var6.getFloorButtonsDown();
    java.util.ArrayList var8 = var6.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var9 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var10 = var9.getFloorButtonsDown();
    java.util.ArrayList var11 = var9.getElevatorBoxesList();
    var6.setFloorButtonsUp(var11);
    java.util.ArrayList var13 = var6.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var14 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var15 = var14.getFloorButtonsDown();
    java.util.ArrayList var16 = var14.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var26 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var27 = var26.getFloorButtonsDown();
    java.util.ArrayList var28 = var26.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var29 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var30 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var31 = var30.getFloorHeight();
    java.util.ArrayList var32 = var30.getCarts();
    var29.setFloorButtonsDown(var32);
    var26.setFloorButtonsUp(var32);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var35 = var14.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var32);
    java.util.ArrayList var36 = var14.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var46 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var47 = var46.getFloors();
    java.util.ArrayList var48 = var46.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var49 = var14.new ElevatorBox(1, 10, 0, 0, (-1), 1, 10, 10, 1, var48);
    at.fhhagenberg.sqe.elevator.model.Elevator var59 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var60 = var59.getFloors();
    java.util.ArrayList var61 = var59.getCarts();
    java.util.ArrayList var62 = var59.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var63 = var14.new ElevatorBox(0, 100, 1, 100, 100, 2, 100, 0, (-1), var62);
    var6.setFloorButtonsUp(var62);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var65 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var66 = var65.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var76 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var77 = var76.getFloors();
    var65.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var77);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var79 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var80 = var79.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var90 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var91 = var90.getFloors();
    var79.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var91);
    at.fhhagenberg.sqe.elevator.model.Elevator var93 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var94 = var93.getFloorHeight();
    java.util.ArrayList var95 = var93.getCarts();
    var79.setFloorButtonsUp(var95);
    at.fhhagenberg.sqe.elevator.model.Elevator var97 = new at.fhhagenberg.sqe.elevator.model.Elevator(var77, var95);
    var6.setFloorButtonsDown(var77);
    var0.setCarts(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test121");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var10 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var11 = var10.getFloorButtonsUp();
    java.util.ArrayList var12 = var10.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var22 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var23 = var22.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var25 = var24.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var26 = new at.fhhagenberg.sqe.elevator.model.Elevator(var23, var25);
    var10.addElevatorBox(0, 100, (-1), 100, 10, 1, 0, 100, 100, var23);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var28 = var0.new ElevatorBox(11, 1, 10, 11, 2, 2, 10, (-1), 2, var23);
    java.util.ArrayList var29 = var0.getFloorButtonsDown();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test122");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    int var22 = var21.getElevatorSpeed();
    var21.setElevatorAccel(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test123");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    boolean var3 = var0.getFloorButtonDown(2);
    int var4 = var0.getElevatorNum();
    var0.setTarget((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test124");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorAccel();
    int var25 = var21.getTargetFloor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test125");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    int var7 = var1.getElevatorDirection();
    var1.moveDown();
    int var9 = var1.getSpeed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test126");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var26 = var25.getFloorHeight();
    java.util.ArrayList var27 = var25.getCarts();
    int var28 = var25.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var29 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var30 = var29.getFloors();
    java.util.ArrayList var31 = var29.getCarts();
    var25.setCarts(var31);
    var21.setElevatorPressedButtons(var31);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var34 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var35 = var34.getFloorButtonsDown();
    java.util.ArrayList var36 = var34.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var37 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var39 = var38.getFloorHeight();
    java.util.ArrayList var40 = var38.getCarts();
    var37.setFloorButtonsDown(var40);
    var34.setFloorButtonsUp(var40);
    var21.setElevatorPressedButtons(var40);
    int var44 = var21.getElevatorAccel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test127");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    boolean var7 = var1.getElevatorButton(0);
    int var8 = var1.getCurrentFloor();
    var1.addDestination((java.lang.Integer)1);
    boolean var12 = var1.getElevatorButton(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test128");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    int var3 = var0.getFloorNum();
    int var4 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTarget(11, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test129");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var1 = var0.getFloorHeight();
    boolean var3 = var0.getFloorButtonDown(10);
    boolean var6 = var0.getElevatorButton(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test130");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    int var7 = var1.getElevatorDirection();
    int var8 = var1.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test131");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var2 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    boolean var4 = var0.getFloorButtonDown(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test132");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var5 = var4.getFloorNum();
    int var6 = var4.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setTarget(2, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test133");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getCarts();
    java.util.ArrayList var3 = var0.getCarts();
    int var5 = var0.getElevatorWeight(1);
    int var6 = var0.getElevatorNum();
    int var7 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTarget(0, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test134");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    boolean var5 = var0.getFloorButtonDown(1);
    int var7 = var0.getElevatorCapacity(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test135");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.getElevatorFloor(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test136");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    var1.moveDown();

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test137");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    int var2 = var1.getCurrentPayload();
    int var3 = var1.getElevatorDirection();
    int var4 = var1.getElevatorDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test138");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    int var25 = var21.getElevatorSpeed();
    int var26 = var21.getTargetFloor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test139");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.stop();
    var1.readValues();
    boolean var4 = var1.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test140");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var12 = var11.getFloors();
    var0.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var12);
    java.util.ArrayList var14 = var0.getFloorButtonsUp();
    java.util.ArrayList var15 = var0.getElevatorBoxesList();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test141");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    int var1 = var0.getFloorId();
    boolean var2 = var0.isFloorButtonDownPressed();
    int var3 = var0.getFloorId();
    boolean var4 = var0.isFloorButtonDownPressed();
    boolean var5 = var0.isFloorButtonDownPressed();
    int var6 = var0.getFloorId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test142");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonDownPressed();
    var0.setFloorButtonUpPressed(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test143");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    boolean var5 = var0.getFloorButtonDown(1);
    int var7 = var0.getElevatorWeight(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTarget(100, 2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test144");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorAccel(1);
    int var8 = var0.getElevatorDoorStatus(10);
    boolean var10 = var0.getFloorButtonDown(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test145");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var9 = var0.getServicesFloors((-1), 0);
    int var11 = var0.getElevatorAccel(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test146");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    int var25 = var21.getElevatorSpeed();
    var21.setElevatorCapacity(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test147");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var11 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var12 = var11.getFloorButtonsUp();
    java.util.ArrayList var13 = var11.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var23 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var24 = var23.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var26 = var25.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var27 = new at.fhhagenberg.sqe.elevator.model.Elevator(var24, var26);
    var11.addElevatorBox(0, 100, (-1), 100, 10, 1, 0, 100, 100, var24);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var29 = var0.new ElevatorBox(10, 10, 0, 100, 10, 100, 10, 1, (-1), var24);
    at.fhhagenberg.sqe.elevator.model.Elevator var30 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var31 = var30.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var32 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var33 = var32.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var34 = new at.fhhagenberg.sqe.elevator.model.Elevator(var31, var33);
    var29.setElevatorPressedButtons(var31);
    int var36 = var29.getElevatorCapacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test148");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    var21.setElevatorCapacity(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test149");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getElevatorDoorStatus(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test150");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var10 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var11 = var10.getFloorButtonsDown();
    java.util.ArrayList var12 = var10.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var13 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var14 = var13.getFloorButtonsDown();
    java.util.ArrayList var15 = var13.getElevatorBoxesList();
    var10.setFloorButtonsDown(var15);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var17 = var0.new ElevatorBox(10, 10, 0, 100, 100, (-1), 1, 0, 0, var15);
    java.util.ArrayList var18 = var0.getElevatorBoxesList();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test151");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)0);
    int var2 = var1.getCurrentPayload();
    int var3 = var1.getElevatorDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test152");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var7.notifyObservers();
    var7.stop();
    at.fhhagenberg.sqe.elevator.model.ElevatorCart var11 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    var11.addDestination((java.lang.Integer)100);
    var11.moveUp();
    int var15 = var11.getCurrentFloor();
    var7.notifyObservers((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 11);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test153");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    int var2 = var1.getCurrentPayload();
    boolean var4 = var1.getElevatorButton(0);
    var1.addDestination((java.lang.Integer)0);
    var1.addDestination((java.lang.Integer)11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test154");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    int var1 = var0.getFloorId();
    boolean var2 = var0.isFloorButtonDownPressed();
    int var3 = var0.getFloorId();
    var0.setFloorId(0);
    var0.setFloorButtonUpPressed(false);
    var0.setFloorButtonUpPressed(true);
    int var10 = var0.getFloorId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test155");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    int var1 = var0.getFloorId();
    boolean var2 = var0.isFloorButtonDownPressed();
    int var3 = var0.getFloorId();
    var0.setFloorId(0);
    boolean var6 = var0.isFloorButtonDownPressed();
    var0.setFloorId(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test156");


    at.fhhagenberg.sqe.elevator.main.Main var0 = new at.fhhagenberg.sqe.elevator.main.Main();
    var0.connect();
    var0.connect();
    var0.start();
    var0.start();
    var0.connect();

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test157");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var26 = var25.getFloorHeight();
    java.util.ArrayList var27 = var25.getCarts();
    int var28 = var25.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var29 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var30 = var29.getFloors();
    java.util.ArrayList var31 = var29.getCarts();
    var25.setCarts(var31);
    var21.setElevatorPressedButtons(var31);
    var21.setElevatorWeight(1);
    int var36 = var21.getElevatorSpeed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test158");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var11 = var10.getFloorHeight();
    java.util.ArrayList var12 = var10.getCarts();
    var0.addElevatorBox(0, (-1), (-1), 0, 100, (-1), 1, 100, (-1), var12);
    java.util.ArrayList var14 = var0.getFloorButtonsDown();
    java.util.ArrayList var15 = var0.getElevatorBoxesList();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test159");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    at.fhhagenberg.sqe.elevator.model.floor.Floor var4 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var5 = var4.isFloorButtonDownPressed();
    var4.setFloorId(2);
    var3.notifyObservers((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test160");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    java.util.ArrayList var29 = var21.getElevatorPressedButtons();
    var21.setElevatorPosition(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test161");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var5 = var4.getFloorNum();
    boolean var7 = var4.getFloorButtonDown(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test162");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)100);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test163");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorAccel();
    var21.setElevatorCapacity((-1));
    var21.setElevatorClosestFloor(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test164");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test165");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var5 = var4.getFloorNum();
    int var6 = var4.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var8 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var9 = var8.getFloorHeight();
    java.util.ArrayList var10 = var8.getCarts();
    var7.setFloorButtonsDown(var10);
    var4.setFloors(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test166");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    int var7 = var1.getElevatorDirection();
    var1.moveDown();
    boolean var10 = var1.getElevatorButton((-1));
    int var11 = var1.getCurrentPayload();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test167");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    var21.setElevatorDir(10);
    var21.setElevatorCapacity(2);
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var29 = var28.getFloorHeight();
    java.util.ArrayList var30 = var28.getCarts();
    int var31 = var28.getFloorHeight();
    java.util.ArrayList var32 = var28.getCarts();
    var21.setElevatorPressedButtons(var32);
    var21.setElevatorAccel(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test168");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var6 = var4.getElevatorAccel((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var4.getElevatorDoorStatus(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test169");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var2 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var3 = var2.getFloorButtonsDown();
    java.util.ArrayList var4 = var2.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var6 = var5.getFloorButtonsDown();
    java.util.ArrayList var7 = var5.getElevatorBoxesList();
    var2.setFloorButtonsUp(var7);
    java.util.ArrayList var9 = var2.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var10 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var11 = var10.getFloorButtonsDown();
    java.util.ArrayList var12 = var10.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var22 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var23 = var22.getFloorButtonsDown();
    java.util.ArrayList var24 = var22.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var26 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var27 = var26.getFloorHeight();
    java.util.ArrayList var28 = var26.getCarts();
    var25.setFloorButtonsDown(var28);
    var22.setFloorButtonsUp(var28);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var31 = var10.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var28);
    java.util.ArrayList var32 = var10.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var42 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var43 = var42.getFloors();
    java.util.ArrayList var44 = var42.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var45 = var10.new ElevatorBox(1, 10, 0, 0, (-1), 1, 10, 10, 1, var44);
    at.fhhagenberg.sqe.elevator.model.Elevator var55 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var56 = var55.getFloors();
    java.util.ArrayList var57 = var55.getCarts();
    java.util.ArrayList var58 = var55.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var59 = var10.new ElevatorBox(0, 100, 1, 100, 100, 2, 100, 0, (-1), var58);
    var2.setFloorButtonsUp(var58);
    java.util.ArrayList var61 = var2.getElevatorBoxesList();
    var0.setFloorButtonsDown(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test170");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCommittedDirection(1, 2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test171");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var5 = var4.getFloors();
    java.util.ArrayList var6 = var4.getCarts();
    var0.setCarts(var6);
    int var8 = var0.getFloorNum();
    java.util.ArrayList var9 = var0.getFloors();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test172");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    java.util.ArrayList var22 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var32 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var33 = var32.getFloors();
    java.util.ArrayList var34 = var32.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var35 = var0.new ElevatorBox(1, 10, 0, 0, (-1), 1, 10, 10, 1, var34);
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var46 = var45.getFloors();
    java.util.ArrayList var47 = var45.getCarts();
    java.util.ArrayList var48 = var45.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var49 = var0.new ElevatorBox(0, 100, 1, 100, 100, 2, 100, 0, (-1), var48);
    java.util.ArrayList var50 = var0.getElevatorBoxesList();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test173");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    int var29 = var21.getElevatorDir();
    var21.setElevatorClosestFloor((-1));
    var21.setElevatorCapacity(100);
    int var34 = var21.getElevatorWeight();
    int var35 = var21.getElevatorDoorStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 10);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test174");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    var1.addDestination((java.lang.Integer)100);
    var1.moveDown();
    var1.setSpeed(0);
    int var7 = var1.getElevatorDirection();
    var1.setCommitedDirection(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test175");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorPosition((-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    boolean var4 = var3.hasChanged();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var6 = var5.getFloorButtonsDown();
    java.util.ArrayList var7 = var5.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var17 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var18 = var17.getFloorButtonsDown();
    java.util.ArrayList var19 = var17.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var20 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var22 = var21.getFloorHeight();
    java.util.ArrayList var23 = var21.getCarts();
    var20.setFloorButtonsDown(var23);
    var17.setFloorButtonsUp(var23);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var26 = var5.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var23);
    var26.setElevatorWeight(10);
    int var29 = var26.getElevatorAccel();
    var26.setElevatorWeight(0);
    at.fhhagenberg.sqe.elevator.model.Elevator var32 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var33 = var32.getClockTick();
    java.util.ArrayList var34 = var32.getCarts();
    var26.setElevatorPressedButtons(var34);
    var3.notifyObservers((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test176");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    var1.setCommitedDirection(10);
    var1.addDestination((java.lang.Integer)10);
    var1.moveUp();

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test177");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    var1.moveUp();
    var1.setSpeed(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test178");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    java.util.ArrayList var2 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var4 = var3.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var15 = var14.getFloors();
    var3.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var15);
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator(var2, var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var19 = var17.getTarget(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test179");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    int var24 = var21.getElevatorDir();
    int var25 = var21.getElevatorClosestFloor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 10);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test180");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    boolean var7 = var1.getElevatorButton(0);
    int var8 = var1.getCurrentFloor();
    var1.addDestination((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test181");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorPosition((-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var3.start();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test182");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    var21.addElevatorPressedButtons(true);
    var21.setElevatorWeight(0);
    int var33 = var21.getElevatorCapacity();
    var21.setElevatorCapacity(0);
    int var36 = var21.getElevatorDir();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test183");


    at.fhhagenberg.sqe.elevator.main.Main var0 = new at.fhhagenberg.sqe.elevator.main.Main();
    var0.connect();
    var0.start();
    var0.start();

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test184");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    boolean var7 = var1.getElevatorButton(0);
    int var8 = var1.getCurrentFloor();
    int var9 = var1.getElevatorDirection();
    var1.moveUp();
    int var11 = var1.getDoorStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test185");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    java.util.ArrayList var29 = var21.getElevatorPressedButtons();
    var21.setElevatorCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test186");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    int var7 = var1.getElevatorDirection();
    var1.moveDown();
    int var9 = var1.getCurrentFloor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test187");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var0.setCommittedDirection(1, 0);
    int var6 = var0.getElevatorAccel(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test188");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var1.getFloorHeight();
    java.util.ArrayList var3 = var1.getCarts();
    var0.setFloorButtonsDown(var3);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var6 = var5.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var17 = var16.getFloors();
    var5.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var17);
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var29 = var28.getFloorHeight();
    java.util.ArrayList var30 = var28.getCarts();
    var5.addElevatorBox(1, 100, 10, 100, 1, 1, 0, 0, 0, var30);
    var0.setFloorButtonsDown(var30);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var42 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var43 = var42.getFloorButtonsDown();
    java.util.ArrayList var44 = var42.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var54 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var55 = var54.getFloorButtonsDown();
    java.util.ArrayList var56 = var54.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var57 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var58 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var59 = var58.getFloorHeight();
    java.util.ArrayList var60 = var58.getCarts();
    var57.setFloorButtonsDown(var60);
    var54.setFloorButtonsUp(var60);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var63 = var42.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var60);
    var63.setElevatorPosition((-1));
    var63.setElevatorDir(1);
    java.util.ArrayList var68 = var63.getElevatorPressedButtons();
    var0.addElevatorBox(2, 10, 1, 2, 0, 10, 2, 0, 100, var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test189");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    var21.setElevatorSpeed(10);
    var21.setElevatorCapacity(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test190");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    java.util.ArrayList var22 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var32 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var33 = var32.getFloors();
    java.util.ArrayList var34 = var32.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var35 = var0.new ElevatorBox(1, 10, 0, 0, (-1), 1, 10, 10, 1, var34);
    var35.setElevatorWeight(100);
    int var38 = var35.getElevatorCapacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 10);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test191");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    int var22 = var21.getElevatorSpeed();
    int var23 = var21.getElevatorCapacity();
    int var24 = var21.getTargetFloor();
    int var25 = var21.getElevatorCapacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test192");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    int var1 = var0.getFloorId();
    boolean var2 = var0.isFloorButtonDownPressed();
    int var3 = var0.getFloorId();
    var0.setFloorId(0);
    boolean var6 = var0.isFloorButtonUpPressed();
    boolean var7 = var0.isFloorButtonUpPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test193");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var5 = var4.getFloors();
    java.util.ArrayList var6 = var4.getCarts();
    var0.setCarts(var6);
    int var9 = var0.getElevatorCapacity(0);
    java.util.ArrayList var10 = var0.getFloors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var0.getElevatorButton(10, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test194");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorPosition((-1));
    int var4 = var0.getElevatorPosition(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test195");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    int var22 = var21.getElevatorSpeed();
    int var23 = var21.getElevatorCapacity();
    var21.setElevatorDir(11);
    int var26 = var21.getElevatorDoorStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test196");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var0.setCommittedDirection(1, 0);
    int var6 = var0.getElevatorDoorStatus((-1));
    boolean var8 = var0.getFloorButtonDown(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test197");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    int var22 = var21.getElevatorSpeed();
    java.util.ArrayList var23 = var21.getElevatorPressedButtons();
    var21.setElevatorPosition(0);
    var21.addElevatorPressedButtons(false);
    int var28 = var21.getElevatorAccel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test198");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var5 = var4.getFloorNum();
    int var6 = var4.getFloorHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test199");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    var21.setElevatorDir(1);
    int var26 = var21.getElevatorDoorStatus();
    var21.setElevatorSpeed(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test200");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    int var3 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getCommittedDirection((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test201");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    java.util.ArrayList var22 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var32 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var33 = var32.getFloors();
    java.util.ArrayList var34 = var32.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var35 = var0.new ElevatorBox(1, 10, 0, 0, (-1), 1, 10, 10, 1, var34);
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var46 = var45.getFloors();
    java.util.ArrayList var47 = var45.getCarts();
    java.util.ArrayList var48 = var45.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var49 = var0.new ElevatorBox(0, 100, 1, 100, 100, 2, 100, 0, (-1), var48);
    int var50 = var49.getElevatorWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 100);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test202");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    at.fhhagenberg.sqe.elevator.model.Elevator var31 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var32 = var31.getFloors();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var33 = var0.new ElevatorBox(0, 11, 2, 2, (-1), 10, 1, 11, (-1), var32);
    java.util.ArrayList var34 = var0.getFloorButtonsUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test203");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    var21.setElevatorDir(10);
    java.util.ArrayList var26 = var21.getElevatorPressedButtons();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test204");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var6 = var4.getElevatorAccel((-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorData var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var8 = var7.getFloorButtonsUp();
    java.util.ArrayList var9 = var7.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var19 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var20 = var19.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var22 = var21.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var23 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var22);
    var7.addElevatorBox(0, 100, (-1), 100, 10, 1, 0, 100, 100, var20);
    var4.setCarts(var20);
    long var26 = var4.getClockTick();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var28 = var4.getElevatorPosition(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0L);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test205");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var4 = var3.getFloorButtonsDown();
    java.util.ArrayList var5 = var3.getElevatorBoxesList();
    var0.setFloorButtonsUp(var5);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var16 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var17 = var16.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var27 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var28 = var27.getFloorButtonsUp();
    java.util.ArrayList var29 = var27.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var39 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var40 = var39.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var42 = var41.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var43 = new at.fhhagenberg.sqe.elevator.model.Elevator(var40, var42);
    var27.addElevatorBox(0, 100, (-1), 100, 10, 1, 0, 100, 100, var40);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var45 = var16.new ElevatorBox(10, 10, 0, 100, 10, 100, 10, 1, (-1), var40);
    var0.addElevatorBox((-1), 100, 100, 1, (-1), 100, 11, 100, 2, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var47 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var48 = var47.getClockTick();
    java.util.ArrayList var49 = var47.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var50 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var51 = var50.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var61 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var62 = var61.getFloors();
    var50.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var62);
    at.fhhagenberg.sqe.elevator.model.Elevator var64 = new at.fhhagenberg.sqe.elevator.model.Elevator(var49, var62);
    var0.setFloorButtonsUp(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test206");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonDownPressed();
    var0.setFloorId(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test207");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.stop();
    var1.readValues();
    var1.readValues();
    var1.start();
    boolean var6 = var1.hasChanged();
    var1.start();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test208");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.getCommittedDirection(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test209");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.stop();
    boolean var3 = var1.hasChanged();
    var1.stop();
    var1.start();
    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var6 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var8 = var6.getElevatorDoorStatus((-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var9 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var6);
    var1.notifyObservers((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test210");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    java.util.ArrayList var2 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var4 = var3.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var15 = var14.getFloors();
    var3.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var15);
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator(var2, var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.setTarget(10, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test211");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    boolean var5 = var0.getFloorButtonDown(1);
    int var7 = var0.getElevatorWeight(100);
    int var8 = var0.getFloorHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test212");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test213");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var2 = var1.countObservers();
    at.fhhagenberg.sqe.elevator.model.ElevatorCart var4 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var6 = var4.getElevatorButton(1);
    var4.setSpeed(1);
    boolean var10 = var4.getElevatorButton(0);
    int var11 = var4.getCurrentFloor();
    var4.setCommitedDirection(11);
    var4.moveDown();
    var1.notifyObservers((java.lang.Object)var4);
    int var16 = var4.getSpeed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test214");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    var1.addDestination((java.lang.Integer)(-1));
    var1.addDestination((java.lang.Integer)1);
    int var11 = var1.getNextDestination();
    var1.addDestination((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test215");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    int var24 = var21.getElevatorDir();
    var21.setElevatorDoorStatus(100);
    int var27 = var21.getElevatorPosition();
    var21.setElevatorDoorStatus(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test216");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var8 = var0.getFloorButtonUp(100);
    long var9 = var0.getClockTick();
    int var11 = var0.getElevatorFloor(100);
    int var13 = var0.getElevatorAccel(1);
    int var14 = var0.getFloorNum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test217");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonUpPressed();
    var0.setFloorButtonUpPressed(false);
    boolean var4 = var0.isFloorButtonDownPressed();
    var0.setFloorButtonUpPressed(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test218");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    java.util.ArrayList var4 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var6 = var5.getFloorButtonsDown();
    java.util.ArrayList var7 = var5.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var17 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var18 = var17.getFloorButtonsDown();
    java.util.ArrayList var19 = var17.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var20 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var22 = var21.getFloorHeight();
    java.util.ArrayList var23 = var21.getCarts();
    var20.setFloorButtonsDown(var23);
    var17.setFloorButtonsUp(var23);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var26 = var5.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var23);
    var0.setFloors(var23);
    int var28 = var0.getFloorHeight();
    int var30 = var0.getElevatorSpeed(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var32 = var0.getElevatorPosition(11);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test219");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var12 = var11.getFloors();
    var0.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var12);
    java.util.ArrayList var14 = var0.getElevatorBoxesList();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test220");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    var21.addElevatorPressedButtons(true);
    java.util.ArrayList var31 = var21.getElevatorPressedButtons();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test221");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var2 = var1.countObservers();
    at.fhhagenberg.sqe.elevator.model.ElevatorCart var4 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var6 = var4.getElevatorButton(1);
    var4.setSpeed(1);
    boolean var10 = var4.getElevatorButton(0);
    int var11 = var4.getCurrentFloor();
    var4.setCommitedDirection(11);
    var4.moveDown();
    var1.notifyObservers((java.lang.Object)var4);
    int var16 = var1.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test222");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var5 = var0.getElevatorCapacity(10);
    int var6 = var0.getElevatorNum();
    int var8 = var0.getElevatorAccel(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test223");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var2 = var1.countObservers();
    int var3 = var1.countObservers();
    at.fhhagenberg.sqe.elevator.model.floor.Floor var4 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    int var5 = var4.getFloorId();
    var1.notifyObservers((java.lang.Object)var5);
    var1.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test224");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.stop();
    boolean var3 = var1.hasChanged();
    var1.stop();
    var1.start();
    var1.start();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test225");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var0.setCommittedDirection(1, 0);
    int var6 = var0.getElevatorDoorStatus((-1));
    boolean var8 = var0.getFloorButtonDown(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test226");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorAccel();
    var21.setElevatorWeight(0);
    int var27 = var21.getElevatorPosition();
    var21.setElevatorDoorStatus(1);
    var21.setTargetFloor(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 100);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test227");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    int var3 = var0.getElevatorSpeed(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test228");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    int var3 = var0.getFloorNum();
    java.util.ArrayList var4 = var0.getCarts();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test229");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.deleteObservers();
    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var5 = var3.getElevatorDoorStatus((-1));
    int var7 = var3.getTarget(0);
    int var9 = var3.getElevatorWeight(1);
    boolean var12 = var3.getServicesFloors((-1), 0);
    int var14 = var3.getElevatorFloor(100);
    var1.notifyObservers((java.lang.Object)var3);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var16 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var17 = var16.getFloorButtonsDown();
    java.util.ArrayList var18 = var16.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var28 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var29 = var28.getFloorButtonsDown();
    java.util.ArrayList var30 = var28.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var31 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var32 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var33 = var32.getFloorHeight();
    java.util.ArrayList var34 = var32.getCarts();
    var31.setFloorButtonsDown(var34);
    var28.setFloorButtonsUp(var34);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var37 = var16.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var34);
    var37.setElevatorWeight(10);
    var37.setElevatorSpeed(10);
    int var42 = var37.getElevatorPosition();
    var37.setElevatorDir(2);
    int var45 = var37.getElevatorWeight();
    var1.notifyObservers((java.lang.Object)var45);
    boolean var47 = var1.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test230");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorCapacity((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test231");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var6 = var4.getElevatorAccel((-1));
    var4.setServicesFloors(11, 11, true);
    boolean var13 = var4.getServicesFloors((-1), 11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setTarget(100, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test232");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.deleteObservers();
    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var5 = var3.getElevatorDoorStatus((-1));
    int var7 = var3.getTarget(0);
    int var9 = var3.getElevatorWeight(1);
    boolean var12 = var3.getServicesFloors((-1), 0);
    int var14 = var3.getElevatorFloor(100);
    var1.notifyObservers((java.lang.Object)var3);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var16 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var17 = var16.getFloorButtonsDown();
    java.util.ArrayList var18 = var16.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var28 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var29 = var28.getFloorButtonsDown();
    java.util.ArrayList var30 = var28.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var31 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var32 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var33 = var32.getFloorHeight();
    java.util.ArrayList var34 = var32.getCarts();
    var31.setFloorButtonsDown(var34);
    var28.setFloorButtonsUp(var34);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var37 = var16.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var34);
    var37.setElevatorWeight(10);
    var37.setElevatorSpeed(10);
    int var42 = var37.getElevatorPosition();
    var37.setElevatorDir(2);
    int var45 = var37.getElevatorWeight();
    var1.notifyObservers((java.lang.Object)var45);
    var1.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 10);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test233");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonUpPressed();
    var0.setFloorButtonUpPressed(true);
    boolean var4 = var0.isFloorButtonDownPressed();
    boolean var5 = var0.isFloorButtonDownPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test234");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.getCommittedDirection(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test235");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var2 = var1.countObservers();
    var1.notifyObservers();
    var1.readValues();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test236");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    var21.addElevatorPressedButtons(true);
    var21.setElevatorWeight(0);
    int var33 = var21.getTargetFloor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test237");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getCarts();
    java.util.ArrayList var3 = var0.getCarts();
    int var5 = var0.getElevatorCapacity(1);
    boolean var7 = var0.getFloorButtonDown(11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var0.getElevatorFloor(11);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test238");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    var1.setCommitedDirection(10);
    var1.addDestination((java.lang.Integer)10);
    boolean var7 = var1.getElevatorButton(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test239");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    var21.setElevatorSpeed(10);
    var21.setElevatorCapacity(10);
    int var28 = var21.getElevatorClosestFloor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test240");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    var21.setElevatorDir(10);
    var21.setElevatorClosestFloor(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test241");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    java.util.ArrayList var29 = var21.getElevatorPressedButtons();
    var21.setElevatorAccel((-1));
    var21.addElevatorPressedButtons(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test242");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var0.setCommittedDirection(1, 0);
    int var6 = var0.getElevatorDoorStatus((-1));
    int var8 = var0.getElevatorAccel(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test243");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    int var24 = var21.getElevatorCapacity();
    int var25 = var21.getElevatorDir();
    var21.setElevatorPosition(0);
    var21.setElevatorAccel(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test244");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var9 = var0.getServicesFloors((-1), 0);
    int var11 = var0.getElevatorFloor(100);
    boolean var14 = var0.getElevatorButton((-1), 100);
    boolean var17 = var0.getServicesFloors(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test245");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    var21.addElevatorPressedButtons(true);
    var21.setElevatorWeight(0);
    var21.setElevatorDir(11);
    var21.setElevatorWeight((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test246");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    int var1 = var0.getFloorId();
    boolean var2 = var0.isFloorButtonDownPressed();
    int var3 = var0.getFloorId();
    var0.setFloorId(0);
    var0.setFloorButtonUpPressed(false);
    var0.setFloorButtonUpPressed(true);
    boolean var10 = var0.isFloorButtonDownPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test247");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    var21.addElevatorPressedButtons(true);
    var21.setElevatorWeight(0);
    var21.setElevatorDir(11);
    var21.setTargetFloor((-1));
    var21.setElevatorDir(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test248");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var4 = var0.getElevatorCapacity(100);
    int var6 = var0.getElevatorSpeed(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test249");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    int var7 = var1.getElevatorDirection();
    var1.moveDown();
    int var9 = var1.getElevatorDirection();
    var1.addDestination((java.lang.Integer)11);
    var1.setSpeed(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test250");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    var21.setElevatorCapacity(0);
    var21.setElevatorClosestFloor(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test251");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var8 = var0.getFloorButtonUp(100);
    long var9 = var0.getClockTick();
    int var11 = var0.getElevatorFloor(100);
    int var13 = var0.getElevatorAccel(1);
    int var14 = var0.getFloorHeight();
    int var15 = var0.getFloorNum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test252");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    int var1 = var0.getFloorId();
    boolean var2 = var0.isFloorButtonDownPressed();
    int var3 = var0.getFloorId();
    var0.setFloorId(0);
    var0.setFloorButtonUpPressed(false);
    var0.setFloorButtonUpPressed(true);
    boolean var10 = var0.isFloorButtonUpPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test253");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    var21.addElevatorPressedButtons(true);
    var21.setElevatorWeight(0);
    int var33 = var21.getElevatorCapacity();
    var21.setElevatorCapacity(0);
    int var36 = var21.getElevatorSpeed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test254");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var3 = var0.getElevatorFloor((-1));
    var0.setCommittedDirection(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test255");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    var1.addDestination((java.lang.Integer)100);
    var1.moveUp();
    int var5 = var1.getCurrentFloor();
    var1.moveDown();
    int var7 = var1.getElevatorDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test256");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    int var29 = var21.getElevatorDir();
    var21.setElevatorClosestFloor((-1));
    var21.setElevatorSpeed(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test257");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var12 = var11.getFloors();
    var0.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var12);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var14 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var15 = var14.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var26 = var25.getFloors();
    var14.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var26);
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var29 = var28.getFloorHeight();
    java.util.ArrayList var30 = var28.getCarts();
    var14.setFloorButtonsUp(var30);
    at.fhhagenberg.sqe.elevator.model.Elevator var32 = new at.fhhagenberg.sqe.elevator.model.Elevator(var12, var30);
    int var33 = var32.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var34 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var35 = var34.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var46 = var45.getFloors();
    var34.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var46);
    var32.setFloors(var46);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var49 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var59 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var60 = var59.getFloorButtonsDown();
    java.util.ArrayList var61 = var59.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var62 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var63 = var62.getFloorButtonsDown();
    java.util.ArrayList var64 = var62.getElevatorBoxesList();
    var59.setFloorButtonsDown(var64);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var66 = var49.new ElevatorBox(10, 10, 0, 100, 100, (-1), 1, 0, 0, var64);
    java.util.ArrayList var67 = var49.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var68 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var69 = var68.getClockTick();
    java.util.ArrayList var70 = var68.getCarts();
    var49.setFloorButtonsDown(var70);
    var32.setFloors(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test258");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonUpPressed();
    var0.setFloorButtonUpPressed(true);
    boolean var4 = var0.isFloorButtonDownPressed();
    boolean var5 = var0.isFloorButtonUpPressed();
    boolean var6 = var0.isFloorButtonUpPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test259");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var8 = var0.getFloorButtonUp(100);
    int var10 = var0.getElevatorDoorStatus(100);
    boolean var12 = var0.getFloorButtonDown((-1));
    boolean var14 = var0.getFloorButtonUp(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test260");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var0.setCommittedDirection(1, 0);
    var0.setTarget(100, (-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var8 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test261");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsUp();
    java.util.ArrayList var2 = var0.getElevatorBoxesList();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var4 = var3.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var15 = var14.getFloors();
    var3.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var15);
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var18 = var17.getFloorHeight();
    java.util.ArrayList var19 = var17.getCarts();
    var3.setFloorButtonsUp(var19);
    java.util.ArrayList var21 = var3.getFloorButtonsUp();
    var0.setFloorButtonsUp(var21);
    java.util.ArrayList var23 = var0.getFloorButtonsDown();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test262");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    java.util.ArrayList var4 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var5 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var6 = var5.getFloorHeight();
    java.util.ArrayList var7 = var5.getCarts();
    int var8 = var5.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var10 = var9.getFloors();
    java.util.ArrayList var11 = var9.getCarts();
    var5.setCarts(var11);
    int var14 = var5.getElevatorCapacity(0);
    java.util.ArrayList var15 = var5.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator(var4, var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test263");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    at.fhhagenberg.sqe.elevator.model.Elevator var31 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var32 = var31.getFloors();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var33 = var0.new ElevatorBox(0, 11, 2, 2, (-1), 10, 1, 11, (-1), var32);
    var33.addElevatorPressedButtons(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test264");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    boolean var7 = var1.getElevatorButton(0);
    int var8 = var1.getCurrentFloor();
    int var9 = var1.getSpeed();
    int var10 = var1.getSpeed();
    int var11 = var1.getCurrentFloor();
    boolean var13 = var1.getElevatorButton(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test265");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    var1.addDestination((java.lang.Integer)100);
    int var4 = var1.getWeight();
    int var5 = var1.getNextDestination();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test266");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var8 = var0.getFloorButtonUp(100);
    long var9 = var0.getClockTick();
    long var10 = var0.getClockTick();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test267");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var0.setServicesFloors(0, 10, true);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var8 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var9 = var8.getFloorButtonsDown();
    java.util.ArrayList var10 = var8.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var20 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var21 = var20.getFloorButtonsDown();
    java.util.ArrayList var22 = var20.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var23 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var25 = var24.getFloorHeight();
    java.util.ArrayList var26 = var24.getCarts();
    var23.setFloorButtonsDown(var26);
    var20.setFloorButtonsUp(var26);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var29 = var8.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var26);
    java.util.ArrayList var30 = var8.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var40 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var41 = var40.getFloors();
    java.util.ArrayList var42 = var40.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var43 = var8.new ElevatorBox(1, 10, 0, 0, (-1), 1, 10, 10, 1, var42);
    var0.setCarts(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test268");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var12 = var11.getFloors();
    var0.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var12);
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var15 = var14.getFloorHeight();
    java.util.ArrayList var16 = var14.getCarts();
    var0.setFloorButtonsUp(var16);
    java.util.ArrayList var18 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var19 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var20 = var19.getClockTick();
    java.util.ArrayList var21 = var19.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var22 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var23 = var22.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var33 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var34 = var33.getFloors();
    var22.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var34);
    at.fhhagenberg.sqe.elevator.model.Elevator var36 = new at.fhhagenberg.sqe.elevator.model.Elevator(var21, var34);
    at.fhhagenberg.sqe.elevator.model.Elevator var37 = new at.fhhagenberg.sqe.elevator.model.Elevator(var18, var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var39 = var37.getElevatorDoorStatus(11);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test269");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    var21.setElevatorDir(1);
    var21.setTargetFloor(2);
    var21.setElevatorDir(100);
    int var30 = var21.getElevatorWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 100);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test270");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonUpPressed();
    var0.setFloorButtonUpPressed(false);
    boolean var4 = var0.isFloorButtonDownPressed();
    boolean var5 = var0.isFloorButtonDownPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test271");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    int var2 = var1.getCurrentPayload();
    int var3 = var1.getElevatorDirection();
    int var4 = var1.getCurrentPayload();
    var1.setCommitedDirection(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test272");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    var1.setSpeed(10);
    var1.setSpeed((-1));
    boolean var12 = var1.getElevatorButton(11);
    int var13 = var1.getSpeed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test273");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    boolean var5 = var0.getServicesFloors((-1), 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test274");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var12 = var11.getFloors();
    var0.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var12);
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var15 = var14.getFloorHeight();
    java.util.ArrayList var16 = var14.getCarts();
    var0.setFloorButtonsUp(var16);
    java.util.ArrayList var18 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var19 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var20 = var19.getFloorButtonsDown();
    java.util.ArrayList var21 = var19.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var31 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var32 = var31.getFloorButtonsDown();
    java.util.ArrayList var33 = var31.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var34 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var36 = var35.getFloorHeight();
    java.util.ArrayList var37 = var35.getCarts();
    var34.setFloorButtonsDown(var37);
    var31.setFloorButtonsUp(var37);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var40 = var19.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var37);
    var40.setElevatorPosition((-1));
    var40.setElevatorDir(1);
    java.util.ArrayList var45 = var40.getElevatorPressedButtons();
    var0.setFloorButtonsDown(var45);
    java.util.ArrayList var47 = var0.getFloorButtonsDown();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test275");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorPosition((-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var5 = var0.getElevatorAccel(100);
    var0.setServicesFloors(10, 11, false);
    int var11 = var0.getElevatorSpeed((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test276");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonUpPressed();
    var0.setFloorButtonUpPressed(true);
    var0.setFloorButtonUpPressed(false);
    boolean var6 = var0.isFloorButtonUpPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test277");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var6 = var4.getElevatorAccel((-1));
    var4.setServicesFloors(11, 11, true);
    boolean var13 = var4.getServicesFloors(2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test278");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorAccel(1);
    int var8 = var0.getElevatorFloor(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test279");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var2 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var3 = var2.getFloorButtonsDown();
    java.util.ArrayList var4 = var2.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var14 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var15 = var14.getFloorButtonsDown();
    java.util.ArrayList var16 = var14.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var17 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var19 = var18.getFloorHeight();
    java.util.ArrayList var20 = var18.getCarts();
    var17.setFloorButtonsDown(var20);
    var14.setFloorButtonsUp(var20);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var23 = var2.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var20);
    var23.setElevatorWeight(10);
    int var26 = var23.getElevatorAccel();
    at.fhhagenberg.sqe.elevator.model.Elevator var27 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var28 = var27.getFloorHeight();
    java.util.ArrayList var29 = var27.getCarts();
    int var30 = var27.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var31 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var32 = var31.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var42 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var43 = var42.getFloors();
    var31.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var43);
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var46 = var45.getFloorHeight();
    java.util.ArrayList var47 = var45.getCarts();
    var31.setFloorButtonsUp(var47);
    var27.setCarts(var47);
    var23.setElevatorPressedButtons(var47);
    var0.setCarts(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test280");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getFloors();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test281");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var2 = var1.countObservers();
    var1.notifyObservers();
    var1.start();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test282");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var5 = var4.getFloorNum();
    int var7 = var4.getElevatorCapacity((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var4.getCommittedDirection(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test283");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)0);
    int var2 = var1.getCurrentPayload();
    int var3 = var1.getCurrentFloor();
    var1.moveUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test284");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var9 = var0.getServicesFloors((-1), 0);
    int var11 = var0.getElevatorFloor(100);
    boolean var14 = var0.getElevatorButton((-1), 100);
    int var16 = var0.getElevatorSpeed(0);
    int var18 = var0.getElevatorPosition(0);
    int var19 = var0.getFloorHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test285");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    int var24 = var21.getElevatorCapacity();
    int var25 = var21.getElevatorDir();
    int var26 = var21.getElevatorDoorStatus();
    var21.setElevatorClosestFloor(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test286");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    boolean var4 = var0.getFloorButtonDown(2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var0.getCommittedDirection(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test287");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    int var22 = var21.getElevatorSpeed();
    java.util.ArrayList var23 = var21.getElevatorPressedButtons();
    var21.setElevatorPosition(0);
    int var26 = var21.getElevatorDoorStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test288");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    boolean var7 = var1.getElevatorButton(0);
    var1.setCommitedDirection(11);
    int var10 = var1.getSpeed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test289");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    int var24 = var21.getElevatorWeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var28 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var29 = var28.getFloorButtonsDown();
    java.util.ArrayList var30 = var28.getElevatorBoxesList();
    var25.setFloorButtonsUp(var30);
    java.util.ArrayList var32 = var25.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var33 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var34 = var33.getFloorButtonsDown();
    java.util.ArrayList var35 = var33.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var45 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var46 = var45.getFloorButtonsDown();
    java.util.ArrayList var47 = var45.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var48 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var49 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var50 = var49.getFloorHeight();
    java.util.ArrayList var51 = var49.getCarts();
    var48.setFloorButtonsDown(var51);
    var45.setFloorButtonsUp(var51);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var54 = var33.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var51);
    java.util.ArrayList var55 = var33.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var65 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var66 = var65.getFloors();
    java.util.ArrayList var67 = var65.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var68 = var33.new ElevatorBox(1, 10, 0, 0, (-1), 1, 10, 10, 1, var67);
    at.fhhagenberg.sqe.elevator.model.Elevator var78 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var79 = var78.getFloors();
    java.util.ArrayList var80 = var78.getCarts();
    java.util.ArrayList var81 = var78.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var82 = var33.new ElevatorBox(0, 100, 1, 100, 100, 2, 100, 0, (-1), var81);
    var25.setFloorButtonsUp(var81);
    var21.setElevatorPressedButtons(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test290");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    boolean var7 = var1.getElevatorButton(0);
    int var8 = var1.getCurrentFloor();
    int var9 = var1.getElevatorDirection();
    int var10 = var1.getElevatorDirection();
    int var11 = var1.getDoorStatus();
    var1.setSpeed(2);
    var1.addDestination((java.lang.Integer)11);
    var1.addDestination((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test291");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    int var1 = var0.getFloorId();
    boolean var2 = var0.isFloorButtonDownPressed();
    int var3 = var0.getFloorId();
    var0.setFloorId(0);
    boolean var6 = var0.isFloorButtonDownPressed();
    int var7 = var0.getFloorId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test292");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var3 = var0.getElevatorFloor((-1));
    int var5 = var0.getCommittedDirection(0);
    int var7 = var0.getElevatorFloor(100);
    int var9 = var0.getElevatorAccel(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test293");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    int var1 = var0.getFloorId();
    boolean var2 = var0.isFloorButtonDownPressed();
    int var3 = var0.getFloorId();
    var0.setFloorId(0);
    var0.setFloorButtonUpPressed(false);
    int var8 = var0.getFloorId();
    var0.setFloorButtonDownPressed(true);
    boolean var11 = var0.isFloorButtonUpPressed();
    boolean var12 = var0.isFloorButtonUpPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test294");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var5 = var4.getFloors();
    java.util.ArrayList var6 = var4.getCarts();
    var0.setCarts(var6);
    int var8 = var0.getFloorHeight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTarget(1, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test295");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var1 = var0.getFloorHeight();
    int var3 = var0.getElevatorFloor(2);
    boolean var6 = var0.getElevatorButton((-1), 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test296");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var10 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var11 = var10.getFloorButtonsDown();
    java.util.ArrayList var12 = var10.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var13 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var14 = var13.getFloorButtonsDown();
    java.util.ArrayList var15 = var13.getElevatorBoxesList();
    var10.setFloorButtonsDown(var15);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var17 = var0.new ElevatorBox(10, 10, 0, 100, 100, (-1), 1, 0, 0, var15);
    int var18 = var17.getElevatorClosestFloor();
    int var19 = var17.getElevatorPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test297");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonUpPressed();
    var0.setFloorButtonUpPressed(false);
    boolean var4 = var0.isFloorButtonDownPressed();
    var0.setFloorId(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test298");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var12 = var11.getFloors();
    var0.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var12);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var14 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var15 = var14.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var26 = var25.getFloors();
    var14.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var26);
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var29 = var28.getFloorHeight();
    java.util.ArrayList var30 = var28.getCarts();
    var14.setFloorButtonsUp(var30);
    at.fhhagenberg.sqe.elevator.model.Elevator var32 = new at.fhhagenberg.sqe.elevator.model.Elevator(var12, var30);
    int var33 = var32.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var35 = var32.getElevatorFloor(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 10);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test299");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var10 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var11 = var10.getFloorButtonsDown();
    java.util.ArrayList var12 = var10.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var13 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var14 = var13.getFloorButtonsDown();
    java.util.ArrayList var15 = var13.getElevatorBoxesList();
    var10.setFloorButtonsDown(var15);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var17 = var0.new ElevatorBox(10, 10, 0, 100, 100, (-1), 1, 0, 0, var15);
    int var18 = var17.getElevatorSpeed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test300");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    boolean var7 = var1.getElevatorButton(0);
    int var8 = var1.getCurrentFloor();
    int var9 = var1.getElevatorDirection();
    int var10 = var1.getElevatorDirection();
    int var11 = var1.getDoorStatus();
    var1.setSpeed(2);
    var1.addDestination((java.lang.Integer)11);
    boolean var17 = var1.getElevatorButton(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test301");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getCarts();
    java.util.ArrayList var3 = var0.getCarts();
    int var5 = var0.getElevatorWeight(1);
    int var6 = var0.getElevatorNum();
    int var7 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.getElevatorButton(11, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test302");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    int var25 = var21.getElevatorPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test303");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    boolean var7 = var1.getElevatorButton(1);
    boolean var9 = var1.getElevatorButton(2);
    int var10 = var1.getElevatorDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test304");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    int var1 = var0.getFloorId();
    boolean var2 = var0.isFloorButtonDownPressed();
    int var3 = var0.getFloorId();
    boolean var4 = var0.isFloorButtonDownPressed();
    int var5 = var0.getFloorId();
    boolean var6 = var0.isFloorButtonDownPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test305");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getCarts();
    java.util.ArrayList var3 = var0.getCarts();
    int var5 = var0.getElevatorCapacity(1);
    boolean var7 = var0.getFloorButtonDown(11);
    int var9 = var0.getElevatorCapacity(10);
    boolean var12 = var0.getServicesFloors(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test306");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var5 = var4.getFloors();
    java.util.ArrayList var6 = var4.getCarts();
    var0.setCarts(var6);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var8 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var9 = var8.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var19 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var20 = var19.getFloors();
    var8.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var20);
    at.fhhagenberg.sqe.elevator.model.Elevator var22 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var23 = var22.getFloorHeight();
    java.util.ArrayList var24 = var22.getCarts();
    var8.setFloorButtonsUp(var24);
    at.fhhagenberg.sqe.elevator.model.Elevator var26 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test307");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var4 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var5 = var4.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var15 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var16 = var15.getFloors();
    var4.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var16);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var19 = var18.getFloorHeight();
    java.util.ArrayList var20 = var18.getCarts();
    var4.setFloorButtonsUp(var20);
    var0.setCarts(var20);
    int var23 = var0.getFloorHeight();
    boolean var25 = var0.getFloorButtonUp(10);
    boolean var28 = var0.getServicesFloors(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test308");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    var1.setCommitedDirection(10);
    var1.addDestination((java.lang.Integer)10);
    int var6 = var1.getCurrentPayload();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test309");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var9 = var0.getServicesFloors((-1), 0);
    int var11 = var0.getElevatorFloor(100);
    boolean var14 = var0.getElevatorButton((-1), 100);
    int var16 = var0.getElevatorSpeed(0);
    boolean var19 = var0.getElevatorButton(11, 10);
    int var20 = var0.getElevatorNum();
    int var22 = var0.getElevatorCapacity(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test310");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var11 = var10.getFloorHeight();
    java.util.ArrayList var12 = var10.getCarts();
    var0.addElevatorBox(0, (-1), (-1), 0, 100, (-1), 1, 100, (-1), var12);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var14 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var15 = var14.getFloorButtonsDown();
    java.util.ArrayList var16 = var14.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var17 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var19 = var18.getFloorHeight();
    java.util.ArrayList var20 = var18.getCarts();
    var17.setFloorButtonsDown(var20);
    var14.setFloorButtonsUp(var20);
    var0.setFloorButtonsUp(var20);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var33 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var34 = var33.getFloorButtonsUp();
    java.util.ArrayList var35 = var33.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var46 = var45.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var47 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var48 = var47.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var49 = new at.fhhagenberg.sqe.elevator.model.Elevator(var46, var48);
    var33.addElevatorBox(0, 100, (-1), 100, 10, 1, 0, 100, 100, var46);
    var0.addElevatorBox((-1), 2, 0, 10, 2, 100, (-1), 0, 2, var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test311");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.stop();
    var1.start();

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test312");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var5 = var4.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setCommittedDirection(10, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test313");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)(-1));
    var1.setCommitedDirection(2);
    var1.setSpeed(11);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test314");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    int var2 = var1.getElevatorDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test315");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    java.util.ArrayList var4 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var6 = var5.getFloorButtonsDown();
    java.util.ArrayList var7 = var5.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var17 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var18 = var17.getFloorButtonsDown();
    java.util.ArrayList var19 = var17.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var20 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var22 = var21.getFloorHeight();
    java.util.ArrayList var23 = var21.getCarts();
    var20.setFloorButtonsDown(var23);
    var17.setFloorButtonsUp(var23);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var26 = var5.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var23);
    var0.setFloors(var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var29 = var0.getElevatorFloor(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test316");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.stop();
    boolean var3 = var1.hasChanged();
    var1.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test317");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    var21.setElevatorDir(10);
    int var26 = var21.getTargetFloor();
    int var27 = var21.getElevatorWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 10);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test318");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    int var29 = var21.getElevatorAccel();
    int var30 = var21.getElevatorAccel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test319");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    int var22 = var21.getElevatorSpeed();
    java.util.ArrayList var23 = var21.getElevatorPressedButtons();
    var21.setElevatorPosition(0);
    var21.setElevatorPosition(100);
    int var28 = var21.getElevatorCapacity();
    int var29 = var21.getElevatorDir();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test320");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    var1.setCommitedDirection((-1));

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test321");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonUpPressed();
    var0.setFloorButtonUpPressed(true);
    boolean var4 = var0.isFloorButtonDownPressed();
    var0.setFloorButtonDownPressed(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test322");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var1 = var0.getFloorHeight();
    boolean var3 = var0.getFloorButtonDown(10);
    int var5 = var0.getCommittedDirection(2);
    var0.setServicesFloors(0, 0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test323");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getCarts();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCommittedDirection(0, 11);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test324");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.stop();
    var1.readValues();
    var1.readValues();
    var1.deleteObservers();

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test325");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    int var24 = var21.getElevatorDir();
    int var25 = var21.getElevatorAccel();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var26 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var27 = var26.getFloorButtonsDown();
    java.util.ArrayList var28 = var26.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var38 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var39 = var38.getFloorButtonsDown();
    java.util.ArrayList var40 = var38.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var41 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var42 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var43 = var42.getFloorHeight();
    java.util.ArrayList var44 = var42.getCarts();
    var41.setFloorButtonsDown(var44);
    var38.setFloorButtonsUp(var44);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var47 = var26.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var44);
    var47.setElevatorWeight(10);
    int var50 = var47.getElevatorAccel();
    at.fhhagenberg.sqe.elevator.model.Elevator var51 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var52 = var51.getFloorHeight();
    java.util.ArrayList var53 = var51.getCarts();
    int var54 = var51.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var55 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var56 = var55.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var66 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var67 = var66.getFloors();
    var55.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var67);
    at.fhhagenberg.sqe.elevator.model.Elevator var69 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var70 = var69.getFloorHeight();
    java.util.ArrayList var71 = var69.getCarts();
    var55.setFloorButtonsUp(var71);
    var51.setCarts(var71);
    var47.setElevatorPressedButtons(var71);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var75 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var76 = var75.getFloorButtonsDown();
    java.util.ArrayList var77 = var75.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var78 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var79 = var78.getFloorButtonsDown();
    java.util.ArrayList var80 = var78.getElevatorBoxesList();
    var75.setFloorButtonsUp(var80);
    at.fhhagenberg.sqe.elevator.model.Elevator var82 = new at.fhhagenberg.sqe.elevator.model.Elevator(var71, var80);
    var21.setElevatorPressedButtons(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test326");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getCarts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test327");


    at.fhhagenberg.sqe.elevator.main.Main var0 = new at.fhhagenberg.sqe.elevator.main.Main();
    var0.connect();
    var0.connect();
    var0.connect();
    var0.start();
    var0.connect();
    var0.start();

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test328");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var4.getElevatorFloor(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test329");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getCarts();
    java.util.ArrayList var3 = var0.getCarts();
    int var5 = var0.getElevatorCapacity(1);
    boolean var7 = var0.getFloorButtonDown(11);
    java.util.ArrayList var8 = var0.getFloors();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test330");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    boolean var7 = var1.getElevatorButton(0);
    int var8 = var1.getCurrentFloor();
    int var9 = var1.getSpeed();
    int var10 = var1.getSpeed();
    int var11 = var1.getNextDestination();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test331");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    var21.addElevatorPressedButtons(true);
    var21.setElevatorWeight(0);
    var21.setElevatorDir(11);
    var21.setTargetFloor((-1));
    int var37 = var21.getElevatorSpeed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test332");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    var21.setElevatorSpeed(10);
    var21.setElevatorCapacity(10);
    var21.setTargetFloor(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test333");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    int var24 = var21.getElevatorCapacity();
    int var25 = var21.getElevatorDir();
    int var26 = var21.getElevatorDoorStatus();
    int var27 = var21.getElevatorAccel();
    int var28 = var21.getElevatorDoorStatus();
    int var29 = var21.getTargetFloor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test334");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var4 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var5 = var4.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var15 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var16 = var15.getFloors();
    var4.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var16);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var19 = var18.getFloorHeight();
    java.util.ArrayList var20 = var18.getCarts();
    var4.setFloorButtonsUp(var20);
    var0.setCarts(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var24 = var0.getElevatorDoorStatus(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test335");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    int var24 = var21.getElevatorCapacity();
    int var25 = var21.getElevatorDir();
    int var26 = var21.getElevatorDoorStatus();
    int var27 = var21.getElevatorDir();
    var21.addElevatorPressedButtons(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test336");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var12 = var11.getFloors();
    var0.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var12);
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var15 = var14.getFloorHeight();
    java.util.ArrayList var16 = var14.getCarts();
    var0.setFloorButtonsUp(var16);
    java.util.ArrayList var18 = var0.getFloorButtonsDown();
    java.util.ArrayList var19 = var0.getElevatorBoxesList();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test337");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonUpPressed();
    var0.setFloorButtonUpPressed(true);
    var0.setFloorButtonDownPressed(true);
    boolean var6 = var0.isFloorButtonDownPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test338");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    boolean var5 = var0.getFloorButtonDown(1);
    long var6 = var0.getClockTick();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test339");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var7.notifyObservers();
    var7.stop();
    var7.deleteObservers();
    var7.notifyObservers();
    var7.readValues();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test340");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var26 = var25.getFloorHeight();
    java.util.ArrayList var27 = var25.getCarts();
    int var28 = var25.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var29 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var30 = var29.getFloors();
    java.util.ArrayList var31 = var29.getCarts();
    var25.setCarts(var31);
    var21.setElevatorPressedButtons(var31);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var34 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var35 = var34.getFloorButtonsDown();
    java.util.ArrayList var36 = var34.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var37 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var39 = var38.getFloorHeight();
    java.util.ArrayList var40 = var38.getCarts();
    var37.setFloorButtonsDown(var40);
    var34.setFloorButtonsUp(var40);
    var21.setElevatorPressedButtons(var40);
    int var44 = var21.getElevatorClosestFloor();
    java.util.ArrayList var45 = var21.getElevatorPressedButtons();
    var21.setElevatorWeight(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test341");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorAccel();
    var21.setElevatorWeight(0);
    at.fhhagenberg.sqe.elevator.model.Elevator var27 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var28 = var27.getClockTick();
    java.util.ArrayList var29 = var27.getCarts();
    var21.setElevatorPressedButtons(var29);
    int var31 = var21.getElevatorPosition();
    java.util.ArrayList var32 = var21.getElevatorPressedButtons();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test342");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonDownPressed();
    var0.setFloorId(2);
    var0.setFloorButtonDownPressed(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test343");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    int var6 = var1.getWeight();
    int var7 = var1.getElevatorDirection();
    var1.moveDown();
    int var9 = var1.getDoorStatus();
    int var10 = var1.getNextDestination();
    var1.moveUp();
    int var12 = var1.getDoorStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test344");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(1, 100);
    boolean var6 = var0.getServicesFloors(2, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test345");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    java.util.ArrayList var4 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var6 = var5.getFloorButtonsDown();
    java.util.ArrayList var7 = var5.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var17 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var18 = var17.getFloorButtonsDown();
    java.util.ArrayList var19 = var17.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var20 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var22 = var21.getFloorHeight();
    java.util.ArrayList var23 = var21.getCarts();
    var20.setFloorButtonsDown(var23);
    var17.setFloorButtonsUp(var23);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var26 = var5.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var23);
    var0.setFloors(var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCommittedDirection(10, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test346");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var3 = var0.getElevatorFloor((-1));
    int var5 = var0.getTarget(11);
    int var7 = var0.getElevatorWeight(11);
    int var9 = var0.getCommittedDirection(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test347");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    int var1 = var0.getFloorId();
    boolean var2 = var0.isFloorButtonDownPressed();
    int var3 = var0.getFloorId();
    var0.setFloorId(0);
    boolean var6 = var0.isFloorButtonDownPressed();
    boolean var7 = var0.isFloorButtonUpPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test348");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorAccel();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var26 = var25.getFloorHeight();
    java.util.ArrayList var27 = var25.getCarts();
    int var28 = var25.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var29 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var30 = var29.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var40 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var41 = var40.getFloors();
    var29.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var41);
    at.fhhagenberg.sqe.elevator.model.Elevator var43 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var44 = var43.getFloorHeight();
    java.util.ArrayList var45 = var43.getCarts();
    var29.setFloorButtonsUp(var45);
    var25.setCarts(var45);
    var21.setElevatorPressedButtons(var45);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var49 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var50 = var49.getFloorButtonsDown();
    java.util.ArrayList var51 = var49.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var52 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var53 = var52.getFloorButtonsDown();
    java.util.ArrayList var54 = var52.getElevatorBoxesList();
    var49.setFloorButtonsUp(var54);
    at.fhhagenberg.sqe.elevator.model.Elevator var56 = new at.fhhagenberg.sqe.elevator.model.Elevator(var45, var54);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var57 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var58 = var57.getFloorButtonsDown();
    java.util.ArrayList var59 = var57.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var69 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var70 = var69.getFloorButtonsDown();
    java.util.ArrayList var71 = var69.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var72 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var73 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var74 = var73.getFloorHeight();
    java.util.ArrayList var75 = var73.getCarts();
    var72.setFloorButtonsDown(var75);
    var69.setFloorButtonsUp(var75);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var78 = var57.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var75);
    int var79 = var78.getElevatorSpeed();
    java.util.ArrayList var80 = var78.getElevatorPressedButtons();
    at.fhhagenberg.sqe.elevator.model.Elevator var81 = new at.fhhagenberg.sqe.elevator.model.Elevator(var54, var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test349");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    int var22 = var21.getElevatorSpeed();
    int var23 = var21.getElevatorCapacity();
    int var24 = var21.getElevatorDoorStatus();
    var21.setElevatorDir((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test350");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getCarts();
    java.util.ArrayList var3 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var4 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var0.getCommittedDirection(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test351");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var26 = var25.getFloorHeight();
    java.util.ArrayList var27 = var25.getCarts();
    int var28 = var25.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var29 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var30 = var29.getFloors();
    java.util.ArrayList var31 = var29.getCarts();
    var25.setCarts(var31);
    var21.setElevatorPressedButtons(var31);
    java.util.ArrayList var34 = var21.getElevatorPressedButtons();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var35 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var36 = var35.getFloorButtonsDown();
    java.util.ArrayList var37 = var35.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var47 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var48 = var47.getFloorButtonsDown();
    java.util.ArrayList var49 = var47.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var50 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var51 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var52 = var51.getFloorHeight();
    java.util.ArrayList var53 = var51.getCarts();
    var50.setFloorButtonsDown(var53);
    var47.setFloorButtonsUp(var53);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var56 = var35.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var53);
    java.util.ArrayList var57 = var35.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var67 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var68 = var67.getFloors();
    java.util.ArrayList var69 = var67.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var70 = var35.new ElevatorBox(1, 10, 0, 0, (-1), 1, 10, 10, 1, var69);
    at.fhhagenberg.sqe.elevator.model.Elevator var71 = new at.fhhagenberg.sqe.elevator.model.Elevator(var34, var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test352");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    int var1 = var0.getFloorId();
    var0.setFloorButtonUpPressed(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test353");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var12 = var11.getFloors();
    var0.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var12);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var14 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var15 = var14.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var26 = var25.getFloors();
    var14.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var26);
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var29 = var28.getFloorHeight();
    java.util.ArrayList var30 = var28.getCarts();
    var14.setFloorButtonsUp(var30);
    at.fhhagenberg.sqe.elevator.model.Elevator var32 = new at.fhhagenberg.sqe.elevator.model.Elevator(var12, var30);
    int var33 = var32.getFloorNum();
    int var34 = var32.getFloorHeight();
    java.util.ArrayList var35 = var32.getCarts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test354");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var5 = var0.getElevatorCapacity(10);
    long var6 = var0.getClockTick();
    java.util.ArrayList var7 = var0.getCarts();
    java.util.ArrayList var8 = var0.getCarts();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test355");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    java.util.ArrayList var2 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var4 = var3.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var15 = var14.getFloors();
    var3.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var15);
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator(var2, var15);
    int var18 = var17.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var20 = var17.getElevatorFloor(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test356");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)1);
    boolean var3 = var1.getElevatorButton(1);
    var1.setSpeed(1);
    boolean var7 = var1.getElevatorButton(1);
    boolean var9 = var1.getElevatorButton(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test357");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var1 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var2 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var4 = var0.getElevatorPosition(0);
    var0.setCommittedDirection(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test358");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonDownPressed();
    int var2 = var0.getFloorId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test359");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var7.notifyObservers();
    var7.stop();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var11 = var10.getFloors();
    java.util.ArrayList var12 = var10.getCarts();
    java.util.ArrayList var13 = var10.getCarts();
    int var15 = var10.getElevatorCapacity(1);
    boolean var17 = var10.getFloorButtonDown(11);
    var7.notifyObservers((java.lang.Object)11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test360");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getCarts();
    java.util.ArrayList var3 = var0.getCarts();
    int var5 = var0.getElevatorWeight(1);
    int var7 = var0.getElevatorWeight(1);
    int var9 = var0.getElevatorWeight(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test361");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var10 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var11 = var10.getFloorButtonsDown();
    java.util.ArrayList var12 = var10.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var13 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var14 = var13.getFloorButtonsDown();
    java.util.ArrayList var15 = var13.getElevatorBoxesList();
    var10.setFloorButtonsDown(var15);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var17 = var0.new ElevatorBox(10, 10, 0, 100, 100, (-1), 1, 0, 0, var15);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var18 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var19 = var18.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var29 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var30 = var29.getFloors();
    var18.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var30);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var32 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var33 = var32.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var43 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var44 = var43.getFloors();
    var32.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var44);
    at.fhhagenberg.sqe.elevator.model.Elevator var46 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var47 = var46.getFloorHeight();
    java.util.ArrayList var48 = var46.getCarts();
    var32.setFloorButtonsUp(var48);
    at.fhhagenberg.sqe.elevator.model.Elevator var50 = new at.fhhagenberg.sqe.elevator.model.Elevator(var30, var48);
    var17.setElevatorPressedButtons(var30);
    var17.addElevatorPressedButtons(false);
    var17.setElevatorDir((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test362");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var9 = var0.getServicesFloors((-1), 0);
    var0.setServicesFloors(2, (-1), false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test363");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var0.setCommittedDirection(1, 0);
    int var6 = var0.getElevatorDoorStatus((-1));
    int var8 = var0.getElevatorSpeed(10);
    int var10 = var0.getElevatorCapacity(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test364");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getCarts();
    java.util.ArrayList var3 = var0.getCarts();
    boolean var6 = var0.getServicesFloors((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test365");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var4 = var0.getElevatorAccel(2);
    int var5 = var0.getFloorHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test366");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    int var24 = var21.getElevatorCapacity();
    int var25 = var21.getElevatorDir();
    int var26 = var21.getElevatorDoorStatus();
    int var27 = var21.getElevatorAccel();
    int var28 = var21.getElevatorDoorStatus();
    int var29 = var21.getElevatorDoorStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 10);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test367");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var5 = var0.getElevatorCapacity(10);
    int var6 = var0.getElevatorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.getCommittedDirection(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test368");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var5 = var0.getElevatorCapacity(10);
    long var6 = var0.getClockTick();
    java.util.ArrayList var7 = var0.getCarts();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.getElevatorButton(100, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test369");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    int var5 = var0.getElevatorCapacity(10);
    long var6 = var0.getClockTick();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.getTarget(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test370");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var8 = var0.getFloorButtonUp(100);
    long var9 = var0.getClockTick();
    int var11 = var0.getElevatorCapacity(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test371");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    int var24 = var21.getElevatorDir();
    var21.setElevatorDoorStatus(100);
    var21.setElevatorPosition(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test372");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    java.util.ArrayList var2 = var0.getCarts();
    java.util.ArrayList var3 = var0.getCarts();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getTarget(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test373");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    java.util.ArrayList var22 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var32 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var33 = var32.getFloors();
    java.util.ArrayList var34 = var32.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var35 = var0.new ElevatorBox(1, 10, 0, 0, (-1), 1, 10, 10, 1, var34);
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var46 = var45.getFloors();
    java.util.ArrayList var47 = var45.getCarts();
    java.util.ArrayList var48 = var45.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var49 = var0.new ElevatorBox(0, 100, 1, 100, 100, 2, 100, 0, (-1), var48);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var59 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var60 = var59.getFloorButtonsDown();
    java.util.ArrayList var61 = var59.getElevatorBoxesList();
    var0.addElevatorBox(0, 1, 100, 100, 0, 100, 100, 1, (-1), var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test374");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    java.util.ArrayList var2 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var3 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var4 = var3.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var15 = var14.getFloors();
    var3.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var15);
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator(var2, var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var19 = var17.getElevatorFloor(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test375");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    var0.setFloorButtonDownPressed(false);
    int var3 = var0.getFloorId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test376");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    boolean var4 = var0.getFloorButtonDown(100);
    java.util.ArrayList var5 = var0.getCarts();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test377");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    int var2 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.Elevator var3 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var4 = var3.getFloors();
    java.util.ArrayList var5 = var3.getCarts();
    java.util.ArrayList var6 = var3.getCarts();
    var0.setCarts(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test378");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorDir();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var25 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var26 = var25.getFloorButtonsDown();
    java.util.ArrayList var27 = var25.getElevatorBoxesList();
    var21.setElevatorPressedButtons(var27);
    var21.addElevatorPressedButtons(true);
    var21.setElevatorWeight(0);
    int var33 = var21.getElevatorCapacity();
    java.util.ArrayList var34 = var21.getElevatorPressedButtons();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test379");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getCommittedDirection(10);
    boolean var4 = var0.getFloorButtonDown(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test380");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsUp();
    java.util.ArrayList var2 = var0.getElevatorBoxesList();
    java.util.ArrayList var3 = var0.getFloorButtonsDown();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test381");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var11 = var10.getClockTick();
    java.util.ArrayList var12 = var10.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var13 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var14 = var13.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var25 = var24.getFloors();
    var13.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var25);
    at.fhhagenberg.sqe.elevator.model.Elevator var27 = new at.fhhagenberg.sqe.elevator.model.Elevator(var12, var25);
    var0.addElevatorBox(2, 11, 100, 0, (-1), 100, 10, 10, 11, var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test382");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonDownPressed();
    boolean var2 = var0.isFloorButtonUpPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test383");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var3 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var4 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var5 = var4.getFloorButtonsDown();
    at.fhhagenberg.sqe.elevator.model.Elevator var15 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var16 = var15.getFloors();
    var4.addElevatorBox(100, 0, 1, 1, 0, 0, 10, 10, 10, var16);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var19 = var18.getFloorHeight();
    java.util.ArrayList var20 = var18.getCarts();
    var4.setFloorButtonsUp(var20);
    var0.setCarts(var20);
    int var23 = var0.getFloorHeight();
    boolean var25 = var0.getFloorButtonUp(10);
    int var26 = var0.getElevatorNum();
    int var27 = var0.getFloorHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test384");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorHeight();
    java.util.ArrayList var2 = var0.getCarts();
    int var4 = var0.getElevatorCapacity(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var0.getCommittedDirection(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test385");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var1 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var3 = var2.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator(var1, var3);
    int var6 = var4.getElevatorAccel((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var4.getElevatorButton(10, 2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test386");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    int var22 = var21.getElevatorSpeed();
    int var23 = var21.getElevatorCapacity();
    int var24 = var21.getElevatorDoorStatus();
    int var25 = var21.getElevatorWeight();
    int var26 = var21.getElevatorAccel();
    java.util.ArrayList var27 = var21.getElevatorPressedButtons();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test387");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    int var4 = var0.getTarget(0);
    int var6 = var0.getElevatorWeight(1);
    boolean var9 = var0.getServicesFloors((-1), 0);
    int var11 = var0.getElevatorFloor(100);
    boolean var14 = var0.getElevatorButton((-1), 100);
    int var16 = var0.getElevatorSpeed(0);
    boolean var19 = var0.getElevatorButton(11, 10);
    int var21 = var0.getElevatorDoorStatus(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test388");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorAccel();
    var21.setElevatorWeight(0);
    var21.setElevatorWeight(0);
    int var29 = var21.getElevatorWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test389");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorPosition((-1));
    int var24 = var21.getElevatorCapacity();
    int var25 = var21.getElevatorPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test390");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsUp();
    java.util.ArrayList var2 = var0.getElevatorBoxesList();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsUp();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var25 = var24.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var26 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var27 = var26.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator(var25, var27);
    var12.addElevatorBox(0, 100, (-1), 100, 10, 1, 0, 100, 100, var25);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var30 = var0.new ElevatorBox(10, (-1), (-1), 2, (-1), 100, 1, 100, 2, var25);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var31 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var42 = var41.getFloorHeight();
    java.util.ArrayList var43 = var41.getCarts();
    var31.addElevatorBox(0, (-1), (-1), 0, 100, (-1), 1, 100, (-1), var43);
    var0.setFloorButtonsDown(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test391");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorAccel();
    var21.setElevatorWeight(0);
    int var27 = var21.getElevatorPosition();
    var21.setElevatorDoorStatus(1);
    int var30 = var21.getElevatorCapacity();
    int var31 = var21.getElevatorDir();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test392");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    var21.setElevatorSpeed(10);
    int var26 = var21.getElevatorPosition();
    at.fhhagenberg.sqe.elevator.model.Elevator var27 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var28 = var27.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var29 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    java.util.ArrayList var30 = var29.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var31 = new at.fhhagenberg.sqe.elevator.model.Elevator(var28, var30);
    var21.setElevatorPressedButtons(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test393");


    at.fhhagenberg.sqe.elevator.main.Main var0 = new at.fhhagenberg.sqe.elevator.main.Main();
    var0.connect();
    var0.connect();
    var0.start();
    var0.start();
    var0.start();

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test394");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorDoorStatus((-1));
    long var3 = var0.getClockTick();
    boolean var5 = var0.getFloorButtonUp(0);
    int var7 = var0.getElevatorCapacity(100);
    int var8 = var0.getElevatorNum();
    int var10 = var0.getElevatorFloor(1);
    long var11 = var0.getClockTick();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nMyTest0.test395");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var1 = var0.getFloorButtonsDown();
    java.util.ArrayList var2 = var0.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    java.util.ArrayList var13 = var12.getFloorButtonsDown();
    java.util.ArrayList var14 = var12.getFloorButtonsUp();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var15 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var17 = var16.getFloorHeight();
    java.util.ArrayList var18 = var16.getCarts();
    var15.setFloorButtonsDown(var18);
    var12.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var21 = var0.new ElevatorBox(1, (-1), 10, 10, 100, 0, 100, (-1), (-1), var18);
    var21.setElevatorWeight(10);
    int var24 = var21.getElevatorAccel();
    var21.setElevatorWeight(0);
    int var27 = var21.getElevatorPosition();
    var21.setElevatorDoorStatus(1);
    var21.setElevatorPosition(0);
    int var32 = var21.getElevatorPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);

  }

}
