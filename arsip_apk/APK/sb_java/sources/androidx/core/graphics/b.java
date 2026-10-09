package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.core.graphics.c;

/* loaded from: classes.dex */
public abstract class b {

    public static class a {
        public static ColorFilter a(int r1, Object r2) {
            return new BlendModeColorFilter(r1, (BlendMode) r2);
        }
    }

    public static ColorFilter a(int r3, BlendModeCompat r4) {
        if (Build.VERSION.SDK_INT < 29) goto L9;
        Object r42 = c.b.a(r4);
        if (r42 != null) goto L7;
        return null;
    L7:
        return a.a(r3, r42);
    L9:
        PorterDuff.Mode r43 = c.a(r4);
        if (r43 != null) goto L12;
        return null;
    L12:
        return new PorterDuffColorFilter(r3, r43);
    }
}
