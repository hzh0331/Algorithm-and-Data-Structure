package test.com.Zihao.stack; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static com.Zihao.stack.Calculator.removeParentheses;
import static org.junit.Assert.assertEquals;

/** 
* Calculator Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 26, 2021</pre> 
* @version 1.0 
*/ 
public class CalculatorTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: isOperator(char current) 
* 
*/ 
@Test
public void testIsOperator() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Calculator.getClass().getMethod("isOperator", char.class); 
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
* Method: priority(int operator) 
* 
*/ 
@Test
public void testPriority() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Calculator.getClass().getMethod("priority", int.class); 
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
* Method: removeParentheses(String expression) 
* 
*/ 
@Test
public void testRemoveParentheses() throws Exception {
//TODO: Test goes here...
    assertEquals("1+5+2",removeParentheses("1+(3+2)+2"));
    assertEquals("1+6+2",removeParentheses("1+(3*2)+2"));
    assertEquals("1+7+2",removeParentheses("1+(3+2*2)+2"));
/* 
try { 
   Method method = Calculator.getClass().getMethod("removeParentheses", String.class); 
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
* Method: calculateWithoutParentheses(String expression) 
* 
*/ 
@Test
public void testCalculateWithoutParentheses() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Calculator.getClass().getMethod("calculateWithoutParentheses", String.class); 
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
* Method: calculate(int num1, int num2, int operator) 
* 
*/ 
@Test
public void testCalculate() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Calculator.getClass().getMethod("calculate", int.class, int.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
