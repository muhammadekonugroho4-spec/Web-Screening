package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
/* loaded from: classes6.dex */
public abstract class HeartBeatResult {
    public HeartBeatResult() {
    }

    public static HeartBeatResult create(String r1, List<String> r2) {
        return new AutoValue_HeartBeatResult(r1, r2);
    }

    public abstract List<String> getUsedDates();

    public abstract String getUserAgent();
}
