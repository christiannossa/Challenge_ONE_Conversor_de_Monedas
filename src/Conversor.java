import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Conversor extends Principal {

    double cantidad = 0;
    static Gson gson = new Gson();


    public static double conversionAPesoArgentino (double cantidad, String response) {

        JsonObject jsonObject = gson.fromJson(response.toString(), JsonObject.class);

        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

        double tasaDeCambio = conversionRates.get("ARS").getAsDouble();

        return cantidad * tasaDeCambio;

    }

    public static double conversionAAmericanDolar (double cantidad, String response) {

        JsonObject jsonObject = gson.fromJson(response.toString(), JsonObject.class);

        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

        double tasaDeCambio = conversionRates.get("USD").getAsDouble();

        return cantidad * tasaDeCambio;

    }

    public static double conversionARealBrasileiro (double cantidad, String response) {

        JsonObject jsonObject = gson.fromJson(response.toString(), JsonObject.class);

        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

        double tasaDeCambio = conversionRates.get("BRL").getAsDouble();

        return cantidad * tasaDeCambio;

    }

    public static double conversionAPesoColombiano (double cantidad, String response) {

        JsonObject jsonObject = gson.fromJson(response.toString(), JsonObject.class);

        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

        double tasaDeCambio = conversionRates.get("COP").getAsDouble();

        return cantidad * tasaDeCambio;

    }


}
