package androidx.appcompat.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.E;
import androidx.core.content.b;

/* loaded from: classes.dex */
public abstract class a {
    public static ColorStateList a(Context r02, int r1) {
        return b.getColorStateList(r02, r1);
    }

    public static Drawable b(Context r1, int r2) {
        return E.g().i(r1, r2);
    }
}
