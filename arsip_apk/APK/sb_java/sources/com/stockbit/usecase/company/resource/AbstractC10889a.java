package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* renamed from: com.stockbit.usecase.company.resource.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10889a {

    /* renamed from: com.stockbit.usecase.company.resource.a$a, reason: collision with other inner class name */
    public static final class C1436a extends AbstractC10889a {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156778a;

        public C1436a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156778a = r2;
        }

        public final DomainExodusException a() {
            return this.f156778a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1436a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156778a, ((C1436a) r4).f156778a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156778a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156778a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.a$b */
    public static final class b extends AbstractC10889a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f156779a = null;

        static {
            f156779a = new b();
        }

        public b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.a$c */
    public static final class c extends AbstractC10889a {

        /* renamed from: a, reason: collision with root package name */
        public final String f156780a;

        public c(String r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156780a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156780a, ((c) r4).f156780a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156780a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156780a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.a$d */
    public static final class d extends AbstractC10889a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f156781a = null;

        static {
            f156781a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC10889a(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10889a() {
    }
}
