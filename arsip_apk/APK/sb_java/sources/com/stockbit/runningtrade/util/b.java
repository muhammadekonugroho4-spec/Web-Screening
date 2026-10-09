package com.stockbit.runningtrade.util;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class b implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f131623a;

    static {
    }

    public b(int r3, int r4) {
        this.f131623a = Pattern.compile("^-?\\d{0," + r3 + "}([.]\\d{0," + r4 + "})?$");
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence r1, int r2, int r3, Spanned r4, int r5, int r6) {
        StringBuilder r22 = new StringBuilder();
        r22.append(r4);
        r22.append(r1);
        String r12 = r22.toString();
        if (this.f131623a.matcher(r12).matches() == true) goto L6;
        return "";
    L6:
        return null;
    }
}
