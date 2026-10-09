package com.nineoldandroids.util;

/* loaded from: classes6.dex */
public abstract class b extends c {
    public b(String r2) {
        super(Integer.class, r2);
    }

    @Override // com.nineoldandroids.util.c
    public /* bridge */ /* synthetic */ void c(Object r1, Object r2) {
        d(r1, (Integer) r2);
    }

    public final void d(Object r1, Integer r2) {
        r2.intValue();
        d(r1, r2);
    }
}
