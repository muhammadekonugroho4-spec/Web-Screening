package androidx.compose.animation.core;

/* loaded from: classes.dex */
public interface f1 {
    boolean a();

    long b(AbstractC2395p r1, AbstractC2395p r2, AbstractC2395p r3);

    default AbstractC2395p d(AbstractC2395p r7, AbstractC2395p r8, AbstractC2395p r9) {
        return e(b(r7, r8, r9), r7, r8, r9);
    }

    AbstractC2395p e(long r1, AbstractC2395p r3, AbstractC2395p r4, AbstractC2395p r5);

    AbstractC2395p f(long r1, AbstractC2395p r3, AbstractC2395p r4, AbstractC2395p r5);
}
