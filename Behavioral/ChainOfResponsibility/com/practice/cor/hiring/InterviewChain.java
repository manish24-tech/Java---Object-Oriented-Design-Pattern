package com.practice.cor.hiring;

public interface InterviewChain {

	abstract void setNexChain(InterviewChain chain);

	abstract void process(Recruitment request);
}
