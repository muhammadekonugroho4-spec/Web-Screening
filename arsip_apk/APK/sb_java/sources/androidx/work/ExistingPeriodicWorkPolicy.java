package androidx.work;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/ExistingPeriodicWorkPolicy;", "", "(Ljava/lang/String;I)V", "REPLACE", "KEEP", "UPDATE", "CANCEL_AND_REENQUEUE", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum ExistingPeriodicWorkPolicy extends Enum<ExistingPeriodicWorkPolicy> {
    public static final ExistingPeriodicWorkPolicy CANCEL_AND_REENQUEUE = null;
    public static final ExistingPeriodicWorkPolicy KEEP = null;

    @kotlin.e
    public static final ExistingPeriodicWorkPolicy REPLACE = null;
    public static final ExistingPeriodicWorkPolicy UPDATE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ExistingPeriodicWorkPolicy[] f29028a = null;

    static {
        REPLACE = new ExistingPeriodicWorkPolicy("REPLACE", 0);
        KEEP = new ExistingPeriodicWorkPolicy("KEEP", 1);
        UPDATE = new ExistingPeriodicWorkPolicy("UPDATE", 2);
        CANCEL_AND_REENQUEUE = new ExistingPeriodicWorkPolicy("CANCEL_AND_REENQUEUE", 3);
        f29028a = a();
    }

    ExistingPeriodicWorkPolicy(String r1, int r2) {
    }

    public static final /* synthetic */ ExistingPeriodicWorkPolicy[] a() {
        return new ExistingPeriodicWorkPolicy[]{REPLACE, KEEP, UPDATE, CANCEL_AND_REENQUEUE};
    }

    public static ExistingPeriodicWorkPolicy valueOf(String r1) {
        return (ExistingPeriodicWorkPolicy) Enum.valueOf(ExistingPeriodicWorkPolicy.class, r1);
    }

    public static ExistingPeriodicWorkPolicy[] values() {
        return (ExistingPeriodicWorkPolicy[]) f29028a.clone();
    }
}
