package br.com.myhelper.helper;

import java.util.Calendar;
import java.util.TimeZone;

public class Helper {
	
	public static final String TIMEZONE = new String("America/Sao_Paulo");
	//public static final String TIMEZONE = new String("GMT-03:00");
	private TimeZone timezone;
	
	public java.sql.Date getSqlDate() {
        Calendar data;
        int dia, mes, ano;

        data = Calendar.getInstance(timezone);
        dia = data.get(Calendar.DAY_OF_MONTH);
        mes = data.get(Calendar.MONTH);
        ano = data.get(Calendar.YEAR);

        data.set(ano, mes, dia, 0, 0, 0);
        return (new java.sql.Date(data.getTimeInMillis()));
    }

}
