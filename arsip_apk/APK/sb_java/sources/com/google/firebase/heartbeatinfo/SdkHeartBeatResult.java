package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes6.dex */
public abstract class SdkHeartBeatResult implements Comparable<SdkHeartBeatResult> {
    public SdkHeartBeatResult() {
    }

    public static SdkHeartBeatResult create(String r1, long r2) {
        return new AutoValue_SdkHeartBeatResult(r1, r2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(SdkHeartBeatResult r1) {
        return compareTo2(r1);
    }

    public abstract long getMillis();

    public abstract String getSdkName();

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(SdkHeartBeatResult r5) {
        if (getMillis() >= r5.getMillis()) goto L6;
        return -1;
    L6:
        return 1;
    }
}
