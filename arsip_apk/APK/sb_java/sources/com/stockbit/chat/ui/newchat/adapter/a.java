package com.stockbit.chat.ui.newchat.adapter;

import com.stockbit.domain.model.chat.group.o;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: com.stockbit.chat.ui.newchat.adapter.a$a, reason: collision with other inner class name */
    public static final class C0585a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0585a f56655a = null;

        static {
            f56655a = new C0585a();
        }

        public C0585a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0585a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -143030904;
        }

        public String toString() {
            return "Header";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final o f56656a;

        static {
        }

        public b(o r2) {
            p.l(r2, "memberUser");
            super(null);
            this.f56656a = r2;
        }

        public final o a() {
            return this.f56656a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f56656a, ((b) r4).f56656a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f56656a.hashCode();
        }

        public String toString() {
            return "Member(memberUser=" + this.f56656a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final o f56657a;

        static {
        }

        public c(o r2) {
            p.l(r2, "memberUser");
            super(null);
            this.f56657a = r2;
        }

        public final o a() {
            return this.f56657a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f56657a, ((c) r4).f56657a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f56657a.hashCode();
        }

        public String toString() {
            return "MemberSelection(memberUser=" + this.f56657a + ')';
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f56658a = null;

        static {
            f56658a = new d();
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
            return 1035942730;
        }

        public String toString() {
            return "Section";
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
