package androidx.work;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/OutOfQuotaPolicy;", "", "(Ljava/lang/String;I)V", "RUN_AS_NON_EXPEDITED_WORK_REQUEST", "DROP_WORK_REQUEST", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum OutOfQuotaPolicy extends Enum<OutOfQuotaPolicy> {
    public static final OutOfQuotaPolicy DROP_WORK_REQUEST = null;
    public static final OutOfQuotaPolicy RUN_AS_NON_EXPEDITED_WORK_REQUEST = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OutOfQuotaPolicy[] f29048a = null;

    static {
        RUN_AS_NON_EXPEDITED_WORK_REQUEST = new OutOfQuotaPolicy("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        DROP_WORK_REQUEST = new OutOfQuotaPolicy("DROP_WORK_REQUEST", 1);
        f29048a = a();
    }

    OutOfQuotaPolicy(String r1, int r2) {
    }

    public static final /* synthetic */ OutOfQuotaPolicy[] a() {
        return new OutOfQuotaPolicy[]{RUN_AS_NON_EXPEDITED_WORK_REQUEST, DROP_WORK_REQUEST};
    }

    public static OutOfQuotaPolicy valueOf(String r1) {
        return (OutOfQuotaPolicy) Enum.valueOf(OutOfQuotaPolicy.class, r1);
    }

    public static OutOfQuotaPolicy[] values() {
        return (OutOfQuotaPolicy[]) f29048a.clone();
    }
}
