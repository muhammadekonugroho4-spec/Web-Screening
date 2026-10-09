package com.stockbit.feature.bonds.ui.catalog;

import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes8.dex */
public abstract class r {

    public static final class a extends r {

        /* renamed from: a, reason: collision with root package name */
        public static final a f92719a = null;

        static {
            f92719a = new a();
        }

        public a() {
            super(null);
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
            return 1389396868;
        }

        public String toString() {
            return "Error";
        }
    }

    public static final class b extends r {

        /* renamed from: a, reason: collision with root package name */
        public final String f92720a;

        /* renamed from: b, reason: collision with root package name */
        public final int f92721b;

        /* renamed from: c, reason: collision with root package name */
        public final com.stockbit.usecase.bonds.model.b f92722c;

        static {
        }

        public b(String r2, int r3, com.stockbit.usecase.bonds.model.b r4) {
            kotlin.jvm.internal.p.l(r2, "searchQuery");
            kotlin.jvm.internal.p.l(r4, RemoteConfigConstants.ResponseFieldKey.STATE);
            super(null);
            this.f92720a = r2;
            this.f92721b = r3;
            this.f92722c = r4;
        }

        public final String a() {
            return this.f92720a;
        }

        public final com.stockbit.usecase.bonds.model.b b() {
            return this.f92722c;
        }

        public final int c() {
            return this.f92721b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f92720a, r52.f92720a) == true) goto L12;
            return false;
        L12:
            if (this.f92721b == r52.f92721b) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f92722c, r52.f92722c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f92720a.hashCode() * 31) + Integer.hashCode(this.f92721b)) * 31) + this.f92722c.hashCode();
        }

        public String toString() {
            return "Loaded(searchQuery=" + this.f92720a + ", totalAsset=" + this.f92721b + ", state=" + this.f92722c + ')';
        }
    }

    public static final class c extends r {

        /* renamed from: a, reason: collision with root package name */
        public static final c f92723a = null;

        static {
            f92723a = new c();
        }

        public c() {
            super(null);
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
            return 1291199416;
        }

        public String toString() {
            return "Loading";
        }
    }

    static {
    }

    public /* synthetic */ r(kotlin.jvm.internal.i r1) {
        this();
    }

    public r() {
    }
}
