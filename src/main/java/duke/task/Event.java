package duke.task;

/**
 * Represents an event task in the task list
 */
public class Event extends Task {

    protected String time;

    public Event(String description, String time) {
        super(description);
        this.time = time;
    }

    @Override
    public String getTime() { return this.time; }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + time + ")";
    }

    @Override
    public String getType() { return "E"; }
}
