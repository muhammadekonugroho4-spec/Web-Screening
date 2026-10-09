package kotlin.reflect.jvm.internal.impl.types.model;

/* loaded from: classes3.dex */
public enum CaptureStatus extends Enum<CaptureStatus> {
    public static final CaptureStatus FOR_INCORPORATION = null;
    public static final CaptureStatus FOR_SUBTYPING = null;
    public static final CaptureStatus FROM_EXPRESSION = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CaptureStatus[] f180113a = null;

    static {
        FOR_SUBTYPING = new CaptureStatus("FOR_SUBTYPING", 0);
        FOR_INCORPORATION = new CaptureStatus("FOR_INCORPORATION", 1);
        FROM_EXPRESSION = new CaptureStatus("FROM_EXPRESSION", 2);
        f180113a = a();
    }

    CaptureStatus(String r1, int r2) {
    }

    public static final /* synthetic */ CaptureStatus[] a() {
        return new CaptureStatus[]{FOR_SUBTYPING, FOR_INCORPORATION, FROM_EXPRESSION};
    }

    public static CaptureStatus valueOf(String r1) {
        return (CaptureStatus) Enum.valueOf(CaptureStatus.class, r1);
    }

    public static CaptureStatus[] values() {
        return (CaptureStatus[]) f180113a.clone();
    }
}
