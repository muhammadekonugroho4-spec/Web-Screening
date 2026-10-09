package com.stockbit.components.cryptoheader;

import com.google.firebase.messaging.Constants;

/* loaded from: classes8.dex */
public interface l {

    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public final i f78288a;

        static {
        }

        public a(i r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f78288a = r2;
        }

        public final i a() {
            return this.f78288a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f78288a, ((a) r4).f78288a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f78288a.hashCode();
        }

        public String toString() {
            return "Error(data=" + this.f78288a + ')';
        }
    }

    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f78289a = null;

        static {
            f78289a = new b();
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
            return -1695866485;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements l {

        /* renamed from: a, reason: collision with root package name */
        public final k f78290a;

        static {
        }

        public c(k r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f78290a = r2;
        }

        public final k a() {
            return this.f78290a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f78290a, ((c) r4).f78290a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f78290a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f78290a + ')';
        }
    }
}
