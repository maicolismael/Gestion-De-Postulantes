/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.Timer;  
/**
 *
 * @author HP
 */
public class Reloj {
    private Timer timer;
     public void iniciarReloj(JLabel etiqueta) {
        
        final SimpleDateFormat formato = new SimpleDateFormat(
            "EEEE, dd 'de' MMMM yyyy - HH:mm:ss", new Locale("es", "ES")
        );

        
        timer = new Timer(1000, e -> {
            Date ahora = new Date();
            String texto = formato.format(ahora);
            
            texto = Character.toUpperCase(texto.charAt(0)) + texto.substring(1);
            etiqueta.setText(texto);
        });

        
        timer.setInitialDelay(0);
        timer.start();
    }

    
    public void detenerReloj() {
        if (timer != null) timer.stop();
    }
    
}
