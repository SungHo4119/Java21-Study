package middle1.study19.ex1;

public class ImmutableMyDate {

  private final int year;
  private final int month;
  private final int day;

  public ImmutableMyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }
  public ImmutableMyDate newYear(int newYear){
    return new ImmutableMyDate(newYear, month, day);
  }

  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
  }

  @Override
  public String toString() {
    return "ImmutableMyDate{" +
        "year=" + year +
        ", month=" + month +
        ", day=" + day +
        '}';
  }
}
