package com.practice.cor.hiring;

import java.util.Arrays;

public class Certified implements InterviewChain {

	private InterviewChain chain;

	@Override
	public void setNexChain(InterviewChain chain) {
		this.chain = chain;

	}

	@Override
	public void process(Recruitment request) {

		if (request.getNoe() == 5 && request.isCertified() ) {
			// business logic of the systems
			System.out.println("Certified process() => Interview process will be as :");
			Arrays.asList("1. Technical Interview", "2. Compititve coding", "3. HR Manager", "4. On Borading Selection")
					.forEach(System.out::println);
		}
	}

}
