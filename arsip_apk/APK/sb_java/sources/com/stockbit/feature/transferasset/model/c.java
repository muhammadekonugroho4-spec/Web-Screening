package com.stockbit.feature.transferasset.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.feature.transferasset.presentation.C8969f0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f116893a;

        /* renamed from: b, reason: collision with root package name */
        public final String f116894b;

        static {
        }

        public a(String r2, String r3) {
            p.l(r2, Constants.MessagePayloadKeys.FROM);
            p.l(r3, "to");
            super(null);
            this.f116893a = r2;
            this.f116894b = r3;
        }

        public final String a() {
            return this.f116893a;
        }

        public final String b() {
            return this.f116894b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f116893a, r52.f116893a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f116894b, r52.f116894b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f116893a.hashCode() * 31) + this.f116894b.hashCode();
        }

        public String toString() {
            return "Confirmation(from=" + this.f116893a + ", to=" + this.f116894b + ')';
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f116895a;

        /* renamed from: b, reason: collision with root package name */
        public final String f116896b;

        static {
        }

        public b(String r2, String r3) {
            p.l(r2, Constants.MessagePayloadKeys.FROM);
            p.l(r3, "to");
            super(null);
            this.f116895a = r2;
            this.f116896b = r3;
        }

        public final String a() {
            return this.f116895a;
        }

        public final String b() {
            return this.f116896b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f116895a, r52.f116895a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f116896b, r52.f116896b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f116895a.hashCode() * 31) + this.f116896b.hashCode();
        }

        public String toString() {
            return "IfaConfirmation(from=" + this.f116895a + ", to=" + this.f116896b + ')';
        }
    }

    /* renamed from: com.stockbit.feature.transferasset.model.c$c, reason: collision with other inner class name */
    public static final class C1015c extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1015c f116897a = null;

        static {
            f116897a = new C1015c();
        }

        public C1015c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1015c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -232491232;
        }

        public String toString() {
            return "IfaRestriction";
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f116898a = null;

        static {
            f116898a = new d();
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
            return -2082421584;
        }

        public String toString() {
            return "MarginReachedMaxAllowed";
        }
    }

    public static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f116899a;

        /* renamed from: b, reason: collision with root package name */
        public final String f116900b;

        /* renamed from: c, reason: collision with root package name */
        public final C8969f0 f116901c;

        static {
        }

        public e(String r2, String r3, C8969f0 r4) {
            p.l(r2, "fromAccNo");
            p.l(r3, "toAccNo");
            p.l(r4, "informationData");
            super(null);
            this.f116899a = r2;
            this.f116900b = r3;
            this.f116901c = r4;
        }

        public final String a() {
            return this.f116899a;
        }

        public final C8969f0 b() {
            return this.f116901c;
        }

        public final String c() {
            return this.f116900b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof e) == true) goto L8;
            return false;
        L8:
            e r52 = (e) r5;
            if (p.g(this.f116899a, r52.f116899a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f116900b, r52.f116900b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f116901c, r52.f116901c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f116899a.hashCode() * 31) + this.f116900b.hashCode()) * 31) + this.f116901c.hashCode();
        }

        public String toString() {
            return "RightOrWarrantConfirmation(fromAccNo=" + this.f116899a + ", toAccNo=" + this.f116900b + ", informationData=" + this.f116901c + ')';
        }
    }

    public static final class f extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final f f116902a = null;

        static {
            f116902a = new f();
        }

        public f() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof f) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1001142827;
        }

        public String toString() {
            return "Success";
        }
    }

    static {
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
