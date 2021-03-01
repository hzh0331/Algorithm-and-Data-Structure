package test.com.Zihao.sort; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static com.Zihao.sort.QuickSortDemo.quickSort;
import static com.Zihao.sort.SelectionSortDemo.selectionSort;

/** 
* QuickSortDemo Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 1, 2021</pre> 
* @version 1.0 
*/ 
public class QuickSortDemoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: quickSort(int[] list, int left, int right) 
* 
*/ 
@Test
public void testQuickSort() throws Exception { 
//TODO: Test goes here...
    int list[] = {5,3,2,1,4};
    int result[] =  {1,2,3,4,5};
    quickSort(list, 0, 4);
    Assert.assertArrayEquals(result , list);

    list = new int[]{3, 3, 2, 1, 4, 5, 7};
    quickSort(list, 0, 6);
    Assert.assertArrayEquals(new int[]{1,2,3,3,4,5,7} ,list);
} 


} 
