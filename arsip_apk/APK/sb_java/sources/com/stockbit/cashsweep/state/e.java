package com.stockbit.cashsweep.state;

import kotlin.jvm.internal.i;

/* loaded from: classes7.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f52006a = null;

        static {
            f52006a = new a();
        }

        public a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 753275816;
        }

        public String toString() {
            return "Back";
        }
    }

    static {
    }

    public /* synthetic */ e(i r1) {
        this();
    }

    public e() {
    }
}
