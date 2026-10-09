package androidx.compose.ui.res;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.N;
import androidx.compose.ui.graphics.O0;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class b {
    public static final O0 a(O0.a r02, Resources r1, int r2) {
        Drawable r03 = r1.getDrawable(r2, null);
        p.j(r03, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return N.c(((BitmapDrawable) r03).getBitmap());
    }
}
