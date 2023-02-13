package com.simulacaodecreditotst.tests;

import com.simulacaodecreditotst.bases.TestBase;
import com.simulacaodecreditotst.request.GetRetornaTodasAsSimulacoesExistentesRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class GetRetornaTodasAsSimulacoesExistentesTests extends TestBase {

    GetRetornaTodasAsSimulacoesExistentesRequest getRetornaTodasAsSimulacoesExistentesRequest;

    @Test(groups = "principal")
    public void retornarTodasAsSimulacoesExistentesComSucesso(){
        //region Arrange

        int statusCodeEsperado = HttpStatus.SC_OK;
        int idEsperado = 11;
        String nomeEsperado = "Fulano";
        String cpfEsperado = "66414919004";
        String emailesperado = "fulano@gmail.com";
        int valorEsperado = 11000;
        int parcelasEsperado = 3;
        boolean seguroEsperado = true;
        int id2Esperado = 12;
        String nome2Esperado = "Deltrano";
        String cpf2Esperado = "17822386034";
        String email2Esperado = "deltrano@gmail.com";
        int valor2Esperado = 20000;
        int parcelas2Esperado = 5;
        boolean seguro2Esperado = false;

        getRetornaTodasAsSimulacoesExistentesRequest = new GetRetornaTodasAsSimulacoesExistentesRequest();
        //endregion

        //region Act
        ValidatableResponse response = getRetornaTodasAsSimulacoesExistentesRequest.executeRequest();
        //endregion

        //region Assert
        response.statusCode(statusCodeEsperado);
        response.body("[0].id", equalTo(idEsperado),
                "[0].nome", equalTo(nomeEsperado),
                "[0].cpf", equalTo(cpfEsperado),
                "[0].email", equalTo(emailesperado),
                "[0].valor", equalTo(valorEsperado),
                "[0].parcelas", equalTo(parcelasEsperado),
                "[0].seguro", equalTo(seguroEsperado),
                "[1].id", equalTo(id2Esperado),
                "[1].nome", equalTo(nome2Esperado),
                "[1].cpf", equalTo(cpf2Esperado),
                "[1].email", equalTo(email2Esperado),
                "[1].valor", equalTo(valor2Esperado),
                "[1].parcelas", equalTo(parcelas2Esperado),
                "[1].seguro", equalTo(seguro2Esperado));
    }

}
