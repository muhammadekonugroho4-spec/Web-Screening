package androidx.compose.ui.platform;

import android.content.ClipData;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final ClipData f19279a;

    static {
    }

    public X(ClipData r1) {
        this.f19279a = r1;
    }

    public final ClipData a() {
        return this.f19279a;
    }

    public final Y b() {
        return AbstractC3670l.c(this.f19279a.getDescription());
    }
}
