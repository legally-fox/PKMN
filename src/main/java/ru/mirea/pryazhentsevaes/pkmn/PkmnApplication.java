package ru.mirea.pryazhentsevaes.pkmn;

public class PkmnApplication {
    public static void main(String[] args) {
        CardImport pokemon = new CardImport("src\\main\\resources\\my_card.txt");
        System.out.println(pokemon.card.toString());
    }
}