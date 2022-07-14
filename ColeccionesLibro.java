public class ColeccionesLibro extends Libro
{
    //Atributos
    private String coleccion;
    private int numeroColeccion;

    //Constructor nulo
    public ColeccionesLibro()
    {
    }

    //Constructor con parametros
    public ColeccionesLibro (String nombreLibro, String autor, int anioedicion, String edicionLujo, String coleccion, int numeroColeccion)
    {
        setnombreLibro(nombreLibro);
        setAutor(autor);
        setanioedicion(anioedicion);
        setedicionLujo(edicionLujo);
        setcoleccion(coleccion);
        setnumeroColeccion(numeroColeccion);
    }

    //Metodos
    public String getcoleccion() {
        return coleccion;
    }
    
    public void setcoleccion(String coleccion) {
        this.coleccion = coleccion;
    }  
        
    public int getnumeroColeccion() {
        return numeroColeccion;
    }
    
    public void setnumeroColeccion(int numeroColeccion) {
        this.numeroColeccion = numeroColeccion;
    }

    public String toString() 
    {   
        return "El libro: " + getnombreLibro() +
        " del autor " + getAutor() + " con el año de edición " + getanioedicion() + 
        " que " + getedicionLujo() + " es de lujo. Pertenece a la coleccion " +
        getcoleccion()  + " con el número " + getnumeroColeccion();
    }
    
}
