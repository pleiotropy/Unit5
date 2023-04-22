public class Time {
    // instance variables
    private int h, m, s;

    // constructor(s)
    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    // method(s)
    public void tick(){
        if (s == 59) {
            s = 0;
            if (m == 59) {
                m = 0;
                if (h == 23) {
                    h = 0;
                }
                else {
                    h += 1;
                }
            }
            else {
                m += 1;
            }
        }
        else {
            s += 1;
        }
    }

    public void tickAlternate() {
        s += 1;
        if (s == 60) {
            s = 0;
            m += 1;
        }
        if (m == 60) {
            m = 0;
            h += 1;
        }
        if (h == 24) {
            h = 0;
        }
    }

    public void add(Time addedTime) {
        s += addedTime.getS();
        // check if seconds are over 60
        if (s > 60) {
            s -= 60;
            m += 1;
        }
        m += addedTime.getM();
        // check if minutes are over 60
        if (m > 60) {
            m -= 60;
            h += 1;
        }
        h += addedTime.getH();
        // check if hours are over 23
        if (h > 23) {
            h -= 24;
        }
    }

    public String toString() {
        // convert ints to Strings
        String hr, min, sec;
        hr = Integer.toString(h);
        min = Integer.toString(m);
        sec = Integer.toString(s);
        // check if they're 1 digit in length
        // if they are, add a leading 0
        if (hr.length() == 1) {
            hr = "0" + hr;
        }
        if (min.length() == 1) {
            min = "0" + min;
        }
        if (sec.length() == 1) {
            sec = "0" + sec;
        }
        return hr + ":" + min + ":" + sec;
    }

    // getters for add() method

    private int getH() {
        return h;
    }

    private int getM() {
        return m;
    }

    private int getS() {
        return s;
    }
}
