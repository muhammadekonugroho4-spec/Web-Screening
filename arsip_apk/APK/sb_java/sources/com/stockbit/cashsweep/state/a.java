package com.stockbit.cashsweep.state;

import com.stockbit.usecase.cashsweep.model.type.CashSweepBottomSheetType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: com.stockbit.cashsweep.state.a$a, reason: collision with other inner class name */
    public static final class C0561a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0561a f51997a = null;

        static {
            f51997a = new C0561a();
        }

        public C0561a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0561a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1073325254;
        }

        public String toString() {
            return "HideBottomSheet";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final CashSweepBottomSheetType f51998a;

        static {
        }

        public b(CashSweepBottomSheetType r2) {
            p.l(r2, "type");
            super(null);
            this.f51998a = r2;
        }

        public final CashSweepBottomSheetType a() {
            return this.f51998a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f51998a == ((b) r4).f51998a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f51998a.hashCode();
        }

        public String toString() {
            return "ShowBottomSheetInfo(type=" + this.f51998a + ')';
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
