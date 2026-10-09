package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3931v implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f23887a;

    public C3931v(Iterator r1) {
        this.f23887a = r1;
    }

    public Map.Entry a() {
        Map.Entry r02 = (Map.Entry) this.f23887a.next();
        r02.getValue();
        return r02;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23887a.hasNext();
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return a();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f23887a.remove();
    }
}
