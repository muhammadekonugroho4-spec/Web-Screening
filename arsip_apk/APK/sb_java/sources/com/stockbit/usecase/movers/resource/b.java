package com.stockbit.usecase.movers.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.usecase.movers.model.c;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final c f158560a;

        public a(c r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f158560a = r2;
        }

        public final c a() {
            return this.f158560a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158560a, ((a) r4).f158560a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158560a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f158560a + ")";
        }
    }
}
