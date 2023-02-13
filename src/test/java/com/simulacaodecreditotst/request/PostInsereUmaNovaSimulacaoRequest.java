package com.simulacaodecreditotst.request;

import com.simulacaodecreditotst.bases.RequestRestBase;
import io.restassured.http.Method;

public class PostInsereUmaNovaSimulacaoRequest extends RequestRestBase {

    public PostInsereUmaNovaSimulacaoRequest(String nome, String cpf, String email, int valor, int parcelas, boolean seguro){

        method = Method.POST;
        requestService = "/api/v1/simulacoes/";
        queryParameters.put("nome", nome);
        queryParameters.put("cpf", cpf);
        queryParameters.put("email", email);
        queryParameters.put("valor", String.valueOf(valor));
        queryParameters.put("parcelas", String.valueOf(parcelas));
        queryParameters.put("seguro", String.valueOf(seguro));
    }
}
