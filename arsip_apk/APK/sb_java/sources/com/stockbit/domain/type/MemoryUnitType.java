package com.stockbit.domain.type;

import io.sentry.SentryOptions;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stockbit/domain/type/MemoryUnitType;", "", "basis", "", "<init>", "(Ljava/lang/String;IJ)V", "getBasis", "()J", "BYTE", "KB", "MB", "GB", "TB", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum MemoryUnitType extends Enum<MemoryUnitType> {
    public static final MemoryUnitType BYTE = null;
    public static final MemoryUnitType GB = null;
    public static final MemoryUnitType KB = null;
    public static final MemoryUnitType MB = null;
    public static final MemoryUnitType TB = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MemoryUnitType[] f87650a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f87651b = null;
    private final long basis;

    static {
        BYTE = new MemoryUnitType("BYTE", 0, 1);
        KB = new MemoryUnitType("KB", 1, 1024);
        MB = new MemoryUnitType("MB", 2, SentryOptions.MAX_EVENT_SIZE_BYTES);
        GB = new MemoryUnitType("GB", 3, 1073741824);
        TB = new MemoryUnitType("TB", 4, 1099511627776L);
        MemoryUnitType[] r02 = a();
        f87650a = r02;
        f87651b = b.a(r02);
    }

    MemoryUnitType(String r1, int r2, long r3) {
        this.basis = r3;
    }

    public static final /* synthetic */ MemoryUnitType[] a() {
        return new MemoryUnitType[]{BYTE, KB, MB, GB, TB};
    }

    public static a getEntries() {
        return f87651b;
    }

    public static MemoryUnitType valueOf(String r1) {
        return (MemoryUnitType) Enum.valueOf(MemoryUnitType.class, r1);
    }

    public static MemoryUnitType[] values() {
        return (MemoryUnitType[]) f87650a.clone();
    }

    public final long getBasis() {
        return this.basis;
    }
}
