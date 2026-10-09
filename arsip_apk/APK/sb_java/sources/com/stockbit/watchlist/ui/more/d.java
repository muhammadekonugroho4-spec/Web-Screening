package com.stockbit.watchlist.ui.more;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f171061a = null;

        static {
            f171061a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f171062a = null;

        static {
            f171062a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f171063a;

        /* renamed from: b, reason: collision with root package name */
        public final String f171064b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f171065c;

        static {
        }

        public c(String r2, String r3, boolean r4) {
            p.l(r2, "watchlistGroupId");
            p.l(r3, "watchlistGroupName");
            super(null);
            this.f171063a = r2;
            this.f171064b = r3;
            this.f171065c = r4;
        }

        public final String a() {
            return this.f171063a;
        }

        public final String b() {
            return this.f171064b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f171063a, r52.f171063a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f171064b, r52.f171064b) == true) goto L15;
            return false;
        L15:
            if (this.f171065c == r52.f171065c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f171063a.hashCode() * 31) + this.f171064b.hashCode()) * 31) + Boolean.hashCode(this.f171065c);
        }

        public String toString() {
            return "Delete(watchlistGroupId=" + this.f171063a + ", watchlistGroupName=" + this.f171064b + ", watchlistGroupIsDefault=" + this.f171065c + ')';
        }
    }

    /* renamed from: com.stockbit.watchlist.ui.more.d$d, reason: collision with other inner class name */
    public static final class C1776d extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f171066a;

        /* renamed from: b, reason: collision with root package name */
        public final String f171067b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f171068c;
        public final boolean d;

        static {
        }

        public C1776d(String r2, String r3, boolean r4, boolean r5) {
            p.l(r2, "watchlistGroupId");
            p.l(r3, "watchlistGroupName");
            super(null);
            this.f171066a = r2;
            this.f171067b = r3;
            this.f171068c = r4;
            this.d = r5;
        }

        public final String a() {
            return this.f171066a;
        }

        public final boolean b() {
            return this.f171068c;
        }

        public final boolean c() {
            return this.d;
        }

        public final String d() {
            return this.f171067b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1776d) == true) goto L8;
            return false;
        L8:
            C1776d r52 = (C1776d) r5;
            if (p.g(this.f171066a, r52.f171066a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f171067b, r52.f171067b) == true) goto L15;
            return false;
        L15:
            if (this.f171068c == r52.f171068c) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((this.f171066a.hashCode() * 31) + this.f171067b.hashCode()) * 31) + Boolean.hashCode(this.f171068c)) * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            return "Edit(watchlistGroupId=" + this.f171066a + ", watchlistGroupName=" + this.f171067b + ", watchlistGroupIsDefault=" + this.f171068c + ", watchlistGroupIsPortfolio=" + this.d + ')';
        }
    }

    public static final class e extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final e f171069a = null;

        static {
            f171069a = new e();
        }

        public e() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ d(i r1) {
        this();
    }

    public d() {
    }
}
