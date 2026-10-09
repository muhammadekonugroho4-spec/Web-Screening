package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* renamed from: com.stockbit.usecase.chat.resource.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10862c {

    /* renamed from: com.stockbit.usecase.chat.resource.c$a */
    public static final class a extends AbstractC10862c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155775a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155775a = r2;
        }

        public final DomainExodusException a() {
            return this.f155775a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155775a, ((a) r4).f155775a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155775a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155775a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.chat.resource.c$b */
    public static final class b extends AbstractC10862c {

        /* renamed from: a, reason: collision with root package name */
        public final String f155776a;

        /* renamed from: b, reason: collision with root package name */
        public final List f155777b;

        public b(String r2, List r3) {
            kotlin.jvm.internal.p.l(r2, "message");
            kotlin.jvm.internal.p.l(r3, "rooms");
            super(null);
            this.f155776a = r2;
            this.f155777b = r3;
        }

        public final String a() {
            return this.f155776a;
        }

        public final List b() {
            return this.f155777b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f155776a, r52.f155776a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f155777b, r52.f155777b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f155776a.hashCode() * 31) + this.f155777b.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f155776a + ", rooms=" + this.f155777b + ")";
        }
    }

    public /* synthetic */ AbstractC10862c(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10862c() {
    }
}
