package androidx.compose.ui.graphics.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.graphics.X0;

/* loaded from: classes.dex */
public abstract class d {
    public static final BlurMaskFilter a(float r2) {
        return new BlurMaskFilter(r2, BlurMaskFilter.Blur.NORMAL);
    }

    public static final void b(X0 r02, BlurMaskFilter r1) {
        r02.o().setMaskFilter(r1);
    }
}
