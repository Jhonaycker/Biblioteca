import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
       
        String titulo1 = JOptionPane.showInputDialog("Ingrese el título del primer libro:");
        String autor1 = JOptionPane.showInputDialog("Ingrese el autor del primer libro:");
        int anio1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicación del primer libro:"));

        Libro libro1 = new Libro(titulo1, autor1, anio1);

     
        String titulo2 = JOptionPane.showInputDialog("Ingrese el título del segundo libro:");
        String autor2 = JOptionPane.showInputDialog("Ingrese el autor del segundo libro:");
        int anio2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicación del segundo libro:"));

        Libro libro2 = new Libro(titulo2, autor2, anio2);

      
        JOptionPane.showMessageDialog(null, 
            "— Información de los libros —\n" + 
            libro1.mostrarInfo() + "\n" + 
            libro2.mostrarInfo()
        );

      
        String nuevoAutor = JOptionPane.showInputDialog("Ingrese el nuevo autor para el segundo libro:");
        libro2.setAutor(nuevoAutor);

       
        JOptionPane.showMessageDialog(null, 
            "— Después de actualizar autor —\n" + 
            libro1.mostrarInfo() + "\n" + 
            libro2.mostrarInfo()
        );
    }
}
