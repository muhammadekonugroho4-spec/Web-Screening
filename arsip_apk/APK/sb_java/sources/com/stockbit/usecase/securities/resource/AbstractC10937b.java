package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;

/* renamed from: com.stockbit.usecase.securities.resource.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10937b {

    /* renamed from: com.stockbit.usecase.securities.resource.b$a */
    public static final class a extends AbstractC10937b {

        /* renamed from: a, reason: collision with root package name */
        public DomainSecuritiesException f162124a;

        public a(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f162124a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162124a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162124a, ((a) r4).f162124a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162124a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162124a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.securities.resource.b$b, reason: collision with other inner class name */
    public static final class C1638b extends AbstractC10937b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1638b f162125a = null;

        static {
            f162125a = new C1638b();
        }

        public C1638b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.securities.resource.b$c */
    public static final class c extends AbstractC10937b {

        /* renamed from: a, reason: collision with root package name */
        public final String f162126a;

        /* renamed from: b, reason: collision with root package name */
        public final String f162127b;

        public c(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            kotlin.jvm.internal.p.l(r3, "orderId");
            super(null);
            this.f162126a = r2;
            this.f162127b = r3;
        }

        public final String a() {
            return this.f162127b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f162126a, r52.f162126a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f162127b, r52.f162127b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f162126a.hashCode() * 31) + this.f162127b.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f162126a + ", orderId=" + this.f162127b + ")";
        }

        public /* synthetic */ c(String r1, String r2, int r3, kotlin.jvm.internal.i r4) {
            if ((r3 & 2) == 0) goto L5;
            r2 = "";
        L5:
            this(r1, r2);
        }
    }

    /* renamed from: com.stockbit.usecase.securities.resource.b$d */
    public static final class d extends AbstractC10937b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f162128a = null;

        static {
            f162128a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC10937b(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10937b() {
    }
}
