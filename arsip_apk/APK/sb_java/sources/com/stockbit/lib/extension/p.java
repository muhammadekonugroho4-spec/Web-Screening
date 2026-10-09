package com.stockbit.lib.extension;

import java.lang.ref.SoftReference;

/* loaded from: classes10.dex */
public abstract class p {

    public static final class a implements kotlin.properties.e {

        /* renamed from: a, reason: collision with root package name */
        public SoftReference f120155a;

        public a(Object r2) {
            this.f120155a = new SoftReference(r2);
        }

        @Override // kotlin.properties.e, kotlin.properties.d
        public Object a(Object r1, kotlin.reflect.l r2) {
            kotlin.jvm.internal.p.l(r2, "property");
            return this.f120155a.get();
        }

        @Override // kotlin.properties.e
        public void b(Object r1, kotlin.reflect.l r2, Object r3) {
            kotlin.jvm.internal.p.l(r2, "property");
            this.f120155a = new SoftReference(r3);
        }
    }

    public static final kotlin.properties.e a(Object r1) {
        return new a(r1);
    }
}
