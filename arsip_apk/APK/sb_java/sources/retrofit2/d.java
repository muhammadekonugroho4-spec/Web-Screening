package retrofit2;

import okhttp3.Request;

/* loaded from: classes3.dex */
public interface d<T> extends Cloneable {
    void E(f r1);

    void cancel();

    /* renamed from: clone */
    d mo658clone();

    Request f();

    boolean isCanceled();
}
