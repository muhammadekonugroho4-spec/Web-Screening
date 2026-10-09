package androidx.datastore.preferences.protobuf;

/* loaded from: classes4.dex */
public abstract class b0 {

    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteString f23802a;

        public a(ByteString r1) {
            this.f23802a = r1;
        }

        @Override // androidx.datastore.preferences.protobuf.b0.b
        public byte byteAt(int r2) {
            return this.f23802a.b(r2);
        }

        @Override // androidx.datastore.preferences.protobuf.b0.b
        public int size() {
            return this.f23802a.size();
        }
    }

    public interface b {
        byte byteAt(int r1);

        int size();
    }

    public static String a(ByteString r1) {
        return b(new a(r1));
    }

    public static String b(b r5) {
        StringBuilder r02 = new StringBuilder(r5.size());
        int r1 = 0;
    L4:
        if (r1 >= r5.size()) goto L30;
        byte r2 = r5.byteAt(r1);
        if (r2 != 34) goto L8;
        r02.append("\\\"");
    L28:
        r1 = r1 + 1;
        goto L4
    L8:
        if (r2 != 39) goto L10;
        r02.append("\\'");
        goto L28
    L10:
        if (r2 == 92) goto L25;
        switch(r2) {
            case 7: goto L24;
            case 8: goto L23;
            case 9: goto L22;
            case 10: goto L21;
            case 11: goto L20;
            case 12: goto L19;
            case 13: goto L18;
            default: goto L13;
        };
    L18:
        r02.append("\\r");
        goto L28
    L19:
        r02.append("\\f");
        goto L28
    L20:
        r02.append("\\v");
        goto L28
    L21:
        r02.append("\\n");
        goto L28
    L22:
        r02.append("\\t");
        goto L28
    L23:
        r02.append("\\b");
        goto L28
    L24:
        r02.append("\\a");
        goto L28
    L13:
        if (r2 >= 32) goto L15;
    L17:
        r02.append('\\');
        r02.append((char) (((r2 >>> 6) & 3) + 48));
        r02.append((char) (((r2 >>> 3) & 7) + 48));
        r02.append((char) ((r2 & 7) + 48));
        goto L28
    L15:
        if (r2 > 126) goto L17;
        r02.append((char) r2);
        goto L28
    L25:
        r02.append("\\\\");
        goto L28
    L30:
        return r02.toString();
    }

    public static String c(String r02) {
        return a(ByteString.h(r02));
    }
}
