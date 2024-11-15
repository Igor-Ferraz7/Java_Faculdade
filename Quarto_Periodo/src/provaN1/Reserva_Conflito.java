package provaN1;

import java.time.LocalDate;
import java.util.Comparator;

public class Reserva_Conflito implements Comparable<Reserva_Conflito>{
    private int id_reserva, id_cliente, id_local, id_cliente_reservou_antes;
    private LocalDate data_chekIn, data_chekOut;
    private boolean status_reserva;

    public Reserva_Conflito(int id_reserva, int id_cliente, int id_local, LocalDate data_chekIn, LocalDate data_chekOut, boolean status_reserva, int id_cliente_reservou_antes) {
        this.id_reserva = id_reserva;
        this.id_cliente = id_cliente;
        this.id_local = id_local;
        this.data_chekIn = data_chekIn;
        this.data_chekOut = data_chekOut;
        this.status_reserva = status_reserva;
        this.id_cliente_reservou_antes = id_cliente_reservou_antes;
    }

    @Override
    public int compareTo(Reserva_Conflito other) {
        return Integer.compare(this.id_local, other.id_local);
    }

    public static Comparator<Reserva_Conflito> byIdReserva() {
        return Comparator.comparingInt(Reserva_Conflito::getId_reserva);
    }

    public static Comparator<Reserva_Conflito> byIdLocal() {
        return Comparator.comparingInt(Reserva_Conflito::getId_local);
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public int getId_local() {
        return id_local;
    }

    public boolean getStatus_reserva() {
        return this.status_reserva;
    }

    public int getId_cliente_reservou_antes() {
        return id_cliente_reservou_antes;
    }

    public LocalDate getData_chekIn() {
        return data_chekIn;
    }
    public String getString_Data_chekIn() {
        return data_chekIn.toString();
    }

    public void setStatus_reserva(boolean status_reserva) {
        this.status_reserva = status_reserva;
    }

    public void setId_cliente_reservou_antes(int id_cliente_reservou_antes) {
        this.id_cliente_reservou_antes = id_cliente_reservou_antes;
    }

    public LocalDate getData_chekOut() {
        return data_chekOut;
    }
    public String getString_Data_chekOut() {
        return data_chekOut.toString();
    }


}
