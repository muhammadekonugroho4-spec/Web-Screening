package androidx.compose.ui.text.android.selection;

import android.os.Build;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract class g {
    public static final f a(CharSequence r2, TextPaint r3) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return new d(r2, r3);
    L7:
        return new e(r2);
    }
}
