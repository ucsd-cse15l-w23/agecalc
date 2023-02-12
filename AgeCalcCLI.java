import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.Month;

class AgeCalc {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    int year = Integer.parseInt(args[0]);
    Month month = Month.of(Integer.parseInt(args[1]));
    int day = Integer.parseInt(args[2]);
    LocalDateTime provided = LocalDateTime.of(year, month, day, 0, 0);
    long difference = provided.until(now, ChronoUnit.YEARS);
    if(difference < 0) { System.out.println("You don't exist yet."); }
    else { System.out.println("You're " + difference + " yrs old."); }
  }
}
