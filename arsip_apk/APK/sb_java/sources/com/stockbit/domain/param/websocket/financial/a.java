package com.stockbit.domain.param.websocket.financial;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface a {

    /* renamed from: com.stockbit.domain.param.websocket.financial.a$a, reason: collision with other inner class name */
    public static final class C0824a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0824a f87631a = null;

        static {
            f87631a = new C0824a();
        }

        public C0824a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0824a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1209913254;
        }

        public String toString() {
            return "Ping";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f87632a;

        /* renamed from: b, reason: collision with root package name */
        public final List f87633b;

        public b(String r2, List r3) {
            p.l(r2, Constants.KEY_KEY);
            p.l(r3, "channels");
            this.f87632a = r2;
            this.f87633b = r3;
        }

        public final List a() {
            return this.f87633b;
        }

        public final String b() {
            return this.f87632a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f87632a, r52.f87632a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f87633b, r52.f87633b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f87632a.hashCode() * 31) + this.f87633b.hashCode();
        }

        public String toString() {
            return "Subscribe(key=" + this.f87632a + ", channels=" + this.f87633b + ")";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f87634a;

        /* renamed from: b, reason: collision with root package name */
        public final List f87635b;

        public c(String r2, List r3) {
            p.l(r2, Constants.KEY_KEY);
            p.l(r3, "channels");
            this.f87634a = r2;
            this.f87635b = r3;
        }

        public final String a() {
            return this.f87634a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f87634a, r52.f87634a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f87635b, r52.f87635b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f87634a.hashCode() * 31) + this.f87635b.hashCode();
        }

        public String toString() {
            return "Unsubscribe(key=" + this.f87634a + ", channels=" + this.f87635b + ")";
        }
    }
}
