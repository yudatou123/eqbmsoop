package service;

import org.springframework.stereotype.Service;

@Service("testService")
public class TestService {
	
	public String pingSql() {
		return "select * from table1";
	}

}
