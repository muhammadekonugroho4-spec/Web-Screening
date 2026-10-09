package com.stockbit.android.extension.utils;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes6.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f47203a = null;

    public static final class a extends CharacterStyle implements UpdateAppearance {

        /* renamed from: a, reason: collision with root package name */
        public final int f47204a;

        /* renamed from: b, reason: collision with root package name */
        public final float f47205b;

        public a(int r1, float r2) {
            this.f47204a = r1;
            this.f47205b = r2;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint r2) {
            kotlin.jvm.internal.p.l(r2, "tp");
            o.a(r2, this.f47204a);
            p.a(r2, this.f47205b);
        }
    }

    static {
        f47203a = new q();
    }

    public q() {
    }

    public final UpdateAppearance a(int r2, float r3) {
        return new a(r2, r3);
    }
}
