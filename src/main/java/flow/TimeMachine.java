package flow;

public class TimeMachine {
    private String year;
    private String month;
    private String day;
    private boolean hyperMode;

    public TimeMachine setYear(String year) {
        this.year = year;
        return this;
    }

    public TimeMachine setMonth(String month) {
        this.month = month;
        return this;
    }

    public TimeMachine setDay(String day) {
        this.day = day;
        return this;
    }

    public TimeMachine setHyperModeOn() {
        this.hyperMode = true;
        return this;
    }

    public TimeMachine setHyperModeOff() {
        this.hyperMode = false;
        return this;
    }

    public void pushTheButton() {
        System.out.println("blip-blip..");
    }

}
