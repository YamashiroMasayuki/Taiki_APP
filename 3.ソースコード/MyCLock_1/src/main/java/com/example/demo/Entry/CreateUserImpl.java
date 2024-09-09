package com.example.demo.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserImpl implements CreateUser {

	@Autowired
	private UserMapper mapper;
	@Override
	public void creatUser(EntryModel entryModel){
		mapper.insertOne(entryModel);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
