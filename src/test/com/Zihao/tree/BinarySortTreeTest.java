package test.com.Zihao.tree; 

import com.Zihao.tree.BinarySortTree;
import com.Zihao.tree.Node;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* BinarySortTree Tester. 
* 
* @author <Authors name> 
* @since <pre>6月 3, 2021</pre> 
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
public void testAddValue() throws Exception { 
//TODO: Test goes here...
    BinarySortTree<Integer> binarySortTree = new BinarySortTree<>();
    binarySortTree.add(0);
    binarySortTree.add(1);
    binarySortTree.add(2);
    binarySortTree.add(-1);
    binarySortTree.inOrderTraversal();
    System.out.println();
    binarySortTree = new BinarySortTree<>();
    binarySortTree.add(4);
    binarySortTree.add(2);
    binarySortTree.add(6);
    binarySortTree.add(1);
    binarySortTree.add(3);
    binarySortTree.add(5);
    binarySortTree.add(7);
    binarySortTree.inOrderTraversal();
} 

/** 
* 
* Method: add(Node<T> node, T value) 
* 
*/ 
@Test
public void testAddForNodeValue() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: remove(T value) 
* 
*/ 
@Test
public void testRemoveValue() throws Exception { 
//TODO: Test goes here...
    BinarySortTree<Integer> binarySortTree = new BinarySortTree<>();
    binarySortTree.add(50);
    binarySortTree.add(30);
    binarySortTree.add(20);
    binarySortTree.add(40);
    binarySortTree.add(70);
    binarySortTree.add(60);
    binarySortTree.add(80);
//    binarySortTree.add(4);
    binarySortTree.remove(20);
    binarySortTree.inOrderTraversal();
    System.out.println();
    binarySortTree.remove(30);
    binarySortTree.inOrderTraversal();
    System.out.println();
    binarySortTree.remove(50);
    binarySortTree.inOrderTraversal();
} 

/** 
* 
* Method: remove(Node<T> node, T value) 
* 
*/ 
@Test
public void testRemoveForNodeValue() throws Exception { 
//TODO: Test goes here... 
} 


} 
