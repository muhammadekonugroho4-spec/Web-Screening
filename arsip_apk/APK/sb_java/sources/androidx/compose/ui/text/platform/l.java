package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.z;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f20195a;

    static {
    }

    public l(Typeface r1) {
        this.f20195a = r1;
    }

    @Override // androidx.compose.ui.text.platform.k
    public Typeface a(z r1, int r2, int r3) {
        return this.f20195a;
    }
}
