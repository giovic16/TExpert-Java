package datas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestaDatas1 {
    public static void main(String[] args) {

//        Date data = new Date();
//        System.out.println(data);

        // LocalDate: data
        LocalDate dataDeHoje = LocalDate.now();
        System.out.println(dataDeHoje);

        // LocalTime: hora
        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        // LocalDatetime: data e hora
        LocalDateTime dataEHora = LocalDateTime.now();
        System.out.println(dataEHora);

        // Montando a data de acordo com sua preferência
//        LocalDate niver = LocalDate.of(2023, 8, 16);
        LocalDate niver = LocalDate.of(2023, Month.AUGUST, 16);
        System.out.println(niver);

        int ano = niver.getYear();
        Month mes = niver.getMonth();
        int valorDoMes = niver.getMonthValue();
        int diaDoMes = niver.getDayOfMonth();
        DayOfWeek diaDaSemana = niver.getDayOfWeek();
        int diaDoAno = niver.getDayOfYear();

        System.out.println("--------------------------");

        System.out.println("Ano: " + ano);
        System.out.println("Mês: " + mes);
        System.out.println("Valor do mês: " + valorDoMes);
        System.out.println("Dia do mês: " + diaDoMes);
        System.out.println("Dia da semana: " + diaDaSemana);
        System.out.println("Dia do ano: " + diaDoAno);

        System.out.println("--------------------------");

        LocalDate dtHoje = LocalDate.now();
        System.out.println("Data de hoje: " + dtHoje);
        System.out.println("Data de hoje + 5 dias: " + dtHoje.plusDays(5));
        System.out.println("Mês atual + 6 meses: "+ dtHoje.plusMonths(6));
        System.out.println("Ano atual + 1: " + dtHoje.plusYears(1));
        System.out.println("Dias atrás: " + dtHoje.minusDays(5));
        System.out.println("Anos atrás: " + dtHoje.minusYears(2));

        System.out.println("--------------------------");

        LocalTime agora = LocalTime.now();
        System.out.println(agora);
        System.out.println(agora.plusMinutes(5));
        System.out.println(agora.plusHours(1));
        System.out.println(agora.minusMinutes(15));
        System.out.println(agora.minusHours(3));

        System.out.println("--------------------------");

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // MM maiúsculo é mês, minúsculo é minuto
        System.out.println("Data de hoje: " + dtHoje.format(dataFormatada));

        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println("Hora: " + agora.format(horaFormatada));

        System.out.println("--------------------------");

        LocalDate compara = LocalDate.of(2024, Month.APRIL, 26);
        Period periodo = Period.between(compara, dtHoje);
        System.out.println("Periodo do ano: " + periodo.getYears());
        System.out.println("Periodo do mês: " + periodo.getMonths());
        System.out.println("Periodo do dia: " + periodo.getDays());

    }
}
