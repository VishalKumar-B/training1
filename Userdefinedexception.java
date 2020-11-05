package com.Exceptions;

class VotingEligibility extends Exception	{
	void votingEligibility(String msg)	{
		super(msg);
	}
	
}
public class Userdefinedexception {
	public static void main(String[] args) throws Exception{
		int age=19;
		if(age>=18)
			System.out.println("eligible for voting");
		else
			System.out.println("not eligible for voting");

	}

}
