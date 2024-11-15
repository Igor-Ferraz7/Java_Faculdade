package Quarto_Periodo.provaN1;/*
Desenvolva as classes relacionadas aos arquivos em anexo, importe os dados para
listas correspondentes a cada classe.
Apresente uma lista com o nome do cliente, o ID da reserva, a data de check-in a data de check-out,
o status da reserva (reservado ou n�o reservado) e o motivo caso n�o reservado;
 */

import java.time.LocalDate;
import java.util.*;

public class prova {
    private static List<Cliente> c1 = File_reader.client_reader();
    private static List<Location> locations = File_reader.location_reader();
    private static List<Reserva_Conflito> reservaConflitos = File_reader.reservaConflito_reader();

    public static void main(String[] args) {
        analisar_reserva();
        List<Reserva_Conflito> reservaConflitos_ordenado = reservaConflitos;
        Collections.sort(reservaConflitos_ordenado);

//        print_reserva_conflito(reservaConflitos_ordenado);

        print_reserva_conflito2(reservaConflitos_ordenado);


    }

    public static void analisar_reserva() {
        List<Reserva_Conflito> reservaConflitos_ordenado = File_reader.reservaConflito_reader();
        List<Reserva_Conflito> temp_list = new ArrayList<Reserva_Conflito>();
        List<Reserva_Conflito> reservas_certas = new ArrayList<Reserva_Conflito>();
        int[] id_local = new int[250];

        Collections.sort(reservaConflitos_ordenado);

        for (int i = 0; i < id_local.length; i++) {
            id_local[i] = reservaConflitos_ordenado.get(i).getId_local();
        }

        boolean id_local_repetiu = false;
        for (int i = 0; i < id_local.length - 1; i++) {

            int id_local_atual = reservaConflitos_ordenado.get(i).getId_local();
            List<Integer> ids_reservas_certas = new ArrayList<>();

            if (id_local_atual == id_local[i+1]) {
                temp_list.add(reservaConflitos_ordenado.get(i));
                id_local_repetiu = true;

            } else {
                temp_list.add(reservaConflitos_ordenado.get(i));
//                System.out.println(reservaConflitos_ordenado.get(i).getId_reserva());
                if (id_local_repetiu) {

                    ids_reservas_certas = getReservas_certas(temp_list);
                } else {
                    ids_reservas_certas.add(0);
                }

                for (int j = 0; j < ids_reservas_certas.size(); j++) {
//                    System.out.println(ids_reservas_certas.get(i));
                    reservas_certas.add(temp_list.get(ids_reservas_certas.get(j)));
                    //print_reserva_conflito(reservas_certas);
                }

                temp_list.clear();
                id_local_repetiu = false;
            }
        }

        reservas_certas.add(reservaConflitos_ordenado.get(249));
        //colocar status_reserva = true
        List<Reserva_Conflito> reservas_certas_ordenada = reservas_certas;

        Collections.sort(reservas_certas_ordenada, Reserva_Conflito.byIdReserva());

        int i2 = 0;
        for (int i = 0; i < reservaConflitos.size(); i++) {

            if (i2 >= reservas_certas_ordenada.size()) {
                break;
            }

            int id_reserva1 = reservaConflitos.get(i).getId_reserva();
            int id_reserva2 = reservas_certas_ordenada.get(i2).getId_reserva();

            //System.out.printf("%d, %d\n", id_reserva1, id_reserva2);

            if (reservaConflitos.get(i).getId_reserva() == reservas_certas_ordenada.get(i2).getId_reserva()) {
                reservaConflitos.get(i).setStatus_reserva(true);
                //i = 0;
                i2++;
            }
        }

        //relacionar reservas que n�o puderam ser reservadas >> Est� errado!!!
        /*
        for (int i = 0; i < reservaConflitos.size(); i++) {
            if (!(reservaConflitos.get(i).getStatus_reserva())) {
                for (int j = 0; j < reservaConflitos.size(); j++) {
                    if (reservaConflitos.get(i).getId_local() == reservaConflitos.get(j).getId_local()) {
                        int id_cliente_reservou_antes = reservaConflitos.get(i).getId_cliente();
                        reservaConflitos.get(j).setId_cliente_reservou_antes(id_cliente_reservou_antes);
                    }
                }
            }
        }
        */

    }

    public static List<Integer> getReservas_certas(List<Reserva_Conflito> temp_list) {
        temp_list.sort(Comparator.comparing(Reserva_Conflito::getData_chekIn));

        List<Integer> indicesReservasCertas = new ArrayList<>();

        for (int i = 0; i < temp_list.size(); i++) {
            boolean conflitou = false;

            for (int j = 0; j < i; j++) {
                LocalDate dataCheckInAtual = temp_list.get(i).getData_chekIn();
                LocalDate dataCheckOutAtual = temp_list.get(i).getData_chekOut();

                LocalDate dataCheckInProximo = temp_list.get(j).getData_chekIn();
                LocalDate dataCheckOutProximo = temp_list.get(j).getData_chekOut();

                boolean checkInAtualConflitou = dataCheckInAtual.isAfter(dataCheckInProximo) && dataCheckInAtual.isBefore(dataCheckOutProximo);
                boolean checkOutAtualConflitou = dataCheckOutAtual.isAfter(dataCheckInProximo) && dataCheckOutAtual.isBefore(dataCheckOutProximo);
                boolean checkInProximoConflitou = dataCheckInProximo.isAfter(dataCheckInAtual) && dataCheckInProximo.isBefore(dataCheckOutAtual);
                boolean checkOutProximoConflitou = dataCheckOutProximo.isAfter(dataCheckInAtual) && dataCheckOutProximo.isBefore(dataCheckOutAtual);

                if (checkInAtualConflitou || checkOutAtualConflitou || checkInProximoConflitou || checkOutProximoConflitou) {
                    conflitou = true;
                    break;
                }
            }

            if (!conflitou) {
                indicesReservasCertas.add(i);
            }
        }

        return indicesReservasCertas;
    }

    /*
        public static int getReserva_certa(List<Reserva_Conflito> temp_list) {
            LocalDate data_checkIn_certo = temp_list.get(0).getData_chekIn();
            int index_reserva_certa = 0;

            for (int i = 0; i < temp_list.size() - 1; i++) {
                LocalDate data_checkIn_atual = temp_list.get(i).getData_chekIn();
                LocalDate data_checkOut_atual = temp_list.get(i).getData_chekOut();

                LocalDate data_checkIn_proximo = temp_list.get(i+1).getData_chekIn();
                LocalDate data_checkOut_proximo = temp_list.get(i+1).getData_chekOut();

                boolean checkIn_atual_conflitou = data_checkIn_atual.isAfter(data_checkIn_proximo) && data_checkIn_atual.isBefore(data_checkOut_proximo);
                boolean checkOut_atual_conflitou = data_checkOut_atual.isAfter(data_checkIn_proximo) && data_checkOut_atual.isBefore(data_checkOut_proximo);

                if (checkIn_atual_conflitou || checkOut_atual_conflitou) { //  > talvez a l�gica n�o esteja 100% certa < \\
                    if (data_checkIn_atual.isBefore(data_checkIn_proximo)) {
                        if (data_checkIn_atual.isBefore(data_checkIn_certo) && i != index_reserva_certa) {
                            data_checkIn_certo = data_checkIn_atual;
                            index_reserva_certa = i;
                        } else if (i == index_reserva_certa) {
                            data_checkIn_certo = data_checkIn_atual;
                            index_reserva_certa = i;
                        }
                    } else {
                        data_checkIn_certo = data_checkIn_proximo;
                        index_reserva_certa = i+1;
                    }
                }
            }

            return index_reserva_certa;

        }
    */
    public static void print_reserva_conflito(List<Reserva_Conflito> reservaConflitos_sorted) {
        for (int i = 0; i < reservaConflitos_sorted.size(); i++) {
            int id_reserva = reservaConflitos_sorted.get(i).getId_reserva();
            int id_cliente = reservaConflitos_sorted.get(i).getId_cliente();
            int id_local1 = reservaConflitos_sorted.get(i).getId_local();
            int id_cliente_reservou_antes = reservaConflitos_sorted.get(i).getId_cliente_reservou_antes();
            String data_chekIn = reservaConflitos_sorted.get(i).getString_Data_chekIn();
            String data_chekOut = reservaConflitos_sorted.get(i).getString_Data_chekOut();
            boolean status_reserva = reservaConflitos_sorted.get(i).getStatus_reserva();

            System.out.printf("%d, %d, %d, %d, %s, %s, %b\n", id_reserva, id_cliente, id_local1, id_cliente_reservou_antes, data_chekIn, data_chekOut, status_reserva);

        }
    }

    public static void print_reserva_conflito2(List<Reserva_Conflito> reservaConflitos_sorted) {
        for (int i = 0; i < reservaConflitos_sorted.size(); i++) {
            int id_reserva = reservaConflitos_sorted.get(i).getId_reserva();
            int id_cliente = reservaConflitos_sorted.get(i).getId_cliente();
            int id_local1 = reservaConflitos_sorted.get(i).getId_local();
            int id_cliente_reservou_antes = reservaConflitos_sorted.get(i).getId_cliente_reservou_antes();
            String data_chekIn = reservaConflitos_sorted.get(i).getString_Data_chekIn();
            String data_chekOut = reservaConflitos_sorted.get(i).getString_Data_chekOut();
            boolean status_reserva = reservaConflitos_sorted.get(i).getStatus_reserva();
            String status_reserva_String = "";
            int id_reserva_cliente = 0;

            if (id_reserva != 0) {
                id_reserva_cliente = id_cliente - 1;
            }

            String nome_cliente = c1.get(id_reserva_cliente).getNome();

            if (status_reserva) {
                status_reserva_String = "Reservado";
            } else {
                status_reserva_String = "N�o reservado";
            }
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("Nome: %s | ID_Reserva: %d | DataCheckIn: %s | DataCheckOut: %s | Status_Reserva: %s\n", nome_cliente, id_reserva, data_chekIn, data_chekOut, status_reserva_String);

            if (!status_reserva) {
                System.out.println("");
                System.out.println("Motivo: Outro cliente reservou o local antes.");
            }
        }
    }
}

/*
o proximo id_local � igual?
    se sim:
        guarda o id_local em um vetor temporario
    se n�o:
        compara as datas com os valores guardados no vetor (ou lista, pq tem que usar dois campos)
        se n�o houver o que comparar, mude o status para true
 */