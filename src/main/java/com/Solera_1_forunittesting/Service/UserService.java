package com.Solera_1_forunittesting.Service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public boolean isEvenOrNot(int i) {

		return i % 2 == 0;
	}
}
