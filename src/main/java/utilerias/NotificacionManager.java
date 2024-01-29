
package utilerias;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;


/**
 *
 * @author marco
 */
public class NotificacionManager {
    
    private Timer timer;

    public NotificacionManager(){
        this.timer = new Timer();
    }
    
    /**
     * 
     * @param fechaHora 
     */
    public void programarNotificacionPersonalizada(LocalDateTime fechaHora) {
        
       // Obtén la diferencia en milisegundos entre la fecha y hora actual y la fecha y hora proporcionadas
        long delayMilis = calcularDiferenciaEnMili(LocalDateTime.now(), fechaHora);

        // Programa la tarea para ejecutarse después del tiempo calculado
        timer.schedule(new NotificacionTask(), delayMilis);
    }

    // Método para calcular la diferencia en milisegundos entre dos fechas y horas
    private long calcularDiferenciaEnMili(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        Duration duration = Duration.between(fechaInicio, fechaFin);
        return duration.toMillis();
    }
    
    /**
     * 
     * @param mensaje 
     */
    private void mostrarNotificacion(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Notificación", JOptionPane.INFORMATION_MESSAGE);
    }

    // Clase interna que representa la tarea de notificación
    private class NotificacionTask extends TimerTask {
        @Override
        public void run() {
            
            System.out.println("¡Es hora de tomar tus medicamentos!");
            mostrarNotificacion("Llegó la hora marcada, Hora de tomar tus medicamentos");
        }
    }

}

