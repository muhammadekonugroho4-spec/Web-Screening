package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class q {

    public static final class a extends q {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155814a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155814a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155814a, ((a) r4).f155814a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155814a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155814a + ")";
        }
    }

    public static final class b extends q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155815a = null;

        static {
            f155815a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends q {

        /* renamed from: a, reason: collision with root package name */
        public final List f155816a;

        /* renamed from: b, reason: collision with root package name */
        public final int f155817b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f155818c;

        public c(List r2, int r3, boolean r4) {
            kotlin.jvm.internal.p.l(r2, "rooms");
            super(null);
            this.f155816a = r2;
            this.f155817b = r3;
            this.f155818c = r4;
        }

        public final boolean a() {
            return this.f155818c;
        }

        public final List b() {
            return this.f155816a;
        }

        public final int c() {
            return this.f155817b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f155816a, r52.f155816a) == true) goto L12;
            return false;
        L12:
            if (this.f155817b == r52.f155817b) goto L15;
            return false;
        L15:
            if (this.f155818c == r52.f155818c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f155816a.hashCode() * 31) + Integer.hashCode(this.f155817b)) * 31) + Boolean.hashCode(this.f155818c);
        }

        public String toString() {
            return "Success(rooms=" + this.f155816a + ", totalRequests=" + this.f155817b + ", hasMorePage=" + this.f155818c + ")";
        }
    }

    public /* synthetic */ q(kotlin.jvm.internal.i r1) {
        this();
    }

    public q() {
    }
}
