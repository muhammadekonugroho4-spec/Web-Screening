package com.stockbit.domains.usecase.stockgroups.resource;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: com.stockbit.domains.usecase.stockgroups.resource.a$a, reason: collision with other inner class name */
    public static final class C0841a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0841a f88464a = null;

        static {
            f88464a = new C0841a();
        }

        public C0841a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0841a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1366483882;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f88465a;

        public b(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f88465a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88465a, ((b) r4).f88465a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88465a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f88465a + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f88466a = null;

        static {
            f88466a = new c();
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
            return 891493465;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final List f88467a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f88468b;

        /* renamed from: c, reason: collision with root package name */
        public final int f88469c;

        public d(List r2, boolean r3, int r4) {
            p.l(r2, FirebaseAnalytics.Param.ITEMS);
            super(null);
            this.f88467a = r2;
            this.f88468b = r3;
            this.f88469c = r4;
        }

        public final boolean a() {
            return this.f88468b;
        }

        public final List b() {
            return this.f88467a;
        }

        public final int c() {
            return this.f88469c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f88467a, r52.f88467a) == true) goto L12;
            return false;
        L12:
            if (this.f88468b == r52.f88468b) goto L15;
            return false;
        L15:
            if (this.f88469c == r52.f88469c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f88467a.hashCode() * 31) + Boolean.hashCode(this.f88468b)) * 31) + Integer.hashCode(this.f88469c);
        }

        public String toString() {
            return "Success(items=" + this.f88467a + ", hasNext=" + this.f88468b + ", page=" + this.f88469c + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
