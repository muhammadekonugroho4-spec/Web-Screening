package B;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class t implements androidx.viewbinding.a {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f336a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewStub f337b;

    public t(FrameLayout r1, ViewStub r2) {
        this.f336a = r1;
        this.f337b = r2;
    }

    @Override // androidx.viewbinding.a
    public final View getRoot() {
        return this.f336a;
    }
}
