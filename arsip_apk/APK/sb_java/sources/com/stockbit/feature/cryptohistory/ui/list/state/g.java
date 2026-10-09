package com.stockbit.feature.cryptohistory.ui.list.state;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface g {

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f94069a = null;

        static {
            f94069a = new a();
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
            return -1745985237;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.feature.cryptohistory.ui.list.state.c f94070a;

        static {
        }

        public b(com.stockbit.feature.cryptohistory.ui.list.state.c r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f94070a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f94070a, ((b) r4).f94070a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f94070a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f94070a + ')';
        }
    }

    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final c f94071a = null;

        static {
            f94071a = new c();
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
            return -894091878;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d implements g {

        /* renamed from: a, reason: collision with root package name */
        public final f f94072a;

        static {
        }

        public d(f r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f94072a = r2;
        }

        public final f a() {
            return this.f94072a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f94072a, ((d) r4).f94072a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f94072a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f94072a + ')';
        }
    }
}
