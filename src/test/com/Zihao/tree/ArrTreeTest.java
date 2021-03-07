package test.com.Zihao.tree; 

import com.Zihao.tree.ArrTree;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* ArrTree Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 5, 2021</pre> 
* @version 1.0 
*/ 
public class ArrTreeTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getArr() 
* 
*/ 
@Test
public void testGetArr() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setArr(int[] arr) 
* 
*/ 
@Test
public void testSetArr() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getSize() 
* 
*/ 
@Test
public void testGetSize() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setSize(int size) 
* 
*/ 
@Test
public void testSetSize() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: preOrder(int index) 
* 
*/ 
@Test
public void testPreOrder() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: infixOrder(int index) 
* 
*/ 
@Test
public void testInfixOrder() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: postOrder(int index) 
* 
*/ 
@Test
public void testPostOrder() throws Exception { 
//TODO: Test goes here... 
}

@Test
public void testTravel() throws Exception{
    ArrTree arrTree = new ArrTree(7);
    int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7};
    arrTree.setArr(arr);

    arrTree.preOrder(0);
    System.out.println();
    arrTree.infixOrder(0);
    System.out.println();
    arrTree.postOrder(0);
}


} 
