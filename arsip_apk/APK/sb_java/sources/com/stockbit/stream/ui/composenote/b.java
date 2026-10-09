package com.stockbit.stream.ui.composenote;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f142182a;

        static {
        }

        public a(String r2) {
            p.l(r2, "message");
            this.f142182a = r2;
        }

        public final String a() {
            return this.f142182a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f142182a, ((a) r4).f142182a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f142182a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f142182a + ')';
        }
    }
}
