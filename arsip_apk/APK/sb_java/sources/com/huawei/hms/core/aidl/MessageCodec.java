package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class MessageCodec {
    protected static final int VAL_ENTITY = 0;
    protected static final int VAL_LIST = 1;
    protected static final int VAL_NULL = -1;
    protected static final String VAL_TYPE = "_val_type_";

    public MessageCodec() {
    }

    private void a(IMessageEntity r3, Field r4, Bundle r5) throws IllegalAccessException {
        Object r52 = a(r4, r5);
        if (r52 == null) goto L6;
        boolean r02 = r4.isAccessible();
        r4.setAccessible(true);
        r4.set(r3, r52);
        r4.setAccessible(r02);
        return;
    }

    private void b(IMessageEntity r3, Field r4, Bundle r5) throws IllegalAccessException {
        boolean r02 = r4.isAccessible();
        r4.setAccessible(true);
        writeValue(r4.getName(), r4.get(r3), r5);
        r4.setAccessible(r02);
    }

    public IMessageEntity decode(Bundle r8, IMessageEntity r9) {
        if (r8 != null) goto L4;
        return r9;
    L4:
        r8.setClassLoader(getClass().getClassLoader());
        Class<?> r02 = r9.getClass();
    L5:
        if (r02 == null) goto L15;
        Field[] r1 = r02.getDeclaredFields();
        int r2 = r1.length;
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L14;
        Field r4 = r1[r3];
        if (r4.isAnnotationPresent(Packed.class) == false) goto L13;
        a(r9, r4, r8);     // Catch: Throwable -> L12
    L12:
        Log.e("MessageCodec", "decode, set value of the field exception, field name:" + r4.getName());
    L13:
        r3 = r3 + 1;
        goto L7
    L14:
        r02 = r02.getSuperclass();
        goto L5
    L15:
        return r9;
    }

    public Bundle encode(IMessageEntity r8, Bundle r9) {
        Class<?> r02 = r8.getClass();
    L3:
        if (r02 == null) goto L13;
        Field[] r1 = r02.getDeclaredFields();
        int r2 = r1.length;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L12;
        Field r4 = r1[r3];
        if (r4.isAnnotationPresent(Packed.class) == false) goto L11;
        b(r8, r4, r9);     // Catch: Throwable -> L10
    L10:
        Log.e("MessageCodec", "encode, get value of the field exception, field name: " + r4.getName());
    L11:
        r3 = r3 + 1;
        goto L5
    L12:
        r02 = r02.getSuperclass();
        goto L3
    L13:
        return r9;
    }

    public List<Object> readList(Type r6, Bundle r7) throws InstantiationException, IllegalAccessException {
        ArrayList r02 = new ArrayList();
        Bundle r72 = r7.getBundle("_next_item_");
    L3:
        if (r72 == null) goto L23;
        Object r2 = r72.get("_value_");
        if (r2.getClass().isPrimitive() == false) goto L7;
    L21:
        r02.add(r2);
    L22:
        r72 = r72.getBundle("_next_item_");
        goto L3
    L7:
        if ((r2 instanceof String) == true) goto L21;
        if ((r2 instanceof Serializable) == true) goto L21;
        if ((r2 instanceof Bundle) == false) goto L22;
        Bundle r22 = (Bundle) r2;
        int r3 = r22.getInt(VAL_TYPE, -1);
        if (r3 == 1) goto L20;
        if (r3 != 0) goto L18;
        r02.add(decode(r22, (IMessageEntity) ((Class) ((ParameterizedType) r6).getActualTypeArguments()[0]).newInstance()));
        goto L22
    L18:
        throw new InstantiationException("Unknown type can not be supported");
    L20:
        throw new InstantiationException("Nested List can not be supported");
    L23:
        return r02;
    }

    public void writeList(String r5, List r6, Bundle r7) {
        Iterator r62 = r6.iterator();
        Bundle r02 = null;
    L4:
        if (r62.hasNext() == false) goto L9;
        Object r1 = r62.next();
        if (r02 != null) goto L8;
        r02 = new Bundle();
        r7.putBundle(r5, r02);
        r02.putInt(VAL_TYPE, 1);
    L8:
        r02 = a("_value_", r02, r1);
        goto L4
    }

    public void writeValue(String r3, Object r4, Bundle r5) {
        if (r4 != null) goto L5;
        return;
    L5:
        if (a(r3, r4, r5) == false) goto L8;
        return;
    L8:
        if ((r4 instanceof CharSequence) == false) goto L12;
        r5.putCharSequence(r3, (CharSequence) r4);
        return;
    L12:
        if ((r4 instanceof Parcelable) == false) goto L16;
        r5.putParcelable(r3, (Parcelable) r4);
        return;
    L16:
        if ((r4 instanceof byte[]) == false) goto L20;
        r5.putByteArray(r3, (byte[]) r4);
        return;
    L20:
        if ((r4 instanceof List) == false) goto L24;
        writeList(r3, (List) r4, r5);
        return;
    L24:
        if ((r4 instanceof Serializable) == false) goto L28;
        r5.putSerializable(r3, (Serializable) r4);
        return;
    L28:
        if ((r4 instanceof IMessageEntity) == false) goto L31;
        Bundle r42 = encode((IMessageEntity) r4, new Bundle());
        r42.putInt(VAL_TYPE, 0);
        r5.putBundle(r3, r42);
        return;
    L31:
        Log.e("MessageCodec", "cannot support type, " + r3);
    }

    private Object a(Field r5, Bundle r6) {
        String r02 = r5.getName();
        Object r62 = r6.get(r02);
        if ((r62 instanceof Bundle) == true) goto L14;
    L13:
        return r62;
    L14:
        Bundle r1 = (Bundle) r62;     // Catch: Exception -> L11
        int r2 = r1.getInt(VAL_TYPE, -1);     // Catch: Exception -> L11
        if (r2 == 1) goto L7;
        if (r2 != 0) goto L13;
        return decode((Bundle) r62, (IMessageEntity) r5.getType().newInstance());
    L7:
        return readList(r5.getGenericType(), r1);
    L11:
        Log.e("MessageCodec", "decode, read value of the field exception, field name: " + r02);
        return null;
    }

    private Bundle a(String r2, Bundle r3, Object r4) {
        Bundle r02 = new Bundle();
        writeValue(r2, r4, r02);
        r3.putBundle("_next_item_", r02);
        return r02;
    }

    private boolean a(String r3, Object r4, Bundle r5) {
        if ((r4 instanceof String) == false) goto L6;
        r5.putString(r3, (String) r4);
        return true;
    L6:
        if ((r4 instanceof Integer) == false) goto L9;
        r5.putInt(r3, ((Integer) r4).intValue());
        return true;
    L9:
        if ((r4 instanceof Short) == false) goto L12;
        r5.putShort(r3, ((Short) r4).shortValue());
        return true;
    L12:
        if ((r4 instanceof Long) == false) goto L15;
        r5.putLong(r3, ((Long) r4).longValue());
        return true;
    L15:
        if ((r4 instanceof Float) == false) goto L18;
        r5.putFloat(r3, ((Float) r4).floatValue());
        return true;
    L18:
        if ((r4 instanceof Double) == false) goto L21;
        r5.putDouble(r3, ((Double) r4).doubleValue());
        return true;
    L21:
        if ((r4 instanceof Boolean) == false) goto L25;
        r5.putBoolean(r3, ((Boolean) r4).booleanValue());
        return true;
    L25:
        return false;
    }
}
