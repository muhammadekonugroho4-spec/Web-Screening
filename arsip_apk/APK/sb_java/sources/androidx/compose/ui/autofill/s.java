package androidx.compose.ui.autofill;

import kotlin.collections.Z;

/* loaded from: classes.dex */
public abstract class s {
    public static final r a(String r1) {
        return new e(Z.d(r1));
    }

    public static final String[] b(r r1) {
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((e) r1).a().toArray(new String[0]);
    }
}
