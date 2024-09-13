package Converter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;
//NAO FUNFA, um dia eu venho resolver isso.
public class Converter {
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/USD"; // API para obter taxas de câmbio em relação ao dólar

    public static void main(String[] args) throws InterruptedException {
        try {
            double amount = 100.0; // Valor a ser convertido
            String baseCurrency = "USD"; // Moeda de origem
            String targetCurrency = "EUR"; // Moeda de destino

            // Obter as taxas de câmbio da API
            JSONObject exchangeRates = getExchangeRates();

            // Obter a taxa de câmbio da moeda de origem para a moeda de destino
            double exchangeRate = exchangeRates.getDouble(targetCurrency);

            // Converter o valor para a moeda de destino
            double convertedAmount = amount * exchangeRate;

            System.out.println(amount + " " + baseCurrency + " equivale a " + convertedAmount + " " + targetCurrency);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static JSONObject getExchangeRates() throws IOException, InterruptedException, URISyntaxException {
        HttpClient client = HttpClient.newHttpClient();
        URL url = new URL(API_URL);
        URI uri = url.toURI();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return new JSONObject(response.body());
    }
}
