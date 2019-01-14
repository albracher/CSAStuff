package SecSemesterCSA;

public class NonExample {
        private int hours;
        private int minutes;

        // Constructs a time span with the given interval.
        // pre: hours >= 0 && minutes >= 0
        public TimeSpan(int hours, int minutes) {
            this.hours = 0;
            this.minutes = 0;
            add(hours, minutes);
        }

        // Adds the given interval to this time span.
        // pre: hours >= 0 && minutes >= 0
        public void add(int hours, int minutes) {
            this.hours += hours;
            this.minutes += minutes;

            // convert each 60 minutes into one hour
            this.hours += this.minutes / 60;
            this.minutes = this.minutes % 60;
        }

        public String toString() {
            return hours + "h " + minutes + "m";
    }
}
