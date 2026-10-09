package com.stockbit.stockgroups.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.domains.usecase.stockgroups.model.type.StockGroupColumnType;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f138901a = null;

        static {
            f138901a = new a();
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
            return -2036835178;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f138902a = null;

        static {
            f138902a = new b();
        }

        public b() {
            super(null);
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
            return -2036684463;
        }

        public String toString() {
            return "Error";
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f138903a = null;

        static {
            f138903a = new c();
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
            return -1228010939;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.stockgroups.model.d$d, reason: collision with other inner class name */
    public static final class C1254d extends d {

        /* renamed from: a, reason: collision with root package name */
        public final List f138904a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f138905b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f138906c;
        public final StockGroupColumnType d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f138907e;

        static {
        }

        public C1254d(List r2, boolean r3, boolean r4, StockGroupColumnType r5, boolean r6) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            p.l(r5, "sortColumn");
            super(null);
            this.f138904a = r2;
            this.f138905b = r3;
            this.f138906c = r4;
            this.d = r5;
            this.f138907e = r6;
        }

        public final List a() {
            return this.f138904a;
        }

        public final StockGroupColumnType b() {
            return this.d;
        }

        public final boolean c() {
            return this.f138905b;
        }

        public final boolean d() {
            return this.f138906c;
        }

        public final boolean e() {
            return this.f138907e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1254d) == true) goto L8;
            return false;
        L8:
            C1254d r52 = (C1254d) r5;
            if (p.g(this.f138904a, r52.f138904a) == true) goto L12;
            return false;
        L12:
            if (this.f138905b == r52.f138905b) goto L15;
            return false;
        L15:
            if (this.f138906c == r52.f138906c) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L21;
            return false;
        L21:
            if (this.f138907e == r52.f138907e) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            return (((((((this.f138904a.hashCode() * 31) + Boolean.hashCode(this.f138905b)) * 31) + Boolean.hashCode(this.f138906c)) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f138907e);
        }

        public String toString() {
            return "Success(data=" + this.f138904a + ", isCanPaginate=" + this.f138905b + ", isLoadingNextPage=" + this.f138906c + ", sortColumn=" + this.d + ", isSortDescending=" + this.f138907e + ')';
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
