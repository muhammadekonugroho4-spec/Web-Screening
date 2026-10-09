package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class L {

    public static final class a extends L {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155760a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155760a = r2;
        }

        public final DomainExodusException a() {
            return this.f155760a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155760a, ((a) r4).f155760a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155760a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155760a + ")";
        }
    }

    public static final class b extends L {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155761a = null;

        static {
            f155761a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends L {

        /* renamed from: a, reason: collision with root package name */
        public final List f155762a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f155763b;

        public c(List r2, boolean r3) {
            kotlin.jvm.internal.p.l(r2, "suggestedItems");
            super(null);
            this.f155762a = r2;
            this.f155763b = r3;
        }

        public final boolean a() {
            return this.f155763b;
        }

        public final List b() {
            return this.f155762a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f155762a, r52.f155762a) == true) goto L12;
            return false;
        L12:
            if (this.f155763b == r52.f155763b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f155762a.hashCode() * 31) + Boolean.hashCode(this.f155763b);
        }

        public String toString() {
            return "Success(suggestedItems=" + this.f155762a + ", hasMoreSuggested=" + this.f155763b + ")";
        }
    }

    public /* synthetic */ L(kotlin.jvm.internal.i r1) {
        this();
    }

    public L() {
    }
}
