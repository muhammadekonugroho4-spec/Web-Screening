package com.google.firebase.heartbeatinfo;

/* loaded from: classes6.dex */
final class AutoValue_SdkHeartBeatResult extends SdkHeartBeatResult {
    private final long millis;
    private final String sdkName;

    public AutoValue_SdkHeartBeatResult(String r1, long r2) {
        if (r1 == null) goto L7;
        this.sdkName = r1;
        this.millis = r2;
        return;
    L7:
        throw new NullPointerException("Null sdkName");
    }

    public boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof SdkHeartBeatResult) == false) goto L12;
        SdkHeartBeatResult r82 = (SdkHeartBeatResult) r8;
        if (this.sdkName.equals(r82.getSdkName()) == false) goto L12;
        if (this.millis != r82.getMillis()) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public long getMillis() {
        return this.millis;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public String getSdkName() {
        return this.sdkName;
    }

    public int hashCode() {
        int r02 = (this.sdkName.hashCode() ^ 1000003) * 1000003;
        long r1 = this.millis;
        return r02 ^ ((int) (r1 ^ (r1 >>> 32)));
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.sdkName + ", millis=" + this.millis + "}";
    }
}
