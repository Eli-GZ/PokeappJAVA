package logica;

public class Pokeapp {

    public static void main(String[] args) {

        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulba = new Bulbasaur();
        Pikachu pika = new Pikachu();

        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();

        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();

        bulba.atacarAraniazo();
        bulba.atacarLatigoCepa();

        pika.atacarAraniazo();
        pika.atacarImpactrueno();
    }

}
