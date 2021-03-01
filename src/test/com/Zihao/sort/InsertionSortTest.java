package test.com.Zihao.sort; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static com.Zihao.sort.InsertionSort.InsertionSort;
import static com.Zihao.sort.SelectionSortDemo.selectionSort;

/** 
* InsertionSort Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 28, 2021</pre> 
* @version 1.0 
*/ 
public class InsertionSortTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: InsertionSort(int[] list) 
* 
*/ 
@Test
public void testInsertionSort() throws Exception { 
//TODO: Test goes here...
    int list[] = {5,3,2,1,4};
    int result[] =  {1,2,3,4,5};
    InsertionSort(list);
    Assert.assertArrayEquals(result , list);

    list = new int[]{3, 3, 2, 1, 4, 5, 7};
    InsertionSort(list);
    Assert.assertArrayEquals(new int[]{1,2,3,3,4,5,7} ,list);
}


} 
