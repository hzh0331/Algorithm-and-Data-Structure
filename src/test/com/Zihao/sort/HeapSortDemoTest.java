package test.com.Zihao.sort; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static com.Zihao.sort.HeapSortDemo.heapSort;


/** 
* HeapSortDemo Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 9, 2021</pre> 
* @version 1.0 
*/ 
public class HeapSortDemoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: heapSort(int arr[]) 
* 
*/ 
@Test
public void testHeapSort() throws Exception { 
//TODO: Test goes here...
    int list[] = {5,3,2,1,4};
    int result[] =  {1,2,3,4,5};
    heapSort(list);
    Assert.assertArrayEquals(result , list);

    list = new int[]{3, 3, 2, 1, 4, 5, 7};
    heapSort(list);
    Assert.assertArrayEquals(new int[]{1,2,3,3,4,5,7} ,list);
} 

/** 
* 
* Method: adjust(int arr[], int i, int length) 
* 
*/ 
@Test
public void testAdjust() throws Exception { 
//TODO: Test goes here... 
} 


} 
