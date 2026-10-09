package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;

/* renamed from: androidx.compose.ui.platform.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3683s {

    /* renamed from: a, reason: collision with root package name */
    public static final C3683s f19368a = null;

    static {
        f19368a = new C3683s();
    }

    public C3683s() {
    }

    public final void a(ViewStructure r1, View r2) {
        r1.setClassName(r2.getAccessibilityClassName().toString());
    }
}
