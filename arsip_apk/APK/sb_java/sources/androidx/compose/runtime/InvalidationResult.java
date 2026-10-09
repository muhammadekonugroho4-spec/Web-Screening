package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/InvalidationResult;", "", "<init>", "(Ljava/lang/String;I)V", "IGNORED", "SCHEDULED", "DEFERRED", "IMMINENT", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum InvalidationResult extends Enum<InvalidationResult> {
    public static final InvalidationResult DEFERRED = null;
    public static final InvalidationResult IGNORED = null;
    public static final InvalidationResult IMMINENT = null;
    public static final InvalidationResult SCHEDULED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InvalidationResult[] f15929a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f15930b = null;

    static {
        IGNORED = new InvalidationResult("IGNORED", 0);
        SCHEDULED = new InvalidationResult("SCHEDULED", 1);
        DEFERRED = new InvalidationResult("DEFERRED", 2);
        IMMINENT = new InvalidationResult("IMMINENT", 3);
        InvalidationResult[] r02 = a();
        f15929a = r02;
        f15930b = kotlin.enums.b.a(r02);
    }

    InvalidationResult(String r1, int r2) {
    }

    public static final /* synthetic */ InvalidationResult[] a() {
        return new InvalidationResult[]{IGNORED, SCHEDULED, DEFERRED, IMMINENT};
    }

    public static kotlin.enums.a getEntries() {
        return f15930b;
    }

    public static InvalidationResult valueOf(String r1) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, r1);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) f15929a.clone();
    }
}
