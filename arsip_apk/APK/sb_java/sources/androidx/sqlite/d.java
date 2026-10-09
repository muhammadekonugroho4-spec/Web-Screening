package androidx.sqlite;

/* loaded from: classes4.dex */
public interface d extends AutoCloseable {
    void M0(int r1, String r2);

    @Override // java.lang.AutoCloseable
    void close();

    default boolean getBoolean(int r5) {
        if (getLong(r5) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    int getColumnCount();

    String getColumnName(int r1);

    double getDouble(int r1);

    default int getInt(int r3) {
        return (int) getLong(r3);
    }

    long getLong(int r1);

    boolean isNull(int r1);

    void m(int r1, long r2);

    void o(int r1);

    void p(int r1, double r2);

    void reset();

    boolean u0();

    String u1(int r1);
}
