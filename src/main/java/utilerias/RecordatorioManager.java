
package utilerias;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import dominio.Medicamento;

/**
 *
 * @author marco
 */
public class RecordatorioManager {
    
    private Timer timer;
    private Medicamento medicamentoRecordatorio;
    
    public RecordatorioManager(Medicamento medicamento){
        this.timer = new Timer();
        medicamentoRecordatorio = medicamento;
    }
    
    /**
     * Programa el recordatorio diariamente.
     */
    public void recordatorioDiario() {
        // Calcula la primera ejecución para que sea aproximadamente en la próxima hora exacta
        LocalDateTime proximaEjecucion = LocalDateTime.now().plusSeconds(15);
        

        // Obtén la diferencia en milisegundos entre la fecha y hora actual y la fecha y hora diaria
        long delayMilis = calcularDiferenciaEnMili(LocalDateTime.now(), proximaEjecucion);

        // Programa la tarea para ejecutarse cada 15 segundos
        timer.scheduleAtFixedRate(new RecordatorioTask(medicamentoRecordatorio), delayMilis, 15 * 1000);

    }

     public void recordatorioSemanal() {
        // Calcula la primera ejecución para que sea aproximadamente en la próxima hora exacta
        LocalDateTime proximaEjecucion = LocalDateTime.now().plusSeconds(25);
        

        // Obtén la diferencia en milisegundos entre la fecha y hora actual y la fecha y hora diaria
        long delayMilis = calcularDiferenciaEnMili(LocalDateTime.now(), proximaEjecucion);

        // Programa la tarea para ejecutarse cada 15 segundos
        timer.scheduleAtFixedRate(new RecordatorioTask(medicamentoRecordatorio), delayMilis, 15 * 1000);

    }
     
    // Método para calcular la diferencia en milisegundos entre dos fechas y horas
    private long calcularDiferenciaEnMili(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        Duration duration = Duration.between(fechaInicio, fechaFin);
        return duration.toMillis();
    }

    /**
     * Muestra la notificación.
     *
     * @param mensaje Mensaje de notificación.
     */
    private void mostrarNotificacion(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Recordatorio", JOptionPane.INFORMATION_MESSAGE);
    }

    // Clase interna que representa la tarea de notificación
    private class RecordatorioTask extends TimerTask {
        private Medicamento medicamento;

        public RecordatorioTask(Medicamento medicamento) {
            this.medicamento = medicamento;
        }

        @Override
        public void run() {
            System.out.println("¡Es hora de tomar tus medicamentos!");
            mostrarNotificacion("Hola: " + this.medicamento.getUsuario().getNombre() + "\n"
             + "Este es un recordatorio para tu medicamento: " + this.medicamento.getNombre()
             + "\n" + "debes tomar: " + this.medicamento.getDosis() +" ml" + "\n"
             + "cada: " + this.medicamento.getFrecuencia() + " minutos.");
        }
    }
    
}
