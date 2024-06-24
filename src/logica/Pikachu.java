package logica;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Pikachu y este mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Pikachu y este mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Pikachu y este mi ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola, soy Pikachu y este mi ataque impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola, soy Pikachu y este mi ataque puño de trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola, soy Pikachu y este mi ataque rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola, soy Pikachu y este mi ataque carga de rayo");
    }
}
