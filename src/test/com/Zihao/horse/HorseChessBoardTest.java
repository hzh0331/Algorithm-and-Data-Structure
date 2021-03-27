package test.com.Zihao.horse; 

import com.Zihao.horse.HorseChessBoard;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* HorseChessBoard Tester. 
* 
* @author <Authors name> 
* @since <pre>3月 24, 2021</pre> 
* @version 1.0 
*/ 
public class HorseChessBoardTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: next(Point current) 
* 
*/ 
@Test
public void testNext() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: move(int board[][], int step, int x, int y) 
* 
*/ 
@Test
public void testMove() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: show() 
* 
*/ 
@Test
public void testShow() throws Exception { 
//TODO: Test goes here... 
}

@Test
public void test() throws Exception {
//TODO: Test goes here...
    HorseChessBoard horseChessBoard = new HorseChessBoard(8, 8);
    long start = System.currentTimeMillis();
    horseChessBoard.move(horseChessBoard.getBoard(), 1, 0, 0);
    long end = System.currentTimeMillis();
    System.out.println((start - end) + " ms");
    horseChessBoard.show();
}


} 
