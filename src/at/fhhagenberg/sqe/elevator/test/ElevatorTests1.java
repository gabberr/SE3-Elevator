package at.fhhagenberg.sqe.elevator.test;

import junit.framework.*;

public class ElevatorTests1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test1");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    var62.setElevatorSpeed((-1));
    int var70 = var62.getElevatorSpeed();
    int var71 = var62.getElevatorDir();
    int var72 = var62.getElevatorWeight();
    int var73 = var62.getElevatorPosition();
    var62.setElevatorCapacity(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 10);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test2");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    var62.setElevatorSpeed((-1));
    var62.setElevatorClosestFloor(1);
    var62.setElevatorCapacity((-1));
    var62.setElevatorDir(2);
    var62.addElevatorPressedButtons(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test3");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    int var13 = var0.getElevatorSpeed((-1));
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var16 = var14.getElevatorAccel(1);
    java.util.ArrayList var17 = var14.getCarts();
    var0.setCarts(var17);
    boolean var20 = var0.getFloorButtonDown(1);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var21 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var22 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var23 = var22.getClockTick();
    java.util.ArrayList var24 = var22.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var26 = var25.getClockTick();
    java.util.ArrayList var27 = var25.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator(var24, var27);
    var21.setFloorButtonsUp(var24);
    at.fhhagenberg.sqe.elevator.model.Elevator var39 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var40 = var39.getClockTick();
    java.util.ArrayList var41 = var39.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var42 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var43 = var42.getClockTick();
    java.util.ArrayList var44 = var42.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator(var41, var44);
    var21.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var44);
    at.fhhagenberg.sqe.elevator.model.Elevator var56 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var57 = var56.getClockTick();
    java.util.ArrayList var58 = var56.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var59 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var60 = var59.getClockTick();
    java.util.ArrayList var61 = var59.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var62 = new at.fhhagenberg.sqe.elevator.model.Elevator(var58, var61);
    var21.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var61);
    at.fhhagenberg.sqe.elevator.model.Elevator var73 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var74 = var73.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var75 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var76 = var75.getClockTick();
    java.util.ArrayList var77 = var75.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var78 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var79 = var78.getClockTick();
    java.util.ArrayList var80 = var78.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var81 = new at.fhhagenberg.sqe.elevator.model.Elevator(var77, var80);
    var73.setCarts(var77);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var83 = var21.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var77);
    at.fhhagenberg.sqe.elevator.model.Elevator var93 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var95 = var93.getElevatorAccel(1);
    java.util.ArrayList var96 = var93.getCarts();
    var21.addElevatorBox((-1), 2, 100, 1, 0, (-1), 0, 10, 1, var96);
    var0.setCarts(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test4");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var7 = var6.getClockTick();
    java.util.ArrayList var8 = var6.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    java.util.ArrayList var11 = var9.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var12 = new at.fhhagenberg.sqe.elevator.model.Elevator(var8, var11);
    var5.setFloorButtonsUp(var8);
    var0.setCarts(var8);
    int var15 = var0.getElevatorNum();
    int var16 = var0.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var17 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var17.setFloorButtonsUp(var20);
    at.fhhagenberg.sqe.elevator.model.Elevator var26 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var27 = var26.getClockTick();
    boolean var29 = var26.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var30 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var31 = var30.getClockTick();
    java.util.ArrayList var32 = var30.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var33 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var34 = var33.getClockTick();
    java.util.ArrayList var35 = var33.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var36 = new at.fhhagenberg.sqe.elevator.model.Elevator(var32, var35);
    var26.setCarts(var35);
    var17.setFloorButtonsUp(var35);
    at.fhhagenberg.sqe.elevator.model.Elevator var48 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var49 = var48.getClockTick();
    java.util.ArrayList var50 = var48.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var51 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var52 = var51.getClockTick();
    java.util.ArrayList var53 = var51.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator(var50, var53);
    at.fhhagenberg.sqe.elevator.model.Elevator var55 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var56 = var55.getClockTick();
    java.util.ArrayList var57 = var55.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var58 = new at.fhhagenberg.sqe.elevator.model.Elevator(var53, var57);
    var17.addElevatorBox(1, 100, (-1), 100, 0, 2, 0, 0, (-1), var53);
    var0.setFloors(var53);
    at.fhhagenberg.sqe.elevator.model.Elevator var61 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var62 = var61.getClockTick();
    boolean var64 = var61.getFloorButtonDown(100);
    int var65 = var61.getElevatorNum();
    var61.setServicesFloors(0, 10, true);
    java.util.ArrayList var70 = var61.getCarts();
    var0.setFloors(var70);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var72 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var73 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var74 = var73.getClockTick();
    java.util.ArrayList var75 = var73.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var76 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var77 = var76.getClockTick();
    java.util.ArrayList var78 = var76.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var79 = new at.fhhagenberg.sqe.elevator.model.Elevator(var75, var78);
    var72.setFloorButtonsUp(var75);
    at.fhhagenberg.sqe.elevator.model.Elevator var81 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var82 = var81.getClockTick();
    boolean var84 = var81.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var85 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var86 = var85.getClockTick();
    java.util.ArrayList var87 = var85.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var88 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var89 = var88.getClockTick();
    java.util.ArrayList var90 = var88.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var91 = new at.fhhagenberg.sqe.elevator.model.Elevator(var87, var90);
    var81.setCarts(var90);
    var72.setFloorButtonsUp(var90);
    java.util.ArrayList var94 = var72.getElevatorBoxesList();
    var0.setFloors(var94);
    int var97 = var0.getElevatorWeight(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == 0);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test5");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    java.util.ArrayList var2 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var3 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var4 = var3.getClockTick();
    java.util.ArrayList var5 = var3.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator(var2, var5);
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var5, var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var12 = var10.getElevatorPosition(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test6");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    java.util.ArrayList var3 = var0.getCarts();
    long var4 = var0.getClockTick();
    int var5 = var0.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var6 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test7");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    at.fhhagenberg.sqe.elevator.model.Elevator var63 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var64 = var63.getClockTick();
    java.util.ArrayList var65 = var63.getCarts();
    var62.setElevatorPressedButtons(var65);
    var62.setElevatorCapacity(1);
    var62.setElevatorPosition(1);
    int var71 = var62.getElevatorDoorStatus();
    var62.setElevatorPosition(100);
    var62.addElevatorPressedButtons(false);
    var62.setElevatorDoorStatus(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 100);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test8");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.stop();
    var1.stop();
    int var6 = var1.countObservers();
    var1.start();
    at.fhhagenberg.sqe.elevator.model.ElevatorCart var9 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    int var10 = var9.getCurrentPayload();
    var9.moveUp();
    int var12 = var9.getWeight();
    var1.notifyObservers((java.lang.Object)var9);
    int var14 = var9.getNextDestination();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test9");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    java.util.ArrayList var3 = var0.getCarts();
    long var4 = var0.getClockTick();
    boolean var6 = var0.getFloorButtonDown(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test10");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var14 = var0.getTarget(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test11");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    java.util.ArrayList var3 = var0.getCarts();
    boolean var6 = var0.getServicesFloors((-1), (-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var0.getCommittedDirection(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test12");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    int var64 = var62.getElevatorPosition();
    var62.setElevatorDir(100);
    var62.addElevatorPressedButtons(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 10);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test13");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    int var4 = var0.getElevatorNum();
    var0.setServicesFloors(0, 10, true);
    int var10 = var0.getElevatorWeight(0);
    int var11 = var0.getFloorHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test14");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    at.fhhagenberg.sqe.elevator.model.Elevator var63 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var64 = var63.getClockTick();
    java.util.ArrayList var65 = var63.getCarts();
    var62.setElevatorPressedButtons(var65);
    java.util.ArrayList var67 = var62.getElevatorPressedButtons();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test15");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var12.notifyObservers();
    int var14 = var12.countObservers();
    at.fhhagenberg.sqe.elevator.model.Elevator var15 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var16 = var15.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var18 = var17.getClockTick();
    java.util.ArrayList var19 = var17.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var20 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var21 = var20.getClockTick();
    java.util.ArrayList var22 = var20.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var23 = new at.fhhagenberg.sqe.elevator.model.Elevator(var19, var22);
    var15.setCarts(var19);
    int var25 = var15.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var26 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var27 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var28 = var27.getClockTick();
    java.util.ArrayList var29 = var27.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var30 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var31 = var30.getClockTick();
    java.util.ArrayList var32 = var30.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var33 = new at.fhhagenberg.sqe.elevator.model.Elevator(var29, var32);
    var26.setFloorButtonsUp(var29);
    var15.setFloors(var29);
    var12.notifyObservers((java.lang.Object)var15);
    at.fhhagenberg.sqe.elevator.model.Elevator var37 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var38 = var37.getClockTick();
    java.util.ArrayList var39 = var37.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var40 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var41 = var40.getClockTick();
    java.util.ArrayList var42 = var40.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var43 = new at.fhhagenberg.sqe.elevator.model.Elevator(var39, var42);
    long var44 = var43.getClockTick();
    boolean var46 = var43.getFloorButtonUp((-1));
    boolean var48 = var43.getFloorButtonDown((-1));
    var12.notifyObservers((java.lang.Object)(-1));
    var12.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test16");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var3 = var2.getClockTick();
    java.util.ArrayList var4 = var2.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var5 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var6 = var5.getClockTick();
    java.util.ArrayList var7 = var5.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var8 = new at.fhhagenberg.sqe.elevator.model.Elevator(var4, var7);
    var0.setCarts(var4);
    int var10 = var0.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var11 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var12 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var13 = var12.getClockTick();
    java.util.ArrayList var14 = var12.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var15 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var16 = var15.getClockTick();
    java.util.ArrayList var17 = var15.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator(var14, var17);
    var11.setFloorButtonsUp(var14);
    var0.setFloors(var14);
    var0.setServicesFloors((-1), 100, false);
    int var26 = var0.getElevatorSpeed(2);
    java.util.ArrayList var27 = var0.getFloors();
    int var29 = var0.getElevatorSpeed(9);
    int var31 = var0.getElevatorSpeed(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test17");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var11 = var9.getElevatorAccel(1);
    java.util.ArrayList var12 = var9.getCarts();
    var0.setFloorButtonsUp(var12);
    java.util.ArrayList var14 = var0.getElevatorBoxesList();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test18");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    int var4 = var0.getElevatorNum();
    var0.setServicesFloors(0, 10, true);
    int var9 = var0.getElevatorNum();
    int var11 = var0.getElevatorAccel(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var13 = var0.getTarget(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test19");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    int var4 = var0.getElevatorNum();
    var0.setServicesFloors(0, 10, true);
    java.util.ArrayList var9 = var0.getCarts();
    int var10 = var0.getElevatorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTarget(2, 9);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test20");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonDownPressed();
    boolean var2 = var0.isFloorButtonDownPressed();
    boolean var3 = var0.isFloorButtonUpPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test21");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    int var3 = var0.getElevatorCapacity((-1));
    int var4 = var0.getElevatorNum();
    java.util.ArrayList var5 = var0.getCarts();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test22");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.stop();
    var1.stop();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var6);
    boolean var9 = var6.getFloorButtonUp(100);
    int var11 = var6.getElevatorAccel((-1));
    var1.notifyObservers((java.lang.Object)var6);
    boolean var14 = var6.getFloorButtonUp(1);
    int var16 = var6.getElevatorWeight(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test23");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    int var66 = var62.getElevatorClosestFloor();
    var62.setElevatorClosestFloor((-1));
    var62.setElevatorDoorStatus(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 10);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test24");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    int var13 = var0.getElevatorSpeed((-1));
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var16 = var14.getElevatorAccel(1);
    java.util.ArrayList var17 = var14.getCarts();
    var0.setCarts(var17);
    long var19 = var0.getClockTick();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test25");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    at.fhhagenberg.sqe.elevator.model.Elevator var63 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var64 = var63.getClockTick();
    java.util.ArrayList var65 = var63.getCarts();
    var62.setElevatorPressedButtons(var65);
    var62.setElevatorCapacity(1);
    var62.setElevatorPosition(1);
    var62.setElevatorDoorStatus(0);
    var62.setElevatorWeight((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test26");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    boolean var12 = var9.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var13 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var14 = var13.getClockTick();
    java.util.ArrayList var15 = var13.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var17 = var16.getClockTick();
    java.util.ArrayList var18 = var16.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var19 = new at.fhhagenberg.sqe.elevator.model.Elevator(var15, var18);
    var9.setCarts(var18);
    var0.setFloorButtonsUp(var18);
    java.util.ArrayList var22 = var0.getElevatorBoxesList();
    at.fhhagenberg.sqe.elevator.model.Elevator var32 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var33 = var32.getClockTick();
    java.util.ArrayList var34 = var32.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator(var34, var37);
    var0.addElevatorBox((-1), 2, 2, 0, 9, 9, 1, 2, 100, var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test27");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    var1.setSpeed(1);
    int var6 = var1.getSpeed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test28");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.stop();
    var1.stop();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var6);
    boolean var9 = var6.getFloorButtonUp(100);
    int var11 = var6.getElevatorAccel((-1));
    var1.notifyObservers((java.lang.Object)var6);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var13 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var15 = var14.getClockTick();
    java.util.ArrayList var16 = var14.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var18 = var17.getClockTick();
    java.util.ArrayList var19 = var17.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var20 = new at.fhhagenberg.sqe.elevator.model.Elevator(var16, var19);
    var13.setFloorButtonsUp(var16);
    at.fhhagenberg.sqe.elevator.model.Elevator var31 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var32 = var31.getClockTick();
    java.util.ArrayList var33 = var31.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var34 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var35 = var34.getClockTick();
    java.util.ArrayList var36 = var34.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var37 = new at.fhhagenberg.sqe.elevator.model.Elevator(var33, var36);
    var13.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var36);
    at.fhhagenberg.sqe.elevator.model.Elevator var48 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var49 = var48.getClockTick();
    java.util.ArrayList var50 = var48.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var51 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var52 = var51.getClockTick();
    java.util.ArrayList var53 = var51.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator(var50, var53);
    var13.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var53);
    at.fhhagenberg.sqe.elevator.model.Elevator var65 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var66 = var65.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var67 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var68 = var67.getClockTick();
    java.util.ArrayList var69 = var67.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var70 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var71 = var70.getClockTick();
    java.util.ArrayList var72 = var70.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var73 = new at.fhhagenberg.sqe.elevator.model.Elevator(var69, var72);
    var65.setCarts(var69);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var75 = var13.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var69);
    var75.addElevatorPressedButtons(true);
    int var78 = var75.getElevatorAccel();
    var75.addElevatorPressedButtons(true);
    var75.setElevatorSpeed((-1));
    int var83 = var75.getElevatorSpeed();
    int var84 = var75.getElevatorDir();
    int var85 = var75.getElevatorWeight();
    int var86 = var75.getElevatorPosition();
    int var87 = var75.getElevatorWeight();
    int var88 = var75.getElevatorPosition();
    var1.notifyObservers((java.lang.Object)var75);
    int var90 = var1.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 0);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test29");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var7 = var6.getClockTick();
    java.util.ArrayList var8 = var6.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    java.util.ArrayList var11 = var9.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var12 = new at.fhhagenberg.sqe.elevator.model.Elevator(var8, var11);
    var5.setFloorButtonsUp(var8);
    var0.setCarts(var8);
    int var15 = var0.getElevatorNum();
    int var17 = var0.getElevatorCapacity(1);
    boolean var19 = var0.getFloorButtonDown(10);
    int var21 = var0.getElevatorCapacity(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test30");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    int var68 = var62.getElevatorAccel();
    int var69 = var62.getElevatorPosition();
    int var70 = var62.getElevatorCapacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 100);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test31");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    at.fhhagenberg.sqe.elevator.model.Elevator var63 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var64 = var63.getClockTick();
    java.util.ArrayList var65 = var63.getCarts();
    var62.setElevatorPressedButtons(var65);
    var62.setElevatorDir(0);
    int var69 = var62.getElevatorAccel();
    var62.setElevatorAccel(2);
    int var72 = var62.getElevatorWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test32");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    var62.setElevatorSpeed((-1));
    int var70 = var62.getElevatorSpeed();
    int var71 = var62.getElevatorDir();
    int var72 = var62.getElevatorWeight();
    int var73 = var62.getElevatorPosition();
    int var74 = var62.getElevatorWeight();
    int var75 = var62.getElevatorPosition();
    int var76 = var62.getElevatorPosition();
    var62.setElevatorClosestFloor(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 10);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test33");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var3 = var2.getClockTick();
    java.util.ArrayList var4 = var2.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var5 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var6 = var5.getClockTick();
    java.util.ArrayList var7 = var5.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var8 = new at.fhhagenberg.sqe.elevator.model.Elevator(var4, var7);
    var0.setCarts(var4);
    int var11 = var0.getElevatorCapacity(1);
    int var13 = var0.getElevatorAccel(2);
    int var15 = var0.getElevatorCapacity((-1));
    int var16 = var0.getFloorHeight();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var17 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var17.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test34");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    java.util.ArrayList var3 = var0.getCarts();
    boolean var6 = var0.getServicesFloors((-1), (-1));
    int var7 = var0.getFloorHeight();
    int var8 = var0.getElevatorNum();
    int var9 = var0.getFloorHeight();
    int var10 = var0.getElevatorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var12 = var0.getElevatorDoorStatus(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test35");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    at.fhhagenberg.sqe.elevator.model.Elevator var72 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var74 = var72.getElevatorAccel(1);
    java.util.ArrayList var75 = var72.getCarts();
    var0.addElevatorBox((-1), 2, 100, 1, 0, (-1), 0, 10, 1, var75);
    at.fhhagenberg.sqe.elevator.model.Elevator var77 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var80 = var77.getServicesFloors(100, 100);
    int var81 = var77.getElevatorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var82 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var83 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var84 = var83.getClockTick();
    java.util.ArrayList var85 = var83.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var86 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var87 = var86.getClockTick();
    java.util.ArrayList var88 = var86.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var89 = new at.fhhagenberg.sqe.elevator.model.Elevator(var85, var88);
    var82.setFloorButtonsUp(var85);
    var77.setCarts(var85);
    at.fhhagenberg.sqe.elevator.model.Elevator var92 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var93 = var92.getClockTick();
    java.util.ArrayList var94 = var92.getCarts();
    var77.setFloors(var94);
    var0.setFloorButtonsUp(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test36");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getCommittedDirection(9);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test37");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getCommittedDirection(10);
    int var4 = var0.getElevatorFloor((-1));
    int var6 = var0.getElevatorFloor(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test38");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    java.util.ArrayList var3 = var0.getCarts();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getElevatorFloor(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test39");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    java.util.ArrayList var2 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var3 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var4 = var3.getClockTick();
    java.util.ArrayList var5 = var3.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator(var2, var5);
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var5, var9);
    int var12 = var10.getElevatorWeight(10);
    int var14 = var10.getElevatorWeight(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setCommittedDirection(100, 9);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test40");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    java.util.ArrayList var11 = var9.getCarts();
    var0.setFloorButtonsDown(var11);
    java.util.ArrayList var13 = var0.getElevatorBoxesList();
    at.fhhagenberg.sqe.elevator.model.Elevator var23 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var26 = var23.getServicesFloors(100, 100);
    int var27 = var23.getElevatorNum();
    int var28 = var23.getFloorNum();
    boolean var31 = var23.getServicesFloors(1, 1);
    java.util.ArrayList var32 = var23.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var33 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var34 = var33.getClockTick();
    java.util.ArrayList var35 = var33.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var36 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var37 = var36.getClockTick();
    java.util.ArrayList var38 = var36.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var39 = new at.fhhagenberg.sqe.elevator.model.Elevator(var35, var38);
    at.fhhagenberg.sqe.elevator.model.Elevator var40 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var41 = var40.getClockTick();
    java.util.ArrayList var42 = var40.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var43 = new at.fhhagenberg.sqe.elevator.model.Elevator(var38, var42);
    var23.setCarts(var42);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var45 = var0.new ElevatorBox(100, 100, 10, 100, 1, 9, 100, 1, 2, var42);
    at.fhhagenberg.sqe.elevator.model.Elevator var46 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var48 = var46.getElevatorAccel(1);
    java.util.ArrayList var49 = var46.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var50 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var51 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var52 = var51.getClockTick();
    java.util.ArrayList var53 = var51.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator(var53, var56);
    var50.setFloorButtonsUp(var53);
    at.fhhagenberg.sqe.elevator.model.Elevator var68 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var69 = var68.getClockTick();
    java.util.ArrayList var70 = var68.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var71 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var72 = var71.getClockTick();
    java.util.ArrayList var73 = var71.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var74 = new at.fhhagenberg.sqe.elevator.model.Elevator(var70, var73);
    var50.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var73);
    at.fhhagenberg.sqe.elevator.model.Elevator var76 = new at.fhhagenberg.sqe.elevator.model.Elevator(var49, var73);
    var0.setFloorButtonsUp(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test41");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonDownPressed();
    boolean var2 = var0.isFloorButtonUpPressed();
    boolean var3 = var0.isFloorButtonDownPressed();
    var0.setFloorButtonDownPressed(true);
    var0.setFloorButtonUpPressed(true);
    boolean var8 = var0.isFloorButtonUpPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test42");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorAccel();
    int var64 = var62.getElevatorAccel();
    int var65 = var62.getElevatorAccel();
    int var66 = var62.getElevatorDir();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 10);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test43");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    at.fhhagenberg.sqe.elevator.model.Elevator var64 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var65 = var64.getClockTick();
    boolean var67 = var64.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var68 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var69 = var68.getClockTick();
    java.util.ArrayList var70 = var68.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var71 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var72 = var71.getClockTick();
    java.util.ArrayList var73 = var71.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var74 = new at.fhhagenberg.sqe.elevator.model.Elevator(var70, var73);
    var64.setCarts(var73);
    var62.setElevatorPressedButtons(var73);
    var62.setElevatorCapacity(10);
    var62.setElevatorClosestFloor(100);
    int var81 = var62.getTargetFloor();
    int var82 = var62.getElevatorClosestFloor();
    java.util.ArrayList var83 = var62.getElevatorPressedButtons();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test44");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    at.fhhagenberg.sqe.elevator.model.Elevator var63 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var64 = var63.getClockTick();
    java.util.ArrayList var65 = var63.getCarts();
    var62.setElevatorPressedButtons(var65);
    var62.setElevatorWeight(0);
    var62.setTargetFloor((-1));
    int var71 = var62.getElevatorPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 10);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test45");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    boolean var8 = var0.getServicesFloors(1, 1);
    java.util.ArrayList var9 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var11 = var10.getClockTick();
    java.util.ArrayList var12 = var10.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var13 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var14 = var13.getClockTick();
    java.util.ArrayList var15 = var13.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator(var12, var15);
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var18 = var17.getClockTick();
    java.util.ArrayList var19 = var17.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var20 = new at.fhhagenberg.sqe.elevator.model.Elevator(var15, var19);
    var0.setCarts(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var23 = var0.getTarget(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test46");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    boolean var12 = var9.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var13 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var14 = var13.getClockTick();
    java.util.ArrayList var15 = var13.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var17 = var16.getClockTick();
    java.util.ArrayList var18 = var16.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var19 = new at.fhhagenberg.sqe.elevator.model.Elevator(var15, var18);
    var9.setCarts(var18);
    var0.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.Elevator var31 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var32 = var31.getClockTick();
    java.util.ArrayList var33 = var31.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var34 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var35 = var34.getClockTick();
    java.util.ArrayList var36 = var34.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var37 = new at.fhhagenberg.sqe.elevator.model.Elevator(var33, var36);
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var36, var40);
    var0.addElevatorBox(1, 100, (-1), 100, 0, 2, 0, 0, (-1), var36);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var55 = var52.getServicesFloors(100, 100);
    int var56 = var52.getElevatorNum();
    int var57 = var52.getFloorNum();
    boolean var60 = var52.getServicesFloors(1, 1);
    java.util.ArrayList var61 = var52.getFloors();
    var0.addElevatorBox(0, 10, 100, 2, 0, 10, 1, 2, 1, var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test47");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    java.util.ArrayList var3 = var0.getCarts();
    boolean var6 = var0.getServicesFloors((-1), (-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var0.getElevatorFloor(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test48");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    int var12 = var0.getElevatorNum();
    int var14 = var0.getElevatorSpeed(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test49");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    at.fhhagenberg.sqe.elevator.model.Elevator var64 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var65 = var64.getClockTick();
    boolean var67 = var64.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var68 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var69 = var68.getClockTick();
    java.util.ArrayList var70 = var68.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var71 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var72 = var71.getClockTick();
    java.util.ArrayList var73 = var71.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var74 = new at.fhhagenberg.sqe.elevator.model.Elevator(var70, var73);
    var64.setCarts(var73);
    var62.setElevatorPressedButtons(var73);
    var62.setElevatorCapacity(10);
    var62.setTargetFloor(10);
    var62.setElevatorClosestFloor(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test50");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    int var66 = var62.getElevatorClosestFloor();
    var62.setElevatorDoorStatus(10);
    var62.setElevatorDoorStatus(2);
    var62.setElevatorCapacity(10);
    int var73 = var62.getElevatorDoorStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 2);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test51");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers();
    var1.readValues();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    long var11 = var10.getClockTick();
    boolean var13 = var10.getFloorButtonUp((-1));
    var1.notifyObservers((java.lang.Object)var13);
    boolean var15 = var1.hasChanged();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var16 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var18 = var17.getClockTick();
    java.util.ArrayList var19 = var17.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var20 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var21 = var20.getClockTick();
    java.util.ArrayList var22 = var20.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var23 = new at.fhhagenberg.sqe.elevator.model.Elevator(var19, var22);
    var16.setFloorButtonsUp(var19);
    at.fhhagenberg.sqe.elevator.model.Elevator var34 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var35 = var34.getClockTick();
    java.util.ArrayList var36 = var34.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var37 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var38 = var37.getClockTick();
    java.util.ArrayList var39 = var37.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var40 = new at.fhhagenberg.sqe.elevator.model.Elevator(var36, var39);
    var16.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var39);
    at.fhhagenberg.sqe.elevator.model.Elevator var51 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var52 = var51.getClockTick();
    java.util.ArrayList var53 = var51.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator(var53, var56);
    var16.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var56);
    at.fhhagenberg.sqe.elevator.model.Elevator var68 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var69 = var68.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var70 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var71 = var70.getClockTick();
    java.util.ArrayList var72 = var70.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var73 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var74 = var73.getClockTick();
    java.util.ArrayList var75 = var73.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var76 = new at.fhhagenberg.sqe.elevator.model.Elevator(var72, var75);
    var68.setCarts(var72);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var78 = var16.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var72);
    int var79 = var78.getElevatorAccel();
    var1.notifyObservers((java.lang.Object)var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == (-1));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test52");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.stop();
    var1.stop();
    int var6 = var1.countObservers();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var8 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var9 = var8.getClockTick();
    java.util.ArrayList var10 = var8.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var12 = var11.getClockTick();
    java.util.ArrayList var13 = var11.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator(var10, var13);
    var7.setFloorButtonsUp(var10);
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var26 = var25.getClockTick();
    java.util.ArrayList var27 = var25.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var29 = var28.getClockTick();
    java.util.ArrayList var30 = var28.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var31 = new at.fhhagenberg.sqe.elevator.model.Elevator(var27, var30);
    var7.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var30);
    at.fhhagenberg.sqe.elevator.model.Elevator var42 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var43 = var42.getClockTick();
    java.util.ArrayList var44 = var42.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var46 = var45.getClockTick();
    java.util.ArrayList var47 = var45.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var48 = new at.fhhagenberg.sqe.elevator.model.Elevator(var44, var47);
    var7.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var47);
    var1.notifyObservers((java.lang.Object)var7);
    at.fhhagenberg.sqe.elevator.model.Elevator var51 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var52 = var51.getClockTick();
    boolean var54 = var51.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var55 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var56 = var55.getClockTick();
    java.util.ArrayList var57 = var55.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var58 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var59 = var58.getClockTick();
    java.util.ArrayList var60 = var58.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var61 = new at.fhhagenberg.sqe.elevator.model.Elevator(var57, var60);
    var51.setCarts(var60);
    var7.setFloorButtonsUp(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test53");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.deleteObservers();
    boolean var5 = var1.hasChanged();
    int var6 = var1.countObservers();
    var1.start();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test54");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    int var4 = var0.getElevatorNum();
    var0.setServicesFloors(0, 10, true);
    boolean var11 = var0.getServicesFloors(0, 2);
    var0.setServicesFloors(1, 1, true);
    int var17 = var0.getElevatorWeight(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test55");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    boolean var3 = var0.getFloorButtonUp(100);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var4 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var5 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var6 = var5.getClockTick();
    java.util.ArrayList var7 = var5.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var8 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var9 = var8.getClockTick();
    java.util.ArrayList var10 = var8.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator(var7, var10);
    var4.setFloorButtonsUp(var7);
    at.fhhagenberg.sqe.elevator.model.Elevator var22 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var23 = var22.getClockTick();
    java.util.ArrayList var24 = var22.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var26 = var25.getClockTick();
    java.util.ArrayList var27 = var25.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator(var24, var27);
    var4.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var27);
    at.fhhagenberg.sqe.elevator.model.Elevator var39 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var40 = var39.getClockTick();
    java.util.ArrayList var41 = var39.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var42 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var43 = var42.getClockTick();
    java.util.ArrayList var44 = var42.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator(var41, var44);
    var4.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var44);
    at.fhhagenberg.sqe.elevator.model.Elevator var56 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var57 = var56.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var58 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var59 = var58.getClockTick();
    java.util.ArrayList var60 = var58.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var61 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var62 = var61.getClockTick();
    java.util.ArrayList var63 = var61.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var64 = new at.fhhagenberg.sqe.elevator.model.Elevator(var60, var63);
    var56.setCarts(var60);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var66 = var4.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var60);
    at.fhhagenberg.sqe.elevator.model.Elevator var76 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var78 = var76.getElevatorAccel(1);
    java.util.ArrayList var79 = var76.getCarts();
    var4.addElevatorBox((-1), 2, 100, 1, 0, (-1), 0, 10, 1, var79);
    var0.setFloors(var79);
    int var82 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var84 = var0.getElevatorPosition(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 10);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test56");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var3 = var2.getClockTick();
    java.util.ArrayList var4 = var2.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var5 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var6 = var5.getClockTick();
    java.util.ArrayList var7 = var5.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var8 = new at.fhhagenberg.sqe.elevator.model.Elevator(var4, var7);
    var0.setCarts(var4);
    int var10 = var0.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var11 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var12 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var13 = var12.getClockTick();
    java.util.ArrayList var14 = var12.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var15 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var16 = var15.getClockTick();
    java.util.ArrayList var17 = var15.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator(var14, var17);
    var11.setFloorButtonsUp(var14);
    var0.setFloors(var14);
    var0.setServicesFloors((-1), 100, false);
    int var26 = var0.getElevatorSpeed(2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var28 = var0.getElevatorDoorStatus(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test57");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    int var6 = var0.getFloorNum();
    boolean var8 = var0.getFloorButtonDown(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test58");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.stop();
    var1.deleteObservers();
    int var6 = var1.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test59");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    int var4 = var1.getCurrentPayload();
    var1.moveUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test60");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    at.fhhagenberg.sqe.elevator.model.Elevator var64 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var65 = var64.getClockTick();
    boolean var67 = var64.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var68 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var69 = var68.getClockTick();
    java.util.ArrayList var70 = var68.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var71 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var72 = var71.getClockTick();
    java.util.ArrayList var73 = var71.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var74 = new at.fhhagenberg.sqe.elevator.model.Elevator(var70, var73);
    var64.setCarts(var73);
    var62.setElevatorPressedButtons(var73);
    at.fhhagenberg.sqe.elevator.model.Elevator var77 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var78 = var77.getClockTick();
    boolean var80 = var77.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var81 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var82 = var81.getClockTick();
    java.util.ArrayList var83 = var81.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var84 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var85 = var84.getClockTick();
    java.util.ArrayList var86 = var84.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var87 = new at.fhhagenberg.sqe.elevator.model.Elevator(var83, var86);
    var77.setCarts(var86);
    at.fhhagenberg.sqe.elevator.model.Elevator var89 = new at.fhhagenberg.sqe.elevator.model.Elevator(var73, var86);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var91 = var89.getCommittedDirection(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test61");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    var62.addElevatorPressedButtons(false);
    int var70 = var62.getTargetFloor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 2);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test62");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    var1.setCommitedDirection((-1));
    int var4 = var1.getCurrentPayload();
    int var5 = var1.getElevatorDirection();
    var1.addDestination((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test63");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.stop();
    var1.stop();
    var1.notifyObservers();
    int var7 = var1.countObservers();
    int var8 = var1.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test64");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    int var13 = var0.getElevatorSpeed((-1));
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var16 = var14.getElevatorAccel(1);
    java.util.ArrayList var17 = var14.getCarts();
    var0.setCarts(var17);
    boolean var20 = var0.getFloorButtonDown(1);
    var0.setServicesFloors(2, 1, true);
    boolean var27 = var0.getServicesFloors(10, 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test65");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    var1.setCommitedDirection((-1));
    var1.move();
    var1.moveDown();
    var1.move();
    int var7 = var1.getCommitedDirection();
    var1.setSpeed(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test66");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    var1.setCommitedDirection((-1));
    var1.setCommitedDirection(10);
    var1.setCommitedDirection(10);
    boolean var9 = var1.getElevatorButton(0);
    var1.moveUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test67");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    boolean var8 = var0.getServicesFloors(1, 1);
    boolean var10 = var0.getFloorButtonDown(2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var12 = var0.getCommittedDirection(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test68");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var7 = var6.getClockTick();
    java.util.ArrayList var8 = var6.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    java.util.ArrayList var11 = var9.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var12 = new at.fhhagenberg.sqe.elevator.model.Elevator(var8, var11);
    var5.setFloorButtonsUp(var8);
    var0.setCarts(var8);
    at.fhhagenberg.sqe.elevator.model.Elevator var15 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var16 = var15.getClockTick();
    java.util.ArrayList var17 = var15.getCarts();
    var0.setFloors(var17);
    int var19 = var0.getElevatorNum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test69");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonDownPressed();
    boolean var2 = var0.isFloorButtonUpPressed();
    var0.setFloorId((-1));
    var0.setFloorButtonUpPressed(true);
    boolean var7 = var0.isFloorButtonDownPressed();
    boolean var8 = var0.isFloorButtonUpPressed();
    var0.setFloorButtonDownPressed(false);
    boolean var11 = var0.isFloorButtonUpPressed();
    boolean var12 = var0.isFloorButtonDownPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test70");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    boolean var8 = var0.getServicesFloors(1, 1);
    java.util.ArrayList var9 = var0.getFloors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var0.getCommittedDirection(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test71");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getCommittedDirection(10);
    int var4 = var0.getElevatorFloor(9);
    int var6 = var0.getElevatorPosition((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test72");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    var0.setFloorButtonUpPressed(true);
    var0.setFloorButtonDownPressed(true);
    var0.setFloorId((-1));

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test73");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    int var6 = var0.getFloorNum();
    var0.setServicesFloors((-1), 0, true);
    int var11 = var0.getElevatorNum();
    int var13 = var0.getElevatorWeight(100);
    int var14 = var0.getElevatorNum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test74");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    boolean var3 = var0.getFloorButtonUp(100);
    int var5 = var0.getElevatorAccel((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTarget(10, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test75");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var11 = var9.getElevatorAccel(1);
    java.util.ArrayList var12 = var9.getCarts();
    var0.setFloorButtonsUp(var12);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var14 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var24 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var26 = var25.getClockTick();
    java.util.ArrayList var27 = var25.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var29 = var28.getClockTick();
    java.util.ArrayList var30 = var28.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var31 = new at.fhhagenberg.sqe.elevator.model.Elevator(var27, var30);
    var24.setFloorButtonsUp(var27);
    at.fhhagenberg.sqe.elevator.model.Elevator var42 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var43 = var42.getClockTick();
    java.util.ArrayList var44 = var42.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var46 = var45.getClockTick();
    java.util.ArrayList var47 = var45.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var48 = new at.fhhagenberg.sqe.elevator.model.Elevator(var44, var47);
    var24.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var47);
    at.fhhagenberg.sqe.elevator.model.Elevator var59 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var60 = var59.getClockTick();
    java.util.ArrayList var61 = var59.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var62 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var63 = var62.getClockTick();
    java.util.ArrayList var64 = var62.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var65 = new at.fhhagenberg.sqe.elevator.model.Elevator(var61, var64);
    var24.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var64);
    at.fhhagenberg.sqe.elevator.model.Elevator var76 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var77 = var76.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var78 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var79 = var78.getClockTick();
    java.util.ArrayList var80 = var78.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var81 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var82 = var81.getClockTick();
    java.util.ArrayList var83 = var81.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var84 = new at.fhhagenberg.sqe.elevator.model.Elevator(var80, var83);
    var76.setCarts(var80);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var86 = var24.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var80);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var87 = var14.new ElevatorBox((-1), 0, 1, 0, 1, 2, 1, (-1), 100, var80);
    var0.setFloorButtonsUp(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test76");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getCommittedDirection(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test77");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    var62.setElevatorSpeed((-1));
    int var70 = var62.getElevatorSpeed();
    var62.setElevatorDir((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test78");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    int var6 = var0.getFloorHeight();
    int var7 = var0.getFloorHeight();
    int var9 = var0.getElevatorCapacity(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test79");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    int var6 = var0.getFloorNum();
    int var7 = var0.getElevatorNum();
    int var8 = var0.getFloorNum();
    long var9 = var0.getClockTick();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTarget(2, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test80");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    var1.setSpeed(1);
    int var6 = var1.getNextDestination();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test81");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var6 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var8 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var9 = var8.getClockTick();
    java.util.ArrayList var10 = var8.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var12 = var11.getClockTick();
    java.util.ArrayList var13 = var11.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator(var10, var13);
    var7.setFloorButtonsUp(var10);
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var26 = var25.getClockTick();
    java.util.ArrayList var27 = var25.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var29 = var28.getClockTick();
    java.util.ArrayList var30 = var28.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var31 = new at.fhhagenberg.sqe.elevator.model.Elevator(var27, var30);
    var7.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var30);
    at.fhhagenberg.sqe.elevator.model.Elevator var42 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var43 = var42.getClockTick();
    java.util.ArrayList var44 = var42.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var46 = var45.getClockTick();
    java.util.ArrayList var47 = var45.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var48 = new at.fhhagenberg.sqe.elevator.model.Elevator(var44, var47);
    var7.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var47);
    at.fhhagenberg.sqe.elevator.model.Elevator var59 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var60 = var59.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var61 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var62 = var61.getClockTick();
    java.util.ArrayList var63 = var61.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var64 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var65 = var64.getClockTick();
    java.util.ArrayList var66 = var64.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var67 = new at.fhhagenberg.sqe.elevator.model.Elevator(var63, var66);
    var59.setCarts(var63);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var69 = var7.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var63);
    var69.addElevatorPressedButtons(true);
    int var72 = var69.getElevatorAccel();
    var69.addElevatorPressedButtons(true);
    var69.setElevatorSpeed((-1));
    var69.setElevatorCapacity((-1));
    java.util.ArrayList var79 = var69.getElevatorPressedButtons();
    var0.setFloors(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test82");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    java.util.ArrayList var11 = var9.getCarts();
    var0.setFloorButtonsDown(var11);
    java.util.ArrayList var13 = var0.getElevatorBoxesList();
    at.fhhagenberg.sqe.elevator.model.Elevator var23 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var26 = var23.getServicesFloors(100, 100);
    int var27 = var23.getElevatorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var28 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var29 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var30 = var29.getClockTick();
    java.util.ArrayList var31 = var29.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var32 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var33 = var32.getClockTick();
    java.util.ArrayList var34 = var32.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator(var31, var34);
    var28.setFloorButtonsUp(var31);
    var23.setCarts(var31);
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    var23.setFloors(var40);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var42 = var0.new ElevatorBox(1, 0, 10, 10, 0, (-1), 10, 2, 2, var40);
    int var43 = var42.getElevatorWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 10);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test83");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    int var68 = var62.getElevatorSpeed();
    var62.setTargetFloor(2);
    int var71 = var62.getTargetFloor();
    at.fhhagenberg.sqe.elevator.model.Elevator var72 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var73 = var72.getClockTick();
    java.util.ArrayList var74 = var72.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var75 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var76 = var75.getClockTick();
    java.util.ArrayList var77 = var75.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var78 = new at.fhhagenberg.sqe.elevator.model.Elevator(var74, var77);
    at.fhhagenberg.sqe.elevator.model.Elevator var79 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var80 = var79.getClockTick();
    java.util.ArrayList var81 = var79.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var82 = new at.fhhagenberg.sqe.elevator.model.Elevator(var77, var81);
    var62.setElevatorPressedButtons(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test84");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var18 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var19 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var20 = var19.getClockTick();
    java.util.ArrayList var21 = var19.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var22 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var23 = var22.getClockTick();
    java.util.ArrayList var24 = var22.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator(var21, var24);
    var18.setFloorButtonsUp(var21);
    at.fhhagenberg.sqe.elevator.model.Elevator var36 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var37 = var36.getClockTick();
    java.util.ArrayList var38 = var36.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var39 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var40 = var39.getClockTick();
    java.util.ArrayList var41 = var39.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var42 = new at.fhhagenberg.sqe.elevator.model.Elevator(var38, var41);
    var18.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var41);
    at.fhhagenberg.sqe.elevator.model.Elevator var53 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var54 = var53.getClockTick();
    java.util.ArrayList var55 = var53.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var56 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var57 = var56.getClockTick();
    java.util.ArrayList var58 = var56.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var59 = new at.fhhagenberg.sqe.elevator.model.Elevator(var55, var58);
    var18.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var58);
    at.fhhagenberg.sqe.elevator.model.Elevator var70 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var71 = var70.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var72 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var73 = var72.getClockTick();
    java.util.ArrayList var74 = var72.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var75 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var76 = var75.getClockTick();
    java.util.ArrayList var77 = var75.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var78 = new at.fhhagenberg.sqe.elevator.model.Elevator(var74, var77);
    var70.setCarts(var74);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var80 = var18.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var74);
    var80.addElevatorPressedButtons(true);
    int var83 = var80.getElevatorAccel();
    int var84 = var80.getElevatorClosestFloor();
    var80.setElevatorDoorStatus(10);
    at.fhhagenberg.sqe.elevator.model.Elevator var87 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var88 = var87.getClockTick();
    java.util.ArrayList var89 = var87.getCarts();
    var80.setElevatorPressedButtons(var89);
    var0.addElevatorBox(100, 10, 10, (-1), (-1), 1, 1, 100, (-1), var89);
    java.util.ArrayList var92 = var0.getElevatorBoxesList();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test85");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    java.util.ArrayList var2 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var3 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var4 = var3.getClockTick();
    java.util.ArrayList var5 = var3.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator(var2, var5);
    long var7 = var6.getClockTick();
    long var8 = var6.getClockTick();
    int var10 = var6.getElevatorWeight(10);
    int var11 = var6.getElevatorNum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test86");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    var62.setElevatorSpeed((-1));
    int var70 = var62.getElevatorSpeed();
    int var71 = var62.getElevatorDir();
    var62.setElevatorWeight((-1));
    var62.setElevatorWeight(0);
    int var76 = var62.getElevatorCapacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 100);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test87");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    java.util.ArrayList var11 = var9.getCarts();
    var0.setFloorButtonsDown(var11);
    java.util.ArrayList var13 = var0.getElevatorBoxesList();
    at.fhhagenberg.sqe.elevator.model.Elevator var23 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var26 = var23.getServicesFloors(100, 100);
    int var27 = var23.getElevatorNum();
    int var28 = var23.getFloorNum();
    boolean var31 = var23.getServicesFloors(1, 1);
    java.util.ArrayList var32 = var23.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var33 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var34 = var33.getClockTick();
    java.util.ArrayList var35 = var33.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var36 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var37 = var36.getClockTick();
    java.util.ArrayList var38 = var36.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var39 = new at.fhhagenberg.sqe.elevator.model.Elevator(var35, var38);
    at.fhhagenberg.sqe.elevator.model.Elevator var40 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var41 = var40.getClockTick();
    java.util.ArrayList var42 = var40.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var43 = new at.fhhagenberg.sqe.elevator.model.Elevator(var38, var42);
    var23.setCarts(var42);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var45 = var0.new ElevatorBox(100, 100, 10, 100, 1, 9, 100, 1, 2, var42);
    var45.setElevatorPosition(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test88");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    at.fhhagenberg.sqe.elevator.model.Elevator var64 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var65 = var64.getClockTick();
    boolean var67 = var64.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var68 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var69 = var68.getClockTick();
    java.util.ArrayList var70 = var68.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var71 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var72 = var71.getClockTick();
    java.util.ArrayList var73 = var71.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var74 = new at.fhhagenberg.sqe.elevator.model.Elevator(var70, var73);
    var64.setCarts(var73);
    var62.setElevatorPressedButtons(var73);
    var62.setElevatorCapacity(10);
    var62.setElevatorClosestFloor(100);
    int var81 = var62.getTargetFloor();
    int var82 = var62.getElevatorWeight();
    int var83 = var62.getElevatorClosestFloor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 100);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test89");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonDownPressed();
    boolean var2 = var0.isFloorButtonUpPressed();
    boolean var3 = var0.isFloorButtonDownPressed();
    boolean var4 = var0.isFloorButtonDownPressed();
    int var5 = var0.getFloorId();
    var0.setFloorId(0);
    var0.setFloorButtonDownPressed(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test90");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    boolean var12 = var9.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var13 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var14 = var13.getClockTick();
    java.util.ArrayList var15 = var13.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var17 = var16.getClockTick();
    java.util.ArrayList var18 = var16.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var19 = new at.fhhagenberg.sqe.elevator.model.Elevator(var15, var18);
    var9.setCarts(var18);
    var0.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.Elevator var22 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var23 = var22.getClockTick();
    java.util.ArrayList var24 = var22.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var26 = var25.getClockTick();
    java.util.ArrayList var27 = var25.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator(var24, var27);
    at.fhhagenberg.sqe.elevator.model.Elevator var29 = new at.fhhagenberg.sqe.elevator.model.Elevator(var18, var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test91");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    at.fhhagenberg.sqe.elevator.model.Elevator var63 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var64 = var63.getClockTick();
    java.util.ArrayList var65 = var63.getCarts();
    var62.setElevatorPressedButtons(var65);
    var62.setElevatorDir(0);
    int var69 = var62.getElevatorAccel();
    var62.setElevatorCapacity(1);
    var62.setElevatorCapacity(100);
    var62.setElevatorPosition(0);
    var62.setElevatorWeight(100);
    var62.setTargetFloor(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test92");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    int var3 = var0.getFloorHeight();
    int var5 = var0.getElevatorAccel(2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var0.getCommittedDirection((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test93");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var12.notifyObservers();
    int var14 = var12.countObservers();
    at.fhhagenberg.sqe.elevator.model.Elevator var15 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var16 = var15.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var18 = var17.getClockTick();
    java.util.ArrayList var19 = var17.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var20 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var21 = var20.getClockTick();
    java.util.ArrayList var22 = var20.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var23 = new at.fhhagenberg.sqe.elevator.model.Elevator(var19, var22);
    var15.setCarts(var19);
    int var25 = var15.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var26 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var27 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var28 = var27.getClockTick();
    java.util.ArrayList var29 = var27.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var30 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var31 = var30.getClockTick();
    java.util.ArrayList var32 = var30.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var33 = new at.fhhagenberg.sqe.elevator.model.Elevator(var29, var32);
    var26.setFloorButtonsUp(var29);
    var15.setFloors(var29);
    var12.notifyObservers((java.lang.Object)var15);
    long var37 = var15.getClockTick();
    int var38 = var15.getFloorHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test94");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    at.fhhagenberg.sqe.elevator.model.Elevator var63 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var64 = var63.getClockTick();
    java.util.ArrayList var65 = var63.getCarts();
    var62.setElevatorPressedButtons(var65);
    var62.setElevatorDir(0);
    int var69 = var62.getElevatorAccel();
    var62.setElevatorCapacity(1);
    var62.setElevatorCapacity(100);
    var62.setElevatorPosition(0);
    var62.setElevatorWeight(100);
    var62.setElevatorSpeed(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test95");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    boolean var6 = var0.getFloorButtonDown(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test96");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    int var13 = var0.getElevatorSpeed((-1));
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var16 = var14.getElevatorAccel(1);
    java.util.ArrayList var17 = var14.getCarts();
    var0.setCarts(var17);
    int var20 = var0.getElevatorCapacity(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var22 = var0.getCommittedDirection(9);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test97");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    int var13 = var0.getElevatorSpeed((-1));
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var16 = var14.getElevatorAccel(1);
    java.util.ArrayList var17 = var14.getCarts();
    var0.setCarts(var17);
    int var19 = var0.getElevatorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var21 = var0.getElevatorPosition(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test98");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var26 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var27 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var28 = var27.getClockTick();
    java.util.ArrayList var29 = var27.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var30 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var31 = var30.getClockTick();
    java.util.ArrayList var32 = var30.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var33 = new at.fhhagenberg.sqe.elevator.model.Elevator(var29, var32);
    var26.setFloorButtonsUp(var29);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    boolean var38 = var35.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var39 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var40 = var39.getClockTick();
    java.util.ArrayList var41 = var39.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var42 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var43 = var42.getClockTick();
    java.util.ArrayList var44 = var42.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator(var41, var44);
    var35.setCarts(var44);
    var26.setFloorButtonsUp(var44);
    java.util.ArrayList var48 = var26.getElevatorBoxesList();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var58 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var59 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var60 = var59.getClockTick();
    java.util.ArrayList var61 = var59.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var62 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var63 = var62.getClockTick();
    java.util.ArrayList var64 = var62.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var65 = new at.fhhagenberg.sqe.elevator.model.Elevator(var61, var64);
    var58.setFloorButtonsUp(var61);
    var26.addElevatorBox(9, 0, 9, (-1), 10, 0, 2, (-1), 100, var61);
    var0.setFloorButtonsUp(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test99");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    int var64 = var62.getTargetFloor();
    int var65 = var62.getElevatorDir();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 10);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test100");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var12.notifyObservers();
    var12.start();
    var12.start();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test101");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var1 = var0.getFloorNum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test102");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var7 = var6.getClockTick();
    java.util.ArrayList var8 = var6.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    java.util.ArrayList var11 = var9.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var12 = new at.fhhagenberg.sqe.elevator.model.Elevator(var8, var11);
    var5.setFloorButtonsUp(var8);
    var0.setCarts(var8);
    int var15 = var0.getElevatorNum();
    int var16 = var0.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var17 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var17.setFloorButtonsUp(var20);
    at.fhhagenberg.sqe.elevator.model.Elevator var26 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var27 = var26.getClockTick();
    boolean var29 = var26.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var30 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var31 = var30.getClockTick();
    java.util.ArrayList var32 = var30.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var33 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var34 = var33.getClockTick();
    java.util.ArrayList var35 = var33.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var36 = new at.fhhagenberg.sqe.elevator.model.Elevator(var32, var35);
    var26.setCarts(var35);
    var17.setFloorButtonsUp(var35);
    at.fhhagenberg.sqe.elevator.model.Elevator var48 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var49 = var48.getClockTick();
    java.util.ArrayList var50 = var48.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var51 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var52 = var51.getClockTick();
    java.util.ArrayList var53 = var51.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator(var50, var53);
    at.fhhagenberg.sqe.elevator.model.Elevator var55 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var56 = var55.getClockTick();
    java.util.ArrayList var57 = var55.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var58 = new at.fhhagenberg.sqe.elevator.model.Elevator(var53, var57);
    var17.addElevatorBox(1, 100, (-1), 100, 0, 2, 0, 0, (-1), var53);
    var0.setFloors(var53);
    at.fhhagenberg.sqe.elevator.model.Elevator var61 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var62 = var61.getClockTick();
    boolean var64 = var61.getFloorButtonDown(100);
    int var65 = var61.getElevatorNum();
    var61.setServicesFloors(0, 10, true);
    java.util.ArrayList var70 = var61.getCarts();
    var0.setFloors(var70);
    int var72 = var0.getFloorNum();
    int var73 = var0.getElevatorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCommittedDirection((-1), 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 2);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test103");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    boolean var6 = var0.getFloorButtonDown(10);
    long var7 = var0.getClockTick();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test104");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonDownPressed();
    int var2 = var0.getFloorId();
    boolean var3 = var0.isFloorButtonDownPressed();
    boolean var4 = var0.isFloorButtonUpPressed();
    boolean var5 = var0.isFloorButtonDownPressed();
    var0.setFloorId(9);
    boolean var8 = var0.isFloorButtonDownPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test105");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.deleteObservers();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var7 = var6.getClockTick();
    java.util.ArrayList var8 = var6.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    java.util.ArrayList var11 = var9.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var12 = new at.fhhagenberg.sqe.elevator.model.Elevator(var8, var11);
    var5.setFloorButtonsUp(var8);
    at.fhhagenberg.sqe.elevator.model.Elevator var23 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var24 = var23.getClockTick();
    java.util.ArrayList var25 = var23.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var26 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var27 = var26.getClockTick();
    java.util.ArrayList var28 = var26.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var29 = new at.fhhagenberg.sqe.elevator.model.Elevator(var25, var28);
    var5.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var28);
    at.fhhagenberg.sqe.elevator.model.Elevator var40 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var41 = var40.getClockTick();
    java.util.ArrayList var42 = var40.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var43 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var44 = var43.getClockTick();
    java.util.ArrayList var45 = var43.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var46 = new at.fhhagenberg.sqe.elevator.model.Elevator(var42, var45);
    var5.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var45);
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var59 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var60 = var59.getClockTick();
    java.util.ArrayList var61 = var59.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var62 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var63 = var62.getClockTick();
    java.util.ArrayList var64 = var62.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var65 = new at.fhhagenberg.sqe.elevator.model.Elevator(var61, var64);
    var57.setCarts(var61);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var67 = var5.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var61);
    var67.addElevatorPressedButtons(true);
    int var70 = var67.getElevatorAccel();
    var67.addElevatorPressedButtons(true);
    int var73 = var67.getElevatorAccel();
    var1.notifyObservers((java.lang.Object)var67);
    var67.setElevatorCapacity(2);
    var67.setTargetFloor(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-1));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test106");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var12.notifyObservers();
    var12.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test107");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var3 = var2.getClockTick();
    java.util.ArrayList var4 = var2.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var5 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var6 = var5.getClockTick();
    java.util.ArrayList var7 = var5.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var8 = new at.fhhagenberg.sqe.elevator.model.Elevator(var4, var7);
    var0.setCarts(var4);
    int var11 = var0.getElevatorCapacity(1);
    int var12 = var0.getElevatorNum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test108");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.deleteObservers();
    var1.notifyObservers();
    var1.notifyObservers();

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test109");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    var1.setSpeed(2);
    int var4 = var1.getElevatorDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test110");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    int var66 = var62.getElevatorClosestFloor();
    var62.setElevatorDoorStatus(10);
    var62.setElevatorWeight(100);
    var62.setElevatorPosition(100);
    int var73 = var62.getElevatorSpeed();
    int var74 = var62.getElevatorCapacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 100);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test111");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    int var2 = var1.getCurrentPayload();
    var1.moveUp();
    int var4 = var1.getWeight();
    var1.setSpeed(9);
    int var7 = var1.getWeight();
    boolean var9 = var1.getElevatorButton(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test112");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    at.fhhagenberg.sqe.elevator.model.Elevator var64 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var65 = var64.getClockTick();
    boolean var67 = var64.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var68 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var69 = var68.getClockTick();
    java.util.ArrayList var70 = var68.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var71 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var72 = var71.getClockTick();
    java.util.ArrayList var73 = var71.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var74 = new at.fhhagenberg.sqe.elevator.model.Elevator(var70, var73);
    var64.setCarts(var73);
    var62.setElevatorPressedButtons(var73);
    var62.setElevatorCapacity(10);
    var62.setElevatorClosestFloor(100);
    int var81 = var62.getTargetFloor();
    int var82 = var62.getElevatorWeight();
    var62.setElevatorCapacity(10);
    int var85 = var62.getElevatorClosestFloor();
    var62.setElevatorAccel(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 100);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test113");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var3 = var2.getClockTick();
    java.util.ArrayList var4 = var2.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var5 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var6 = var5.getClockTick();
    java.util.ArrayList var7 = var5.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var8 = new at.fhhagenberg.sqe.elevator.model.Elevator(var4, var7);
    var0.setCarts(var4);
    int var10 = var0.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var11 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var12 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var13 = var12.getClockTick();
    java.util.ArrayList var14 = var12.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var15 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var16 = var15.getClockTick();
    java.util.ArrayList var17 = var15.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator(var14, var17);
    var11.setFloorButtonsUp(var14);
    var0.setFloors(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var22 = var0.getElevatorPosition(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test114");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.deleteObservers();
    var1.start();
    var1.deleteObservers();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    boolean var10 = var7.getFloorButtonDown(100);
    int var11 = var7.getElevatorNum();
    var1.notifyObservers((java.lang.Object)var11);
    var1.stop();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test115");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    var62.setElevatorSpeed((-1));
    int var70 = var62.getElevatorSpeed();
    var62.setElevatorAccel(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test116");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    var0.setFloorButtonUpPressed(true);
    var0.setFloorId(10);
    boolean var5 = var0.isFloorButtonDownPressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test117");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    int var3 = var0.getFloorHeight();
    var0.setServicesFloors(1, 2, false);
    var0.setServicesFloors(10, 10, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test118");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    java.util.ArrayList var3 = var0.getCarts();
    boolean var6 = var0.getServicesFloors((-1), (-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var7.start();
    boolean var9 = var7.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test119");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    var0.setServicesFloors((-1), 2, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCommittedDirection(9, 2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test120");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    var1.setCommitedDirection((-1));
    var1.move();
    int var5 = var1.getCurrentFloor();
    int var6 = var1.getWeight();
    int var7 = var1.getElevatorDirection();
    int var8 = var1.getCurrentPayload();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test121");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    var1.moveDown();
    int var5 = var1.getElevatorDirection();
    int var6 = var1.getWeight();
    int var7 = var1.getElevatorDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test122");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    java.util.ArrayList var3 = var0.getCarts();
    boolean var6 = var0.getServicesFloors((-1), (-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var7.start();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.readValues();
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test123");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    at.fhhagenberg.sqe.elevator.model.Elevator var63 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var64 = var63.getClockTick();
    java.util.ArrayList var65 = var63.getCarts();
    var62.setElevatorPressedButtons(var65);
    var62.setElevatorCapacity(1);
    var62.setElevatorPosition(1);
    int var71 = var62.getElevatorDoorStatus();
    var62.setElevatorDir((-1));
    java.util.ArrayList var74 = var62.getElevatorPressedButtons();
    var62.setElevatorAccel((-1));
    int var77 = var62.getElevatorPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 1);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test124");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    var1.setCommitedDirection((-1));
    var1.setCommitedDirection(10);
    int var6 = var1.getNextDestination();
    int var7 = var1.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test125");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    int var64 = var62.getTargetFloor();
    var62.setElevatorDoorStatus(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 2);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test126");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    at.fhhagenberg.sqe.elevator.model.Elevator var63 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var64 = var63.getClockTick();
    java.util.ArrayList var65 = var63.getCarts();
    var62.setElevatorPressedButtons(var65);
    var62.setElevatorCapacity(1);
    var62.setElevatorPosition(1);
    int var71 = var62.getTargetFloor();
    int var72 = var62.getElevatorClosestFloor();
    var62.setTargetFloor(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 10);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test127");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    var1.moveDown();
    int var5 = var1.getCurrentPayload();
    var1.addDestination((java.lang.Integer)10);
    boolean var9 = var1.getElevatorButton(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test128");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    int var64 = var62.getTargetFloor();
    int var65 = var62.getElevatorClosestFloor();
    var62.setElevatorDir(100);
    int var68 = var62.getElevatorDoorStatus();
    var62.setElevatorClosestFloor(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 100);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test129");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    int var64 = var62.getElevatorPosition();
    var62.setElevatorDir(100);
    var62.setElevatorAccel(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 10);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test130");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    at.fhhagenberg.sqe.elevator.model.Elevator var63 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var64 = var63.getClockTick();
    java.util.ArrayList var65 = var63.getCarts();
    var62.setElevatorPressedButtons(var65);
    var62.setElevatorDir(0);
    int var69 = var62.getElevatorAccel();
    var62.setElevatorCapacity(1);
    var62.setElevatorCapacity(100);
    var62.setElevatorPosition(0);
    var62.setElevatorPosition(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test131");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    java.util.ArrayList var3 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var4 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var5 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var6 = var5.getClockTick();
    java.util.ArrayList var7 = var5.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var8 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var9 = var8.getClockTick();
    java.util.ArrayList var10 = var8.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator(var7, var10);
    var4.setFloorButtonsUp(var7);
    at.fhhagenberg.sqe.elevator.model.Elevator var22 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var23 = var22.getClockTick();
    java.util.ArrayList var24 = var22.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var26 = var25.getClockTick();
    java.util.ArrayList var27 = var25.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator(var24, var27);
    var4.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var27);
    at.fhhagenberg.sqe.elevator.model.Elevator var30 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var27);
    int var32 = var30.getElevatorAccel(2);
    boolean var35 = var30.getServicesFloors(100, 2);
    at.fhhagenberg.sqe.elevator.model.Elevator var36 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var39 = var36.getServicesFloors(100, 100);
    int var40 = var36.getElevatorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var41 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var42 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var43 = var42.getClockTick();
    java.util.ArrayList var44 = var42.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var46 = var45.getClockTick();
    java.util.ArrayList var47 = var45.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var48 = new at.fhhagenberg.sqe.elevator.model.Elevator(var44, var47);
    var41.setFloorButtonsUp(var44);
    var36.setCarts(var44);
    int var52 = var36.getElevatorSpeed(10);
    java.util.ArrayList var53 = var36.getFloors();
    var30.setCarts(var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var57 = var30.getElevatorButton(100, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test132");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    int var13 = var0.getElevatorSpeed((-1));
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var16 = var14.getElevatorAccel(1);
    java.util.ArrayList var17 = var14.getCarts();
    var0.setCarts(var17);
    int var20 = var0.getElevatorCapacity(10);
    java.util.ArrayList var21 = var0.getFloors();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test133");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var5 = var0.getElevatorAccel((-1));
    int var6 = var0.getFloorNum();
    java.util.ArrayList var7 = var0.getCarts();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test134");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    java.util.ArrayList var2 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var3 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var4 = var3.getClockTick();
    java.util.ArrayList var5 = var3.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator(var2, var5);
    long var7 = var6.getClockTick();
    boolean var9 = var6.getFloorButtonUp((-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var10 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test135");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    int var4 = var1.getNextDestination();
    var1.moveUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test136");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    int var2 = var0.getElevatorSpeed(10);
    boolean var4 = var0.getFloorButtonUp(0);
    int var6 = var0.getElevatorDoorStatus(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test137");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.deleteObservers();
    boolean var5 = var1.hasChanged();
    int var6 = var1.countObservers();
    var1.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test138");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.deleteObservers();
    var1.start();
    var1.deleteObservers();
    var1.deleteObservers();
    var1.deleteObservers();

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test139");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    var1.setSpeed(0);
    var1.setCommitedDirection(2);
    var1.setSpeed(100);
    var1.addDestination((java.lang.Integer)10);
    int var12 = var1.getWeight();
    var1.addDestination((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test140");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    var62.setElevatorSpeed((-1));
    int var70 = var62.getElevatorSpeed();
    int var71 = var62.getElevatorWeight();
    var62.setElevatorWeight(10);
    int var74 = var62.getElevatorClosestFloor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 10);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test141");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    int var3 = var0.getElevatorCapacity((-1));
    int var4 = var0.getElevatorNum();
    boolean var6 = var0.getFloorButtonDown((-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    boolean var9 = var0.getFloorButtonUp(1);
    var0.setServicesFloors(10, 0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test142");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    java.util.ArrayList var3 = var0.getCarts();
    boolean var6 = var0.getServicesFloors((-1), (-1));
    int var7 = var0.getFloorHeight();
    int var8 = var0.getElevatorNum();
    int var9 = var0.getElevatorNum();
    int var10 = var0.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var11 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var12 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var13 = var12.getClockTick();
    java.util.ArrayList var14 = var12.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var15 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var16 = var15.getClockTick();
    java.util.ArrayList var17 = var15.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator(var14, var17);
    var11.setFloorButtonsUp(var14);
    var0.setCarts(var14);
    int var21 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var23 = var0.getElevatorPosition(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test143");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.start();

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test144");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    int var2 = var1.getCurrentPayload();
    int var3 = var1.getCurrentFloor();
    int var4 = var1.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test145");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    int var6 = var0.getFloorNum();
    int var7 = var0.getElevatorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var8 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    java.util.ArrayList var11 = var9.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var12 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var13 = var12.getClockTick();
    java.util.ArrayList var14 = var12.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var15 = new at.fhhagenberg.sqe.elevator.model.Elevator(var11, var14);
    var8.setFloorButtonsUp(var11);
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var18 = var17.getClockTick();
    boolean var20 = var17.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var25 = var24.getClockTick();
    java.util.ArrayList var26 = var24.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var27 = new at.fhhagenberg.sqe.elevator.model.Elevator(var23, var26);
    var17.setCarts(var26);
    var8.setFloorButtonsUp(var26);
    java.util.ArrayList var30 = var8.getElevatorBoxesList();
    at.fhhagenberg.sqe.elevator.model.Elevator var31 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var32 = var31.getClockTick();
    boolean var34 = var31.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var31.setCarts(var40);
    var8.setFloorButtonsUp(var40);
    var0.setCarts(var40);
    int var45 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCommittedDirection(2, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 10);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test146");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers();
    var1.readValues();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    long var11 = var10.getClockTick();
    boolean var13 = var10.getFloorButtonUp((-1));
    var1.notifyObservers((java.lang.Object)var13);
    var1.start();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test147");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    var1.setSpeed(0);
    var1.setCommitedDirection(2);
    var1.setSpeed(100);
    int var10 = var1.getDoorStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test148");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.stop();
    var1.deleteObservers();
    var1.notifyObservers();
    var1.start();
    at.fhhagenberg.sqe.elevator.model.Elevator var8 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var9 = var8.getClockTick();
    var1.notifyObservers((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test149");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    boolean var8 = var0.getServicesFloors(1, 1);
    java.util.ArrayList var9 = var0.getFloors();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var11 = var10.getClockTick();
    java.util.ArrayList var12 = var10.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var13 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var14 = var13.getClockTick();
    java.util.ArrayList var15 = var13.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator(var12, var15);
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var18 = var17.getClockTick();
    java.util.ArrayList var19 = var17.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var20 = new at.fhhagenberg.sqe.elevator.model.Elevator(var15, var19);
    var0.setCarts(var19);
    int var22 = var0.getFloorHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test150");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var7 = var6.getClockTick();
    java.util.ArrayList var8 = var6.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    java.util.ArrayList var11 = var9.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var12 = new at.fhhagenberg.sqe.elevator.model.Elevator(var8, var11);
    var5.setFloorButtonsUp(var8);
    var0.setCarts(var8);
    int var15 = var0.getElevatorNum();
    int var16 = var0.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var17 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var17.setFloorButtonsUp(var20);
    at.fhhagenberg.sqe.elevator.model.Elevator var26 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var27 = var26.getClockTick();
    boolean var29 = var26.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var30 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var31 = var30.getClockTick();
    java.util.ArrayList var32 = var30.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var33 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var34 = var33.getClockTick();
    java.util.ArrayList var35 = var33.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var36 = new at.fhhagenberg.sqe.elevator.model.Elevator(var32, var35);
    var26.setCarts(var35);
    var17.setFloorButtonsUp(var35);
    at.fhhagenberg.sqe.elevator.model.Elevator var48 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var49 = var48.getClockTick();
    java.util.ArrayList var50 = var48.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var51 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var52 = var51.getClockTick();
    java.util.ArrayList var53 = var51.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator(var50, var53);
    at.fhhagenberg.sqe.elevator.model.Elevator var55 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var56 = var55.getClockTick();
    java.util.ArrayList var57 = var55.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var58 = new at.fhhagenberg.sqe.elevator.model.Elevator(var53, var57);
    var17.addElevatorBox(1, 100, (-1), 100, 0, 2, 0, 0, (-1), var53);
    var0.setFloors(var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var62 = var0.getElevatorDoorStatus(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test151");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    at.fhhagenberg.sqe.elevator.model.Elevator var64 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var65 = var64.getClockTick();
    boolean var67 = var64.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var68 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var69 = var68.getClockTick();
    java.util.ArrayList var70 = var68.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var71 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var72 = var71.getClockTick();
    java.util.ArrayList var73 = var71.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var74 = new at.fhhagenberg.sqe.elevator.model.Elevator(var70, var73);
    var64.setCarts(var73);
    var62.setElevatorPressedButtons(var73);
    var62.setElevatorCapacity(10);
    var62.setElevatorDoorStatus(2);
    var62.setElevatorCapacity(2);
    int var83 = var62.getTargetFloor();
    var62.setElevatorDoorStatus(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 2);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test152");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var7 = var6.getClockTick();
    java.util.ArrayList var8 = var6.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    java.util.ArrayList var11 = var9.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var12 = new at.fhhagenberg.sqe.elevator.model.Elevator(var8, var11);
    var5.setFloorButtonsUp(var8);
    var0.setCarts(var8);
    int var15 = var0.getElevatorNum();
    int var16 = var0.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var17 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var17.setFloorButtonsUp(var20);
    at.fhhagenberg.sqe.elevator.model.Elevator var26 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var27 = var26.getClockTick();
    boolean var29 = var26.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var30 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var31 = var30.getClockTick();
    java.util.ArrayList var32 = var30.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var33 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var34 = var33.getClockTick();
    java.util.ArrayList var35 = var33.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var36 = new at.fhhagenberg.sqe.elevator.model.Elevator(var32, var35);
    var26.setCarts(var35);
    var17.setFloorButtonsUp(var35);
    at.fhhagenberg.sqe.elevator.model.Elevator var48 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var49 = var48.getClockTick();
    java.util.ArrayList var50 = var48.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var51 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var52 = var51.getClockTick();
    java.util.ArrayList var53 = var51.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator(var50, var53);
    at.fhhagenberg.sqe.elevator.model.Elevator var55 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var56 = var55.getClockTick();
    java.util.ArrayList var57 = var55.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var58 = new at.fhhagenberg.sqe.elevator.model.Elevator(var53, var57);
    var17.addElevatorBox(1, 100, (-1), 100, 0, 2, 0, 0, (-1), var53);
    var0.setFloors(var53);
    int var62 = var0.getElevatorAccel(1);
    long var63 = var0.getClockTick();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0L);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test153");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    var62.setElevatorSpeed((-1));
    int var70 = var62.getElevatorSpeed();
    var62.setElevatorWeight(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test154");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    int var68 = var62.getElevatorAccel();
    int var69 = var62.getElevatorPosition();
    var62.addElevatorPressedButtons(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 10);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test155");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    int var3 = var0.getElevatorAccel(100);
    int var5 = var0.getElevatorSpeed(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test156");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    var1.setSpeed(0);
    var1.setCommitedDirection(2);
    var1.setSpeed(100);
    int var10 = var1.getElevatorDirection();
    int var11 = var1.getElevatorDirection();
    boolean var13 = var1.getElevatorButton(9);
    boolean var15 = var1.getElevatorButton(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test157");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    var1.setSpeed(2);
    int var6 = var1.getDoorStatus();
    boolean var8 = var1.getElevatorButton(10);
    int var9 = var1.getWeight();
    var1.moveDown();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test158");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    boolean var8 = var0.getServicesFloors(1, 1);
    int var10 = var0.getElevatorWeight((-1));
    int var12 = var0.getElevatorWeight(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var14 = var0.getElevatorFloor(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test159");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    var1.setSpeed(2);
    var1.setCommitedDirection(10);
    var1.setSpeed(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test160");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    var1.setSpeed(0);
    var1.setCommitedDirection(2);
    var1.setSpeed(100);
    var1.addDestination((java.lang.Integer)10);
    boolean var13 = var1.getElevatorButton(0);
    var1.moveUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test161");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var12.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test162");


    at.fhhagenberg.sqe.elevator.model.floor.Floor var0 = new at.fhhagenberg.sqe.elevator.model.floor.Floor();
    boolean var1 = var0.isFloorButtonDownPressed();
    int var2 = var0.getFloorId();
    boolean var3 = var0.isFloorButtonDownPressed();
    boolean var4 = var0.isFloorButtonUpPressed();
    var0.setFloorButtonDownPressed(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test163");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var3 = var2.getClockTick();
    java.util.ArrayList var4 = var2.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var5 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var6 = var5.getClockTick();
    java.util.ArrayList var7 = var5.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var8 = new at.fhhagenberg.sqe.elevator.model.Elevator(var4, var7);
    var0.setCarts(var4);
    int var10 = var0.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var11 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var12 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var13 = var12.getClockTick();
    java.util.ArrayList var14 = var12.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var15 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var16 = var15.getClockTick();
    java.util.ArrayList var17 = var15.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator(var14, var17);
    var11.setFloorButtonsUp(var14);
    var0.setFloors(var14);
    var0.setServicesFloors((-1), 100, false);
    int var25 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var27 = var0.getElevatorDoorStatus(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 10);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test164");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    var62.setElevatorSpeed((-1));
    var62.setElevatorClosestFloor(1);
    var62.setElevatorCapacity((-1));
    var62.setElevatorPosition(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test165");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test166");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getElevatorNum();
    int var6 = var0.getFloorNum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test167");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)(-1));

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test168");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    var1.setCommitedDirection((-1));
    var1.move();
    int var5 = var1.getCurrentFloor();
    int var6 = var1.getWeight();
    int var7 = var1.getElevatorDirection();
    var1.setSpeed(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test169");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    java.util.ArrayList var2 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var3 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var4 = var3.getClockTick();
    java.util.ArrayList var5 = var3.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator(var2, var5);
    long var7 = var6.getClockTick();
    boolean var9 = var6.getFloorButtonUp((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var6.getElevatorFloor(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test170");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    int var3 = var0.getFloorHeight();
    int var5 = var0.getElevatorAccel(2);
    long var6 = var0.getClockTick();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test171");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    boolean var13 = var12.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test172");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    var1.setSpeed(0);
    int var6 = var1.getCurrentFloor();
    boolean var8 = var1.getElevatorButton(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test173");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    java.util.ArrayList var11 = var9.getCarts();
    var0.setFloorButtonsDown(var11);
    java.util.ArrayList var13 = var0.getElevatorBoxesList();
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var16 = var14.getElevatorAccel(1);
    java.util.ArrayList var17 = var14.getCarts();
    boolean var20 = var14.getServicesFloors((-1), (-1));
    int var21 = var14.getFloorHeight();
    int var22 = var14.getElevatorNum();
    at.fhhagenberg.sqe.elevator.model.Elevator var23 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var25 = var23.getElevatorAccel(1);
    java.util.ArrayList var26 = var23.getCarts();
    boolean var29 = var23.getServicesFloors((-1), (-1));
    int var30 = var23.getFloorHeight();
    int var31 = var23.getElevatorNum();
    java.util.ArrayList var32 = var23.getFloors();
    var14.setCarts(var32);
    var0.setFloorButtonsDown(var32);
    at.fhhagenberg.sqe.elevator.model.Elevator var44 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var46 = var44.getElevatorAccel(1);
    java.util.ArrayList var47 = var44.getCarts();
    boolean var50 = var44.getServicesFloors((-1), (-1));
    int var51 = var44.getFloorHeight();
    int var52 = var44.getElevatorNum();
    java.util.ArrayList var53 = var44.getFloors();
    var0.addElevatorBox(0, 100, 2, 2, 0, 0, 9, 10, 0, var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test174");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    int var4 = var0.getElevatorNum();
    var0.setServicesFloors(100, 0, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var0.getElevatorDoorStatus(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test175");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    int var3 = var0.getElevatorCapacity((-1));
    int var4 = var0.getElevatorNum();
    boolean var6 = var0.getFloorButtonDown((-1));
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var7 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var7.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test176");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    var62.setElevatorSpeed((-1));
    int var70 = var62.getElevatorSpeed();
    int var71 = var62.getElevatorDir();
    var62.setElevatorCapacity(100);
    java.util.ArrayList var74 = var62.getElevatorPressedButtons();
    at.fhhagenberg.sqe.elevator.model.Elevator var75 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var76 = var75.getClockTick();
    java.util.ArrayList var77 = var75.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var78 = new at.fhhagenberg.sqe.elevator.model.Elevator(var74, var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test177");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.deleteObservers();
    var1.start();
    var1.start();
    var1.notifyObservers();
    var1.stop();
    var1.deleteObservers();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var10 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var12 = var11.getClockTick();
    java.util.ArrayList var13 = var11.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var15 = var14.getClockTick();
    java.util.ArrayList var16 = var14.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator(var13, var16);
    var10.setFloorButtonsUp(var13);
    at.fhhagenberg.sqe.elevator.model.Elevator var28 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var29 = var28.getClockTick();
    java.util.ArrayList var30 = var28.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var31 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var32 = var31.getClockTick();
    java.util.ArrayList var33 = var31.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var34 = new at.fhhagenberg.sqe.elevator.model.Elevator(var30, var33);
    var10.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var33);
    at.fhhagenberg.sqe.elevator.model.Elevator var45 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var46 = var45.getClockTick();
    java.util.ArrayList var47 = var45.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var48 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var49 = var48.getClockTick();
    java.util.ArrayList var50 = var48.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var51 = new at.fhhagenberg.sqe.elevator.model.Elevator(var47, var50);
    var10.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var50);
    at.fhhagenberg.sqe.elevator.model.Elevator var62 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var63 = var62.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var64 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var65 = var64.getClockTick();
    java.util.ArrayList var66 = var64.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var67 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var68 = var67.getClockTick();
    java.util.ArrayList var69 = var67.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var70 = new at.fhhagenberg.sqe.elevator.model.Elevator(var66, var69);
    var62.setCarts(var66);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var72 = var10.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var66);
    var72.addElevatorPressedButtons(true);
    int var75 = var72.getElevatorAccel();
    var72.addElevatorPressedButtons(true);
    var72.setElevatorSpeed((-1));
    int var80 = var72.getElevatorSpeed();
    var72.setElevatorPosition(0);
    int var83 = var72.getElevatorSpeed();
    var72.addElevatorPressedButtons(true);
    var1.notifyObservers((java.lang.Object)var72);
    int var87 = var72.getElevatorAccel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == (-1));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test178");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    int var4 = var0.getElevatorNum();
    var0.setServicesFloors(0, 10, true);
    java.util.ArrayList var9 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var10 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var12 = var11.getClockTick();
    java.util.ArrayList var13 = var11.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var14 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var15 = var14.getClockTick();
    java.util.ArrayList var16 = var14.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator(var13, var16);
    var10.setFloorButtonsUp(var13);
    at.fhhagenberg.sqe.elevator.model.Elevator var19 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var21 = var19.getElevatorAccel(1);
    java.util.ArrayList var22 = var19.getCarts();
    var10.setFloorButtonsUp(var22);
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var9, var22);
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var26 = var25.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var27 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var28 = var27.getClockTick();
    java.util.ArrayList var29 = var27.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var30 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var31 = var30.getClockTick();
    java.util.ArrayList var32 = var30.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var33 = new at.fhhagenberg.sqe.elevator.model.Elevator(var29, var32);
    var25.setCarts(var29);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator(var22, var29);
    boolean var38 = var35.getServicesFloors(2, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test179");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    int var3 = var0.getElevatorCapacity((-1));
    int var4 = var0.getElevatorNum();
    var0.setServicesFloors(10, 0, false);
    int var9 = var0.getFloorNum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test180");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    int var66 = var62.getElevatorClosestFloor();
    var62.setElevatorDoorStatus(10);
    var62.setElevatorDoorStatus(2);
    int var71 = var62.getElevatorDoorStatus();
    int var72 = var62.getElevatorSpeed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 2);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test181");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers((java.lang.Object)true);
    var1.stop();
    var1.deleteObservers();
    var1.notifyObservers();
    boolean var7 = var1.hasChanged();
    var1.notifyObservers();
    var1.stop();
    var1.start();
    boolean var11 = var1.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test182");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    var1.setSpeed(2);
    int var6 = var1.getCurrentPayload();
    var1.moveDown();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test183");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    boolean var12 = var9.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var13 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var14 = var13.getClockTick();
    java.util.ArrayList var15 = var13.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var17 = var16.getClockTick();
    java.util.ArrayList var18 = var16.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var19 = new at.fhhagenberg.sqe.elevator.model.Elevator(var15, var18);
    var9.setCarts(var18);
    var0.setFloorButtonsUp(var18);
    java.util.ArrayList var22 = var0.getElevatorBoxesList();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var32 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var33 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var34 = var33.getClockTick();
    java.util.ArrayList var35 = var33.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var36 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var37 = var36.getClockTick();
    java.util.ArrayList var38 = var36.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var39 = new at.fhhagenberg.sqe.elevator.model.Elevator(var35, var38);
    var32.setFloorButtonsUp(var35);
    var0.addElevatorBox(9, 0, 9, (-1), 10, 0, 2, (-1), 100, var35);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var42 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var43 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var44 = var43.getClockTick();
    java.util.ArrayList var45 = var43.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var46 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var47 = var46.getClockTick();
    java.util.ArrayList var48 = var46.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var49 = new at.fhhagenberg.sqe.elevator.model.Elevator(var45, var48);
    var42.setFloorButtonsUp(var45);
    at.fhhagenberg.sqe.elevator.model.Elevator var51 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var52 = var51.getClockTick();
    java.util.ArrayList var53 = var51.getCarts();
    var42.setFloorButtonsDown(var53);
    java.util.ArrayList var55 = var42.getElevatorBoxesList();
    var0.setFloorButtonsDown(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test184");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)2);
    int var2 = var1.getWeight();
    int var3 = var1.getCurrentPayload();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test185");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)9);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test186");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    int var66 = var62.getElevatorClosestFloor();
    var62.setElevatorDoorStatus(10);
    var62.setElevatorWeight(100);
    var62.setElevatorPosition(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var73 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var74 = var73.getClockTick();
    boolean var76 = var73.getFloorButtonDown(100);
    int var77 = var73.getElevatorNum();
    int var78 = var73.getFloorNum();
    int var79 = var73.getFloorNum();
    int var80 = var73.getElevatorNum();
    int var81 = var73.getFloorNum();
    java.util.ArrayList var82 = var73.getFloors();
    var62.setElevatorPressedButtons(var82);
    java.util.ArrayList var84 = var62.getElevatorPressedButtons();
    int var85 = var62.getElevatorCapacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 100);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test187");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    int var64 = var62.getTargetFloor();
    int var65 = var62.getElevatorClosestFloor();
    var62.addElevatorPressedButtons(true);
    var62.addElevatorPressedButtons(false);
    var62.setElevatorAccel(0);
    int var72 = var62.getElevatorClosestFloor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 10);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test188");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers();
    var1.readValues();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    long var11 = var10.getClockTick();
    boolean var13 = var10.getFloorButtonUp((-1));
    var1.notifyObservers((java.lang.Object)var13);
    boolean var15 = var1.hasChanged();
    var1.deleteObservers();
    var1.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test189");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    java.util.ArrayList var3 = var0.getCarts();
    boolean var6 = var0.getServicesFloors((-1), (-1));
    int var7 = var0.getFloorHeight();
    int var8 = var0.getElevatorNum();
    int var9 = var0.getElevatorNum();
    int var10 = var0.getFloorNum();
    boolean var12 = var0.getFloorButtonDown(2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var0.getElevatorButton((-1), 9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test190");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    at.fhhagenberg.sqe.elevator.model.Elevator var64 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var65 = var64.getClockTick();
    boolean var67 = var64.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var68 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var69 = var68.getClockTick();
    java.util.ArrayList var70 = var68.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var71 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var72 = var71.getClockTick();
    java.util.ArrayList var73 = var71.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var74 = new at.fhhagenberg.sqe.elevator.model.Elevator(var70, var73);
    var64.setCarts(var73);
    var62.setElevatorPressedButtons(var73);
    var62.setElevatorCapacity(0);
    var62.setElevatorClosestFloor(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test191");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    int var4 = var0.getElevatorNum();
    var0.setServicesFloors(0, 10, true);
    boolean var11 = var0.getServicesFloors(0, 2);
    java.util.ArrayList var12 = var0.getCarts();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test192");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    var1.setSpeed(2);
    int var4 = var1.getCurrentPayload();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test193");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.setElevatorAccel(100);
    var62.setElevatorDoorStatus(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test194");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    int var6 = var0.getFloorNum();
    int var7 = var0.getElevatorNum();
    int var8 = var0.getFloorNum();
    java.util.ArrayList var9 = var0.getFloors();
    int var11 = var0.getElevatorWeight(2);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var12.stop();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test195");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    java.util.ArrayList var6 = var0.getFloors();
    int var7 = var0.getFloorNum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test196");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    int var66 = var62.getElevatorClosestFloor();
    var62.setElevatorClosestFloor((-1));
    int var69 = var62.getElevatorAccel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test197");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.setElevatorPosition(2);
    var62.setElevatorCapacity((-1));
    int var70 = var62.getElevatorClosestFloor();
    var62.setElevatorDir(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 10);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test198");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var8 = var7.getClockTick();
    java.util.ArrayList var9 = var7.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var10 = new at.fhhagenberg.sqe.elevator.model.Elevator(var6, var9);
    var0.setCarts(var9);
    var0.setServicesFloors(100, 2, false);
    int var16 = var0.getFloorNum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var18 = var0.getElevatorDoorStatus(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test199");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    int var64 = var62.getTargetFloor();
    int var65 = var62.getElevatorClosestFloor();
    var62.setElevatorCapacity(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 10);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test200");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var5 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var6 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var7 = var6.getClockTick();
    java.util.ArrayList var8 = var6.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    java.util.ArrayList var11 = var9.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var12 = new at.fhhagenberg.sqe.elevator.model.Elevator(var8, var11);
    var5.setFloorButtonsUp(var8);
    var0.setCarts(var8);
    int var15 = var0.getElevatorNum();
    int var16 = var0.getFloorNum();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var17 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var17.setFloorButtonsUp(var20);
    at.fhhagenberg.sqe.elevator.model.Elevator var26 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var27 = var26.getClockTick();
    boolean var29 = var26.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var30 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var31 = var30.getClockTick();
    java.util.ArrayList var32 = var30.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var33 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var34 = var33.getClockTick();
    java.util.ArrayList var35 = var33.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var36 = new at.fhhagenberg.sqe.elevator.model.Elevator(var32, var35);
    var26.setCarts(var35);
    var17.setFloorButtonsUp(var35);
    at.fhhagenberg.sqe.elevator.model.Elevator var48 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var49 = var48.getClockTick();
    java.util.ArrayList var50 = var48.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var51 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var52 = var51.getClockTick();
    java.util.ArrayList var53 = var51.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator(var50, var53);
    at.fhhagenberg.sqe.elevator.model.Elevator var55 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var56 = var55.getClockTick();
    java.util.ArrayList var57 = var55.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var58 = new at.fhhagenberg.sqe.elevator.model.Elevator(var53, var57);
    var17.addElevatorBox(1, 100, (-1), 100, 0, 2, 0, 0, (-1), var53);
    var0.setFloors(var53);
    at.fhhagenberg.sqe.elevator.model.Elevator var61 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var62 = var61.getClockTick();
    boolean var64 = var61.getFloorButtonDown(100);
    int var65 = var61.getElevatorNum();
    var61.setServicesFloors(0, 10, true);
    java.util.ArrayList var70 = var61.getCarts();
    var0.setFloors(var70);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var72 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var73 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var74 = var73.getClockTick();
    java.util.ArrayList var75 = var73.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var76 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var77 = var76.getClockTick();
    java.util.ArrayList var78 = var76.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var79 = new at.fhhagenberg.sqe.elevator.model.Elevator(var75, var78);
    var72.setFloorButtonsUp(var75);
    at.fhhagenberg.sqe.elevator.model.Elevator var81 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var82 = var81.getClockTick();
    boolean var84 = var81.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var85 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var86 = var85.getClockTick();
    java.util.ArrayList var87 = var85.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var88 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var89 = var88.getClockTick();
    java.util.ArrayList var90 = var88.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var91 = new at.fhhagenberg.sqe.elevator.model.Elevator(var87, var90);
    var81.setCarts(var90);
    var72.setFloorButtonsUp(var90);
    java.util.ArrayList var94 = var72.getElevatorBoxesList();
    var0.setFloors(var94);
    int var96 = var0.getFloorNum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 10);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test201");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    var1.setCommitedDirection(0);
    int var4 = var1.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test202");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var2 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var3 = var2.getClockTick();
    java.util.ArrayList var4 = var2.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var5 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var6 = var5.getClockTick();
    java.util.ArrayList var7 = var5.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var8 = new at.fhhagenberg.sqe.elevator.model.Elevator(var4, var7);
    var0.setCarts(var4);
    int var11 = var0.getElevatorCapacity(1);
    int var13 = var0.getElevatorAccel(2);
    int var15 = var0.getElevatorCapacity((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTarget(100, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test203");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    int var4 = var0.getElevatorNum();
    var0.setServicesFloors(0, 10, true);
    java.util.ArrayList var9 = var0.getCarts();
    int var10 = var0.getElevatorNum();
    int var11 = var0.getFloorHeight();
    boolean var13 = var0.getFloorButtonUp((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var15 = var0.getTarget(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test204");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    var1.setSpeed(0);
    var1.setCommitedDirection(2);
    var1.setSpeed(100);
    var1.addDestination((java.lang.Integer)10);
    int var12 = var1.getWeight();
    int var13 = var1.getDoorStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test205");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.ElevatorData var18 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var19 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var20 = var19.getClockTick();
    java.util.ArrayList var21 = var19.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var22 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var23 = var22.getClockTick();
    java.util.ArrayList var24 = var22.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var25 = new at.fhhagenberg.sqe.elevator.model.Elevator(var21, var24);
    var18.setFloorButtonsUp(var21);
    at.fhhagenberg.sqe.elevator.model.Elevator var36 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var37 = var36.getClockTick();
    java.util.ArrayList var38 = var36.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var39 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var40 = var39.getClockTick();
    java.util.ArrayList var41 = var39.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var42 = new at.fhhagenberg.sqe.elevator.model.Elevator(var38, var41);
    var18.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var41);
    at.fhhagenberg.sqe.elevator.model.Elevator var53 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var54 = var53.getClockTick();
    java.util.ArrayList var55 = var53.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var56 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var57 = var56.getClockTick();
    java.util.ArrayList var58 = var56.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var59 = new at.fhhagenberg.sqe.elevator.model.Elevator(var55, var58);
    var18.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var58);
    at.fhhagenberg.sqe.elevator.model.Elevator var70 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var71 = var70.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var72 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var73 = var72.getClockTick();
    java.util.ArrayList var74 = var72.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var75 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var76 = var75.getClockTick();
    java.util.ArrayList var77 = var75.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var78 = new at.fhhagenberg.sqe.elevator.model.Elevator(var74, var77);
    var70.setCarts(var74);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var80 = var18.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var74);
    at.fhhagenberg.sqe.elevator.model.Elevator var81 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var82 = var81.getClockTick();
    java.util.ArrayList var83 = var81.getCarts();
    var80.setElevatorPressedButtons(var83);
    var80.setElevatorCapacity(1);
    var80.setElevatorPosition(1);
    int var89 = var80.getElevatorDoorStatus();
    var80.setElevatorDir((-1));
    java.util.ArrayList var92 = var80.getElevatorPressedButtons();
    var0.addElevatorBox(100, 9, 2, 2, 0, 0, 100, 10, 0, var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test206");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    int var63 = var62.getElevatorPosition();
    int var64 = var62.getElevatorPosition();
    var62.addElevatorPressedButtons(false);
    var62.addElevatorPressedButtons(false);
    var62.addElevatorPressedButtons(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 10);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test207");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)0);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test208");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getElevatorFloor(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test209");


    at.fhhagenberg.sqe.elevator.model.ElevatorCart var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorCart((java.lang.Integer)10);
    boolean var3 = var1.getElevatorButton(10);
    var1.setSpeed(2);
    var1.setCommitedDirection(10);
    var1.setSpeed(1);
    var1.setSpeed(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test210");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    boolean var3 = var0.getServicesFloors(100, 100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    java.util.ArrayList var6 = var0.getFloors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.getElevatorPosition(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test211");


    at.fhhagenberg.sqe.elevator.model.ElevatorAdapter var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorAdapter();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers();
    boolean var3 = var1.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test212");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    java.util.ArrayList var3 = var0.getCarts();
    boolean var6 = var0.getServicesFloors((-1), (-1));
    int var7 = var0.getFloorHeight();
    int var8 = var0.getElevatorNum();
    int var9 = var0.getFloorHeight();
    int var11 = var0.getElevatorWeight(100);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test213");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var1 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    var1.notifyObservers();
    var1.stop();
    int var4 = var1.countObservers();
    var1.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test214");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    int var2 = var0.getElevatorAccel(1);
    java.util.ArrayList var3 = var0.getCarts();
    at.fhhagenberg.sqe.elevator.model.ElevatorData var4 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var5 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var6 = var5.getClockTick();
    java.util.ArrayList var7 = var5.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var8 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var9 = var8.getClockTick();
    java.util.ArrayList var10 = var8.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var11 = new at.fhhagenberg.sqe.elevator.model.Elevator(var7, var10);
    var4.setFloorButtonsUp(var7);
    at.fhhagenberg.sqe.elevator.model.Elevator var13 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var14 = var13.getClockTick();
    java.util.ArrayList var15 = var13.getCarts();
    var4.setFloorButtonsDown(var15);
    at.fhhagenberg.sqe.elevator.model.Elevator var17 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var19 = var17.getTarget(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test215");


    at.fhhagenberg.sqe.elevator.model.Elevator var0 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var1 = var0.getClockTick();
    boolean var3 = var0.getFloorButtonDown(100);
    int var4 = var0.getElevatorNum();
    int var5 = var0.getFloorNum();
    int var6 = var0.getFloorNum();
    int var7 = var0.getElevatorNum();
    int var8 = var0.getFloorNum();
    java.util.ArrayList var9 = var0.getFloors();
    int var11 = var0.getElevatorWeight(2);
    at.fhhagenberg.sqe.elevator.model.ElevatorObservable var12 = new at.fhhagenberg.sqe.elevator.model.ElevatorObservable((sqelevator.IElevator)var0);
    boolean var14 = var0.getFloorButtonUp((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test216");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var9 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var10 = var9.getClockTick();
    boolean var12 = var9.getFloorButtonDown(100);
    at.fhhagenberg.sqe.elevator.model.Elevator var13 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var14 = var13.getClockTick();
    java.util.ArrayList var15 = var13.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var16 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var17 = var16.getClockTick();
    java.util.ArrayList var18 = var16.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var19 = new at.fhhagenberg.sqe.elevator.model.Elevator(var15, var18);
    var9.setCarts(var18);
    var0.setFloorButtonsUp(var18);
    at.fhhagenberg.sqe.elevator.model.Elevator var31 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var32 = var31.getClockTick();
    java.util.ArrayList var33 = var31.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var34 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var35 = var34.getClockTick();
    java.util.ArrayList var36 = var34.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var37 = new at.fhhagenberg.sqe.elevator.model.Elevator(var33, var36);
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var36, var40);
    var0.addElevatorBox(1, 100, (-1), 100, 0, 2, 0, 0, (-1), var36);
    java.util.ArrayList var43 = var0.getElevatorBoxesList();
    java.util.ArrayList var44 = var0.getElevatorBoxesList();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test217");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    at.fhhagenberg.sqe.elevator.model.Elevator var63 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var64 = var63.getClockTick();
    java.util.ArrayList var65 = var63.getCarts();
    var62.setElevatorPressedButtons(var65);
    var62.setElevatorCapacity(1);
    var62.setElevatorPosition(1);
    int var71 = var62.getElevatorDoorStatus();
    var62.setElevatorDir((-1));
    int var74 = var62.getTargetFloor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 2);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nElevatorTests1.test218");


    at.fhhagenberg.sqe.elevator.model.ElevatorData var0 = new at.fhhagenberg.sqe.elevator.model.ElevatorData();
    at.fhhagenberg.sqe.elevator.model.Elevator var1 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var2 = var1.getClockTick();
    java.util.ArrayList var3 = var1.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var4 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var5 = var4.getClockTick();
    java.util.ArrayList var6 = var4.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var7 = new at.fhhagenberg.sqe.elevator.model.Elevator(var3, var6);
    var0.setFloorButtonsUp(var3);
    at.fhhagenberg.sqe.elevator.model.Elevator var18 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var19 = var18.getClockTick();
    java.util.ArrayList var20 = var18.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var21 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var22 = var21.getClockTick();
    java.util.ArrayList var23 = var21.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var24 = new at.fhhagenberg.sqe.elevator.model.Elevator(var20, var23);
    var0.addElevatorBox((-1), (-1), 1, (-1), 10, 0, 1, 10, 100, var23);
    at.fhhagenberg.sqe.elevator.model.Elevator var35 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var36 = var35.getClockTick();
    java.util.ArrayList var37 = var35.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var38 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var39 = var38.getClockTick();
    java.util.ArrayList var40 = var38.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var41 = new at.fhhagenberg.sqe.elevator.model.Elevator(var37, var40);
    var0.addElevatorBox(100, 10, 10, 2, 10, 10, 2, 1, 10, var40);
    at.fhhagenberg.sqe.elevator.model.Elevator var52 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var53 = var52.getClockTick();
    at.fhhagenberg.sqe.elevator.model.Elevator var54 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var55 = var54.getClockTick();
    java.util.ArrayList var56 = var54.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var57 = new at.fhhagenberg.sqe.elevator.model.Elevator();
    long var58 = var57.getClockTick();
    java.util.ArrayList var59 = var57.getCarts();
    at.fhhagenberg.sqe.elevator.model.Elevator var60 = new at.fhhagenberg.sqe.elevator.model.Elevator(var56, var59);
    var52.setCarts(var56);
    at.fhhagenberg.sqe.elevator.model.ElevatorData.ElevatorBox var62 = var0.new ElevatorBox(10, (-1), 100, 10, 10, 2, 0, 100, 2, var56);
    var62.addElevatorPressedButtons(true);
    int var65 = var62.getElevatorAccel();
    var62.addElevatorPressedButtons(true);
    var62.setElevatorSpeed((-1));
    var62.setElevatorClosestFloor(1);
    var62.setElevatorCapacity((-1));
    var62.setElevatorAccel(9);
    int var76 = var62.getElevatorWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);

  }

}
