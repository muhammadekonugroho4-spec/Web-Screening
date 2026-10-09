package com.stockbit.android.util;

import android.content.Context;
import android.graphics.Typeface;
import java.lang.reflect.Field;

/* loaded from: classes6.dex */
public abstract class d {
    public static void a(Context r2, String r3, String r4) {
        Typeface r22 = Typeface.createFromAsset(r2.getAssets(), r4);     // Catch: Exception -> L4
        Field r02 = Typeface.class.getDeclaredField(r3);     // Catch: Exception -> L4
        r02.setAccessible(true);     // Catch: Exception -> L4
        r02.set(null, r22);     // Catch: Exception -> L4
        return;
    L4:
        timber.log.a.b("Can not set custom font " + r4 + " instead of " + r3 + "we", new Object[0]);
    }
}
