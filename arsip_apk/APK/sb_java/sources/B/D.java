package B;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public final class D implements androidx.viewbinding.a {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f118a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f119b;

    /* renamed from: c, reason: collision with root package name */
    public final ProgressBar f120c;

    public D(FrameLayout r1, FrameLayout r2, ProgressBar r3) {
        this.f118a = r1;
        this.f119b = r2;
        this.f120c = r3;
    }

    @Override // androidx.viewbinding.a
    public final View getRoot() {
        return this.f118a;
    }
}
