package com.stockbit.company.ui.comparison.model;

import com.stockbit.usecase.company.model.F;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: com.stockbit.company.ui.comparison.model.a$a, reason: collision with other inner class name */
    public static final class C0658a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f65017a;

        /* renamed from: b, reason: collision with root package name */
        public final String f65018b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f65019c;

        static {
        }

        public C0658a(String r2, String r3, boolean r4) {
            p.l(r2, "groupId");
            p.l(r3, "groupName");
            super(null);
            this.f65017a = r2;
            this.f65018b = r3;
            this.f65019c = r4;
        }

        public final boolean a() {
            return this.f65019c;
        }

        public String b() {
            return this.f65017a;
        }

        public final String c() {
            return this.f65018b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0658a) == true) goto L8;
            return false;
        L8:
            C0658a r52 = (C0658a) r5;
            if (p.g(this.f65017a, r52.f65017a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f65018b, r52.f65018b) == true) goto L15;
            return false;
        L15:
            if (this.f65019c == r52.f65019c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f65017a.hashCode() * 31) + this.f65018b.hashCode()) * 31) + Boolean.hashCode(this.f65019c);
        }

        public String toString() {
            return "GroupHeader(groupId=" + this.f65017a + ", groupName=" + this.f65018b + ", expanded=" + this.f65019c + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f65020a;

        /* renamed from: b, reason: collision with root package name */
        public final F f65021b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f65022c;

        static {
        }

        public b(String r2, F r3, boolean r4) {
            p.l(r2, "groupId");
            p.l(r3, "metric");
            super(null);
            this.f65020a = r2;
            this.f65021b = r3;
            this.f65022c = r4;
        }

        public final F a() {
            return this.f65021b;
        }

        public final boolean b() {
            return this.f65022c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f65020a, r52.f65020a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f65021b, r52.f65021b) == true) goto L15;
            return false;
        L15:
            if (this.f65022c == r52.f65022c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f65020a.hashCode() * 31) + this.f65021b.hashCode()) * 31) + Boolean.hashCode(this.f65022c);
        }

        public String toString() {
            return "MetricRow(groupId=" + this.f65020a + ", metric=" + this.f65021b + ", isLastInGroup=" + this.f65022c + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
