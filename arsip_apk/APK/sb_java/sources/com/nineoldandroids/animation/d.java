package com.nineoldandroids.animation;

/* loaded from: classes6.dex */
public class d implements l {
    public d() {
    }

    public Float a(float r1, Number r2, Number r3) {
        float r22 = r2.floatValue();
        return Float.valueOf(r22 + (r1 * (r3.floatValue() - r22)));
    }

    @Override // com.nineoldandroids.animation.l
    public /* bridge */ /* synthetic */ Object evaluate(float r1, Object r2, Object r3) {
        return a(r1, (Number) r2, (Number) r3);
    }
}
