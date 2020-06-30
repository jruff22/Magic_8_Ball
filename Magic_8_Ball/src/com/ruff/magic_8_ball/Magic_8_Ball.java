package com.ruff.magic_8_ball;

public class Magic_8_Ball {
	
	private String ans0 = "Yes"; 
	private String ans1 = "No!";
	private String ans2 = "Not Likely...";
	private String ans3 = "Please ask again"; 
	
	public Magic_8_Ball() {
		
	}
	
	public String shake() {
		String answer;
		int randomNumber;
		randomNumber = (int) Math.random()*4;
		
		if(randomNumber == 0)
			answer = ans0;
		else if (randomNumber == 1)
			answer = ans1;
		else if (randomNumber == 2)
			answer = ans2;
		else 
			answer = ans3;
		
		
		System.out.println("Your answer is..." + answer);
		return answer;
		
	}

	public String getAns0() {
		return ans0;
	}

	public String getAns1() {
		return ans1;
	}

	public String getAns2() {
		return ans2;
	}

	public String getAns3() {
		return ans3;
	}

}
