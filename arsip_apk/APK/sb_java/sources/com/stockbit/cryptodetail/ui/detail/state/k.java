package com.stockbit.cryptodetail.ui.detail.state;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface k {

    public static final class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public final i f79742a;

        static {
        }

        public a(i r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f79742a = r2;
        }

        public final i a() {
            return this.f79742a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f79742a, ((a) r4).f79742a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f79742a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f79742a + ')';
        }
    }

    public static final class b implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final b f79743a = null;

        static {
            f79743a = new b();
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
            return 2118627029;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements k {

        /* renamed from: a, reason: collision with root package name */
        public final j f79744a;

        static {
        }

        public c(j r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f79744a = r2;
        }

        public final j a() {
            return this.f79744a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f79744a, ((c) r4).f79744a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f79744a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f79744a + ')';
        }
    }
}
