package test.com.Zihao.tree; 

import com.Zihao.tree.BinaryTree;
import com.Zihao.tree.TreeNode;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* BinaryTree Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 5, 2021</pre> 
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
* Method: getRoot() 
* 
*/ 
@Test
public void testGetRoot() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setRoot(TreeNode root) 
* 
*/ 
@Test
public void testSetRoot() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: preOrder() 
* 
*/ 
@Test
public void testPreOrder() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: infixOrder() 
* 
*/ 
@Test
public void testInfixOrder() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: postOrder() 
* 
*/ 
@Test
public void testPostOrder() throws Exception { 
//TODO: Test goes here... 
} 

@Test
public void testOrder() throws Exception{
    BinaryTree binaryTree = new BinaryTree();

    TreeNode<Integer> root = new TreeNode<>(1);
    TreeNode<Integer> treeNode1 = new TreeNode<>(2);
    TreeNode<Integer> treeNode2 = new TreeNode<>(3);
    TreeNode<Integer> treeNode3 = new TreeNode<>(4);
    TreeNode<Integer> treeNode4 = new TreeNode<>(5);

    root.setLeft(treeNode1);
    root.setRight(treeNode2);

    treeNode2.setRight(treeNode3);
    treeNode2.setLeft(treeNode4);

    binaryTree.setRoot(root);

    binaryTree.preOrder();
    System.out.println();

    binaryTree.infixOrder();
    System.out.println();

    binaryTree.postOrder();
    System.out.println();

}

} 
