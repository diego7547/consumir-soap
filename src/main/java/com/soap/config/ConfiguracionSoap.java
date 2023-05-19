package com.soap.config;

import com.soap.cliente.SoapCliente;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ConfiguracionSoap {

    @Bean
    public Jaxb2Marshaller jaxb2Marshaller(){
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.soap.wsdl");
        return jaxb2Marshaller;
    }

    @Bean
    public SoapCliente getSoapCliente(Jaxb2Marshaller jaxb2Marshaller){
        SoapCliente soapCliente = new SoapCliente();
        soapCliente.setDefaultUri("http://www.dneonline.com/calculator.asmx");
        soapCliente.setUnmarshaller(jaxb2Marshaller);
        soapCliente.setMarshaller(jaxb2Marshaller);
        return soapCliente;
    }
}
