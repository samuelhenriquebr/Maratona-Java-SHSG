package br.com.abc.javacore.Tdata.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        //ISO 639 pt = portugues BR - Brazil, en - ingles, US - Estados Unidos
        Locale locItaly = new Locale("it");
        Locale locSuica = new Locale("it", "CH");
        Locale locIndia = new Locale("hi", "IN");
        Locale locJapan = new Locale("ja");

        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar.DECEMBER, 23);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locJapan);

        System.out.println("Italia "+df.format(c.getTime()));
        System.out.println("Suiça "+df2.format(c.getTime()));
        System.out.println("India "+df3.format(c.getTime()));
        System.out.println("Japão "+df4.format(c.getTime()));

        System.out.println(locItaly.getDisplayLanguage());
        System.out.println(locSuica.getDisplayLanguage());
        System.out.println(locJapan.getDisplayLanguage());
        System.out.println(locIndia.getDisplayLanguage());

        System.out.println(locItaly.getDisplayLanguage(locJapan));
        System.out.println(locJapan.getDisplayLanguage(locItaly));

        System.out.println(locSuica.getDisplayCountry());
        System.out.println(locSuica.getDisplayCountry(locItaly));
        System.out.println(locSuica.getDisplayCountry(locIndia));
    }
}
