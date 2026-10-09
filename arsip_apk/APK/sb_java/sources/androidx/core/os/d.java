package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class d {
    public static final Bundle a() {
        return new Bundle(0);
    }

    public static final Bundle b(Pair... r9) {
        Bundle r02 = new Bundle(r9.length);
        int r1 = r9.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L95;
        Pair r3 = r9[r2];
        String r4 = (String) r3.a();
        Object r32 = r3.b();
        if (r32 != null) goto L8;
        r02.putString(r4, null);
    L92:
        r2 = r2 + 1;
        goto L3
    L8:
        if ((r32 instanceof Boolean) == false) goto L11;
        r02.putBoolean(r4, ((Boolean) r32).booleanValue());
        goto L92
    L11:
        if ((r32 instanceof Byte) == false) goto L14;
        r02.putByte(r4, ((Number) r32).byteValue());
        goto L92
    L14:
        if ((r32 instanceof Character) == false) goto L17;
        r02.putChar(r4, ((Character) r32).charValue());
        goto L92
    L17:
        if ((r32 instanceof Double) == false) goto L20;
        r02.putDouble(r4, ((Number) r32).doubleValue());
        goto L92
    L20:
        if ((r32 instanceof Float) == false) goto L23;
        r02.putFloat(r4, ((Number) r32).floatValue());
        goto L92
    L23:
        if ((r32 instanceof Integer) == false) goto L26;
        r02.putInt(r4, ((Number) r32).intValue());
        goto L92
    L26:
        if ((r32 instanceof Long) == false) goto L29;
        r02.putLong(r4, ((Number) r32).longValue());
        goto L92
    L29:
        if ((r32 instanceof Short) == false) goto L32;
        r02.putShort(r4, ((Number) r32).shortValue());
        goto L92
    L32:
        if ((r32 instanceof Bundle) == false) goto L35;
        r02.putBundle(r4, (Bundle) r32);
        goto L92
    L35:
        if ((r32 instanceof CharSequence) == false) goto L38;
        r02.putCharSequence(r4, (CharSequence) r32);
        goto L92
    L38:
        if ((r32 instanceof Parcelable) == false) goto L41;
        r02.putParcelable(r4, (Parcelable) r32);
        goto L92
    L41:
        if ((r32 instanceof boolean[]) == false) goto L44;
        r02.putBooleanArray(r4, (boolean[]) r32);
        goto L92
    L44:
        if ((r32 instanceof byte[]) == false) goto L47;
        r02.putByteArray(r4, (byte[]) r32);
        goto L92
    L47:
        if ((r32 instanceof char[]) == false) goto L50;
        r02.putCharArray(r4, (char[]) r32);
        goto L92
    L50:
        if ((r32 instanceof double[]) == false) goto L53;
        r02.putDoubleArray(r4, (double[]) r32);
        goto L92
    L53:
        if ((r32 instanceof float[]) == false) goto L56;
        r02.putFloatArray(r4, (float[]) r32);
        goto L92
    L56:
        if ((r32 instanceof int[]) == false) goto L59;
        r02.putIntArray(r4, (int[]) r32);
        goto L92
    L59:
        if ((r32 instanceof long[]) == false) goto L62;
        r02.putLongArray(r4, (long[]) r32);
        goto L92
    L62:
        if ((r32 instanceof short[]) == false) goto L65;
        r02.putShortArray(r4, (short[]) r32);
        goto L92
    L65:
        if ((r32 instanceof Object[]) == false) goto L81;
        Class<?> r5 = r32.getClass().getComponentType();
        p.i(r5);
        if (Parcelable.class.isAssignableFrom(r5) == false) goto L70;
        p.j(r32, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
        r02.putParcelableArray(r4, (Parcelable[]) r32);
        goto L92
    L70:
        if (String.class.isAssignableFrom(r5) == false) goto L73;
        p.j(r32, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        r02.putStringArray(r4, (String[]) r32);
        goto L92
    L73:
        if (CharSequence.class.isAssignableFrom(r5) == false) goto L76;
        p.j(r32, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
        r02.putCharSequenceArray(r4, (CharSequence[]) r32);
        goto L92
    L76:
        if (Serializable.class.isAssignableFrom(r5) == false) goto L79;
        r02.putSerializable(r4, (Serializable) r32);
        goto L92
    L79:
        throw new IllegalArgumentException("Illegal value array type " + r5.getCanonicalName() + " for key \"" + r4 + '\"');
    L81:
        if ((r32 instanceof Serializable) == false) goto L84;
        r02.putSerializable(r4, (Serializable) r32);
        goto L92
    L84:
        if ((r32 instanceof IBinder) == false) goto L87;
        r02.putBinder(r4, (IBinder) r32);
        goto L92
    L87:
        if ((r32 instanceof Size) == false) goto L90;
        b.a(r02, r4, (Size) r32);
        goto L92
    L90:
        if ((r32 instanceof SizeF) == false) goto L94;
        b.b(r02, r4, (SizeF) r32);
        goto L92
    L94:
        throw new IllegalArgumentException("Illegal value type " + r32.getClass().getCanonicalName() + " for key \"" + r4 + '\"');
    L95:
        return r02;
    }
}
