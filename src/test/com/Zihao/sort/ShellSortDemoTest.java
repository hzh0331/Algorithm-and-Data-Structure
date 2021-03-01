package test.com.Zihao.sort; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static com.Zihao.sort.SelectionSortDemo.selectionSort;
import static com.Zihao.sort.ShellSortDemo.shellSort;
import static com.Zihao.sort.ShellSortDemo.shellSort2;

/** 
* ShellSortDemo Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 1, 2021</pre> 
* @version 1.0 
*/ 
public class ShellSortDemoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: shellSort(int[] list) 
* 
*/ 
@Test
public void testShellSort() throws Exception { 
//TODO: Test goes here...
    int list[] = {5,3,2,1,4};
    int result[] =  {1,2,3,4,5};
    shellSort(list);
    Assert.assertArrayEquals(result , list);

    list = new int[]{3, 3, 2, 1, 4, 5, 7};
    shellSort(list);
    Assert.assertArrayEquals(new int[]{1,2,3,3,4,5,7} ,list);
}

    @Test
    public void testShellSort2() throws Exception {
//TODO: Test goes here...
        int list[] = {5,3,2,1,4};
        int result[] =  {1,2,3,4,5};
        shellSort2(list);
        Assert.assertArrayEquals(result , list);

        list = new int[]{3, 3, 2, 1, 4, 5, 7};
        shellSort2(list);
        Assert.assertArrayEquals(new int[]{1,2,3,3,4,5,7} ,list);
    }

} 
