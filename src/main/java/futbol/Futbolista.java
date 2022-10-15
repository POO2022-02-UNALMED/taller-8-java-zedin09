package futbol;

public abstract class Futbolista implements Comparable<Object>{
    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    public abstract int compareTo(Object o);

    @Override
    public String toString() {
        return "El futbolista " + nombre +
                " tiene " + edad +
                ", y juega de " + posicion;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public abstract boolean jugarConLasManos();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }
}
