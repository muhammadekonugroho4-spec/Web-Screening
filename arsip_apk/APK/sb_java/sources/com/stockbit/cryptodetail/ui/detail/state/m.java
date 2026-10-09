package com.stockbit.cryptodetail.ui.detail.state;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface m {

    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        public static final a f79747a = null;

        static {
            f79747a = new a();
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
            return 1803547407;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        public static final b f79748a = null;

        static {
            f79748a = new b();
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
            return 1803698122;
        }

        public String toString() {
            return "Error";
        }
    }

    public static final class c implements m {

        /* renamed from: a, reason: collision with root package name */
        public static final c f79749a = null;

        static {
            f79749a = new c();
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
            return 2745982;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d implements m {

        /* renamed from: a, reason: collision with root package name */
        public final l f79750a;

        static {
        }

        public d(l r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f79750a = r2;
        }

        public final d a(l r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return new d(r2);
        }

        public final l b() {
            return this.f79750a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f79750a, ((d) r4).f79750a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f79750a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f79750a + ')';
        }
    }
}
