package com.stockbit.usecase.facerecognition.resource;

import androidx.core.app.NotificationCompat;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.facerecognition.resource.a$a, reason: collision with other inner class name */
    public static final class C1483a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f157757a;

        public C1483a(DomainExodusException r2) {
            p.l(r2, "exception");
            this.f157757a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1483a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157757a, ((C1483a) r4).f157757a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157757a.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.f157757a + ')';
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f157758a = null;

        static {
            f157758a = new b();
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
            return 1949182923;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157759a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157760b;

        /* renamed from: c, reason: collision with root package name */
        public final String f157761c;

        public c(String r2, String r3, String r4) {
            p.l(r2, NotificationCompat.CATEGORY_STATUS);
            p.l(r3, "purpose");
            p.l(r4, "purposeLabel");
            this.f157759a = r2;
            this.f157760b = r3;
            this.f157761c = r4;
        }

        public final String a() {
            return this.f157761c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f157759a, r52.f157759a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157760b, r52.f157760b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f157761c, r52.f157761c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f157759a.hashCode() * 31) + this.f157760b.hashCode()) * 31) + this.f157761c.hashCode();
        }

        public String toString() {
            return "Success(status=" + this.f157759a + ", purpose=" + this.f157760b + ", purposeLabel=" + this.f157761c + ')';
        }
    }
}
