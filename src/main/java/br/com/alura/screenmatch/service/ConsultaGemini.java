package br.com.alura.screenmatch.service;

import okhttp3.*;
import java.io.IOException;
import org.json.JSONObject;

public class ConsultaGemini {
    private static final String API_KEY = System.getenv("ApiGemini");
    private static final String URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent?key=" + API_KEY;

    public static String chamarGemini(String sinopse) throws IOException {
        OkHttpClient client = new OkHttpClient();

        String prompt = "traduza do ingles para o portugues brasileiro";
        JSONObject jsonBody = new JSONObject();
        jsonBody.put("contents", new JSONObject()
                .put("parts", new JSONObject().put("text", prompt + sinopse)
        ));

        RequestBody body = RequestBody.create(jsonBody.toString(), MediaType.get("application/json; charset=utf-8"));
        Request request = new Request.Builder()
                .url(URL)
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Erro na API: " + response);
            }

            JSONObject jsonResponse = new JSONObject(response.body().string());
            return jsonResponse.getJSONArray("candidates").getJSONObject(0)
                    .getJSONObject("content")
                    .getJSONArray("parts").getJSONObject(0)
                    .getString("text");
        }
    }
}
