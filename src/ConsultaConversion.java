import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {

    public static String seleccionOpcion(int opcionConversion){

        String monedaDestino = "";

        switch (opcionConversion) {

            case 1:
                monedaDestino = "USD";
                break;
            case 2:
                monedaDestino = "ARS";
                break;
            case 3:
                monedaDestino = "BRL";
                break;
            case 4:
                monedaDestino = "COP";
                break;

            default:
                throw new RuntimeException("Opción inválida.");
        }

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/16803e9b6211323ccfd4492f/latest/" + monedaDestino);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e){
            throw new RuntimeException("No se ha encontrado la opcion ingresada.");
        }

    }

}
