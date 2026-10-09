package com.stockbit.common.extension;

import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class e {
    public static final void a(androidx.exifinterface.media.a r2, Collection r3) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        kotlin.jvm.internal.p.l(r3, Constants.KEY_TAGS);
        Iterator r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        r2.h0((String) r32.next(), null);
        goto L4
    L6:
        r2.c0();
    }
}
