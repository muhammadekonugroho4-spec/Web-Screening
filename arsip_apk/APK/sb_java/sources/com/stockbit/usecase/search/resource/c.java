package com.stockbit.usecase.search.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f160108a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f160108a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160108a, ((a) r4).f160108a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160108a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f160108a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f160109a = null;

        static {
            f160109a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -797534974;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.usecase.search.resource.c$c, reason: collision with other inner class name */
    public static final class C1607c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final List f160110a;

        /* renamed from: b, reason: collision with root package name */
        public final String f160111b;

        /* renamed from: c, reason: collision with root package name */
        public final List f160112c;
        public final String d;

        public C1607c(List r2, String r3, List r4, String r5) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            p.l(r3, com.clevertap.android.sdk.Constants.KEY_DATE);
            super(null);
            this.f160110a = r2;
            this.f160111b = r3;
            this.f160112c = r4;
            this.d = r5;
        }

        public final List a() {
            return this.f160110a;
        }

        public final String b() {
            return this.f160111b;
        }

        public final String c() {
            return this.d;
        }

        public final List d() {
            return this.f160112c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1607c) == true) goto L8;
            return false;
        L8:
            C1607c r52 = (C1607c) r5;
            if (p.g(this.f160110a, r52.f160110a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f160111b, r52.f160111b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f160112c, r52.f160112c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            int r02 = ((this.f160110a.hashCode() * 31) + this.f160111b.hashCode()) * 31;
            List r1 = this.f160112c;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            String r13 = this.d;
            if (r13 == null) goto L11;
            r2 = r13.hashCode();
        L11:
            return r03 + r2;
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "Success(data=" + this.f160110a + ", date=" + this.f160111b + ", moversFilterIepIev=" + this.f160112c + ", defaultMoverType=" + this.d + ")";
        }

        public /* synthetic */ C1607c(List r2, String r3, List r4, String r5, int r6, kotlin.jvm.internal.i r7) {
            if ((r6 & 4) == 0) goto L6;
            r4 = null;
        L6:
            if ((r6 & 8) == 0) goto L8;
            r5 = null;
        L8:
            this(r2, r3, r4, r5);
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f160113a = null;

        static {
            f160113a = new d();
        }

        public d() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -675113212;
        }

        public String toString() {
            return "SuccessEmpty";
        }
    }

    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public c() {
    }
}
