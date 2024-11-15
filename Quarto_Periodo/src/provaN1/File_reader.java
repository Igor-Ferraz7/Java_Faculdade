package provaN1;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File_reader {
    private  static File file_client = new File("C:\\Users\\igors\\OneDrive\\Documentos\\Estudos\\Java\\Java_Faculdade\\Quarto_Periodo\\src\\provaN1\\clients.csv");
    private static File file_location = new File("C:\\Users\\igors\\OneDrive\\Documentos\\Estudos\\Java\\Java_Faculdade\\Quarto_Periodo\\src\\provaN1\\prova.java");
    private static File file_reseva_conflito = new File("C:\\Users\\igors\\OneDrive\\Documentos\\Estudos\\Java\\Java_Faculdade\\Quarto_Periodo\\src\\provaN1\\reservas_conflitos.csv");

    public static void main(String[] args) {
        List<Cliente> c1 = client_reader();
        List<Location> locations = location_reader();
        List<Reserva_Conflito> reservaConflitos = reservaConflito_reader();


    }

    public static List<Cliente> client_reader() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        int count = 0;

        try (Scanner fileScanner = new Scanner(file_client)) {
            while (fileScanner.hasNextLine()) {
                String full_line = fileScanner.nextLine();

                if (count != 0) {
                    String id = full_line.split(";")[0];
                    String nome = full_line.split(";")[1];

                    clientes.add(new Cliente(Integer.parseInt(id), nome));
                }

                count++;

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Não foi possível ler o arquivo 'clients.csv'");
        }

        return clientes;
    }

    public static List<Location> location_reader() {
        List<Location> locations = new ArrayList<Location>();
        int count = 0;

        try (Scanner fileScanner = new Scanner(file_client)) {
            while (fileScanner.hasNextLine()) {
                String full_line = fileScanner.nextLine();

                if (count != 0) {
                    String id = full_line.split(";")[0];

                    locations.add(new Location(Integer.parseInt(id)));
                }

                count++;

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Não foi possível ler o arquivo 'locations.csv'");
        }

        return locations;
    }

    public static List<Reserva_Conflito> reservaConflito_reader() {
        List<Reserva_Conflito> reservaConflitos = new ArrayList<Reserva_Conflito>();
        int count = 0;

        try (Scanner fileScanner = new Scanner(file_reseva_conflito)) {
            while (fileScanner.hasNextLine()) {
                String full_line = fileScanner.nextLine();

                if (count != 0) {
                    int id_reserva = Integer.parseInt(full_line.split(",")[0]);
                    int id_cliente = Integer.parseInt(full_line.split(",")[1]);
                    int id_local = Integer.parseInt(full_line.split(",")[2]);
                    LocalDate data_checkIn = LocalDate.parse(full_line.split(",")[3]);
                    LocalDate data_checkOut = LocalDate.parse(full_line.split(",")[4]);

                    reservaConflitos.add(new Reserva_Conflito(id_reserva, id_cliente, id_local, data_checkIn, data_checkOut, false, -1));
                }

                count++;

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Não foi possível ler o arquivo 'reservas_conflitos.csv'");
        }

        return reservaConflitos;
    }

}
