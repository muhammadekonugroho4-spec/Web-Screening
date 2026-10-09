package com.stockbit.cryptodetail.ui.detail.state;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface g {

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f79719a = null;

        static {
            f79719a = new a();
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
            return -187240614;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public final f f79720a;

        static {
        }

        public b(f r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f79720a = r2;
        }

        public final f a() {
            return this.f79720a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f79720a, ((b) r4).f79720a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f79720a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f79720a + ')';
        }
    }
}
