package com.stockbit.feature.cryptohistory.ui.list.state;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f94049a = null;

        static {
            f94049a = new a();
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
            return 1495960574;
        }

        public String toString() {
            return "Empty";
        }
    }

    /* renamed from: com.stockbit.feature.cryptohistory.ui.list.state.b$b, reason: collision with other inner class name */
    public static final class C0891b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.feature.cryptohistory.ui.list.state.c f94050a;

        static {
        }

        public C0891b(com.stockbit.feature.cryptohistory.ui.list.state.c r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f94050a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0891b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f94050a, ((C0891b) r4).f94050a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f94050a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f94050a + ')';
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f94051a = null;

        static {
            f94051a = new c();
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
            return 764542893;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.feature.cryptohistory.ui.list.state.a f94052a;

        static {
        }

        public d(com.stockbit.feature.cryptohistory.ui.list.state.a r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f94052a = r2;
        }

        public final com.stockbit.feature.cryptohistory.ui.list.state.a a() {
            return this.f94052a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f94052a, ((d) r4).f94052a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f94052a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f94052a + ')';
        }
    }
}
