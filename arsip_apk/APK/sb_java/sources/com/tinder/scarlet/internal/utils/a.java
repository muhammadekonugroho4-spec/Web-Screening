package com.tinder.scarlet.internal.utils;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f173748a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final C1826a f173749b = null;

    /* renamed from: com.tinder.scarlet.internal.utils.a$a, reason: collision with other inner class name */
    public static final class C1826a {
        public C1826a() {
        }

        public static final /* synthetic */ a a(C1826a r02) {
            return r02.b();
        }

        public final a b() {
            Class.forName("java.util.Optional");     // Catch: ClassNotFoundException -> L4
            return new c();
        L5:
            return new b();
        }

        public final a c() {
            return a.a();
        }

        public /* synthetic */ C1826a(i r1) {
            this();
        }
    }

    public static final class b extends a {
        public b() {
            super(null);
        }
    }

    public static final class c extends a {
        public c() {
            super(null);
        }

        @Override // com.tinder.scarlet.internal.utils.a
        public Object b(Method r3, Class r4, Object r5, Object[]... r6) {
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            p.l(r4, "declaringClass");
            p.l(r5, "proxy");
            p.l(r6, "args");
            Constructor r02 = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            p.k(r02, "constructor");
            r02.setAccessible(true);
            Object r32 = ((MethodHandles.Lookup) r02.newInstance(new Object[]{r4, -1})).unreflectSpecial(r3, r4).bindTo(r5).invokeWithArguments(new Object[]{r6});
            p.k(r32, "constructor.newInstance(…invokeWithArguments(args)");
            return r32;
        }

        @Override // com.tinder.scarlet.internal.utils.a
        public boolean c(Method r2) {
            p.l(r2, FirebaseAnalytics.Param.METHOD);
            return r2.isDefault();
        }
    }

    static {
        C1826a r02 = new C1826a(null);
        f173749b = r02;
        f173748a = C1826a.a(r02);
    }

    public a() {
    }

    public static final /* synthetic */ a a() {
        return f173748a;
    }

    public Object b(Method r2, Class r3, Object r4, Object[]... r5) {
        p.l(r2, FirebaseAnalytics.Param.METHOD);
        p.l(r3, "declaringClass");
        p.l(r4, "proxy");
        p.l(r5, "args");
        throw new UnsupportedOperationException();
    }

    public boolean c(Method r2) {
        p.l(r2, FirebaseAnalytics.Param.METHOD);
        return false;
    }

    public /* synthetic */ a(i r1) {
        this();
    }
}
