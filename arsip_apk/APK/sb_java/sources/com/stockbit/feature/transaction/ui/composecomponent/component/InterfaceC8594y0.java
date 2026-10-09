package com.stockbit.feature.transaction.ui.composecomponent.component;

/* renamed from: com.stockbit.feature.transaction.ui.composecomponent.component.y0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC8594y0 {

    /* renamed from: com.stockbit.feature.transaction.ui.composecomponent.component.y0$a */
    public static final class a implements InterfaceC8594y0 {

        /* renamed from: a, reason: collision with root package name */
        public final kotlin.jvm.functions.a f112559a;

        static {
        }

        public a(kotlin.jvm.functions.a r2) {
            kotlin.jvm.internal.p.l(r2, "onClick");
            this.f112559a = r2;
        }

        public final kotlin.jvm.functions.a a() {
            return this.f112559a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f112559a, ((a) r4).f112559a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f112559a.hashCode();
        }

        public String toString() {
            return "Custom(onClick=" + this.f112559a + ')';
        }
    }

    /* renamed from: com.stockbit.feature.transaction.ui.composecomponent.component.y0$b */
    public static final class b implements InterfaceC8594y0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f112560a = null;

        static {
            f112560a = new b();
        }

        public b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1951450861;
        }

        public String toString() {
            return "FillAndKillTooltip";
        }
    }

    /* renamed from: com.stockbit.feature.transaction.ui.composecomponent.component.y0$c */
    public static final class c implements InterfaceC8594y0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f112561a = null;

        static {
            f112561a = new c();
        }

        public c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1045269242;
        }

        public String toString() {
            return "None";
        }
    }
}
