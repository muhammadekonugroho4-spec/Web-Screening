package com.stockbit.usecase.registration.resource;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface e {

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.repository.registration.entity.c f159533a;

        public a(com.stockbit.repository.registration.entity.c r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f159533a = r2;
        }

        public final com.stockbit.repository.registration.entity.c a() {
            return this.f159533a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159533a, ((a) r4).f159533a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159533a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f159533a + ")";
        }
    }
}
