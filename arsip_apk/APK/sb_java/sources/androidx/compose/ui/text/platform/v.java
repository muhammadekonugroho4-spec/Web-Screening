package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.o2;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final o2 f20227a;

    /* renamed from: b, reason: collision with root package name */
    public final v f20228b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20229c;

    public v(o2 r1, v r2) {
        this.f20227a = r1;
        this.f20228b = r2;
        this.f20229c = r1.getValue();
    }

    public final Typeface a() {
        Object r02 = this.f20229c;
        kotlin.jvm.internal.p.j(r02, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) r02;
    }

    public final boolean b() {
        if (this.f20227a.getValue() != this.f20229c) goto L11;
        v r02 = this.f20228b;
        if (r02 != null) goto L7;
        return false;
    L7:
        if (r02.b() == true) goto L14;
        return false;
    L14:
        return true;
    L11:
        return true;
    }
}
