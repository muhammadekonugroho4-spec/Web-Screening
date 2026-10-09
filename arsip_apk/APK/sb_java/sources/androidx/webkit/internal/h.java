package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final WebSettingsBoundaryInterface f28789a;

    public h(WebSettingsBoundaryInterface r1) {
        this.f28789a = r1;
    }

    public void a(boolean r2) {
        this.f28789a.setAlgorithmicDarkeningAllowed(r2);
    }

    public void b(int r2) {
        this.f28789a.setForceDarkBehavior(r2);
    }
}
