package test.com.Zihao.search; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.Arrays;
import java.util.List;

import static com.Zihao.search.BinarySearchDemo.binarySearchWithMultipleResults;
import static com.Zihao.search.InsertValueSearch.insertValueSearch;

/** 
* InsertValueSearch Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 4, 2021</pre> 
* @version 1.0 
*/ 
public class InsertValueSearchTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: insertValueSearch(int[] list, int left, int right, int target) 
* 
*/ 
@Test
public void testInsertValueSearch() throws Exception { 
//TODO: Test goes here...
    int[] list = new int[]{1,2,11,24,24,24,24,33,77,102,105};
    List<Integer> result = Arrays.asList(3,4,5,6);
    Assert.assertEquals(result,insertValueSearch(list, 0, 10, 24));
    Assert.assertEquals(Arrays.asList(10),insertValueSearch(list, 0, 10, 105));
} 


} 
