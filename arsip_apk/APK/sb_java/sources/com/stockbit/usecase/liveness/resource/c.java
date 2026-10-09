package com.stockbit.usecase.liveness.resource;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158244a;

        public a(String r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158244a = r2;
        }

        public final String a() {
            return this.f158244a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158244a, ((a) r4).f158244a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158244a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158244a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f158245a = null;

        static {
            f158245a = new b();
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
            return -1342387527;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.usecase.liveness.resource.c$c, reason: collision with other inner class name */
    public static final class C1518c extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1518c f158246a = null;

        static {
            f158246a = new C1518c();
        }

        public C1518c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1518c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1934725661;
        }

        public String toString() {
            return "SuccessGetToken";
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158247a;

        /* renamed from: b, reason: collision with root package name */
        public final String f158248b;

        public d(String r2, String r3) {
            p.l(r2, "videoUrl");
            p.l(r3, "imageUrl");
            super(null);
            this.f158247a = r2;
            this.f158248b = r3;
        }

        public final String a() {
            return this.f158248b;
        }

        public final String b() {
            return this.f158247a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f158247a, r52.f158247a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f158248b, r52.f158248b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f158247a.hashCode() * 31) + this.f158248b.hashCode();
        }

        public String toString() {
            return "SuccessUploadFile(videoUrl=" + this.f158247a + ", imageUrl=" + this.f158248b + ")";
        }
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
