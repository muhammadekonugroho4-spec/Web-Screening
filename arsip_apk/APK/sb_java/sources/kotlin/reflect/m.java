package kotlin.reflect;

import kotlin.reflect.l;

/* loaded from: classes3.dex */
public interface m extends l, kotlin.jvm.functions.a {

    public interface a extends l.b, kotlin.jvm.functions.a {
    }

    Object get();

    Object getDelegate();

    @Override // kotlin.reflect.l
    a getGetter();
}
