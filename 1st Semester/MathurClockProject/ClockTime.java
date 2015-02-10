public class ClockTime implements Comparable<ClockTime> {
   private int hours;
   private int minutes;
   private String amPm;
   
   public ClockTime(int hours, int minutes, String amPm) {
      this.hours = hours;
      this.minutes = minutes;
      this.amPm = amPm;
   }
   
   public int getHours() { return hours; }
   public int getMinutes() { return minutes; }
   public String getAmPm() {return amPm; }
   
   public int compareTo(ClockTime other) {
      if (!amPm.equals(other.amPm))
         return amPm.compareTo(other.amPm);   
      if (hours != other.hours) return hours%12 - other.hours%12;
      return minutes - other.minutes;   
   }
   
   public String toString() {
      String minuteString = minutes + "";
      if (minutes < 10) minuteString += "0";
      return hours + ":" + minuteString + " " + amPm;
   }   
}         