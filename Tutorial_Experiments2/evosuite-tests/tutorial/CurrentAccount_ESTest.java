/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 15 05:52:14 GMT 2018
 */

package tutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import tutorial.CurrentAccount;
import tutorial.Person;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CurrentAccount_ESTest extends CurrentAccount_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Person person0 = new Person("OJl(>Q3vY", "OJl(>Q3vY");
      CurrentAccount currentAccount0 = new CurrentAccount(person0, (-1177));
      boolean boolean0 = currentAccount0.withdraw((-1));
      assertEquals(1, currentAccount0.getBalance());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Person person0 = new Person("7", "7");
      CurrentAccount currentAccount0 = new CurrentAccount(person0, 0);
      currentAccount0.balance = (-867);
      boolean boolean0 = currentAccount0.withdraw(4611);
      assertEquals((-867), currentAccount0.getBalance());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Person person0 = new Person("7", "7");
      CurrentAccount currentAccount0 = new CurrentAccount(person0, 0);
      boolean boolean0 = currentAccount0.withdraw(0);
      assertEquals(0, currentAccount0.getBalance());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Person person0 = new Person("7", "7");
      CurrentAccount currentAccount0 = new CurrentAccount(person0, 0);
      currentAccount0.deposit(4611);
      assertEquals(4611, currentAccount0.getBalance());
  }
}