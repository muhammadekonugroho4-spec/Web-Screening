package kotlin.random;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class a extends Random {
    public a() {
    }

    @Override // kotlin.random.Random
    public int b(int r2) {
        return c.e(i().nextInt(), r2);
    }

    @Override // kotlin.random.Random
    public byte[] d(byte[] r2) {
        p.l(r2, "array");
        i().nextBytes(r2);
        return r2;
    }

    @Override // kotlin.random.Random
    public double e() {
        return i().nextDouble();
    }

    @Override // kotlin.random.Random
    public int f() {
        return i().nextInt();
    }

    @Override // kotlin.random.Random
    public int g(int r2) {
        return i().nextInt(r2);
    }

    public abstract java.util.Random i();
}
