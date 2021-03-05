package test.com.Zihao.search; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.Arrays;
import java.util.List;

import static com.Zihao.search.FibonacciSearchDemo.fibonacciSearch;
import static com.Zihao.search.InsertValueSearch.insertValueSearch;

/** 
* FibonacciSearchDemo Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 4, 2021</pre> 
* @version 1.0 
*/ 
public class FibonacciSearchDemoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: fib() 
* 
*/ 
@Test
public void testFib() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: fibonacciSearch(int list[], int target) 
* 
*/ 
@Test
public void testFibonacciSearch() throws Exception { 
//TODO: Test goes here...
    int[] list = new int[]{1,2,11,24,24,24,24,33,77,102,105};
    List<Integer> result = Arrays.asList(3,4,5,6);
    Assert.assertEquals(result,fibonacciSearch(list, 24));
    Assert.assertEquals(Arrays.asList(10),fibonacciSearch(list, 105));
} 


} 
