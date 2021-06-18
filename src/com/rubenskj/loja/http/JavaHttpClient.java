package com.rubenskj.loja.http;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {
    
    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlApi = new URL(url);

            URLConnection urlConnection = urlApi.openConnection();

            urlConnection.connect();
        } catch (IOException e) {
            throw new RuntimeException("Erro ao enviar requisicao HTTP", e);
        }
    }
}
