 package programming_challlenges;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Quiz {
 public static void main(String[] args) {
    String numbers = "012345678";
    System.out.println(numbers.substring(1, 3));
    System.out.println(numbers.substring(7, 7));
    System.out.println(numbers.substring(7));
    LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
Period p = Period.ofDays(1).ofYears(2);
d = d.minus(p);
DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
.SHORT);
System.out.println(f.format(d));


 } 

}
 
 public class Classroom {
       private int roomNumber;
       protected String teacherName;
     static int globalKey = 54321;
6      public int floor = 3;
7      Classroom(int r, String t) {
          roomNumber = r;
9        teacherName = t; } }

 package my.city;
import my.school.*;
     public class School {
        public static void main(String[] args) {
           System.out.println(Classroom.globalKey);
          Classroom room = new Classroom(101, ""Mrs. Anderson")          System.out.println(room.roomNumber);         System.out.println(room.floor);
        System.out.println(room.teacherName); } }