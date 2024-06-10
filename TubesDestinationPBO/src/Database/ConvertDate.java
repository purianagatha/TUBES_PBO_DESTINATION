/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ginas
 */
public class ConvertDate {
    public static String dateAdditionFromNow(String day){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dateOfWeekFormatter = DateTimeFormatter.ofPattern("e");
        LocalDateTime now = LocalDateTime.now();
        int days = (convertDayToInt(day) + Integer.parseInt(now.format(dateOfWeekFormatter))) % 7;
        return now.plusDays(days).format(formatter);
    }
    public static String dateFormatYYMMDD(String day){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateOfWeekFormatter = DateTimeFormatter.ofPattern("e");
        LocalDateTime now = LocalDateTime.now();
        int days = (convertDayToInt(day) + Integer.parseInt(now.format(dateOfWeekFormatter))) % 7;
        return now.plusDays(days).format(formatter);
    }
    
    private static int convertDayToInt(String day){
        String days[] = {"minggu", "senin", "selasa", "rabu", "kamis", "jumat", "sabtu"};
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(day.toLowerCase())) {
                return i + 1;
            }
        }
        return -1;
    }
}
