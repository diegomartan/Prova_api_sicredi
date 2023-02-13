package com.simulacaodecreditotst.request;

import com.simulacaodecreditotst.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetRetornaTodasAsSimulacoesExistentesRequest extends RequestRestBase {

    public GetRetornaTodasAsSimulacoesExistentesRequest(){
        method = Method.GET;
        requestService = "/api/v1/simulacoes/";
    }
}
