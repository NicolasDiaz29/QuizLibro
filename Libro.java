public class Libro 

{
    //Atributos 
    protected String nombreLibro;
    protected String autor;
    protected int anioedicion;
    protected String edicionLujo;

    //Constructor nulo
    public Libro() 
    {
    }

    //constructor con parámetros
    public Libro(String nombreLibro, String autor, int anioedicion, String edicionLujo) 
    {                                    
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.anioedicion = anioedicion;
        this.edicionLujo = edicionLujo;
    }

    //Metodos
    public String getnombreLibro() {
        return nombreLibro;
    }

    public void setnombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getanioedicion() {
        return anioedicion;
    }

    public void setanioedicion(int anioedicion) {
        this.anioedicion = anioedicion;
    }

    public String getedicionLujo() {
        return edicionLujo;
    }

    public void setedicionLujo(String edicionLujo) {
        this.edicionLujo = edicionLujo;
    }
    

}