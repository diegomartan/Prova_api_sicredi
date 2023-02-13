package com.simulacaodecreditotst.tests;

import com.simulacaodecreditotst.bases.TestBase;
import com.simulacaodecreditotst.request.PostInsereUmaNovaSimulacaoRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class PostInsereUmaNovasimulacaoTests extends TestBase {

    PostInsereUmaNovaSimulacaoRequest postInsereUmaNovaSimulacaoRequest;

    @Test(groups = "principal")
    public void inserirUmaNovaSimulacaoComSucesso(){
        //region Arrenge

        String nome = "Arnaldo Costa";
        String cpf = "69172737085";
        String email = "arnaldo@teste.com.br";
        int valor = 1399;
        int parcelas = 4;
        boolean seguro = true;

        int statusCodeEsperado = HttpStatus.SC_OK;
        String nomeEsperado = "Arnaldo Costa";
        String cpfEsperado = "69172737085";
        String emailEsperado = "arnaldo@teste.com.br";
        int valorEsperado = 1399;
        int parcelasEsperado = 4;
        boolean seguroEsperado = true;

        postInsereUmaNovaSimulacaoRequest = new PostInsereUmaNovaSimulacaoRequest(nome, cpf, email, valor, parcelas, seguro);
        //endregion

        //region Act
        ValidatableResponse response = postInsereUmaNovaSimulacaoRequest.executeRequest();
        //endregion

        //region Assert
        response.statusCode(statusCodeEsperado);
        response.body("nome", equalTo(nomeEsperado),
                "cpf", equalTo(cpfEsperado),
                "email", equalTo(emailEsperado),
                "valor", equalTo(valorEsperado),
                "parcelas", equalTo(parcelasEsperado),
                "seguro", equalTo(seguroEsperado));


    }
}
