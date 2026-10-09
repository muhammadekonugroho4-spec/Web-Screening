package androidx.compose.foundation.text.input.internal;

import android.icu.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: androidx.compose.foundation.text.input.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2773b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2773b0 f10265a = null;

    static {
        f10265a = new C2773b0();
    }

    public C2773b0() {
    }

    public final byte a(Locale r1) {
        return Character.getDirectionality(DecimalFormatSymbols.getInstance(r1).getZeroDigit());
    }
}
