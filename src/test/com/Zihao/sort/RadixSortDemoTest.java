package test.com.Zihao.sort; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static com.Zihao.sort.RadixSortDemo.radixSort;
import static com.Zihao.sort.SelectionSortDemo.selectionSort;

/** 
* RadixSortDemo Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 2, 2021</pre> 
* @version 1.0 
*/ 
public class RadixSortDemoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: radixSort(int[] list) 
* 
*/ 
@Test
public void testRadixSort() throws Exception { 
//TODO: Test goes here...
    int list[] = {50,13,2,1,4};
    int result[] =  {1,2,4,13,50};
    radixSort(list);
    Assert.assertArrayEquals(result , list);

    list = new int[]{3, 3, 2, 1, 4, 5, 7};
    radixSort(list);
    Assert.assertArrayEquals(new int[]{1,2,3,3,4,5,7} ,list);
}


} 
