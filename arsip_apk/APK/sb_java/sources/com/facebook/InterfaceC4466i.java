package com.facebook;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;

/* renamed from: com.facebook.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4466i {

    /* renamed from: com.facebook.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f36299a;

        /* renamed from: b, reason: collision with root package name */
        public final int f36300b;

        /* renamed from: c, reason: collision with root package name */
        public final Intent f36301c;

        public a(int r1, int r2, Intent r3) {
            this.f36299a = r1;
            this.f36300b = r2;
            this.f36301c = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f36299a == r52.f36299a) goto L12;
            return false;
        L12:
            if (this.f36300b == r52.f36300b) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f36301c, r52.f36301c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = ((Integer.hashCode(this.f36299a) * 31) + Integer.hashCode(this.f36300b)) * 31;
            Intent r1 = this.f36301c;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "ActivityResultParameters(requestCode=" + this.f36299a + ", resultCode=" + this.f36300b + ", data=" + this.f36301c + ')';
        }
    }

    /* renamed from: com.facebook.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36302a = null;

        static {
            f36302a = new b();
        }

        public b() {
        }

        public static final InterfaceC4466i a() {
            return new CallbackManagerImpl();
        }
    }

    boolean a(int r1, int r2, Intent r3);
}
