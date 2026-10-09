package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.Q;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\bF\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\bV¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u00020\u000fH\u0082\u0080\u0004R\u0017\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X\u0082\u008e\b¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "map", "", "<init>", "(Ljava/util/Map;)V", "()V", "writeExternal", "", "output", "Ljava/io/ObjectOutput;", "readExternal", "input", "Ljava/io/ObjectInput;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SerializedMap implements Externalizable {

    /* renamed from: a, reason: collision with root package name */
    public static final a f177374a = null;
    private static final long serialVersionUID = 0;
    private Map<?, ?> map;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f177374a = new a(null);
    }

    public SerializedMap(Map r2) {
        p.l(r2, "map");
        this.map = r2;
    }

    private final Object readResolve() {
        return this.map;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput r6) {
        p.l(r6, "input");
        byte r02 = r6.readByte();
        if (r02 != 0) goto L14;
        int r03 = r6.readInt();
        if (r03 < 0) goto L12;
        Map r1 = Q.d(r03);
        int r2 = 0;
    L7:
        if (r2 >= r03) goto L9;
        r1.put(r6.readObject(), r6.readObject());
        r2 = r2 + 1;
        goto L7
    L9:
        this.map = Q.b(r1);
        return;
    L12:
        throw new InvalidObjectException("Illegal size value: " + r03 + '.');
    L14:
        throw new InvalidObjectException("Unsupported flags value: " + r02);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput r4) {
        p.l(r4, "output");
        r4.writeByte(0);
        r4.writeInt(this.map.size());
        Iterator<Map.Entry<?, ?>> r02 = this.map.entrySet().iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        Map.Entry<?, ?> r1 = r02.next();
        r4.writeObject(r1.getKey());
        r4.writeObject(r1.getValue());
        goto L4
    }
}
