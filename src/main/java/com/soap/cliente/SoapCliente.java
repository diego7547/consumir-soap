package com.soap.cliente;

import com.soap.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapCliente extends WebServiceGatewaySupport {

    /**
     *  metodo que realiza suma de dos numeros
     * @param numeroA
     * @param numeroB
     * @return AddResponse
     */

    public AddResponse getAddResponse(int numeroA,int numeroB){
        Add addResponse = new Add();
        addResponse.setIntA(numeroA);
        addResponse.setIntB(numeroB);
        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");
        AddResponse addResponse1 = (AddResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx",addResponse,soapActionCallback);
        return  addResponse1;
    }

    /**
     * metodo que devuelve la division de dos numeros
     * @param numeroA
     * @param numeroB
     * @return DivideResponse
     */
    public DivideResponse getDivideResponse(int numeroA,int numeroB){
        Divide divideResponse = new Divide();
        divideResponse.setIntA(numeroA);
        divideResponse.setIntB(numeroB);
        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");
        DivideResponse divideResponse1 = (DivideResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx",divideResponse,soapActionCallback);
        return divideResponse1;
    }

    /**
     * metodo que devuelve la multiplicacion de dos numeros
     * @param numeroA
     * @param numeroB
     * @return MultiplyResponse
     */
    public MultiplyResponse getMultiplyResponse(int numeroA,int numeroB){
        Multiply multiplyResponse= new Multiply();
        multiplyResponse.setIntB(numeroB);
        multiplyResponse.setIntA(numeroA);
        SoapActionCallback actionCallback = new SoapActionCallback("http://tempuri.org/Multiply");
        MultiplyResponse multiplyResponse1 = (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx",multiplyResponse,actionCallback);
        return multiplyResponse1;
    }

    /**
     * metodo que devuelve la resta de dos numeros
     * @param numeroA
     * @param numeroB
     * @return SubtractResponse
     */
    public SubtractResponse getSubtractResponse(int numeroA,int numeroB){
        Subtract subtract = new Subtract();
        subtract.setIntA(numeroA);
        subtract.setIntB(numeroB);
        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");
        SubtractResponse subtractResponse =(SubtractResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx",subtract,soapActionCallback);
        return subtractResponse;
    }


}
