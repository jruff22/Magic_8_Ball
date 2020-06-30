package com.ruff.magic_8_ball;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Magic_8_BallTest {
	
	public static Magic_8_Ball ball;

	
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ball = new Magic_8_Ball();
		
	}

	@Test
	void test() {
		ball.getAns0();
		ball.getAns1();
		ball.getAns2();
		ball.getAns3();
		ball.shake();
		
		
		//fail("Not yet implemented");
	}

}
