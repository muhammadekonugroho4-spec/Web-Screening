package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.compose.ui.platform.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3664i implements InterfaceC3662h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19339b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19340c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f19341a;

    /* renamed from: androidx.compose.ui.platform.i$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f19339b = new a(null);
        f19340c = 8;
    }

    public C3664i(Context r2) {
        Object r22 = r2.getSystemService("accessibility");
        kotlin.jvm.internal.p.j(r22, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f19341a = (AccessibilityManager) r22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.InterfaceC3662h
    public long a(long r4, boolean r6, boolean r7, boolean r8) {
        int r62 = r6;
        if (r4 >= 2147483647L) goto L20;
        if (r7 == false) goto L7;
        r62 = (r6 ? 1 : 0) | 2;
    L7:
        if (r8 == false) goto L10;
        r62 = (r62 == true ? 1 : 0) | 4;
    L10:
        if (Build.VERSION.SDK_INT < 29) goto L16;
        int r42 = N.f19205a.a(this.f19341a, (int) r4, r62);
        if (r42 != Integer.MAX_VALUE) goto L15;
        return Long.MAX_VALUE;
    L15:
        return r42;
    L16:
        if (r8 == false) goto L20;
        if (this.f19341a.isTouchExplorationEnabled() == false) goto L20;
        return Long.MAX_VALUE;
    L20:
        return r4;
    }
}
