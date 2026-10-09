package com.bumptech.glide.load;

import com.bumptech.glide.util.k;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final b f32607e = null;

    /* renamed from: a, reason: collision with root package name */
    public final Object f32608a;

    /* renamed from: b, reason: collision with root package name */
    public final b f32609b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32610c;
    public volatile byte[] d;

    public class a implements b {
        public a() {
        }

        @Override // com.bumptech.glide.load.e.b
        public void a(byte[] r1, Object r2, MessageDigest r3) {
        }
    }

    public interface b {
        void a(byte[] r1, Object r2, MessageDigest r3);
    }

    static {
        f32607e = new a();
    }

    public e(String r1, Object r2, b r3) {
        this.f32610c = k.b(r1);
        this.f32608a = r2;
        this.f32609b = (b) k.d(r3);
    }

    public static e a(String r1, Object r2, b r3) {
        return new e(r1, r2, r3);
    }

    public static b b() {
        return f32607e;
    }

    public static e e(String r3) {
        return new e(r3, null, b());
    }

    public static e f(String r2, Object r3) {
        return new e(r2, r3, b());
    }

    public Object c() {
        return this.f32608a;
    }

    public final byte[] d() {
        if (this.d != null) goto L6;
        this.d = this.f32610c.getBytes(c.f32567a);
    L6:
        return this.d;
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof e) == true) goto L5;
        return false;
    L5:
        return this.f32610c.equals(((e) r2).f32610c);
    }

    public void g(Object r3, MessageDigest r4) {
        this.f32609b.a(d(), r3, r4);
    }

    public int hashCode() {
        return this.f32610c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f32610c + "'}";
    }
}
