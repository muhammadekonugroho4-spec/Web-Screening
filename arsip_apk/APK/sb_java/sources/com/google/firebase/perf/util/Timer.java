package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = null;
    private long elapsedRealtimeMicros;
    private long wallClockMicros;

    static {
        CREATOR = new AnonymousClass1();
    }

    public /* synthetic */ Timer(Parcel r1, AnonymousClass1 r2) {
        this(r1);
    }

    private static long elapsedRealtimeMicros() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static Timer ofElapsedRealtime(long r4) {
        long r42 = TimeUnit.MILLISECONDS.toMicros(r4);
        return new Timer(wallClockMicros() + (r42 - elapsedRealtimeMicros()), r42);
    }

    private static long wallClockMicros() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrentTimestampMicros() {
        return this.wallClockMicros + getDurationMicros();
    }

    public long getDurationMicros() {
        return getDurationMicros(new Timer());
    }

    public long getMicros() {
        return this.wallClockMicros;
    }

    public void reset() {
        this.wallClockMicros = wallClockMicros();
        this.elapsedRealtimeMicros = elapsedRealtimeMicros();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        r3.writeLong(this.wallClockMicros);
        r3.writeLong(this.elapsedRealtimeMicros);
    }

    public Timer() {
        this(wallClockMicros(), elapsedRealtimeMicros());
    }

    public long getDurationMicros(Timer r5) {
        return r5.elapsedRealtimeMicros - this.elapsedRealtimeMicros;
    }

    public Timer(long r1, long r3) {
        this.wallClockMicros = r1;
        this.elapsedRealtimeMicros = r3;
    }

    public Timer(long r1) {
        this(r1, r1);
    }

    private Timer(Parcel r5) {
        this(r5.readLong(), r5.readLong());
    }
}
