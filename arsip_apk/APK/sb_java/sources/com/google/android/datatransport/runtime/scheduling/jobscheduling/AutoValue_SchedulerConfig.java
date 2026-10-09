package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;

/* loaded from: classes4.dex */
final class AutoValue_SchedulerConfig extends SchedulerConfig {
    private final Clock clock;
    private final Map<Priority, SchedulerConfig.ConfigValue> values;

    public AutoValue_SchedulerConfig(Clock r1, Map<Priority, SchedulerConfig.ConfigValue> r2) {
        if (r1 == null) goto L11;
        this.clock = r1;
        if (r2 == null) goto L9;
        this.values = r2;
        return;
    L9:
        throw new NullPointerException("Null values");
    L11:
        throw new NullPointerException("Null clock");
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof SchedulerConfig) == false) goto L12;
        SchedulerConfig r52 = (SchedulerConfig) r5;
        if (this.clock.equals(r52.getClock()) == false) goto L12;
        if (this.values.equals(r52.getValues()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public Clock getClock() {
        return this.clock;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public Map<Priority, SchedulerConfig.ConfigValue> getValues() {
        return this.values;
    }

    public int hashCode() {
        return ((this.clock.hashCode() ^ 1000003) * 1000003) ^ this.values.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.clock + ", values=" + this.values + "}";
    }
}
