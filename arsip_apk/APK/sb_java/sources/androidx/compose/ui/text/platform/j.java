package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes.dex */
public abstract class j {
    public static final void a(TextPaint r2, float r3) {
        if (Float.isNaN(r3) == false) goto L5;
        return;
    L5:
        if (r3 >= 0.0f) goto L8;
        r3 = 0.0f;
    L8:
        if (r3 <= 1.0f) goto L10;
        r3 = 1.0f;
    L10:
        r2.setAlpha(Math.round(r3 * Constants.MAX_HOST_LENGTH));
    }
}
