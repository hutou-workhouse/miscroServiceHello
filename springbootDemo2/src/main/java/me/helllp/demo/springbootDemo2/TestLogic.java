package me.helllp.demo.springbootDemo2;

public class TestLogic {
	private TestService _service;
	
	public TestLogic(TestService service){
		_service = service;
	}
	
	public String getMessage(){
		return _service.getMessage();
	}
}
