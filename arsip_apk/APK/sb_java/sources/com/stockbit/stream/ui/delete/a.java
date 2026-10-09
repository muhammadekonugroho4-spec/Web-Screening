package com.stockbit.stream.ui.delete;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.stream.ui.delete.a$a, reason: collision with other inner class name */
    public static final class C1279a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f142729a;

        static {
        }

        public C1279a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f142729a = r2;
        }

        public final String a() {
            return this.f142729a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1279a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f142729a, ((C1279a) r4).f142729a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f142729a.hashCode();
        }

        public String toString() {
            return "FailedDeletePost(message=" + this.f142729a + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f142730a = null;

        static {
            f142730a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final StreamDeletePickerType f142731a;

        static {
        }

        public c(StreamDeletePickerType r2) {
            p.l(r2, "type");
            super(null);
            this.f142731a = r2;
        }

        public final StreamDeletePickerType a() {
            return this.f142731a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f142731a == ((c) r4).f142731a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f142731a.hashCode();
        }

        public String toString() {
            return "ShowPicker(type=" + this.f142731a + ')';
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f142732a;

        /* renamed from: b, reason: collision with root package name */
        public final String f142733b;

        /* renamed from: c, reason: collision with root package name */
        public final int f142734c;

        static {
        }

        public d(String r2, String r3, int r4) {
            p.l(r2, "message");
            p.l(r3, "type");
            super(null);
            this.f142732a = r2;
            this.f142733b = r3;
            this.f142734c = r4;
        }

        public final String a() {
            return this.f142732a;
        }

        public final int b() {
            return this.f142734c;
        }

        public final String c() {
            return this.f142733b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f142732a, r52.f142732a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f142733b, r52.f142733b) == true) goto L15;
            return false;
        L15:
            if (this.f142734c == r52.f142734c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f142732a.hashCode() * 31) + this.f142733b.hashCode()) * 31) + Integer.hashCode(this.f142734c);
        }

        public String toString() {
            return "SuccessDeletePost(message=" + this.f142732a + ", type=" + this.f142733b + ", position=" + this.f142734c + ')';
        }

        public /* synthetic */ d(String r1, String r2, int r3, int r4, kotlin.jvm.internal.i r5) {
            if ((r4 & 4) == 0) goto L5;
            r3 = 0;
        L5:
            this(r1, r2, r3);
        }
    }

    static {
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
