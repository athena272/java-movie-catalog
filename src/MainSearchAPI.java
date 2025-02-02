import br.com.alura.movieCatalog.models.MediaType;
import br.com.alura.movieCatalog.models.OmdbMedia;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearchAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search movie: ");
        var search = input.nextLine();

        String urlToUse = "https://www.omdbapi.com/?t=" + search + "&apikey=6124c0b2";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlToUse)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        //MediaType media = gson.fromJson(json, MediaType.class);
        OmdbMedia media = gson.fromJson(json, OmdbMedia.class);
        System.out.println("Media: " + media);
    }
}
