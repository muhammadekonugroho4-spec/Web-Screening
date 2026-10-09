package com.stockbit.uikit.compose.button.v2.attributes;

import androidx.compose.ui.unit.i;

/* loaded from: classes11.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f151708a;

    /* renamed from: b, reason: collision with root package name */
    public final float f151709b;

    public static final class a extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final a f151710c = null;

        static {
            f151710c = new a();
        }

        public a() {
            super(i.h(44), i.h(18), null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1079177739;
        }

        public String toString() {
            return "Default";
        }
    }

    public static final class b extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final b f151711c = null;

        static {
            f151711c = new b();
        }

        public b() {
            super(i.h(44), i.h(18), null);
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
            return -1902609193;
        }

        public String toString() {
            return "ExtraLarge";
        }
    }

    public static final class c extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final c f151712c = null;

        static {
            f151712c = new c();
        }

        public c() {
            super(i.h(44), i.h(18), null);
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
            return -968142865;
        }

        public String toString() {
            return "Large";
        }
    }

    /* renamed from: com.stockbit.uikit.compose.button.v2.attributes.d$d, reason: collision with other inner class name */
    public static final class C1383d extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C1383d f151713c = null;
        public static final int d = 0;

        static {
            f151713c = new C1383d();
        }

        public C1383d() {
            super(i.h(40), i.h(16), null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1383d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 84250945;
        }

        public String toString() {
            return "Medium";
        }
    }

    public static final class e extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final e f151714c = null;

        static {
            f151714c = new e();
        }

        public e() {
            super(i.h(28), i.h(12), null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof e) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -961336901;
        }

        public String toString() {
            return "Small";
        }
    }

    static {
    }

    public /* synthetic */ d(float r1, float r2, kotlin.jvm.internal.i r3) {
        this(r1, r2);
    }

    public float a() {
        return this.f151708a;
    }

    public float b() {
        return this.f151709b;
    }

    public d(float r1, float r2) {
        this.f151708a = r1;
        this.f151709b = r2;
    }
}
