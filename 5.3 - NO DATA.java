public class Logger {

    public Level level;
    public Calendar calendar;
    public String name;
    public String message;

    public String getName() {
        return name;
    }

    public String debug(String value) {
        return String.format("[DEBUG] <%s> <%s> - <%s>", calendar.getTime(), name, value);
    }

    public String info(String value) {
        return String.format("[INFO] <%s> <%s> - <%s>", calendar.getTime(), name, value);
    }

    public String warning(String value) {
        return String.format("[WARNING] <%s> <%s> - <%s>", calendar.getTime(), name, value);
    }

    public String error(String value) {
        return String.format("[ERROR] <%s> <%s> - <%s>", calendar.getTime(), name, value);
    }

    public String toString() {
        return String.format("[%s] <%s> <%s> - <%s>", level, calendar.getTime(), name, message);
    }

    public void log(Level level, String message) {
        this.level = level;
        this.message = message;
    }
    public void setCalendar(int year, int month, int day, int hour, int minutes, int seconds) {
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Moscow"));
        Calendar calendar = new GregorianCalendar(year,month-1,day,hour,minutes,seconds);
        this.calendar = calendar;

    }
}



public class logManager {

    public ArrayList<Logger> loggers = new ArrayList<>();

    public void AddLogger(Logger logger){
        loggers.add(logger);
    }
    public Logger GetLogger(String name)
    {
        for(Logger logger:loggers)
        {
            if (logger.getName().equals(name))
				return logger;
        }
        return new Logger();
    }

    public String printLoggers()
    {
        StringBuilder text = new StringBuilder();
        loggers.stream().forEach(x-> text.append(x.toString()+"\n"));
        return text.toString();
    }

}

