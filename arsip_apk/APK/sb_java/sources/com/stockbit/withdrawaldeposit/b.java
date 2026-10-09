package com.stockbit.withdrawaldeposit;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1784b f171619a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f171620a;

        /* renamed from: b, reason: collision with root package name */
        public final String f171621b;

        /* renamed from: c, reason: collision with root package name */
        public final int f171622c;

        public a(String r2, String r3) {
            p.l(r3, "keyHistoryPeriodNavResult");
            this.f171620a = r2;
            this.f171621b = r3;
            this.f171622c = f.f172302j;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("keyHistoryPeriod", this.f171620a);
            r02.putString("keyHistoryPeriodNavResult", this.f171621b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f171622c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f171620a, r52.f171620a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f171621b, r52.f171621b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.f171620a;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (r03 * 31) + this.f171621b.hashCode();
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "ActionToPeriodeDialog(keyHistoryPeriod=" + this.f171620a + ", keyHistoryPeriodNavResult=" + this.f171621b + ')';
        }
    }

    /* renamed from: com.stockbit.withdrawaldeposit.b$b, reason: collision with other inner class name */
    public static final class C1784b {
        public /* synthetic */ C1784b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2, String r3) {
            p.l(r3, "keyHistoryPeriodNavResult");
            return new a(r2, r3);
        }

        public C1784b() {
        }
    }

    static {
        f171619a = new C1784b(null);
    }
}
