package androidx.compose.foundation.text.input.internal;

import android.icu.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: androidx.compose.foundation.text.input.internal.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2781d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2781d0 f10271a = null;

    static {
        f10271a = new C2781d0();
    }

    public C2781d0() {
    }

    public final byte a(Locale r2) {
        return Character.getDirectionality(AbstractC2832q.b(AbstractC2777c0.a(DecimalFormatSymbols.getInstance(r2))[0], 0));
    }
}
