package test.com.Zihao.hashTab; 

import com.Zihao.hashTab.HashNode;
import com.Zihao.hashTab.HashTab;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* HashTab Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 5, 2021</pre> 
* @version 1.0 
*/ 
public class HashTabTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
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
* Method: getHashLinkedLists() 
* 
*/ 
@Test
public void testGetHashLinkedLists() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setHashLinkedLists(HashLinkedList[] hashLinkedLists) 
* 
*/ 
@Test
public void testSetHashLinkedLists() throws Exception { 
//TODO: Test goes here... 
}

@Test
public void testHashTab() throws Exception{
    HashTab hashTab = new HashTab(10);
    HashNode<Integer> hashNode1 = new HashNode<>(1, 11);
    HashNode<Integer> hashNode2 = new HashNode<>(2, 22);
    HashNode<String> hashNode3 = new HashNode<>(11, "11");
    HashNode<String> hashNode4 = new HashNode<>(22, "22");
    hashTab.add(hashNode1);
    hashTab.add(hashNode2);
    hashTab.add(hashNode3);
    hashTab.add(hashNode4);
    System.out.println(hashTab.find(11));
    System.out.println(hashTab.find(22));
    System.out.println(hashTab.find(3));
    HashNode<String> hashNode5 = new HashNode<>(22, "33");
    hashTab.modify(hashNode5);
    System.out.println(hashTab);
    hashTab.remove(1);
    System.out.println(hashTab);
}


} 
