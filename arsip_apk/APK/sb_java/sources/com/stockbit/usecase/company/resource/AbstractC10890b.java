package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* renamed from: com.stockbit.usecase.company.resource.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10890b {

    /* renamed from: com.stockbit.usecase.company.resource.b$a */
    public static final class a extends AbstractC10890b {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156782a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156782a = r2;
        }

        public final DomainExodusException a() {
            return this.f156782a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156782a, ((a) r4).f156782a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156782a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156782a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.b$b, reason: collision with other inner class name */
    public static final class C1437b extends AbstractC10890b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1437b f156783a = null;

        static {
            f156783a = new C1437b();
        }

        public C1437b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.b$c */
    public static final class c extends AbstractC10890b {

        /* renamed from: a, reason: collision with root package name */
        public final String f156784a;

        public c(String r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156784a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156784a, ((c) r4).f156784a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156784a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156784a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.b$d */
    public static final class d extends AbstractC10890b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f156785a = null;

        static {
            f156785a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC10890b(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10890b() {
    }
}
