package com.stockbit.trading.ui.openingaccount.bibit;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.valueobject.securities.OcrResult;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class j implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final int f147912e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f147913a;

    /* renamed from: b, reason: collision with root package name */
    public final String f147914b;

    /* renamed from: c, reason: collision with root package name */
    public final OcrResult f147915c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final j a(Bundle r6) {
            kotlin.jvm.internal.p.l(r6, "bundle");
            r6.setClassLoader(j.class.getClassLoader());
            if (r6.containsKey("isFromSocial") == false) goto L5;
            boolean r02 = r6.getBoolean("isFromSocial");
        L6:
            OcrResult r3 = null;
            if (r6.containsKey("maskedPhoneNumber") == false) goto L9;
            String r1 = r6.getString("maskedPhoneNumber");
        L11:
            if (r6.containsKey("ocrResult") == false) goto L21;
            if (Parcelable.class.isAssignableFrom(OcrResult.class) == false) goto L15;
        L19:
            r3 = (OcrResult) r6.get("ocrResult");
            goto L21
        L15:
            if (Serializable.class.isAssignableFrom(OcrResult.class) == true) goto L19;
            throw new UnsupportedOperationException(OcrResult.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L21:
            return new j(r02, r1, r3);
        L9:
            r1 = null;
            goto L11
        L5:
            r02 = false;
            goto L6
        }

        public a() {
        }
    }

    static {
        d = new a(null);
        f147912e = 8;
    }

    public j(boolean r1, String r2, OcrResult r3) {
        this.f147913a = r1;
        this.f147914b = r2;
        this.f147915c = r3;
    }

    public static final j fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f147914b;
    }

    public final OcrResult b() {
        return this.f147915c;
    }

    public final boolean c() {
        return this.f147913a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (this.f147913a == r52.f147913a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f147914b, r52.f147914b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f147915c, r52.f147915c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.f147913a) * 31;
        String r1 = this.f147914b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        OcrResult r13 = this.f147915c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "RegistrationBibitFragmentArgs(isFromSocial=" + this.f147913a + ", maskedPhoneNumber=" + this.f147914b + ", ocrResult=" + this.f147915c + ')';
    }
}
