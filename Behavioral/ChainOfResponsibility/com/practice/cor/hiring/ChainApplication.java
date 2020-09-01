package com.practice.cor.hiring;

/**
 * Chain of responsibility let allow user-request to be process sequentially with group of objects of same type till destination
 * Group of objects is nothing but handler object that decide whether to process(handle) the request or pass to the next chain of object sequentially 
 * Ex. in organization, recruitment process for freshers and experience will be different. fresher has less level of interview then experienced and that will be decide based on number of experience like 0 or 2+
 * At the end chain of responsibility should be prefer only when sequential process to be follow with series of handler check object to be measure the client request
 *  
 * @author Manish Luste
 *
 */
public class ChainApplication {

	public static void main(String[] args) {
		
		// create chain
		InterviewChain recruit1 = new Freshers();
		InterviewChain recruit2 = new Experiance();
		InterviewChain recruit3 = new Certified();
		recruit1.setNexChain(recruit2);
		recruit2.setNexChain(recruit3);
		
		// process from chain
		// if recruit 1 failed -> pass to the next until match
		recruit1.process(new Recruitment(5, Boolean.TRUE));
		
		
	}
}
