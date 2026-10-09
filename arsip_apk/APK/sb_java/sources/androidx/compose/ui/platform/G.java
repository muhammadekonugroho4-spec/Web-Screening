package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class G implements S0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f19161a;

    static {
    }

    public G(ViewConfiguration r1) {
        this.f19161a = r1;
    }

    @Override // androidx.compose.ui.platform.S0
    public long a() {
        return 40;
    }

    @Override // androidx.compose.ui.platform.S0
    public float b() {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return J.f19198a.b(this.f19161a);
    L7:
        return super.b();
    }

    @Override // androidx.compose.ui.platform.S0
    public float c() {
        return this.f19161a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.S0
    public float d() {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return J.f19198a.a(this.f19161a);
    L7:
        return super.d();
    }

    @Override // androidx.compose.ui.platform.S0
    public long e() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.S0
    public long f() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.S0
    public float g() {
        return this.f19161a.getScaledMinimumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.S0
    public float i() {
        return this.f19161a.getScaledMaximumFlingVelocity();
    }
}
