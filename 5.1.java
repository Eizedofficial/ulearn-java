public interface TimeUnit {
    long toMillis();
    long toSeconds();
    long toMinutes();
    long toHours();
}

public class TimeUnitUtils {
    public static Milliseconds toMillis(TimeUnit timeUnit)
    {
        return new Milliseconds(timeUnit.toMillis());
    }
    public static Seconds toSeconds(TimeUnit timeUnit)
    {
        return new Seconds(timeUnit.toSeconds());
    }
    public static Minutes toMinutes(TimeUnit timeUnit)
    {
        return new Minutes(timeUnit.toMinutes());
    }
    public static Hours toHours(TimeUnit timeUnit)
    {
        return new Hours(timeUnit.toHours());
    }
}
public class Seconds implements TimeUnit{
    private final long value;
    public long getValue(){
        return value;
    }

    public Seconds(long value) {
        this.value = value;
    }

    @Override
    public long toMillis() {
        return value*1000;
    }

    @Override
    public long toSeconds() {
        return value;
    }

    @Override
    public long toMinutes() {
        return Math.round(value/60.0);
    }

    @Override
    public long toHours() {
        return Math.round(toMinutes()/60.0);
    }
}
public class Minutes implements TimeUnit{
    private final long value;

    public long getValue() {
        return value;
    }

    public Minutes(long value) {
        this.value = value;
    }

    @Override
    public long toMillis() {
        return toSeconds()*1000;
    }

    @Override
    public long toSeconds() {
        return value*60;
    }

    @Override
    public long toMinutes() {
        return value;
    }

    @Override
    public long toHours() {
        return Math.round(value/60.0);
    }
    //TODO реализуйте класс Minutes, который наследует класс TimeUnit

}

public class Milliseconds implements TimeUnit {
    private final long value;
    public long getValue(){
        return value;
    }

    public Milliseconds(long value) {
        this.value = value;
    }

    @Override
    public long toMillis() {
        return value;
    }

    @Override
    public long toSeconds() {
        return Math.round(value/1000.0);
    }

    @Override
    public long toMinutes() {
        return Math.round(toSeconds()/60.0);
    }

    @Override
    public long toHours() {
        return Math.round(toMinutes()/60.0);
	}
}

public class Hours implements TimeUnit{
    private final long value;

    public long getValue() {
        return value;
    }

    public Hours(long value) {
        this.value = value;
    }

    @Override
    public long toMillis() {
        return toSeconds()*1000;
    }

    @Override
    public long toSeconds() {
        return toMinutes()*60;
    }

    @Override
    public long toMinutes() {
        return value*60;
    }

    @Override
    public long toHours() {
        return value;
    }
}

