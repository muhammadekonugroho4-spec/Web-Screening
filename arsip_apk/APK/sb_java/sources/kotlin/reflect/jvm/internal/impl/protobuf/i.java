package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class i implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f179437a;

    public i(Iterator r1) {
        this.f179437a = r1;
    }

    public Map.Entry a() {
        Map.Entry r02 = (Map.Entry) this.f179437a.next();
        r02.getValue();
        return r02;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f179437a.hasNext();
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return a();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f179437a.remove();
    }
}
