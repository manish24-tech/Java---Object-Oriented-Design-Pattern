package com.practice.cor.hiring;

import java.util.Arrays;

import com.practice.cor.hiring.InterviewChain;
import com.practice.cor.hiring.Recruitment;

public class Experiance implements InterviewChain {

	private InterviewChain chain;

	@Override
	public void setNexChain(InterviewChain chain) {
		this.chain = chain;

	}

	@Override
	public void process(Recruitment request) {

		if (request.getNoe() == 2 && (request.isCertified() || !request.isCertified()) ) {
			// business logic of the systems
			System.out.println("Experiance process() => Interview process will be as :");
			Arrays.asList("1. Technical Interview", "2. Compititve coding",  "3. On Borading Selection")
					.forEach(System.out::println);
		}
		else {
			System.out.println("Experiance process() => Failed so pass to next chain :");
			chain.process(request);
		}
	}

}
