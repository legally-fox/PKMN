package ru.mirea.pkmn.pryazhentsevaes;

import com.fasterxml.jackson.databind.JsonNode;
import ru.mirea.pkmn.*;
import ru.mirea.pkmn.pryazhentsevaes.web.http.PkmnHttpClient;
import ru.mirea.pkmn.pryazhentsevaes.web.jdbc.DatabaseServiceImpl;

import java.io.IOException;
import java.sql.SQLException;

public class PkmnApplication {
    public static void main(String[] args) throws IOException, SQLException {
        CardImport pokemon = new CardImport("my_card.txt");

        PkmnHttpClient pkmnHttpClient = new PkmnHttpClient();

        JsonNode json = pkmnHttpClient.getPokemonCard(pokemon.card.getName(), pokemon.card.getNumber());
        //System.out.println(card.toPrettyString());

        doDescription(pokemon.card, json);
        CardExport cardExport = new CardExport(pokemon.card);
        //System.out.println(pokemon.card.toString());

        DatabaseServiceImpl databaseService = new DatabaseServiceImpl();
        //databaseService.createPokemonOwner(pokemon.card.getPokemonOwner());
        //databaseService.saveCardToDatabase(pokemon.card);
        //Student student = databaseService.getStudentFromDatabase("Пряженцева Елизавета Сергеевна");
        Card card = databaseService.getCardFromDatabase("Heracross");
        System.out.println(card.toString());

        System.exit(0);
    }
    public static void doDescription(Card card, JsonNode main_node) {
        for (JsonNode node : main_node.path("data")) {
            if (node.findValue("id").asText().equals("sv2-6")) {
                main_node = node.path("attacks");
                break;
            }
        }
        int i = 0;
        for (AttackSkill attack : card.getSkills()) {
            attack.setDescription(main_node.get(i).findValue("text").asText());
            i++;
        }
    }
}