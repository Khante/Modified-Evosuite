/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 10 00:22:01 GMT 2018
 */

package tutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import tutorial.Kruskal;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Kruskal_ESTest extends Kruskal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Kruskal kruskal0 = new Kruskal(0, 0);
      kruskal0.KruskalMST();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Kruskal kruskal0 = new Kruskal(190, 708);
      Kruskal.Edge[] kruskal_EdgeArray0 = new Kruskal.Edge[3];
      Kruskal.Edge kruskal_Edge0 = kruskal0.new Edge();
      kruskal_EdgeArray0[0] = kruskal_Edge0;
      kruskal_Edge0.dest = 1;
      kruskal_EdgeArray0[1] = kruskal_Edge0;
      kruskal0.edge = kruskal_EdgeArray0;
      kruskal_EdgeArray0[2] = kruskal_EdgeArray0[0];
      // Undeclared exception!
      try { 
        kruskal0.KruskalMST();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("tutorial.Kruskal", e);
      }
  }
}
