package androidx.compose.material;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/SnackbarResult;", "", "<init>", "(Ljava/lang/String;I)V", "Dismissed", "ActionPerformed", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum SnackbarResult extends Enum<SnackbarResult> {
    public static final SnackbarResult ActionPerformed = null;
    public static final SnackbarResult Dismissed = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SnackbarResult[] f11486a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f11487b = null;

    static {
        Dismissed = new SnackbarResult("Dismissed", 0);
        ActionPerformed = new SnackbarResult("ActionPerformed", 1);
        SnackbarResult[] r02 = a();
        f11486a = r02;
        f11487b = kotlin.enums.b.a(r02);
    }

    SnackbarResult(String r1, int r2) {
    }

    public static final /* synthetic */ SnackbarResult[] a() {
        return new SnackbarResult[]{Dismissed, ActionPerformed};
    }

    public static kotlin.enums.a getEntries() {
        return f11487b;
    }

    public static SnackbarResult valueOf(String r1) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, r1);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) f11486a.clone();
    }
}
