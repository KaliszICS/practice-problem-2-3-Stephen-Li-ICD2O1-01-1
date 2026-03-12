/*
File: Lesson 2.3 - Creating Test Cases
Author: Stephen Li
Date Created: Mar 12, 2026
Date Last Modified: Mar 12, 2026
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

   @Test
   void Q1testZero() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }

   @Test
   void Q1testOdd() {
      assertEquals((Math.PI*9), PracticeProblem.circleArea(3));
   }

   @Test
   void Q1testEven() {
      assertEquals((Math.PI*100), PracticeProblem.circleArea(10));
   }

   @Test
   void Q1testLargeNumber() {
      assertEquals((Math.PI*784), PracticeProblem.circleArea(28));
   }

   @Test
   void Q1testDouble() {
      assertEquals((Math.PI*27.04), PracticeProblem.circleArea(5.2));
   }

   @Test
   void Q2testZero() {
      assertEquals("0 hours and 0 minutes", PracticeProblem.minutesToHours(0));
   }

   @Test
   void Q2testOdd() {
      assertEquals("2 hours and 7 minutes", PracticeProblem.minutesToHours(127));
   }

   @Test
   void Q2testEven() {
      assertEquals("4 hours and 46 minutes", PracticeProblem.minutesToHours(286));
   }

   @Test
   void Q2testZeroMinutes() {
      assertEquals("17 hours and 0 minutes", PracticeProblem.minutesToHours(1020));
   }

   @Test
   void Q2testZeroHours() {
      assertEquals("0 hours and 12 minutes", PracticeProblem.minutesToHours(12));
   }

   @Test
   void Q3testZero() {
      assertEquals(0, PracticeProblem.simpleInterest(0, 0, 0));
   }

   @Test
   void Q3testZeroRate() {
      assertEquals(0, PracticeProblem.simpleInterest(1000, 0, 3));
   }

   @Test
   void Q3testZeroYears() {
      assertEquals(0, PracticeProblem.simpleInterest(800, 8, 0));
   }

   @Test
   void Q3testZeroPrincipal() {
      assertEquals(0, PracticeProblem.simpleInterest(0, 3, 8));
   }

   @Test
   void Q3testDouble() {
      assertEquals(19.20786, PracticeProblem.simpleInterest(47.31, 5.8, 7));
   }

   @Test
   void Q4testZero() {
      assertEquals(0, PracticeProblem.hypotenuse(0, 0));
   }

   @Test
   void Q4testOneZero() {
      assertEquals(4, PracticeProblem.hypotenuse(0, 4));
   }

   @Test
   void Q4testDouble() {
      assertEquals(14.190489773083945, PracticeProblem.hypotenuse(12.4, 6.9));
   }

   @Test
   void Q4testEqual() {
      assertEquals(8.48528137423857, PracticeProblem.hypotenuse(6, 6));
   }

   @Test
   void Q4testLargeNumber() {
      assertEquals(29.427877939124322, PracticeProblem.hypotenuse(5, 29));
   }
}
