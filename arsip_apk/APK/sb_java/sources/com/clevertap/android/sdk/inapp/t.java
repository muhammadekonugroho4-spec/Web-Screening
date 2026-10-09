package com.clevertap.android.sdk.inapp;

import android.content.SharedPreferences;
import com.clevertap.android.sdk.D0;
import java.util.Iterator;
import java.util.Map;
import kotlin.w;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f34393a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f34394b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f34395c;
    public final kotlin.jvm.functions.l d;

    public t(SharedPreferences r2, SharedPreferences r3, Class r4, kotlin.jvm.functions.l r5) {
        kotlin.jvm.internal.p.l(r2, "oldSharedPreferences");
        kotlin.jvm.internal.p.l(r3, "newSharedPreferences");
        kotlin.jvm.internal.p.l(r4, "valueType");
        kotlin.jvm.internal.p.l(r5, "condition");
        this.f34393a = r2;
        this.f34394b = r3;
        this.f34395c = r4;
        this.d = r5;
    }

    public final void a() {
        Map<String, ?> r02 = this.f34393a.getAll();
        SharedPreferences.Editor r1 = this.f34394b.edit();
        kotlin.jvm.internal.p.i(r02);
        Iterator<Map.Entry<String, ?>> r03 = r02.entrySet().iterator();
    L4:
        if (r03.hasNext() == false) goto L40;
        Map.Entry<String, ?> r2 = r03.next();
        String r3 = r2.getKey();
        Object r22 = r2.getValue();
        if (this.f34395c.isInstance(r22) == false) goto L4;
        if (((Boolean) this.d.invoke(r22)).booleanValue() == false) goto L4;
        Class r4 = this.f34395c;
        if (kotlin.jvm.internal.p.g(r4, Boolean.class) == true) goto L11;
        if (kotlin.jvm.internal.p.g(r4, Integer.class) == true) goto L14;
        if (kotlin.jvm.internal.p.g(r4, Long.class) == true) goto L17;
        if (kotlin.jvm.internal.p.g(r4, Float.class) == true) goto L20;
        if (kotlin.jvm.internal.p.g(r4, String.class) == true) goto L23;
        if ((r22 instanceof Boolean) == false) goto L28;
        r1.putBoolean(r3, ((Boolean) r22).booleanValue());
    L39:
        w r23 = w.f180450a;
        goto L4
    L28:
        if ((r22 instanceof Integer) == false) goto L31;
        r1.putInt(r3, ((Number) r22).intValue());
        goto L39
    L31:
        if ((r22 instanceof Long) == false) goto L34;
        r1.putLong(r3, ((Number) r22).longValue());
        goto L39
    L34:
        if ((r22 instanceof Float) == false) goto L37;
        r1.putFloat(r3, ((Number) r22).floatValue());
        goto L39
    L37:
        if ((r22 instanceof String) == false) goto L39;
        r1.putString(r3, (String) r22);
        goto L39
    L23:
        kotlin.jvm.internal.p.j(r22, "null cannot be cast to non-null type kotlin.String");
        r1.putString(r3, (String) r22);
        goto L4
    L20:
        kotlin.jvm.internal.p.j(r22, "null cannot be cast to non-null type kotlin.Float");
        r1.putFloat(r3, ((Float) r22).floatValue());
        goto L4
    L17:
        kotlin.jvm.internal.p.j(r22, "null cannot be cast to non-null type kotlin.Long");
        r1.putLong(r3, ((Long) r22).longValue());
        goto L4
    L14:
        kotlin.jvm.internal.p.j(r22, "null cannot be cast to non-null type kotlin.Int");
        r1.putInt(r3, ((Integer) r22).intValue());
        goto L4
    L11:
        kotlin.jvm.internal.p.j(r22, "null cannot be cast to non-null type kotlin.Boolean");
        r1.putBoolean(r3, ((Boolean) r22).booleanValue());
        goto L4
    L40:
        D0.l(r1);
        this.f34393a.edit().clear().apply();
    }
}
