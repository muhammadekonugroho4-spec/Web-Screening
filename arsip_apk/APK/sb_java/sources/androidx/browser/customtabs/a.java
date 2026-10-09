package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f3851a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f3852b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f3853c;
    public final Integer d;

    /* renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0036a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f3854a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f3855b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f3856c;
        public Integer d;

        public C0036a() {
        }

        public a a() {
            return new a(this.f3854a, this.f3855b, this.f3856c, this.d);
        }

        public C0036a b(int r2) {
            this.f3854a = Integer.valueOf(r2 | (-16777216));
            return this;
        }
    }

    public a(Integer r1, Integer r2, Integer r3, Integer r4) {
        this.f3851a = r1;
        this.f3852b = r2;
        this.f3853c = r3;
        this.d = r4;
    }

    public Bundle a() {
        Bundle r02 = new Bundle();
        Integer r1 = this.f3851a;
        if (r1 == null) goto L5;
        r02.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", r1.intValue());
    L5:
        Integer r12 = this.f3852b;
        if (r12 == null) goto L8;
        r02.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", r12.intValue());
    L8:
        Integer r13 = this.f3853c;
        if (r13 == null) goto L11;
        r02.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", r13.intValue());
    L11:
        Integer r14 = this.d;
        if (r14 == null) goto L14;
        r02.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", r14.intValue());
    L14:
        return r02;
    }
}
