package test.com.Zihao.stack; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.Zihao.stack.PolandNotation.*;

/** 
* PolandNotation Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 26, 2021</pre> 
* @version 1.0 
*/ 
public class PolandNotationTest { 

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
* Method: calculate(String suffixExpression) 
* 
*/ 
@Test
public void testCalculate() throws Exception { 
//TODO: Test goes here...
//    Assert.assertEquals(29,calculate("3 4 + 5 * 6 -"));
//    Assert.assertEquals(164,calculate("30 4 + 5 * 6 -"));
//    Assert.assertEquals(76,calculate("4 5 * 8 - 60 + 8 2 / +"));
}

/**
* 
* Method: calculateTwoNumber(int num1, int num2, String operator) 
* 
*/ 
@Test
public void testCalculateTwoNumber() throws Exception { 
//TODO: Test goes here... 
}

    @Test
    public void testToInfixExpressionList() {
        Assert.assertEquals(Arrays.asList("1","+","(","(","2","+","3",")","*","4",")","-","5"),toInfixExpressionList("1+((2+3)*4)-5"));
        Assert.assertEquals(Arrays.asList("100","+","(","(","200","+","3",")","*","4",")","-","5"),toInfixExpressionList("100+((200+3)*4)-5"));
    }

    @Test
    public void testParseSuffixExpressionList() {
        Assert.assertEquals(Arrays.asList("1","2","3","+","4","*","+","5","-") ,parseSuffixExpressionList(Arrays.asList("1","+","(","(","2","+","3",")","*","4",")","-","5")));
    }

    @Test
    public void testCalculation() {
        Assert.assertEquals(10,calculation("3*(1+2)+1"));
        Assert.assertEquals(7,calculation("3*(1*2)+1"));
        Assert.assertEquals(18,calculation("3*(1*2)*3"));
    }
}



