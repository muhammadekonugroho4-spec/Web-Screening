package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig;

/* loaded from: classes4.dex */
final class AutoValue_EventStoreConfig extends EventStoreConfig {
    private final int criticalSectionEnterTimeoutMs;
    private final long eventCleanUpAge;
    private final int loadBatchSize;
    private final int maxBlobByteSizePerRow;
    private final long maxStorageSizeInBytes;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder extends EventStoreConfig.Builder {
        private Integer criticalSectionEnterTimeoutMs;
        private Long eventCleanUpAge;
        private Integer loadBatchSize;
        private Integer maxBlobByteSizePerRow;
        private Long maxStorageSizeInBytes;

        public Builder() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig build() {
            String r1 = "";
            if (this.maxStorageSizeInBytes != null) goto L6;
            r1 = " maxStorageSizeInBytes";
        L6:
            if (this.loadBatchSize != null) goto L9;
            r1 = r1 + " loadBatchSize";
        L9:
            if (this.criticalSectionEnterTimeoutMs != null) goto L12;
            r1 = r1 + " criticalSectionEnterTimeoutMs";
        L12:
            if (this.eventCleanUpAge != null) goto L15;
            r1 = r1 + " eventCleanUpAge";
        L15:
            if (this.maxBlobByteSizePerRow != null) goto L18;
            r1 = r1 + " maxBlobByteSizePerRow";
        L18:
            if (r1.isEmpty() == false) goto L22;
            return new AutoValue_EventStoreConfig(this.maxStorageSizeInBytes.longValue(), this.loadBatchSize.intValue(), this.criticalSectionEnterTimeoutMs.intValue(), this.eventCleanUpAge.longValue(), this.maxBlobByteSizePerRow.intValue(), null);
        L22:
            throw new IllegalStateException("Missing required properties:" + r1);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setCriticalSectionEnterTimeoutMs(int r1) {
            this.criticalSectionEnterTimeoutMs = Integer.valueOf(r1);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setEventCleanUpAge(long r1) {
            this.eventCleanUpAge = Long.valueOf(r1);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setLoadBatchSize(int r1) {
            this.loadBatchSize = Integer.valueOf(r1);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setMaxBlobByteSizePerRow(int r1) {
            this.maxBlobByteSizePerRow = Integer.valueOf(r1);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setMaxStorageSizeInBytes(long r1) {
            this.maxStorageSizeInBytes = Long.valueOf(r1);
            return this;
        }
    }

    public /* synthetic */ AutoValue_EventStoreConfig(long r1, int r3, int r4, long r5, int r7, AnonymousClass1 r8) {
        this(r1, r3, r4, r5, r7);
    }

    public boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof EventStoreConfig) == false) goto L18;
        EventStoreConfig r82 = (EventStoreConfig) r8;
        if (this.maxStorageSizeInBytes != r82.getMaxStorageSizeInBytes()) goto L18;
        if (this.loadBatchSize != r82.getLoadBatchSize()) goto L18;
        if (this.criticalSectionEnterTimeoutMs != r82.getCriticalSectionEnterTimeoutMs()) goto L18;
        if (this.eventCleanUpAge != r82.getEventCleanUpAge()) goto L18;
        if (this.maxBlobByteSizePerRow != r82.getMaxBlobByteSizePerRow()) goto L18;
        return true;
    L18:
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getCriticalSectionEnterTimeoutMs() {
        return this.criticalSectionEnterTimeoutMs;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public long getEventCleanUpAge() {
        return this.eventCleanUpAge;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getLoadBatchSize() {
        return this.loadBatchSize;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getMaxBlobByteSizePerRow() {
        return this.maxBlobByteSizePerRow;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public long getMaxStorageSizeInBytes() {
        return this.maxStorageSizeInBytes;
    }

    public int hashCode() {
        long r02 = this.maxStorageSizeInBytes;
        int r03 = (((((((int) (r02 ^ (r02 >>> 32))) ^ 1000003) * 1000003) ^ this.loadBatchSize) * 1000003) ^ this.criticalSectionEnterTimeoutMs) * 1000003;
        long r3 = this.eventCleanUpAge;
        return ((r03 ^ ((int) ((r3 >>> 32) ^ r3))) * 1000003) ^ this.maxBlobByteSizePerRow;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.maxStorageSizeInBytes + ", loadBatchSize=" + this.loadBatchSize + ", criticalSectionEnterTimeoutMs=" + this.criticalSectionEnterTimeoutMs + ", eventCleanUpAge=" + this.eventCleanUpAge + ", maxBlobByteSizePerRow=" + this.maxBlobByteSizePerRow + "}";
    }

    private AutoValue_EventStoreConfig(long r1, int r3, int r4, long r5, int r7) {
        this.maxStorageSizeInBytes = r1;
        this.loadBatchSize = r3;
        this.criticalSectionEnterTimeoutMs = r4;
        this.eventCleanUpAge = r5;
        this.maxBlobByteSizePerRow = r7;
    }
}
