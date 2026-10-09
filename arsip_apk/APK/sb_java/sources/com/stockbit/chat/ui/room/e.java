package com.stockbit.chat.ui.room;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f58170a;

    public static final class a extends e {

        /* renamed from: b, reason: collision with root package name */
        public final String f58171b;

        /* renamed from: c, reason: collision with root package name */
        public final int f58172c;
        public final int d;

        static {
        }

        public a(String r3, int r4, int r5) {
            p.l(r3, "path");
            super("Take Picture From Camera", null);
            this.f58171b = r3;
            this.f58172c = r4;
            this.d = r5;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f58171b, r52.f58171b) == true) goto L12;
            return false;
        L12:
            if (this.f58172c == r52.f58172c) goto L15;
            return false;
        L15:
            if (this.d == r52.d) goto L17;
            return false;
        L17:
            return true;
        }

        public final int g() {
            return this.d;
        }

        public final String h() {
            return this.f58171b;
        }

        public int hashCode() {
            return (((this.f58171b.hashCode() * 31) + Integer.hashCode(this.f58172c)) * 31) + Integer.hashCode(this.d);
        }

        public final int i() {
            return this.f58172c;
        }

        public String toString() {
            return "Camera(path=" + this.f58171b + ", width=" + this.f58172c + ", height=" + this.d + ')';
        }
    }

    public static final class b extends e {

        /* renamed from: b, reason: collision with root package name */
        public final String f58173b;

        /* renamed from: c, reason: collision with root package name */
        public final String f58174c;
        public final float d;

        static {
        }

        public b(String r3, String r4, float r5) {
            p.l(r3, "path");
            p.l(r4, "fileName");
            super("Document", null);
            this.f58173b = r3;
            this.f58174c = r4;
            this.d = r5;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f58173b, r52.f58173b) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f58174c, r52.f58174c) == true) goto L15;
            return false;
        L15:
            if (Float.compare(this.d, r52.d) == 0) goto L17;
            return false;
        L17:
            return true;
        }

        public final String g() {
            return this.f58174c;
        }

        public final String h() {
            return this.f58173b;
        }

        public int hashCode() {
            return (((this.f58173b.hashCode() * 31) + this.f58174c.hashCode()) * 31) + Float.hashCode(this.d);
        }

        public final float i() {
            return this.d;
        }

        public final String j() {
            return kotlin.math.d.e(this.d) + " KB";
        }

        public String toString() {
            return "Document(path=" + this.f58173b + ", fileName=" + this.f58174c + ", size=" + this.d + ')';
        }
    }

    public static final class c extends e {

        /* renamed from: b, reason: collision with root package name */
        public final String f58175b;

        static {
        }

        public c(String r3) {
            p.l(r3, "url");
            super("GIF", null);
            this.f58175b = r3;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f58175b, ((c) r4).f58175b) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public final String g() {
            return this.f58175b;
        }

        public int hashCode() {
            return this.f58175b.hashCode();
        }

        public String toString() {
            return "GIF(url=" + this.f58175b + ')';
        }
    }

    public static final class d extends e {

        /* renamed from: b, reason: collision with root package name */
        public final String f58176b;

        /* renamed from: c, reason: collision with root package name */
        public final int f58177c;
        public final int d;

        static {
        }

        public d(String r3, int r4, int r5) {
            p.l(r3, "path");
            super("Choose Existing Picture", null);
            this.f58176b = r3;
            this.f58177c = r4;
            this.d = r5;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f58176b, r52.f58176b) == true) goto L12;
            return false;
        L12:
            if (this.f58177c == r52.f58177c) goto L15;
            return false;
        L15:
            if (this.d == r52.d) goto L17;
            return false;
        L17:
            return true;
        }

        public final int g() {
            return this.d;
        }

        public final String h() {
            return this.f58176b;
        }

        public int hashCode() {
            return (((this.f58176b.hashCode() * 31) + Integer.hashCode(this.f58177c)) * 31) + Integer.hashCode(this.d);
        }

        public final int i() {
            return this.f58177c;
        }

        public String toString() {
            return "Gallery(path=" + this.f58176b + ", width=" + this.f58177c + ", height=" + this.d + ')';
        }
    }

    /* renamed from: com.stockbit.chat.ui.room.e$e, reason: collision with other inner class name */
    public static final class C0605e extends e {

        /* renamed from: b, reason: collision with root package name */
        public static final C0605e f58178b = null;

        static {
            f58178b = new C0605e();
        }

        public C0605e() {
            super("None", null);
        }
    }

    public static final class f extends e {

        /* renamed from: b, reason: collision with root package name */
        public final String f58179b;

        static {
        }

        public f(String r3) {
            p.l(r3, "url");
            super("Sticker", null);
            this.f58179b = r3;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof f) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f58179b, ((f) r4).f58179b) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public final String g() {
            return this.f58179b;
        }

        public int hashCode() {
            return this.f58179b.hashCode();
        }

        public String toString() {
            return "Sticker(url=" + this.f58179b + ')';
        }
    }

    static {
    }

    public /* synthetic */ e(String r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public final String a() {
        return this.f58170a;
    }

    public final boolean b() {
        return this instanceof b;
    }

    public final boolean c() {
        return p.g(this, C0605e.f58178b);
    }

    public final boolean d() {
        return this instanceof c;
    }

    public final boolean e() {
        if ((this instanceof a) == false) goto L5;
        return true;
    L5:
        if ((this instanceof d) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final boolean f() {
        return this instanceof f;
    }

    public e(String r1) {
        this.f58170a = r1;
    }
}
