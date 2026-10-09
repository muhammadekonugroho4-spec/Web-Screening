package com.nineoldandroids.animation;

/* loaded from: classes6.dex */
public class f implements l {
    public f() {
    }

    public Integer a(float r2, Integer r3, Integer r4) {
        return Integer.valueOf((int) (r3.intValue() + (r2 * (r4.intValue() - r3))));
    }

    @Override // com.nineoldandroids.animation.l
    public /* bridge */ /* synthetic */ Object evaluate(float r1, Object r2, Object r3) {
        return a(r1, (Integer) r2, (Integer) r3);
    }
}
