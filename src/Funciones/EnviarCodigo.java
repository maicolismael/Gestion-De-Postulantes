/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

/**
 *
 * @author MICHEL NINA ZARATE
 */
import java.util.Properties;
import jakarta.mail.*;
import jakarta.mail.internet.*;

public class EnviarCodigo {
    
        public static void enviarCorreo(String destinatario, String codigo) {
        final String remitente = "tucorreo@gmail.com";  // Tu Gmail
        final String clave = "tu_contraseña_de_app";   // Contraseña de aplicación

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
            new jakarta.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(remitente, clave);
                }
            }
        );

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(remitente));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(destinatario));
            message.setSubject("Recuperación de Contraseña");
            message.setText("Tu código de verificación es: " + codigo);

            Transport.send(message);
            System.out.println("Correo enviado correctamente.");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
