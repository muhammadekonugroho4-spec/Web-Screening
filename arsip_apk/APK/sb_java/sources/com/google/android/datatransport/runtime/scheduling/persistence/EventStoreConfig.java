package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes4.dex */
abstract class EventStoreConfig {
    static final EventStoreConfig DEFAULT = null;
    private static final long DURATION_ONE_WEEK_MS = 604800000;
    private static final int LOAD_BATCH_SIZE = 200;
    private static final int LOCK_TIME_OUT_MS = 10000;
    private static final int MAX_BLOB_BYTE_SIZE_PER_ROW = 81920;
    private static final long MAX_DB_STORAGE_SIZE_IN_BYTES = 10485760;

    @AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
        }

        public abstract EventStoreConfig build();

        public abstract Builder setCriticalSectionEnterTimeoutMs(int r1);

        public abstract Builder setEventCleanUpAge(long r1);

        public abstract Builder setLoadBatchSize(int r1);

        public abstract Builder setMaxBlobByteSizePerRow(int r1);

        public abstract Builder setMaxStorageSizeInBytes(long r1);
    }

    static {
        DEFAULT = builder().setMaxStorageSizeInBytes(MAX_DB_STORAGE_SIZE_IN_BYTES).setLoadBatchSize(LOAD_BATCH_SIZE).setCriticalSectionEnterTimeoutMs(10000).setEventCleanUpAge(DURATION_ONE_WEEK_MS).setMaxBlobByteSizePerRow(MAX_BLOB_BYTE_SIZE_PER_ROW).build();
    }

    public EventStoreConfig() {
    }

    public static Builder builder() {
        return new AutoValue_EventStoreConfig.Builder();
    }

    public abstract int getCriticalSectionEnterTimeoutMs();

    public abstract long getEventCleanUpAge();

    public abstract int getLoadBatchSize();

    public abstract int getMaxBlobByteSizePerRow();

    public abstract long getMaxStorageSizeInBytes();

    public Builder toBuilder() {
        return builder().setMaxStorageSizeInBytes(getMaxStorageSizeInBytes()).setLoadBatchSize(getLoadBatchSize()).setCriticalSectionEnterTimeoutMs(getCriticalSectionEnterTimeoutMs()).setEventCleanUpAge(getEventCleanUpAge()).setMaxBlobByteSizePerRow(getMaxBlobByteSizePerRow());
    }
}
