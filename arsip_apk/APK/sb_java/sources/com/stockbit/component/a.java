package com.stockbit.component;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f69028a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69029b;

    /* renamed from: com.stockbit.component.a$a, reason: collision with other inner class name */
    public static final class C0696a extends a {

        /* renamed from: c, reason: collision with root package name */
        public final int f69030c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final BiometricButtonState f69031e;

        /* renamed from: f, reason: collision with root package name */
        public final int f69032f;

        /* renamed from: g, reason: collision with root package name */
        public final int f69033g;

        static {
        }

        public C0696a(int r2, String r3, BiometricButtonState r4, int r5, int r6) {
            p.l(r4, RemoteConfigConstants.ResponseFieldKey.STATE);
            super(r5, r6, null);
            this.f69030c = r2;
            this.d = r3;
            this.f69031e = r4;
            this.f69032f = r5;
            this.f69033g = r6;
        }

        @Override // com.stockbit.component.a
        public int a() {
            return this.f69032f;
        }

        @Override // com.stockbit.component.a
        public int b() {
            return this.f69033g;
        }

        public final String c() {
            return this.d;
        }

        public final int d() {
            return this.f69030c;
        }

        public final BiometricButtonState e() {
            return this.f69031e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0696a) == true) goto L8;
            return false;
        L8:
            C0696a r52 = (C0696a) r5;
            if (this.f69030c == r52.f69030c) goto L12;
            return false;
        L12:
            if (p.g(this.d, r52.d) == true) goto L15;
            return false;
        L15:
            if (this.f69031e == r52.f69031e) goto L18;
            return false;
        L18:
            if (this.f69032f == r52.f69032f) goto L21;
            return false;
        L21:
            if (this.f69033g == r52.f69033g) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            int r02 = Integer.hashCode(this.f69030c) * 31;
            String r1 = this.d;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return ((((((r02 + r12) * 31) + this.f69031e.hashCode()) * 31) + Integer.hashCode(this.f69032f)) * 31) + Integer.hashCode(this.f69033g);
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "Biometric(icon=" + this.f69030c + ", contentDescription=" + this.d + ", state=" + this.f69031e + ", key=" + this.f69032f + ", value=" + this.f69033g + ')';
        }

        public /* synthetic */ C0696a(int r7, String r8, BiometricButtonState r9, int r10, int r11, int r12, i r13) {
            if ((r12 & 2) == 0) goto L5;
            r8 = null;
        L5:
            String r2 = r8;
            if ((r12 & 8) == 0) goto L9;
            int r4 = r7;
        L10:
            this(r7, r2, r9, r4, r11);
            return;
        L9:
            r4 = r10;
            goto L10
        }
    }

    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        public final int f69034c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final int f69035e;

        /* renamed from: f, reason: collision with root package name */
        public final int f69036f;

        static {
        }

        public b(int r2, String r3, int r4, int r5) {
            super(r4, r5, null);
            this.f69034c = r2;
            this.d = r3;
            this.f69035e = r4;
            this.f69036f = r5;
        }

        @Override // com.stockbit.component.a
        public int a() {
            return this.f69035e;
        }

        @Override // com.stockbit.component.a
        public int b() {
            return this.f69036f;
        }

        public final String c() {
            return this.d;
        }

        public final int d() {
            return this.f69034c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (this.f69034c == r52.f69034c) goto L12;
            return false;
        L12:
            if (p.g(this.d, r52.d) == true) goto L15;
            return false;
        L15:
            if (this.f69035e == r52.f69035e) goto L18;
            return false;
        L18:
            if (this.f69036f == r52.f69036f) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            int r02 = Integer.hashCode(this.f69034c) * 31;
            String r1 = this.d;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return ((((r02 + r12) * 31) + Integer.hashCode(this.f69035e)) * 31) + Integer.hashCode(this.f69036f);
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "Icon(icon=" + this.f69034c + ", contentDescription=" + this.d + ", key=" + this.f69035e + ", value=" + this.f69036f + ')';
        }

        public /* synthetic */ b(int r1, String r2, int r3, int r4, int r5, i r6) {
            if ((r5 & 2) == 0) goto L6;
            r2 = null;
        L6:
            if ((r5 & 4) == 0) goto L8;
            r3 = r1;
        L8:
            this(r1, r2, r3, r4);
        }
    }

    public static final class c extends a {

        /* renamed from: c, reason: collision with root package name */
        public final Integer f69037c;
        public final int d;

        /* renamed from: e, reason: collision with root package name */
        public final int f69038e;

        static {
        }

        public c(Integer r2, int r3, int r4) {
            super(r3, r4, null);
            this.f69037c = r2;
            this.d = r3;
            this.f69038e = r4;
        }

        @Override // com.stockbit.component.a
        public int a() {
            return this.d;
        }

        @Override // com.stockbit.component.a
        public int b() {
            return this.f69038e;
        }

        public final Integer c() {
            return this.f69037c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f69037c, r52.f69037c) == true) goto L12;
            return false;
        L12:
            if (this.d == r52.d) goto L15;
            return false;
        L15:
            if (this.f69038e == r52.f69038e) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            Integer r02 = this.f69037c;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (((r03 * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f69038e);
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "Text(text=" + this.f69037c + ", key=" + this.d + ", value=" + this.f69038e + ')';
        }

        public /* synthetic */ c(Integer r1, int r2, int r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = null;
        L6:
            if ((r4 & 2) == 0) goto L10;
            if (r1 == null) goto L9;
            r2 = r1.intValue();
            goto L10
        L9:
            r2 = 0;
        L10:
            this(r1, r2, r3);
        }
    }

    static {
    }

    public /* synthetic */ a(int r1, int r2, i r3) {
        this(r1, r2);
    }

    public abstract int a();

    public abstract int b();

    public a(int r1, int r2) {
        this.f69028a = r1;
        this.f69029b = r2;
    }
}
