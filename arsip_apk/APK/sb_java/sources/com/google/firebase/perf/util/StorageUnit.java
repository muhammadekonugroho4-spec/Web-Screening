package com.google.firebase.perf.util;

import io.sentry.SentryOptions;

/* loaded from: classes6.dex */
public enum StorageUnit extends Enum<StorageUnit> {
    private static final /* synthetic */ StorageUnit[] $VALUES = null;
    public static final StorageUnit BYTES = null;
    public static final StorageUnit GIGABYTES = null;
    public static final StorageUnit KILOBYTES = null;
    public static final StorageUnit MEGABYTES = null;
    public static final StorageUnit TERABYTES = null;
    long numBytes;

    private static /* synthetic */ StorageUnit[] $values() {
        return new StorageUnit[]{TERABYTES, GIGABYTES, MEGABYTES, KILOBYTES, BYTES};
    }

    static {
        final int r1 = 0;
        final long r2 = 1099511627776L;
        final String r4 = "TERABYTES";
        TERABYTES = new AnonymousClass1(r4, r1, r2);
        final int r12 = 1;
        final long r22 = 1073741824;
        final String r42 = "GIGABYTES";
        GIGABYTES = new AnonymousClass2(r42, r12, r22);
        final int r13 = 2;
        final long r23 = SentryOptions.MAX_EVENT_SIZE_BYTES;
        final String r43 = "MEGABYTES";
        MEGABYTES = new AnonymousClass3(r43, r13, r23);
        final int r14 = 3;
        final long r24 = 1024;
        final String r44 = "KILOBYTES";
        KILOBYTES = new AnonymousClass4(r44, r14, r24);
        final int r15 = 4;
        final long r25 = 1;
        final String r45 = "BYTES";
        BYTES = new AnonymousClass5(r45, r15, r25);
        $VALUES = $values();
    }

    /* synthetic */ StorageUnit(String r1, int r2, long r3, AnonymousClass1 r5) {
        this(r1, r2, r3);
    }

    public static StorageUnit valueOf(String r1) {
        return (StorageUnit) Enum.valueOf(StorageUnit.class, r1);
    }

    public static StorageUnit[] values() {
        return (StorageUnit[]) $VALUES.clone();
    }

    public abstract long convert(long r1, StorageUnit r3);

    public long toBytes(long r3) {
        return r3 * this.numBytes;
    }

    public long toGigabytes(long r3) {
        return (r3 * this.numBytes) / GIGABYTES.numBytes;
    }

    public long toKilobytes(long r3) {
        return (r3 * this.numBytes) / KILOBYTES.numBytes;
    }

    public long toMegabytes(long r3) {
        return (r3 * this.numBytes) / MEGABYTES.numBytes;
    }

    public long toTerabytes(long r3) {
        return (r3 * this.numBytes) / TERABYTES.numBytes;
    }

    StorageUnit(String r1, int r2, long r3) {
        this.numBytes = r3;
    }
}
