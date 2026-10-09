package com.google.firebase.sessions;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/DataCollectionStatus;", "", "performance", "Lcom/google/firebase/sessions/DataCollectionState;", "crashlytics", "sessionSamplingRate", "", "(Lcom/google/firebase/sessions/DataCollectionState;Lcom/google/firebase/sessions/DataCollectionState;D)V", "getCrashlytics", "()Lcom/google/firebase/sessions/DataCollectionState;", "getPerformance", "getSessionSamplingRate", "()D", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DataCollectionStatus {
    private final DataCollectionState crashlytics;
    private final DataCollectionState performance;
    private final double sessionSamplingRate;

    public DataCollectionStatus() {
        DataCollectionState r1 = null;
        DataCollectionState r2 = null;
        double r3 = 0.0d;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ DataCollectionStatus copy$default(DataCollectionStatus r02, DataCollectionState r1, DataCollectionState r2, double r3, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.performance;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.crashlytics;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.sessionSamplingRate;
    L12:
        return r02.copy(r1, r2, r3);
    }

    public final DataCollectionState component1() {
        return this.performance;
    }

    public final DataCollectionState component2() {
        return this.crashlytics;
    }

    public final double component3() {
        return this.sessionSamplingRate;
    }

    public final DataCollectionStatus copy(DataCollectionState r2, DataCollectionState r3, double r4) {
        p.l(r2, "performance");
        p.l(r3, "crashlytics");
        return new DataCollectionStatus(r2, r3, r4);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof DataCollectionStatus) == true) goto L8;
        return false;
    L8:
        DataCollectionStatus r82 = (DataCollectionStatus) r8;
        if (this.performance == r82.performance) goto L12;
        return false;
    L12:
        if (this.crashlytics == r82.crashlytics) goto L15;
        return false;
    L15:
        if (Double.compare(this.sessionSamplingRate, r82.sessionSamplingRate) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public final DataCollectionState getCrashlytics() {
        return this.crashlytics;
    }

    public final DataCollectionState getPerformance() {
        return this.performance;
    }

    public final double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public int hashCode() {
        return (((this.performance.hashCode() * 31) + this.crashlytics.hashCode()) * 31) + Double.hashCode(this.sessionSamplingRate);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.performance + ", crashlytics=" + this.crashlytics + ", sessionSamplingRate=" + this.sessionSamplingRate + ')';
    }

    public DataCollectionStatus(DataCollectionState r2, DataCollectionState r3, double r4) {
        p.l(r2, "performance");
        p.l(r3, "crashlytics");
        this.performance = r2;
        this.crashlytics = r3;
        this.sessionSamplingRate = r4;
    }

    public /* synthetic */ DataCollectionStatus(DataCollectionState r1, DataCollectionState r2, double r3, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r3 = 1.0d;
    L11:
        this(r1, r2, r3);
    }
}
