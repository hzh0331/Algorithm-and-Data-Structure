package test.com.Zihao.knapSack; 

import com.Zihao.knapSack.KnapSack;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* knapSack Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 22, 2021</pre> 
* @version 1.0 
*/ 
public class knapSackTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: kanpSack(int max, int itemCount, int[] weight) 
* 
*/ 
@Test
public void testKanpSack() throws Exception { 
//TODO: Test goes here...
    KnapSack knapSack = new KnapSack();
    Assert.assertEquals(3500, knapSack.knapSack(4, new int[]{1, 4, 3}, new int[]{1500, 3000, 2000}));
} 


} 
