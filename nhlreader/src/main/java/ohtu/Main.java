
package ohtu;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.http.client.fluent.Request;
import com.google.gson.Gson;



public class Main {
    public static void main(String[] args) throws IOException {

        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";

        String bodyText = Request.Get(url).execute().returnContent().asString();

        Gson mapper = new Gson();
        Player[] players = mapper.fromJson(bodyText, Player[].class);
        List<Player> lista = Arrays.asList(players);
        System.out.println("Players from FIN \n");

        lista.stream().filter(player -> player.getNationality().equals("FIN"))
            .sorted().forEach(player -> System.out.println(player));
        
        
    }

}
