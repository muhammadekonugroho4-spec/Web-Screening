package com.stockbit.domains.usecase.stockgroups.resource;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f88470a = null;

        static {
            f88470a = new a();
        }

        public a() {
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
            return 1606990670;
        }

        public String toString() {
            return "Empty";
        }
    }

    /* renamed from: com.stockbit.domains.usecase.stockgroups.resource.b$b, reason: collision with other inner class name */
    public static final class C0842b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f88471a;

        public C0842b(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f88471a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0842b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88471a, ((C0842b) r4).f88471a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88471a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f88471a + ")";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f88472a = null;

        static {
            f88472a = new c();
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
            return 90282749;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final List f88473a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f88474b;

        public d(List r2, boolean r3) {
            p.l(r2, FirebaseAnalytics.Param.ITEMS);
            this.f88473a = r2;
            this.f88474b = r3;
        }

        public final boolean a() {
            return this.f88474b;
        }

        public final List b() {
            return this.f88473a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f88473a, r52.f88473a) == true) goto L12;
            return false;
        L12:
            if (this.f88474b == r52.f88474b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f88473a.hashCode() * 31) + Boolean.hashCode(this.f88474b);
        }

        public String toString() {
            return "Success(items=" + this.f88473a + ", hasNext=" + this.f88474b + ")";
        }

        public /* synthetic */ d(List r1, boolean r2, int r3, i r4) {
            if ((r3 & 2) == 0) goto L5;
            r2 = false;
        L5:
            this(r1, r2);
        }
    }
}
