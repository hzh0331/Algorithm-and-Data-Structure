package test.com.Zihao.binarySearch; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.Arrays;
import java.util.List;

import static com.Zihao.binarySearch.BinarySearchDemo.binarySearch;
import static com.Zihao.binarySearch.BinarySearchDemo.binarySearchWithMultipleResults;


/** 
* BinarySearchDemo Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 4, 2021</pre> 
* @version 1.0 
*/ 
public class BinarySearchDemoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: binarySearch(int[] list, int left, int right, int target) 
* 
*/ 
@Test
public void testBinarySearch() throws Exception { 
//TODO: Test goes here...
    int[] list = new int[]{1,2,11,24,33,77,102,105};
    Assert.assertEquals(2,binarySearch(list, 0, 7, 11));
    Assert.assertEquals(-1,binarySearch(list, 0, 7, 15));
    Assert.assertEquals(7,binarySearch(list, 0, 7, 105));
    Assert.assertEquals(5,binarySearch(list, 0, 7, 77));

}

/**
 *
 * Method: binarySearchWithMultipleResults(int[] list, int left, int right, int target)
 *
 */
@Test
public void testBinarySearchWithMultipleResults() throws Exception {
//TODO: Test goes here...
    int[] list = new int[]{1,2,11,24,24,24,24,33,77,102,105};
    List<Integer> result = Arrays.asList(3,4,5,6);
    Assert.assertEquals(result,binarySearchWithMultipleResults(list, 0, 10, 24));
    Assert.assertEquals(Arrays.asList(10),binarySearchWithMultipleResults(list, 0, 10, 105));
}


} 
