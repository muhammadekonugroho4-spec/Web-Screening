package com.stockbit.component.sharecontent.utils;

import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class d {
    public static final void a(TextView r2, String r3, int r4) {
        p.l(r2, "<this>");
        p.l(r3, Constants.KEY_TEXT);
        if (r3.length() < r4) goto L5;
        StringBuilder r02 = new StringBuilder();
        String r32 = r3.substring(0, r4 - 1);
        p.k(r32, "substring(...)");
        r02.append(r32);
        r02.append("...");
        r3 = r02.toString();
    L5:
        r2.setText(r3);
    }
}
