package androidx.compose.material3;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/SnackbarDuration;", "", "<init>", "(Ljava/lang/String;I)V", "Short", "Long", "Indefinite", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum SnackbarDuration extends Enum<SnackbarDuration> {
    public static final SnackbarDuration Indefinite = null;
    public static final SnackbarDuration Long = null;
    public static final SnackbarDuration Short = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SnackbarDuration[] f12911a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f12912b = null;

    static {
        Short = new SnackbarDuration("Short", 0);
        Long = new SnackbarDuration("Long", 1);
        Indefinite = new SnackbarDuration("Indefinite", 2);
        SnackbarDuration[] r02 = a();
        f12911a = r02;
        f12912b = kotlin.enums.b.a(r02);
    }

    SnackbarDuration(String r1, int r2) {
    }

    public static final /* synthetic */ SnackbarDuration[] a() {
        return new SnackbarDuration[]{Short, Long, Indefinite};
    }

    public static kotlin.enums.a getEntries() {
        return f12912b;
    }

    public static SnackbarDuration valueOf(String r1) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, r1);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) f12911a.clone();
    }
}
