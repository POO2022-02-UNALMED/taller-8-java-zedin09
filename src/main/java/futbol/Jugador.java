package futbol;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                " con el dorsal " + this.dorsal +
                ". Ha marcado " + this.golesMarcados;
    }

    @Override
    public int compareTo(Object o) {
        if(this.getEdad() == ((Futbolista)o).getEdad()){return 0;}
        else if (this.getEdad() > ((Futbolista)o).getEdad()){return this.getEdad() - ((Futbolista)o).getEdad();}
        else {return ((Futbolista)o).getEdad() - this.getEdad();}
    }

    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
}
