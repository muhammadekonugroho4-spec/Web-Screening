package com.stockbit.feature.cryptoorder.ui.state;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface h {

    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f94613a = null;

        static {
            f94613a = new a();
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
            return 1630356613;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final e f94614a;

        static {
        }

        public b(e r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f94614a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f94614a, ((b) r4).f94614a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f94614a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f94614a + ')';
        }
    }

    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final c f94615a = null;

        static {
            f94615a = new c();
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
            return 1070117492;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d implements h {

        /* renamed from: a, reason: collision with root package name */
        public final g f94616a;

        static {
        }

        public d(g r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f94616a = r2;
        }

        public final g a() {
            return this.f94616a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f94616a, ((d) r4).f94616a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f94616a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f94616a + ')';
        }
    }
}
