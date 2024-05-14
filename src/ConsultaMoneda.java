import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda consultarMoneda(String pais1, String pais2){
        //URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c92d18585c56ce1edbbc483e/pair/USD/ARS");
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c92d18585c56ce1edbbc483e/pair/"+pais1.toUpperCase()+"/"+pais2.toUpperCase());

        //Se crea el objeto client y request para consultar a la API
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();



        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println(response.body());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontro la moneda");
        }

    }

    public Double conversorMoneda(String pais1, String pais2,int cantidad){
        Moneda moneda = consultarMoneda(pais1,pais2);
        double valor = Double.parseDouble(moneda.conversion_rate());
        return valor * (double) cantidad;
    }
}
