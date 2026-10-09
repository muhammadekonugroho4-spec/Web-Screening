package com.appmattus.certificatetransparency.loglist;

import java.util.Arrays;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public interface i {

    public static class a implements i {
        public a() {
        }
    }

    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f32348a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f32349b;

        public b(byte[] r2, byte[] r3) {
            p.l(r2, "logList");
            p.l(r3, "signature");
            this.f32348a = r2;
            this.f32349b = r3;
        }

        public final byte[] a() {
            return this.f32348a;
        }

        public final byte[] b() {
            return this.f32349b;
        }

        public final byte[] c() {
            return this.f32348a;
        }

        public final byte[] d() {
            return this.f32349b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L5;
            return true;
        L5:
            if (r5 == null) goto L7;
            Class<?> r1 = r5.getClass();
        L9:
            if (p.g(b.class, r1) == true) goto L11;
            return false;
        L11:
            p.j(r5, "null cannot be cast to non-null type com.appmattus.certificatetransparency.loglist.RawLogListResult.Success");
            b r52 = (b) r5;
            if (Arrays.equals(this.f32348a, r52.f32348a) == true) goto L15;
            return false;
        L15:
            if (Arrays.equals(this.f32349b, r52.f32349b) == true) goto L17;
            return false;
        L17:
            return true;
        L7:
            r1 = null;
            goto L9
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f32348a) * 31) + Arrays.hashCode(this.f32349b);
        }

        public String toString() {
            return "Success(logList=" + Arrays.toString(this.f32348a) + ", signature=" + Arrays.toString(this.f32349b) + ')';
        }
    }
}
