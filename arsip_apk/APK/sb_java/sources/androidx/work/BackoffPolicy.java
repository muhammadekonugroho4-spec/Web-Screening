package androidx.work;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/BackoffPolicy;", "", "(Ljava/lang/String;I)V", "EXPONENTIAL", "LINEAR", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum BackoffPolicy extends Enum<BackoffPolicy> {
    public static final BackoffPolicy EXPONENTIAL = null;
    public static final BackoffPolicy LINEAR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BackoffPolicy[] f29017a = null;

    static {
        EXPONENTIAL = new BackoffPolicy("EXPONENTIAL", 0);
        LINEAR = new BackoffPolicy("LINEAR", 1);
        f29017a = a();
    }

    BackoffPolicy(String r1, int r2) {
    }

    public static final /* synthetic */ BackoffPolicy[] a() {
        return new BackoffPolicy[]{EXPONENTIAL, LINEAR};
    }

    public static BackoffPolicy valueOf(String r1) {
        return (BackoffPolicy) Enum.valueOf(BackoffPolicy.class, r1);
    }

    public static BackoffPolicy[] values() {
        return (BackoffPolicy[]) f29017a.clone();
    }
}
