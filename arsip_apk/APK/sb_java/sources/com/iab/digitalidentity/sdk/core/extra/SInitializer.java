package com.iab.digitalidentity.sdk.core.extra;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import i0.AbstractC11492p;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086 J\t\u0010\u0007\u001a\u00020\u0004H\u0086 J\t\u0010\b\u001a\u00020\u0004H\u0086 J\t\u0010\t\u001a\u00020\u0004H\u0086 J\t\u0010\n\u001a\u00020\u0004H\u0086 J\t\u0010\u000b\u001a\u00020\u0004H\u0086 J\t\u0010\f\u001a\u00020\u0004H\u0086 J\t\u0010\r\u001a\u00020\u0004H\u0086 J\t\u0010\u000e\u001a\u00020\u0004H\u0086 J\u0011\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086 J\t\u0010\u0010\u001a\u00020\u0004H\u0086 J\u0011\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0086 J\t\u0010\u0014\u001a\u00020\u0004H\u0086 J\t\u0010\u0015\u001a\u00020\u0004H\u0086 J\u0011\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086 J\t\u0010\u0017\u001a\u00020\u0004H\u0086 J\u0011\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086 J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001aH\u0086 J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001aH\u0086 J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001aH\u0086 ¨\u0006\u001d"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/extra/SInitializer;", "", "()V", "a", "", "context", "Landroid/content/Context;", "a2", "a3", "b", "b2", "b3", "b4", "b5", "c", Constants.INAPP_DATA_TAG, "e", "f", "", "p", "g", "g2", "h", "i", "j", "z1", "", "z2", "z3", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SInitializer {
    public static final SInitializer INSTANCE = null;

    static {
        INSTANCE = new SInitializer();
        System.loadLibrary("onekyc-lib");     // Catch: UnsatisfiedLinkError -> L5
        return;
    L5:
        e = move-exception;
        WeakReference r1 = AbstractC11492p.f174419a;
        AbstractC11492p.a(e.toString(), "GoPay Plus");
    }

    private SInitializer() {
    }

    public final native String a(Context r1);

    public final native String a2();

    public final native String a3();

    public final native String b();

    public final native String b2();

    public final native String b3();

    public final native String b4();

    public final native String b5();

    public final native String c();

    public final native String d(Context r1);

    public final native String e();

    public final native int f(String r1);

    public final native String g();

    public final native String g2();

    public final native String h(Context r1);

    public final native String i();

    public final native String j(Context r1);

    public final native Map<String, String> z1();

    public final native Map<String, String> z2();

    public final native Map<String, String> z3();
}
