package test.com.Zihao.tree; 

import com.Zihao.tree.BinaryTree;
import com.Zihao.tree.Node;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* BinaryTree Tester. 
* 
* @author <Authors name> 
* @since <pre>6月 2, 2021</pre> 
* @version 1.0 
*/ 
public class BinaryTreeTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: remove(T value) 
* 
*/ 
@Test
public void testRemoveValue() throws Exception { 
//TODO: Test goes here...
    Node<Integer> root = new Node<>(0);
    Node<Integer> node1 = new Node<>(1);
    Node<Integer> node2 = new Node<>(2);
    Node<Integer> node3 = new Node<>(3);
    node2.setLeft(node3);
    root.setLeft(node1);
    root.setRight(node2);
    root.inOrderTraversal();
    BinaryTree<Integer> binaryTree = new BinaryTree<>(root);
    System.out.println(binaryTree.remove(3));
    root.inOrderTraversal();
    System.out.println(binaryTree.remove(4));
    root.inOrderTraversal();
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

/** 
* 
* Method: add(T value) 
* 
*/ 
@Test
public void testAdd() throws Exception { 
//TODO: Test goes here... 
} 


} 
