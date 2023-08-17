
package LOGIC;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;


public class Validacion 
{
    public Validacion(){}
    
    public void mostrarMensaje(String mensaje, String tipoDeMensaje, String titulo) 
    {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipoDeMensaje.equals("Info")) 
        {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipoDeMensaje.equals("Error")) 
        {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    public boolean validarRangoAlfabe(String texto) {
    String patron = "^[a-zA-Z ]+$";
    return texto.matches(patron);
}
      public  boolean validarSoloDigitos(String texto) 
    {
        String patron = "^[0-9]+$";
        return texto.matches(patron);
    }
      
     public boolean validarNumeroDecimal(String texto) 
    {
        String patron = "^\\d+(\\.\\d+)?$";
        return texto.matches(patron);
    }
     
    public void centrarInternalFrame(JInternalFrame internalFrame, JDesktopPane desktopPane) 
    {
        Dimension desktopSize = desktopPane.getSize();
        Dimension frameSize = internalFrame.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        internalFrame.setLocation(x, y);
    }
    
    public String guardaConPrimeraLetraMayuscula(String palabra)
    {
        if (palabra == null || palabra.isEmpty())
        {
            return palabra; // Devuelve la palabra original si está vacía
        }

        String primeraLetra = palabra.substring(0, 1).toUpperCase(); // Obtiene la primera letra en mayúscula
        String restoPalabra = palabra.substring(1).toLowerCase(); // Obtiene el resto de la palabra en minúsculas

        return primeraLetra + restoPalabra; // Combina la primera letra con el resto de la palabra
    }   

    
}
