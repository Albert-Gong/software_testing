package triangle.test;

import junit.framework.TestCase;
import static triangle.UpgradedTriangle.Type.*;

public class TestClassification extends TestCase {

   public void test1() {
        assertEquals (triangle.UpgradedTriangle.classify(0,1301,1), INVALID);
   }
   public void test2() {
        assertEquals (triangle.UpgradedTriangle.classify(1108,1,1), INVALID);
   }
   public void test3() {
        assertEquals (triangle.UpgradedTriangle.classify(1,0,-665), INVALID);
   }
   public void test4() {
        assertEquals (triangle.UpgradedTriangle.classify(1,1,0), INVALID);
   }
   public void test5() {
        assertEquals (triangle.UpgradedTriangle.classify(582,582,582), EQUILATERAL);
   }
   public void test6() {
        assertEquals (triangle.UpgradedTriangle.classify(1,1088,15), INVALID);
   }
   public void test7() {
        assertEquals (triangle.UpgradedTriangle.classify(1,2,450), INVALID);
   }
   public void test8() {
        assertEquals (triangle.UpgradedTriangle.classify(1663,1088,823), SCALENE);
   }
   public void test9() {
        assertEquals (triangle.UpgradedTriangle.classify(1187,1146,1), INVALID);
   }
   public void test10() {
        assertEquals (triangle.UpgradedTriangle.classify(1640,1640,1956), ISOSCELES);
   }
   public void test11() {
        assertEquals (triangle.UpgradedTriangle.classify(784,784,1956), INVALID);
   }
   public void test12() {
        assertEquals (triangle.UpgradedTriangle.classify(1,450,1), INVALID);
   }
   public void test13() {
        assertEquals (triangle.UpgradedTriangle.classify(1146,1,1146), ISOSCELES);
   }
   public void test14() {
        assertEquals (triangle.UpgradedTriangle.classify(1640,1956,1956), ISOSCELES);
   }
   public void test15() {
        assertEquals (triangle.UpgradedTriangle.classify(-1,1,1), INVALID);
   }
   public void test16() {
        assertEquals (triangle.UpgradedTriangle.classify(1,-1,1), INVALID);
   }
   public void test17() {
        assertEquals (triangle.UpgradedTriangle.classify(1,2,3), INVALID);
   }
   public void test18() {
        assertEquals (triangle.UpgradedTriangle.classify(2,3,1), INVALID);
   }
   public void test19() {
        assertEquals (triangle.UpgradedTriangle.classify(3,1,2), INVALID);
   }
   public void test20() {
        assertEquals (triangle.UpgradedTriangle.classify(1,1,2), INVALID);
   }
   public void test21() {
        assertEquals (triangle.UpgradedTriangle.classify(1,2,1), INVALID);
   }
   public void test22() {
        assertEquals (triangle.UpgradedTriangle.classify(2,1,1), INVALID);
   }
   public void test23() {
        assertEquals (triangle.UpgradedTriangle.classify(1,1,1), EQUILATERAL);
   }
   public void test24() {
        assertEquals (triangle.UpgradedTriangle.classify(0,1,1), INVALID);
   }
   public void test25() {
        assertEquals (triangle.UpgradedTriangle.classify(1,0,1), INVALID);
   }
   public void test26() {
        assertEquals (triangle.UpgradedTriangle.classify(1,2,-1), INVALID);
   }
   public void test27() {
        assertEquals (triangle.UpgradedTriangle.classify(1,1,-1), INVALID);
   }
   public void test28() {
        assertEquals (triangle.UpgradedTriangle.classify(0,0,0), INVALID);
   }
   public void test29() {
        assertEquals (triangle.UpgradedTriangle.classify(3,2,5), INVALID);
   }
   public void test30() {
        assertEquals (triangle.UpgradedTriangle.classify(5,9,2), INVALID);
   }
   public void test31() {
        assertEquals (triangle.UpgradedTriangle.classify(7,4,3), INVALID);
   }
   public void test32() {
        assertEquals (triangle.UpgradedTriangle.classify(3,8,3), INVALID);
   }
   public void test33() {
        assertEquals (triangle.UpgradedTriangle.classify(7,3,3), INVALID);
   }
 

}
