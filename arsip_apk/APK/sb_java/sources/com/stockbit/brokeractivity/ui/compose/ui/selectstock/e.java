package com.stockbit.brokeractivity.ui.compose.ui.selectstock;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import java.util.Arrays;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f49059b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f49060c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String[] f49061a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(e.class.getClassLoader());
            if (r3.containsKey("selectedStocks") == false) goto L5;
            String[] r32 = r3.getStringArray("selectedStocks");
        L7:
            return new e(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f49059b = new a(null);
        f49060c = 8;
    }

    public e(String[] r1) {
        this.f49061a = r1;
    }

    public static final e fromBundle(Bundle r1) {
        return f49059b.a(r1);
    }

    public final String[] a() {
        return this.f49061a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putStringArray("selectedStocks", this.f49061a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f49061a, ((e) r4).f49061a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String[] r02 = this.f49061a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return Arrays.hashCode(r02);
    }

    public String toString() {
        return "SelectStockComposeFragmentArgs(selectedStocks=" + Arrays.toString(this.f49061a) + ')';
    }
}
