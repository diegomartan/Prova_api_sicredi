package com.simulacaodecreditotst.tests;

import com.simulacaodecreditotst.bases.TestBase;
import com.simulacaodecreditotst.request.GetConsultaSeUmCpfPossuiOuNaoRestricaoRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class GetConsultaSeUmCpfPossuiOuNaoRestricaoTests extends TestBase{

   GetConsultaSeUmCpfPossuiOuNaoRestricaoRequest getConsultaSeUmCpfPossuiOuNaoRestricaoRequest;

   @Test(groups = "principal")
   public void consultarCpfComRestricaoComSucesso(){
       //region Arrange

       String cpf = "97093236014";

       int statusCondeEsperado = HttpStatus.SC_OK;
       String mensagemEsperado = "O CPF 97093236014 tem problema";

       getConsultaSeUmCpfPossuiOuNaoRestricaoRequest = new GetConsultaSeUmCpfPossuiOuNaoRestricaoRequest(cpf);
       //endregion

       //region Act
       ValidatableResponse response = getConsultaSeUmCpfPossuiOuNaoRestricaoRequest.executeRequest();
       //endregion

       //region Assert
       response.statusCode(statusCondeEsperado);
       response.body("mensagem", equalTo(mensagemEsperado));


   }

   public void consultarCpfSemRestricaoComSucesso(){
       // region Arrange

       String cpf = "42479072045";

       int statusCodeEsperado = HttpStatus.SC_NO_CONTENT;

       getConsultaSeUmCpfPossuiOuNaoRestricaoRequest = new GetConsultaSeUmCpfPossuiOuNaoRestricaoRequest(cpf);
       //endregion

       //region Act
       ValidatableResponse response = getConsultaSeUmCpfPossuiOuNaoRestricaoRequest.executeRequest();
       //endregion

       //region Assert
       response.statusCode(statusCodeEsperado);

   }

}
