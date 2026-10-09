package com.stockbit.domains.usecase.stockgroups.resource;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f88475a = null;

        static {
            f88475a = new a();
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
            return 1408091815;
        }

        public String toString() {
            return "Disabled";
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f88476a = null;

        static {
            f88476a = new b();
        }

        public b() {
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
            return 1859870978;
        }

        public String toString() {
            return "Empty";
        }
    }

    /* renamed from: com.stockbit.domains.usecase.stockgroups.resource.c$c, reason: collision with other inner class name */
    public static final class C0843c implements c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f88477a;

        public C0843c(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f88477a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0843c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88477a, ((C0843c) r4).f88477a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88477a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f88477a + ")";
        }
    }

    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f88478a = null;

        static {
            f88478a = new d();
        }

        public d() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1704877135;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final List f88479a;

        public e(List r2) {
            p.l(r2, FirebaseAnalytics.Param.ITEMS);
            this.f88479a = r2;
        }

        public final List a() {
            return this.f88479a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88479a, ((e) r4).f88479a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88479a.hashCode();
        }

        public String toString() {
            return "Success(items=" + this.f88479a + ")";
        }
    }
}
