package com.stockbit.chat.ui.roomlist;

/* renamed from: com.stockbit.chat.ui.roomlist.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC5603b {

    /* renamed from: com.stockbit.chat.ui.roomlist.b$a */
    public static final class a extends AbstractC5603b {

        /* renamed from: a, reason: collision with root package name */
        public final int f58997a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f58998b;

        static {
        }

        public a(int r2, boolean r3) {
            super(null);
            this.f58997a = r2;
            this.f58998b = r3;
        }

        public final int a() {
            return this.f58997a;
        }

        public final boolean b() {
            return this.f58998b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f58997a == r52.f58997a) goto L12;
            return false;
        L12:
            if (this.f58998b == r52.f58998b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f58997a) * 31) + Boolean.hashCode(this.f58998b);
        }

        public String toString() {
            return "ClearChat(position=" + this.f58997a + ", isLoading=" + this.f58998b + ')';
        }
    }

    /* renamed from: com.stockbit.chat.ui.roomlist.b$b, reason: collision with other inner class name */
    public static final class C0612b extends AbstractC5603b {

        /* renamed from: a, reason: collision with root package name */
        public final int f58999a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f59000b;

        static {
        }

        public C0612b(int r2, boolean r3) {
            super(null);
            this.f58999a = r2;
            this.f59000b = r3;
        }

        public final int a() {
            return this.f58999a;
        }

        public final boolean b() {
            return this.f59000b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0612b) == true) goto L8;
            return false;
        L8:
            C0612b r52 = (C0612b) r5;
            if (this.f58999a == r52.f58999a) goto L12;
            return false;
        L12:
            if (this.f59000b == r52.f59000b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f58999a) * 31) + Boolean.hashCode(this.f59000b);
        }

        public String toString() {
            return "DeleteChat(position=" + this.f58999a + ", isLoading=" + this.f59000b + ')';
        }
    }

    /* renamed from: com.stockbit.chat.ui.roomlist.b$c */
    public static final class c extends AbstractC5603b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f59001a = null;

        static {
            f59001a = new c();
        }

        public c() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.chat.ui.roomlist.b$d */
    public static final class d extends AbstractC5603b {

        /* renamed from: a, reason: collision with root package name */
        public final String f59002a;

        static {
        }

        public d(String r2) {
            kotlin.jvm.internal.p.l(r2, "avatar");
            super(null);
            this.f59002a = r2;
        }

        public final String a() {
            return this.f59002a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f59002a, ((d) r4).f59002a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f59002a.hashCode();
        }

        public String toString() {
            return "UpdateNavigationIcon(avatar=" + this.f59002a + ')';
        }
    }

    static {
    }

    public /* synthetic */ AbstractC5603b(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC5603b() {
    }
}
