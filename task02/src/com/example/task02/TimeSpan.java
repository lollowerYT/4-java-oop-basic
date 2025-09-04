class TimeSpan{
    private int Hours;
    private int Minutes;
    private int Seconds;

    public  TimeSpan(int hours, int minutes, int seconds){
        correctTimeFormat(hours, minutes, seconds);
    }
    private void correctTimeFormat (int hours, int minutes, int seconds){
        if (seconds > 59) {
            minutes += seconds / 60;
            seconds %= 60;
        }
        if (minutes > 59) {
            hours += minutes / 60;
            minutes %= 60;
        }

        Hours = hours;
        Minutes = minutes;
        Seconds = seconds;
    }
    public int getSeconds() {
        return Seconds;
    }
    public void setSeconds(int Seconds) {
        this.Seconds = Seconds;
    }

    public int getMinutes() {
        return Minutes;
    }
    public void setMinutes(int Minutes) {
        this.Minutes = Minutes;
    }

    public int getHours() {
        return Hours;
    }
    public void setHours(int Hours) {
        this.Hours = Hours;
    }

    public void add(TimeSpan time){
        correctTimeFormat(Hours + time.Hours, Minutes + time.Minutes, Seconds + time.Seconds);
    }

    public void subtract(TimeSpan time) {
        correctTimeFormat(Math.abs(Hours - time.Hours), Math.abs(Minutes - time.Minutes), Math.abs(Seconds - time.Seconds));
    }

    public String toString() {
        return String.format("%d:%d:%d", Hours, Minutes, Seconds);
    }
}
