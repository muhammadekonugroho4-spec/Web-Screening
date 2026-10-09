package com.stockbit.domain.model.search;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class m {

    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        public final f f84992a;

        public a(f r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f84992a = r2;
        }

        public final f a() {
            return this.f84992a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f84992a, ((a) r4).f84992a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f84992a.hashCode();
        }

        public String toString() {
            return "Company(data=" + this.f84992a + ")";
        }
    }

    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        public final i f84993a;

        public b(i r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f84993a = r2;
        }

        public final i a() {
            return this.f84993a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f84993a, ((b) r4).f84993a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f84993a.hashCode();
        }

        public String toString() {
            return "Insider(data=" + this.f84993a + ")";
        }
    }

    public /* synthetic */ m(kotlin.jvm.internal.i r1) {
        this();
    }

    public m() {
    }
}
