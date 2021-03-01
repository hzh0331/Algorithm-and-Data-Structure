package test.com.Zihao.sort; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static com.Zihao.sort.BubbleSortDemo.bubbleSort;

/** 
* BubbleSortDemo Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 28, 2021</pre> 
* @version 1.0 
*/ 
public class BubbleSortDemoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: bubbleSort(int[] list) 
* 
*/ 
@Test
public void testBubbleSort() throws Exception { 
//TODO: Test goes here...
    int list[] = {5,3,2,1,4};
    int result[] =  {1,2,3,4,5};
    bubbleSort(list);
    Assert.assertArrayEquals(result , list);

    list = new int[]{3, 3, 2, 1, 4, 5, 7};
    bubbleSort(list);
    Assert.assertArrayEquals(new int[]{1,2,3,3,4,5,7} ,list);
//    Assert.assertEquals(new int[5]{1,2,3,4,5}, list);
} 


} 
