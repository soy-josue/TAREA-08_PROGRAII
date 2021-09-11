package gt.umg.prograII;

public class Producto implements ComparadorP {
    /**
     * Atributos
     */
    private int identficador;
    private String nombre;
    private Double precio;

    /**
     * constructor
     */
    public Producto(int identficador, String nombre, Double precio) {
        this.identficador = identficador;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(Producto a, Double precio) {

    }

    /**
     * Getters and setters
     */

    public int getIdentficador() {
        return identficador;
    }

    public void setIdentficador(int identficador) {
        this.identficador = identficador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public boolean igualque(Object q) {
        Producto a = (Producto) q;
        return this.precio == a.precio;
    }

    @Override
    public boolean menorque(Object q) {
        Producto a = (Producto) q;
        return this.precio < a.precio;
    }

    @Override
    public boolean menoriqualque(Object q) {
        Producto a = (Producto) q;
        return this.precio <= a.precio;
    }

    @Override
    public boolean mayorque(Object q) {
        Producto a = (Producto) q;
        return this.precio > a.precio;
    }

    @Override
    public boolean mayorigualque(Object q) {
        Producto a = (Producto) q;
        return this.precio >= a.precio;
    }
}
