package com.logic.java.test;

import java.io.Serializable;

/**
 * Project : TestLogicSnippet
 * @author dillip.das
 *
 * SingletonTest.java
 * 4 Feb 2022 21:51:07
 * 
 *<p>
 */
public class SingletonTest implements Serializable, Cloneable {

  /**
   * The serialVersionUID
   */
  private static final long serialVersionUID = -5281245193667558911L;

  private static SingletonTest instance;

  private SingletonTest() {
    //Prevent from reflection
    if (instance != null) {
      throw new IllegalStateException("Creating of this object is not allowed.");
    }

  }

  public static SingletonTest getInstance() {
    //Check whether instance is null or not
    if (instance == null) {
      //Locking the class object
      synchronized (SingletonTest.class) {
        /*Doing double check for the instance.
        This is required in case first time two threads simultaneously invoke getInstance().
        So when another thread get the lock,it should not create the
        object again as its already created by the previous thread.*/
        if (instance == null) {
          instance = new SingletonTest();
        }
      }
    }
    return instance;
  }

  //Prevent from Object Serialization
  protected Object readResolve() {
    return instance;
  }

  //Prevent from Object Cloning
  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }

}
