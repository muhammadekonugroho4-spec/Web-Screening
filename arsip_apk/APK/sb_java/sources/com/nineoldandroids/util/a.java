package com.nineoldandroids.util;

/* loaded from: classes6.dex */
public abstract class a extends c {
    public a(String r2) {
        super(Float.class, r2);
    }

    @Override // com.nineoldandroids.util.c
    public /* bridge */ /* synthetic */ void c(Object r1, Object r2) {
        d(r1, (Float) r2);
    }

    public final void d(Object r1, Float r2) {
        e(r1, r2.floatValue());
    }

    public abstract void e(Object r1, float r2);
}
