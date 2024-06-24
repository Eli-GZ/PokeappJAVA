package logica;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Bulbasaur y este mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Bulbasaur y este mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Bulbasaur y este mi ataque mordisco");
    }

//INTERFACE
    @Override
    public void atacarDrenaje() {
        System.out.println("Hola, soy Bulbasaur y este mi ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola, soy Bulbasaur y este mi ataque paralizar");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola, soy Bulbasaur y este mi ataque hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola, soy Bulbasaur y este mi ataque latigo cepa");
    }

}
