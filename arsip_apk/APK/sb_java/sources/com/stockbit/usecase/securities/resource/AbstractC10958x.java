package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import java.util.List;

/* renamed from: com.stockbit.usecase.securities.resource.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10958x {

    /* renamed from: com.stockbit.usecase.securities.resource.x$a */
    public static final class a extends AbstractC10958x {

        /* renamed from: a, reason: collision with root package name */
        public DomainSecuritiesException f162235a;

        public a(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f162235a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162235a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162235a, ((a) r4).f162235a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162235a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162235a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.securities.resource.x$b */
    public static final class b extends AbstractC10958x {

        /* renamed from: a, reason: collision with root package name */
        public final List f162236a;

        public b(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f162236a = r2;
        }

        public final List a() {
            return this.f162236a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162236a, ((b) r4).f162236a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162236a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f162236a + ")";
        }
    }

    public /* synthetic */ AbstractC10958x(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10958x() {
    }
}
