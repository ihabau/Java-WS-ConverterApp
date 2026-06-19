package se.lexicon;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class CurrencyRates {

    // added for the currency api get data from big pickle.
    private static final Map<String, Double> rates = new HashMap<>();

    static {
        setFallbackRates();
    }

    public static void fetchRates() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.exchangerate-api.com/v4/latest/EUR"))
                    .timeout(java.time.Duration.ofSeconds(5))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();

            rates.put("EUR", 1.0);
            rates.put("SEK", extractRate(body, "SEK"));
            rates.put("DKK", extractRate(body, "DKK"));
            rates.put("NOK", extractRate(body, "NOK"));
            rates.put("USD", extractRate(body, "USD"));
            rates.put("CAD", extractRate(body, "CAD"));
            rates.put("AUD", extractRate(body, "AUD"));
        } catch (Exception e) {
            setFallbackRates();
        }
    }

    private static double extractRate(String json, String currency) {
        String key = "\"" + currency + "\":";
        int start = json.indexOf(key);
        if (start == -1) return 1.0;
        start += key.length();
        int end = json.indexOf(",", start);
        if (end == -1) end = json.indexOf("}", start);
        return Double.parseDouble(json.substring(start, end).trim());
    }

    private static void setFallbackRates() {
        rates.put("EUR", 1.0);
        rates.put("SEK", 10.98);
        rates.put("DKK", 7.46);
        rates.put("NOK", 11.15);
        rates.put("USD", 1.15);
        rates.put("CAD", 1.62);
        rates.put("AUD", 1.64);
    }

    public static double getRate(String currency) {
        return rates.getOrDefault(currency, 1.0);
    }
}
