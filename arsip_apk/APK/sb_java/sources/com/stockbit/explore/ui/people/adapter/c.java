package com.stockbit.explore.ui.people.adapter;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f91822a;

        public a(String r2) {
            p.l(r2, "userId");
            super(null);
            this.f91822a = r2;
        }

        public final String a() {
            return this.f91822a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f91822a, ((a) r4).f91822a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f91822a.hashCode();
        }

        public String toString() {
            return "Followed(userId=" + this.f91822a + ')';
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f91823a;

        public b(String r2) {
            p.l(r2, "userId");
            super(null);
            this.f91823a = r2;
        }

        public final String a() {
            return this.f91823a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f91823a, ((b) r4).f91823a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f91823a.hashCode();
        }

        public String toString() {
            return "OnFollowRequest(userId=" + this.f91823a + ')';
        }
    }

    /* renamed from: com.stockbit.explore.ui.people.adapter.c$c, reason: collision with other inner class name */
    public static final class C0877c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f91824a;

        public C0877c(String r2) {
            p.l(r2, "userId");
            super(null);
            this.f91824a = r2;
        }

        public final String a() {
            return this.f91824a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0877c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f91824a, ((C0877c) r4).f91824a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f91824a.hashCode();
        }

        public String toString() {
            return "UnFollowed(userId=" + this.f91824a + ')';
        }
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
