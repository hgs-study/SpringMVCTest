package com.test.injection.service;

import org.springframework.stereotype.Service;

@Service
public class injectionTestServiceImpl implements injectionTestService{

	@Override
	public String injectionTest(String msg) {
		System.out.println("injectionTest start");
		// TODO Auto-generated method stub
		return "°á°ú°ª : "+msg;
	}
}
