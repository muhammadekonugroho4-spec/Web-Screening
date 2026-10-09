package com.stockbit.canvas.ui.compose.ui.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public interface a {

    /* renamed from: com.stockbit.canvas.ui.compose.ui.model.a$a, reason: collision with other inner class name */
    public static final class C0560a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f51788a;

        /* renamed from: b, reason: collision with root package name */
        public final List f51789b;

        /* renamed from: c, reason: collision with root package name */
        public final long f51790c;

        static {
        }

        public /* synthetic */ C0560a(long r1, List r3, long r4, kotlin.jvm.internal.i r6) {
            this(r1, r3, r4);
        }

        public static /* synthetic */ C0560a c(C0560a r6, long r7, List r9, long r10, int r12, Object r13) {
            if ((r12 & 1) == 0) goto L5;
            r7 = r6.f51788a;
        L5:
            long r1 = r7;
            if ((r12 & 2) == 0) goto L8;
            r9 = r6.f51789b;
        L8:
            List r3 = r9;
            if ((r12 & 4) == 0) goto L12;
            r10 = r6.f51790c;
        L12:
            return r6.b(r1, r3, r10);
        }

        @Override // com.stockbit.canvas.ui.compose.ui.model.a
        public long a() {
            return this.f51788a;
        }

        public final C0560a b(long r9, List r11, long r12) {
            p.l(r11, "originIds");
            return new C0560a(r9, r11, r12, null);
        }

        public final long d() {
            return this.f51790c;
        }

        public final List e() {
            return this.f51789b;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof C0560a) == true) goto L8;
            return false;
        L8:
            C0560a r82 = (C0560a) r8;
            if (this.f51788a == r82.f51788a) goto L12;
            return false;
        L12:
            if (p.g(this.f51789b, r82.f51789b) == true) goto L15;
            return false;
        L15:
            if (androidx.compose.ui.geometry.e.j(this.f51790c, r82.f51790c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Long.hashCode(this.f51788a) * 31) + this.f51789b.hashCode()) * 31) + androidx.compose.ui.geometry.e.o(this.f51790c);
        }

        public String toString() {
            return "Drag(cardId=" + this.f51788a + ", originIds=" + this.f51789b + ", floatingOffsetPx=" + androidx.compose.ui.geometry.e.s(this.f51790c) + ')';
        }

        public C0560a(long r2, List r4, long r5) {
            p.l(r4, "originIds");
            this.f51788a = r2;
            this.f51789b = r4;
            this.f51790c = r5;
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f51791a;

        /* renamed from: b, reason: collision with root package name */
        public final long f51792b;

        static {
        }

        public /* synthetic */ b(long r1, long r3, kotlin.jvm.internal.i r5) {
            this(r1, r3);
        }

        @Override // com.stockbit.canvas.ui.compose.ui.model.a
        public long a() {
            return this.f51791a;
        }

        public final long b() {
            return this.f51792b;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof b) == true) goto L8;
            return false;
        L8:
            b r82 = (b) r8;
            if (this.f51791a == r82.f51791a) goto L12;
            return false;
        L12:
            if (androidx.compose.ui.geometry.k.f(this.f51792b, r82.f51792b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Long.hashCode(this.f51791a) * 31) + androidx.compose.ui.geometry.k.k(this.f51792b);
        }

        public String toString() {
            return "Resize(cardId=" + this.f51791a + ", stretchedSizePx=" + androidx.compose.ui.geometry.k.m(this.f51792b) + ')';
        }

        public b(long r1, long r3) {
            this.f51791a = r1;
            this.f51792b = r3;
        }
    }

    long a();
}
