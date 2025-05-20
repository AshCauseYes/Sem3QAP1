public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        String formattedHour = this.hour < 10 ? "0" + this.hour : Integer.toString(this.hour);
        String formattedMinute = this.minute < 10 ? "0" + this.minute : Integer.toString(this.minute);
        String formattedSecond = this.second < 10 ? "0" + this.second : Integer.toString(this.second);

        return formattedHour + ":" + formattedMinute + ':' + formattedSecond;
    }

    public Time nextSecond() {
        this.second += 1;
        
        if (this.second >= 60) {
            this.second = 0;
            this.minute += 1;
        }

        if (this.minute >= 60) {
            this.minute = 0;
            this.hour += 1;
        }

        Time incremented = new Time(this.hour, this.minute, this.second);
        return incremented;
    }

    public Time previousSecond() {
        this.second -= 1;

        if (this.second < 0) {
            this.second = 59;
            this.minute -= 1;
        }

        if (this.minute < 0) {
            this.minute = 59;
            this.hour -= 1;
        }

        if (this.hour < 0) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }

        Time decremented = new Time(this.hour, this.minute, this.second);
        return decremented;
    }
}