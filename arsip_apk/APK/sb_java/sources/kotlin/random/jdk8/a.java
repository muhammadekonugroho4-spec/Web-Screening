package kotlin.random.jdk8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class a extends kotlin.random.a {
    public a() {
    }

    @Override // kotlin.random.Random
    public int h(int r2, int r3) {
        return ThreadLocalRandom.current().nextInt(r2, r3);
    }

    @Override // kotlin.random.a
    public Random i() {
        ThreadLocalRandom r02 = ThreadLocalRandom.current();
        p.k(r02, "current(...)");
        return r02;
    }
}
