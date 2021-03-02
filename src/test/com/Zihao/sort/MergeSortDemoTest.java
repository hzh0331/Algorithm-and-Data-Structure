package test.com.Zihao.sort; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import com.Zihao.sort.MergeSortDemo.*;

import static com.Zihao.sort.MergeSortDemo.mergeSort;


/** 
* MergeSortDemo Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 1, 2021</pre> 
* @version 1.0 
*/ 
public class MergeSortDemoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: mergeSort(int[] list, int left, int right) 
* 
*/ 
@Test
public void testMergeSort() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: merge(int[] list, int left, int mid, int right) 
* 
*/ 
@Test
public void testMerge() throws Exception { 
//TODO: Test goes here...
    int list[] = {5,3,2,1,4};
    int result[] =  {1,2,3,4,5};
    mergeSort(list, 0, 4);
    Assert.assertArrayEquals(result , list);

    list = new int[]{3, 3, 2, 1, 4, 5, 7};
    mergeSort(list, 0, 6);
    Assert.assertArrayEquals(new int[]{1,2,3,3,4,5,7} ,list);
}


} 
