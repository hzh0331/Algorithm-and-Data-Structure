package test.com.Zihao.tree; 

import com.Zihao.tree.BinarySortTree;
import com.Zihao.tree.BinarySortTreeNode;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
* BinarySearchTree Tester.
*
* @author <Authors name>
* @since <pre>3月 15, 2021</pre>
* @version 1.0
*/
public class BinarySortTreeTest {

@Before
public void before() throws Exception {
}

@After
public void after() throws Exception {
}

/**
*
* Method: add(T value)
*
*/
@Test
public void testAdd() throws Exception {
//TODO: Test goes here...
    int arr[] = {7,3,10,12,5,1,9};
    BinarySortTree<Integer> binarySearchTree = new BinarySortTree();
    for (int i = 0; i < arr.length; i++){
        binarySearchTree.add(arr[i]);
    }
    binarySearchTree.infixOrder();
}

@Test
public void testDelete() throws Exception {
//TODO: Test goes here...
    int arr[] = {7,3,10,12,5,1,9};
    BinarySortTree<Integer> binarySearchTree = new BinarySortTree();
    for (int i = 0; i < arr.length; i++){
        binarySearchTree.add(arr[i]);
    }
    System.out.println(binarySearchTree.delete(7));
    binarySearchTree.infixOrder();
}


} 
