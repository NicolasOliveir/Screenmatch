package br.com.alura.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService("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");


        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();


        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}
