package test.com.Zihao.tree; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static com.Zihao.tree.HuffmanTree.createHuffmanTree;

/** 
* HuffmanTree Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 12, 2021</pre> 
* @version 1.0 
*/ 
public class HuffmanTreeTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: createHuffmanTree(int[] arr) 
* 
*/ 
@Test
public void testCreateHuffmanTree() throws Exception { 
//TODO: Test goes here...
    int arr[] = {13, 7, 8, 3, 29, 6, 1};
    createHuffmanTree(arr);
} 


} 
