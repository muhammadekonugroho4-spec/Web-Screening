package com.google.firebase.heartbeatinfo;

import java.util.List;

/* loaded from: classes6.dex */
final class AutoValue_HeartBeatResult extends HeartBeatResult {
    private final List<String> usedDates;
    private final String userAgent;

    public AutoValue_HeartBeatResult(String r1, List<String> r2) {
        if (r1 == null) goto L11;
        this.userAgent = r1;
        if (r2 == null) goto L9;
        this.usedDates = r2;
        return;
    L9:
        throw new NullPointerException("Null usedDates");
    L11:
        throw new NullPointerException("Null userAgent");
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof HeartBeatResult) == false) goto L12;
        HeartBeatResult r52 = (HeartBeatResult) r5;
        if (this.userAgent.equals(r52.getUserAgent()) == false) goto L12;
        if (this.usedDates.equals(r52.getUsedDates()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public List<String> getUsedDates() {
        return this.usedDates;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        return ((this.userAgent.hashCode() ^ 1000003) * 1000003) ^ this.usedDates.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.userAgent + ", usedDates=" + this.usedDates + "}";
    }
}
