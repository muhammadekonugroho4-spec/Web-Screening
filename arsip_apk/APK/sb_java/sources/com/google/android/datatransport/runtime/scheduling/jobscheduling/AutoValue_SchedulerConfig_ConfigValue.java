package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* loaded from: classes4.dex */
final class AutoValue_SchedulerConfig_ConfigValue extends SchedulerConfig.ConfigValue {
    private final long delta;
    private final Set<SchedulerConfig.Flag> flags;
    private final long maxAllowedDelay;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder extends SchedulerConfig.ConfigValue.Builder {
        private Long delta;
        private Set<SchedulerConfig.Flag> flags;
        private Long maxAllowedDelay;

        public Builder() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue build() {
            String r1 = "";
            if (this.delta != null) goto L6;
            r1 = " delta";
        L6:
            if (this.maxAllowedDelay != null) goto L9;
            r1 = r1 + " maxAllowedDelay";
        L9:
            if (this.flags != null) goto L12;
            r1 = r1 + " flags";
        L12:
            if (r1.isEmpty() == false) goto L16;
            return new AutoValue_SchedulerConfig_ConfigValue(this.delta.longValue(), this.maxAllowedDelay.longValue(), this.flags, null);
        L16:
            throw new IllegalStateException("Missing required properties:" + r1);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setDelta(long r1) {
            this.delta = Long.valueOf(r1);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setFlags(Set<SchedulerConfig.Flag> r2) {
            if (r2 == null) goto L6;
            this.flags = r2;
            return this;
        L6:
            throw new NullPointerException("Null flags");
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long r1) {
            this.maxAllowedDelay = Long.valueOf(r1);
            return this;
        }
    }

    public /* synthetic */ AutoValue_SchedulerConfig_ConfigValue(long r1, long r3, Set r5, AnonymousClass1 r6) {
        this(r1, r3, r5);
    }

    public boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof SchedulerConfig.ConfigValue) == false) goto L14;
        SchedulerConfig.ConfigValue r82 = (SchedulerConfig.ConfigValue) r8;
        if (this.delta != r82.getDelta()) goto L14;
        if (this.maxAllowedDelay != r82.getMaxAllowedDelay()) goto L14;
        if (this.flags.equals(r82.getFlags()) == false) goto L14;
        return true;
    L14:
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public long getDelta() {
        return this.delta;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public Set<SchedulerConfig.Flag> getFlags() {
        return this.flags;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public long getMaxAllowedDelay() {
        return this.maxAllowedDelay;
    }

    public int hashCode() {
        long r02 = this.delta;
        int r03 = (((int) (r02 ^ (r02 >>> 32))) ^ 1000003) * 1000003;
        long r3 = this.maxAllowedDelay;
        return ((r03 ^ ((int) ((r3 >>> 32) ^ r3))) * 1000003) ^ this.flags.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.delta + ", maxAllowedDelay=" + this.maxAllowedDelay + ", flags=" + this.flags + "}";
    }

    private AutoValue_SchedulerConfig_ConfigValue(long r1, long r3, Set<SchedulerConfig.Flag> r5) {
        this.delta = r1;
        this.maxAllowedDelay = r3;
        this.flags = r5;
    }
}
