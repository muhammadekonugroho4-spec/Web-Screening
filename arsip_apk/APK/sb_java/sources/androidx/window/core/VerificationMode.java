package androidx.window.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/core/VerificationMode;", "", "<init>", "(Ljava/lang/String;I)V", "STRICT", "LOG", "QUIET", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum VerificationMode extends Enum<VerificationMode> {
    public static final VerificationMode LOG = null;
    public static final VerificationMode QUIET = null;
    public static final VerificationMode STRICT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ VerificationMode[] f28864a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f28865b = null;

    static {
        STRICT = new VerificationMode("STRICT", 0);
        LOG = new VerificationMode("LOG", 1);
        QUIET = new VerificationMode("QUIET", 2);
        VerificationMode[] r02 = a();
        f28864a = r02;
        f28865b = kotlin.enums.b.a(r02);
    }

    VerificationMode(String r1, int r2) {
    }

    public static final /* synthetic */ VerificationMode[] a() {
        return new VerificationMode[]{STRICT, LOG, QUIET};
    }

    public static kotlin.enums.a getEntries() {
        return f28865b;
    }

    public static VerificationMode valueOf(String r1) {
        return (VerificationMode) Enum.valueOf(VerificationMode.class, r1);
    }

    public static VerificationMode[] values() {
        return (VerificationMode[]) f28864a.clone();
    }
}
