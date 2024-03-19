public class LongWrapper {
    private long l;
    public LongWrapper(long l) {
        this.l = l;
    }

    public long getValue() {
        return l;
    }

    public void incrementValue() {
        synchronized (this) {
            l++;
        }
    }
}
