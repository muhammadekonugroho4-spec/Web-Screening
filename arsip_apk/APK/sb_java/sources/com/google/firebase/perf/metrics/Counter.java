package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = null;
    private final AtomicLong count;
    private final String name;

    static {
        CREATOR = new AnonymousClass1();
    }

    public /* synthetic */ Counter(Parcel r1, AnonymousClass1 r2) {
        this(r1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCount() {
        return this.count.get();
    }

    public String getName() {
        return this.name;
    }

    public void increment(long r2) {
        this.count.addAndGet(r2);
    }

    public void setCount(long r2) {
        this.count.set(r2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        r3.writeString(this.name);
        r3.writeLong(this.count.get());
    }

    public Counter(String r3) {
        this.name = r3;
        this.count = new AtomicLong(0);
    }

    private Counter(Parcel r4) {
        this.name = r4.readString();
        this.count = new AtomicLong(r4.readLong());
    }
}
