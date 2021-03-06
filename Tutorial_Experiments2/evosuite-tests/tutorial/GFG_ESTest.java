/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 10 00:20:09 GMT 2018
 */

package tutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import tutorial.GFG;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GFG_ESTest extends GFG_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      GFG.smallestPermutation("t|t>wr/al.GF#", 1, (-1));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = GFG.smallestPermutation("oIxwJZ_dn-~", (-2105), (-2105));
      assertEquals("Impossible", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = GFG.smallestPermutation("^9qTXf\"8JWa.", 0, 0);
      assertEquals("\".89JTWX^afq", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GFG gFG0 = new GFG();
  }
}
