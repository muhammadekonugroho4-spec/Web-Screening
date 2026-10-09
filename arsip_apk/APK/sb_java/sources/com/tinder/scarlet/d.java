package com.tinder.scarlet;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f173649a;

        public a(byte[] r2) {
            p.l(r2, "value");
            super(null);
            this.f173649a = r2;
        }

        public final byte[] a() {
            return this.f173649a;
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f173650a;

        public b(String r2) {
            p.l(r2, "value");
            super(null);
            this.f173650a = r2;
        }

        public final String a() {
            return this.f173650a;
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L4;
            return true;
        L4:
            if ((r2 instanceof b) == true) goto L6;
            return false;
        L6:
            if (p.g(this.f173650a, ((b) r2).f173650a) == true) goto L13;
            return false;
        L13:
            return true;
        }

        public int hashCode() {
            String r02 = this.f173650a;
            if (r02 != null) goto L5;
            return 0;
        L5:
            return r02.hashCode();
        }

        public String toString() {
            return "Text(value=" + this.f173650a + ")";
        }
    }

    public d() {
    }

    public /* synthetic */ d(kotlin.jvm.internal.i r1) {
        this();
    }
}
