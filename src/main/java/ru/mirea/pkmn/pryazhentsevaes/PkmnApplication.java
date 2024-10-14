package ru.mirea.pkmn.pryazhentsevaes;

public class PkmnApplication {
    public static void main(String[] args) {
        CardImport pokemon = new CardImport("my_card.txt");
        System.out.println(pokemon.card.toString());
        CardExport save = new CardExport(pokemon.card);

        CardImport pokemon_new = new CardImport("Flygon.crd");
        System.out.println(pokemon_new.card.toString());
    }
}