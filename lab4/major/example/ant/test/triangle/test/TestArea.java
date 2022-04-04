package triangle.test;

import junit.framework.TestCase;

public class TestArea extends TestCase {

   public void test1() {
        assertEquals (triangle.UpgradedTriangle.calcArea(-2, -2, -2), 0.0);
   }

   public void test2() {
        assertEquals (triangle.UpgradedTriangle.calcArea(-1, -2, -3), 0.0);
   }

   public void test3() {
        assertEquals (triangle.UpgradedTriangle.calcArea(0, -2, -2), 0.0);
   }

   public void test4() {
        assertEquals (triangle.UpgradedTriangle.calcArea(-2, 0, -2), 0.0);
   }

   public void test5() {
        assertEquals (triangle.UpgradedTriangle.calcArea(-2, -2, 0), 0.0);
   }

   public void test6() {
        assertEquals (triangle.UpgradedTriangle.calcArea(0, 0, 1), 0.0);
   }

   public void test7() {
        assertEquals (triangle.UpgradedTriangle.calcArea(0, 1, 0), 0.0);
   }
   
   public void test8() {
        assertEquals (triangle.UpgradedTriangle.calcArea(1, 1, 1), 0.4330127, 1e-6);
   }
   
   public void test9() {
        assertEquals (triangle.UpgradedTriangle.calcArea(3, 3, 3),3.897114, 1e-6);
   }

   public void test10() {
        assertEquals (triangle.UpgradedTriangle.calcArea(3, 4, 5), 6.0);
   }
   
   public void test11() {
        assertEquals (triangle.UpgradedTriangle.calcArea(5, 12, 13), 30.0);
   }

   public void test12() {
        assertEquals (triangle.UpgradedTriangle.calcArea(4, 2, 2), 0.0);
   }

   public void test13() {
        assertEquals (triangle.UpgradedTriangle.calcArea(-10, -10, -10), 0.0);
   }

   public void test14() {
        assertEquals (triangle.UpgradedTriangle.calcArea(5, 2, 2), 0.0);
   }
   
   public void test15() {
        assertEquals (triangle.UpgradedTriangle.calcArea(-2, 5, 5), 0.0);
   }

}
