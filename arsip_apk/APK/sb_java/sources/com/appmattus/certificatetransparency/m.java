package com.appmattus.certificatetransparency;

import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public interface m {

    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        public final com.appmattus.certificatetransparency.internal.verifier.model.c f32350a;

        /* renamed from: b, reason: collision with root package name */
        public final String f32351b;

        public a(com.appmattus.certificatetransparency.internal.verifier.model.c r2, String r3) {
            p.l(r2, "sct");
            p.l(r3, "operator");
            this.f32350a = r2;
            this.f32351b = r3;
        }

        public final String a() {
            return this.f32351b;
        }

        public final com.appmattus.certificatetransparency.internal.verifier.model.c b() {
            return this.f32350a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f32350a, r52.f32350a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f32351b, r52.f32351b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f32350a.hashCode() * 31) + this.f32351b.hashCode();
        }

        public String toString() {
            return "Valid SCT";
        }
    }
}
