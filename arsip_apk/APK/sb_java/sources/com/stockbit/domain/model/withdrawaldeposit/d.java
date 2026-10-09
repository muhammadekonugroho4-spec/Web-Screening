package com.stockbit.domain.model.withdrawaldeposit;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f87384a;

    /* renamed from: b, reason: collision with root package name */
    public final List f87385b;

    public d(String r2, List r3) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, "rules");
        this.f87384a = r2;
        this.f87385b = r3;
    }

    public final List a() {
        return this.f87385b;
    }

    public final String b() {
        return this.f87384a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f87384a, r52.f87384a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87385b, r52.f87385b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f87384a.hashCode() * 31) + this.f87385b.hashCode();
    }

    public String toString() {
        return "WithdrawalGuideEntity(title=" + this.f87384a + ", rules=" + this.f87385b + ")";
    }
}
