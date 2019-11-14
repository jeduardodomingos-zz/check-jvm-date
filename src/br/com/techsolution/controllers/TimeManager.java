package br.com.techsolution.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeManager {

    private final String jvmVersion = System.getProperty("java.version");
    private final SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
    private final SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");

    public void getActualTimeZone() {
        Calendar cl = Calendar.getInstance();

        try{
            cl.setTime(new Date());
            System.out.println("########################################### TIMEZONE JVM ###########################################\n");
            System.out.println("                                  Versão da JVM: " + jvmVersion);
            System.out.println("                                  TimeZone: " + cl.getTimeZone().getID());
            System.out.println("                                  Data: " + sdfDate.format(cl.getTime()));
            System.out.println("                                  Hora: " + sdfTime.format(cl.getTime()));
            System.out.println("                                  Horário de Verão Automático: " + (cl.getTimeZone().useDaylightTime() ? "Sim" : "Não"));
            System.out.println("                                  Horáro de Verão Ativo: " + (cl.getTimeZone().inDaylightTime(cl.getTime()) ? "Sim" : "Não"));
            System.out.println("#####################################################################################################");
        }catch (Exception ex){
            System.out.println("Erro ao obter informações de horário.\nDetalhes: " + ex.getMessage());
        }
    }

}
