package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* renamed from: androidx.compose.foundation.text.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2762h1 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f9955a;

    static {
    }

    public C2762h1() {
    }

    public final Integer a(KeyEvent r4) {
        int r42 = androidx.compose.ui.input.key.d.c(r4);
        Integer r1 = null;
        if ((Integer.MIN_VALUE & r42) == 0) goto L6;
        this.f9955a = Integer.valueOf(r42 & Integer.MAX_VALUE);
        return null;
    L6:
        Integer r02 = this.f9955a;
        if (r02 == null) goto L17;
        this.f9955a = null;
        Integer r03 = Integer.valueOf(KeyCharacterMap.getDeadChar(r02.intValue(), r42));
        if (r03.intValue() == 0) goto L12;
        r1 = r03;
    L12:
        if (r1 == null) goto L15;
        r42 = r1.intValue();
    L15:
        return Integer.valueOf(r42);
    L17:
        return Integer.valueOf(r42);
    }
}
