package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.SessionVerbosity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = null;
    private final Timer creationTime;
    private boolean isGaugeAndEventCollectionEnabled;
    private final String sessionId;

    static {
        CREATOR = new AnonymousClass1();
    }

    public /* synthetic */ PerfSession(Parcel r1, AnonymousClass1 r2) {
        this(r1);
    }

    public static com.google.firebase.perf.v1.PerfSession[] buildAndSort(List<PerfSession> r8) {
        if (r8.isEmpty() == false) goto L6;
        return null;
    L6:
        com.google.firebase.perf.v1.PerfSession[] r02 = new com.google.firebase.perf.v1.PerfSession[r8.size()];
        com.google.firebase.perf.v1.PerfSession r2 = r8.get(0).build();
        boolean r5 = false;
        int r4 = 1;
    L8:
        if (r4 >= r8.size()) goto L16;
        com.google.firebase.perf.v1.PerfSession r6 = r8.get(r4).build();
        if (r5 == false) goto L12;
    L14:
        r02[r4] = r6;
    L15:
        r4 = r4 + 1;
        goto L8
    L12:
        if (r8.get(r4).isVerbose() == false) goto L14;
        r02[0] = r6;
        r02[r4] = r2;
        r5 = true;
        goto L15
    L16:
        if (r5 == true) goto L18;
        r02[0] = r2;
    L18:
        return r02;
    }

    public static PerfSession createWithId(String r2) {
        PerfSession r02 = new PerfSession(r2.replace("-", ""), new Clock());
        r02.setGaugeAndEventCollectionEnabled(shouldCollectGaugesAndEvents());
        return r02;
    }

    public static boolean shouldCollectGaugesAndEvents() {
        ConfigResolver r02 = ConfigResolver.getInstance();
        if (r02.isPerformanceMonitoringEnabled() == true) goto L5;
        return false;
    L5:
        if (Math.random() >= r02.getSessionsSamplingRate()) goto L10;
        return true;
    L10:
        return false;
    }

    public com.google.firebase.perf.v1.PerfSession build() {
        PerfSession.Builder r02 = com.google.firebase.perf.v1.PerfSession.newBuilder().setSessionId(this.sessionId);
        if (this.isGaugeAndEventCollectionEnabled == false) goto L6;
        r02.addSessionVerbosity(SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS);
    L6:
        return r02.build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Timer getTimer() {
        return this.creationTime;
    }

    public boolean isGaugeAndEventCollectionEnabled() {
        return this.isGaugeAndEventCollectionEnabled;
    }

    public boolean isSessionRunningTooLong() {
        if (TimeUnit.MICROSECONDS.toMinutes(this.creationTime.getDurationMicros()) <= ConfigResolver.getInstance().getSessionsMaxDurationMinutes()) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isVerbose() {
        return this.isGaugeAndEventCollectionEnabled;
    }

    public String sessionId() {
        return this.sessionId;
    }

    public void setGaugeAndEventCollectionEnabled(boolean r1) {
        this.isGaugeAndEventCollectionEnabled = r1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        r2.writeString(this.sessionId);
        r2.writeByte(this.isGaugeAndEventCollectionEnabled ? 1 : 0);
        r2.writeParcelable(this.creationTime, 0);
    }

    public PerfSession(String r2, Clock r3) {
        this.isGaugeAndEventCollectionEnabled = false;
        this.sessionId = r2;
        this.creationTime = r3.getTime();
    }

    public static boolean isVerbose(com.google.firebase.perf.v1.PerfSession r2) {
        Iterator<SessionVerbosity> r22 = r2.getSessionVerbosityList().iterator();
    L4:
        if (r22.hasNext() == false) goto L9;
        if (r22.next() != SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS) goto L4;
        return true;
    L9:
        return false;
    }

    private PerfSession(Parcel r3) {
        boolean r02 = false;
        this.isGaugeAndEventCollectionEnabled = false;
        this.sessionId = r3.readString();
        if (r3.readByte() == 0) goto L5;
        r02 = true;
    L5:
        this.isGaugeAndEventCollectionEnabled = r02;
        this.creationTime = (Timer) r3.readParcelable(Timer.class.getClassLoader());
    }
}
