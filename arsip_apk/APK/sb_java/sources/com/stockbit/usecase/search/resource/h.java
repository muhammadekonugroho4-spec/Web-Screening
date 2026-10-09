package com.stockbit.usecase.search.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class h {

    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f160132a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f160132a = r2;
        }

        public final DomainExodusException a() {
            return this.f160132a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160132a, ((a) r4).f160132a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160132a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f160132a + ")";
        }
    }

    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f160133a = null;

        static {
            f160133a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends h {

        /* renamed from: a, reason: collision with root package name */
        public final String f160134a;

        /* renamed from: b, reason: collision with root package name */
        public final String f160135b;

        /* renamed from: c, reason: collision with root package name */
        public final String f160136c;
        public final List d;

        public c(String r2, String r3, String r4, List r5) {
            p.l(r2, "catalogName");
            p.l(r3, "subSectorId");
            p.l(r4, "sectorId");
            p.l(r5, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f160134a = r2;
            this.f160135b = r3;
            this.f160136c = r4;
            this.d = r5;
        }

        public final String a() {
            return this.f160134a;
        }

        public final List b() {
            return this.d;
        }

        public final String c() {
            return this.f160136c;
        }

        public final String d() {
            return this.f160135b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f160134a, r52.f160134a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f160135b, r52.f160135b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f160136c, r52.f160136c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((this.f160134a.hashCode() * 31) + this.f160135b.hashCode()) * 31) + this.f160136c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Success(catalogName=" + this.f160134a + ", subSectorId=" + this.f160135b + ", sectorId=" + this.f160136c + ", data=" + this.d + ")";
        }
    }

    public static final class d extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final d f160137a = null;

        static {
            f160137a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ h(kotlin.jvm.internal.i r1) {
        this();
    }

    public h() {
    }
}
