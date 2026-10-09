package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import java.util.HashMap;

/* renamed from: com.stockbit.usecase.securities.resource.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10952q {

    /* renamed from: com.stockbit.usecase.securities.resource.q$a */
    public static final class a extends AbstractC10952q {

        /* renamed from: a, reason: collision with root package name */
        public DomainSecuritiesException f162188a;

        public a(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f162188a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162188a, ((a) r4).f162188a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162188a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162188a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.securities.resource.q$b */
    public static final class b extends AbstractC10952q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162189a = null;

        static {
            f162189a = new b();
        }

        public b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.securities.resource.q$c */
    public static final class c extends AbstractC10952q {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f162190a;

        public c(HashMap r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f162190a = r2;
        }

        public final HashMap a() {
            return this.f162190a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162190a, ((c) r4).f162190a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162190a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f162190a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.securities.resource.q$d */
    public static final class d extends AbstractC10952q {

        /* renamed from: a, reason: collision with root package name */
        public static final d f162191a = null;

        static {
            f162191a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC10952q(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10952q() {
    }
}
