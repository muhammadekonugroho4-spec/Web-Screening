package org.minidns.edns;

import java.io.DataOutputStream;
import org.minidns.edns.Edns;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f182775a;

    /* renamed from: b, reason: collision with root package name */
    public final int f182776b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f182777c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f182778e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f182779a = null;

        static {
            int[] r02 = new int[Edns.OptionCode.values().length];
            f182779a = r02;
            r02[Edns.OptionCode.NSID.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
            return;
        }
    }

    public b(int r1, byte[] r2) {
        this.f182775a = r1;
        this.f182776b = r2.length;
        this.f182777c = r2;
    }

    public static b d(int r2, byte[] r3) {
        Edns.OptionCode r02 = Edns.OptionCode.from(r2);
        if (a.f182779a[r02.ordinal()] == 1) goto L7;
        return new d(r2, r3);
    L7:
        return new c(r3);
    }

    public final String a() {
        if (this.f182778e != null) goto L6;
        this.f182778e = b().toString();
    L6:
        return this.f182778e;
    }

    public abstract CharSequence b();

    public abstract Edns.OptionCode c();

    public abstract CharSequence e();

    public final void f(DataOutputStream r2) {
        r2.writeShort(this.f182775a);
        r2.writeShort(this.f182776b);
        r2.write(this.f182777c);
    }

    public final String toString() {
        if (this.d != null) goto L6;
        this.d = e().toString();
    L6:
        return this.d;
    }

    public b(byte[] r2) {
        this.f182775a = c().asInt;
        this.f182776b = r2.length;
        this.f182777c = r2;
    }
}
