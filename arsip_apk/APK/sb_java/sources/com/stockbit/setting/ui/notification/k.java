package com.stockbit.setting.ui.notification;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class k {

    public static final class a extends k {

        /* renamed from: a, reason: collision with root package name */
        public static final a f136408a = null;

        static {
            f136408a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.notification.model.f f136409a;

        static {
        }

        public b(com.stockbit.usecase.notification.model.f r2) {
            p.l(r2, "setting");
            super(null);
            this.f136409a = r2;
        }

        public final com.stockbit.usecase.notification.model.f a() {
            return this.f136409a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f136409a, ((b) r4).f136409a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f136409a.hashCode();
        }

        public String toString() {
            return "OnUpdateNotificationSetting(setting=" + this.f136409a + ')';
        }
    }

    public static final class c extends k {

        /* renamed from: a, reason: collision with root package name */
        public static final c f136410a = null;

        static {
            f136410a = new c();
        }

        public c() {
            super(null);
        }
    }

    public static final class d extends k {

        /* renamed from: a, reason: collision with root package name */
        public static final d f136411a = null;

        static {
            f136411a = new d();
        }

        public d() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ k(kotlin.jvm.internal.i r1) {
        this();
    }

    public k() {
    }
}
