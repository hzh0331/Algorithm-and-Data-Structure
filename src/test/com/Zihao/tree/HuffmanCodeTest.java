package test.com.Zihao.tree; 

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.Arrays;

import static com.Zihao.tree.HuffmanCode.huffmanZip;

/** 
* HuffmanCode Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 14, 2021</pre> 
* @version 1.0 
*/ 
public class HuffmanCodeTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 


/** 
* 
* Method: getNode(byte[] arr) 
* 
*/ 
@Test
public void testGetNode() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = HuffmanCode.getClass().getMethod("getNode", byte[].class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: getCodes(HuffmanTreeNode huffmanTreeNode) 
* 
*/ 
@Test
public void testGetCodesHuffmanTreeNode() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = HuffmanCode.getClass().getMethod("getCodes", HuffmanTreeNode.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: createHuffmanTree(List<HuffmanTreeNode> list) 
* 
*/ 
@Test
public void testCreateHuffmanTree() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = HuffmanCode.getClass().getMethod("createHuffmanTree", List<HuffmanTreeNode>.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: getCodes(HuffmanTreeNode huffmanTreeNode, String code, StringBuilder stringBuilder) 
* 
*/ 
@Test
public void testGetCodesForHuffmanTreeNodeCodeStringBuilder() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = HuffmanCode.getClass().getMethod("getCodes", HuffmanTreeNode.class, String.class, StringBuilder.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: zip(byte[] bytes, Map<Byte, String> map) 
* 
*/ 
@Test
public void testZip() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = HuffmanCode.getClass().getMethod("zip", byte[].class, Map<Byte,.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: huffmanZip(byte[] bytes) 
* 
*/ 
@Test
public void testHuffmanZip() throws Exception {
    String content = "i like like like java do you like a java";
    byte[] bytes = content.getBytes();
    System.out.println(Arrays.toString(huffmanZip(bytes)));
//TODO: Test goes here... 
/* 
try { 
   Method method = HuffmanCode.getClass().getMethod("huffmanZip", byte[].class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
