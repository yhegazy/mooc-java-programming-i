public class Timer {
    private ClockHand microseconds;
    private ClockHand seconds;
    
    public Timer() {
        this.microseconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.microseconds.advance();

        if (this.microseconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + microseconds;
    }
}