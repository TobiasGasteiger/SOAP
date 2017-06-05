package webservice.gen.rechnerws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;

@WebService(name = "RechnerWebServices", targetNamespace = "http://webservice/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface RechnerWebServices {

    /**
     * 
     * @param arg0
     * @param arg1
     * @return
     *     returns float
     */
    @WebMethod(operationName = "addition")
    @WebResult(partName = "return")
    @Action(input = "http://webservice/RechnerWebServices/additionRequest", output = "http://webservice/RechnerWebServices/additionResponse")
    public float addition(
            @WebParam(name = "arg0", partName = "arg0")
                    float arg0,
             @WebParam(name = "arg1", partName = "arg1")
                     float arg1
    );

    /**
     *
     * @param arg0
     * @param arg1
     * @return
     *     returns float
     */
    @WebMethod(operationName = "subtraktion")
    @WebResult(partName = "return")
    @Action(input = "http://webservice/RechnerWebServices/subtraktionRequest", output = "http://webservice/RechnerWebServices/subtraktionResponse")
    public float subtrakiton(
            @WebParam(name = "arg0", partName = "arg0")
                    float arg0,
            @WebParam(name = "arg1", partName = "arg1")
                    float arg1
    );

    /**
     *
     * @param arg0
     * @param arg1
     * @return
     *     returns float
     */
    @WebMethod(operationName = "multiplikation")
    @WebResult(partName = "return")
    @Action(input = "http://webservice/RechnerWebServices/multiplikationRequest", output = "http://webservice/RechnerWebServices/multiplikationResponse")
    public float multiplikation(
            @WebParam(name = "arg0", partName = "arg0")
                    float arg0,
            @WebParam(name = "arg1", partName = "arg1")
                    float arg1
    );

    /**
     *
     * @param arg0
     * @param arg1
     * @return
     *     returns float
     */
    @WebMethod(operationName = "division")
    @WebResult(partName = "return")
    @Action(input = "http://webservice/RechnerWebServices/divisionRequest", output = "http://webservice/RechnerWebServices/divisionResponse")
    public float division(
            @WebParam(name = "arg0", partName = "arg0")
                    float arg0,
            @WebParam(name = "arg1", partName = "arg1")
                    float arg1
    );

}
