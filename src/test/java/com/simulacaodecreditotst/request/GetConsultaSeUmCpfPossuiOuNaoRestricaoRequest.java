package com.simulacaodecreditotst.request;

import com.simulacaodecreditotst.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetConsultaSeUmCpfPossuiOuNaoRestricaoRequest extends RequestRestBase {

    public GetConsultaSeUmCpfPossuiOuNaoRestricaoRequest(String cpf){

        method = Method.GET;
        requestService = "/api/v1/restricoes/"+cpf;
    }
}
