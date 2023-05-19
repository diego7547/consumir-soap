package com.soap.controller;

import com.soap.cliente.SoapCliente;
import com.soap.wsdl.AddResponse;
import com.soap.wsdl.DivideResponse;
import com.soap.wsdl.MultiplyResponse;
import com.soap.wsdl.SubtractResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @Autowired
    SoapCliente soapCliente;


    @PostMapping("/sumar")
    public ResponseEntity<?> add(@RequestParam  int numeroA,@RequestParam int numeroB){
        AddResponse addResponse = soapCliente.getAddResponse(numeroA,numeroB);
        return ResponseEntity.ok(addResponse);
    }

    @PostMapping("/restar")
    public ResponseEntity<?> subract(int numeroA,int numeroB){
        SubtractResponse subtractResponse = soapCliente.getSubtractResponse(numeroA,numeroB);
        return ResponseEntity.ok(subtractResponse);
    }

    @PostMapping("/multiplicar")
    public ResponseEntity<?> multiplicar(int numeroA,int numeroB){
        MultiplyResponse multiplyResponse = soapCliente.getMultiplyResponse(numeroA,numeroB);
        return ResponseEntity.ok(multiplyResponse);
    }

    @PostMapping("/dividir")
    public ResponseEntity<?> dividi(int numeroA,int numeroB){
        DivideResponse divideResponse = soapCliente.getDivideResponse(numeroA,numeroB);
        return ResponseEntity.ok(divideResponse);
    }
}
