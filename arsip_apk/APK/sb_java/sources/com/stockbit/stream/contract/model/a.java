package com.stockbit.stream.contract.model;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f139572a;

    /* renamed from: b, reason: collision with root package name */
    public final String f139573b;

    /* renamed from: c, reason: collision with root package name */
    public final String f139574c;
    public final C1262a d;

    /* renamed from: com.stockbit.stream.contract.model.a$a, reason: collision with other inner class name */
    public static final class C1262a {

        /* renamed from: a, reason: collision with root package name */
        public final int f139575a;

        /* renamed from: b, reason: collision with root package name */
        public final String f139576b;

        /* renamed from: c, reason: collision with root package name */
        public final List f139577c;
        public final List d;

        public C1262a(int r2, String r3, List r4, List r5) {
            p.l(r3, "noteContent");
            p.l(r4, "noteImageUrls");
            p.l(r5, "noteFileUrls");
            this.f139575a = r2;
            this.f139576b = r3;
            this.f139577c = r4;
            this.d = r5;
        }

        public final String a() {
            return this.f139576b;
        }

        public final List b() {
            return this.d;
        }

        public final int c() {
            return this.f139575a;
        }

        public final List d() {
            return this.f139577c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1262a) == true) goto L8;
            return false;
        L8:
            C1262a r52 = (C1262a) r5;
            if (this.f139575a == r52.f139575a) goto L12;
            return false;
        L12:
            if (p.g(this.f139576b, r52.f139576b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f139577c, r52.f139577c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f139575a) * 31) + this.f139576b.hashCode()) * 31) + this.f139577c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "ContentNavParam(noteId=" + this.f139575a + ", noteContent=" + this.f139576b + ", noteImageUrls=" + this.f139577c + ", noteFileUrls=" + this.d + ')';
        }
    }

    public a(String r2, String r3, String r4, C1262a r5) {
        p.l(r2, "companySymbol");
        p.l(r3, "companyName");
        p.l(r4, "companyIcon");
        this.f139572a = r2;
        this.f139573b = r3;
        this.f139574c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f139574c;
    }

    public final String b() {
        return this.f139573b;
    }

    public final String c() {
        return this.f139572a;
    }

    public final C1262a d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f139572a, r52.f139572a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f139573b, r52.f139573b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f139574c, r52.f139574c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((((this.f139572a.hashCode() * 31) + this.f139573b.hashCode()) * 31) + this.f139574c.hashCode()) * 31;
        C1262a r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ComposeNoteNavParam(companySymbol=" + this.f139572a + ", companyName=" + this.f139573b + ", companyIcon=" + this.f139574c + ", content=" + this.d + ')';
    }

    public /* synthetic */ a(String r1, String r2, String r3, C1262a r4, int r5, i r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = null;
    L5:
        this(r1, r2, r3, r4);
    }
}
