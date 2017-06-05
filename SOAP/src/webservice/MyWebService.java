package webservice;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;

@WebService(name="RechnerWebServices")
@SOAPBinding(style = SOAPBinding.Style.RPC)

public class MyWebService {

	@WebMethod(operationName="addition")
	public float addition (float arg1, float arg2){
		return arg1 + arg2;
	}

	@WebMethod(operationName="subtraktion")
	public float subtraktion (float arg1, float arg2){
		return arg1 - arg2;
	}

	@WebMethod(operationName="multiplikation")
	public float multiplikation (float arg1, float arg2){
		return arg1 * arg2;
	}

	@WebMethod(operationName="division")
	public float division (float arg1, float arg2) {
		return arg1 + arg2;
	}
	
}
