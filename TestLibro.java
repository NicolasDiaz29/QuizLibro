public class TestLibro
{
      public static void main(String[] args) 
      {

        Libro libro1 = new Libro("El quijote", "Cervantes", 1978, "Si");


        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getnombreLibro());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Año edición: " + libro1.getanioedicion());
        System.out.println("Edición de Lujo: " + libro1.getedicionLujo());
        System.out.println();
      }
}
