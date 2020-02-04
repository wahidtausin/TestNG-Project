 package com.db;

import org.testng.annotations.DataProvider;

public class DataReadProvider {
	

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }

}
