package com.huawei.hms.core.aidl;

import android.os.Bundle;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class MessageCodecV2 extends MessageCodec {
    public MessageCodecV2() {
    }

    @Override // com.huawei.hms.core.aidl.MessageCodec
    public List<Object> readList(Type r8, Bundle r9) throws InstantiationException, IllegalAccessException {
        int r02 = r9.getInt("_list_size_");
        ArrayList r1 = new ArrayList(r02);
        int r3 = 0;
    L3:
        if (r3 >= r02) goto L23;
        Object r4 = r9.get("_list_item_" + r3);
        if (r4.getClass().isPrimitive() == false) goto L7;
    L21:
        r1.add(r4);
    L22:
        r3 = r3 + 1;
        goto L3
    L7:
        if ((r4 instanceof String) == true) goto L21;
        if ((r4 instanceof Serializable) == true) goto L21;
        if ((r4 instanceof Bundle) == false) goto L22;
        Bundle r42 = (Bundle) r4;
        int r5 = r42.getInt("_val_type_", -1);
        if (r5 == 1) goto L20;
        if (r5 != 0) goto L18;
        r1.add(decode(r42, (IMessageEntity) ((Class) ((ParameterizedType) r8).getActualTypeArguments()[0]).newInstance()));
        goto L22
    L18:
        throw new InstantiationException("Unknown type can not be supported");
    L20:
        throw new InstantiationException("Nested List can not be supported");
    L23:
        return r1;
    }

    @Override // com.huawei.hms.core.aidl.MessageCodec
    public void writeList(String r5, List r6, Bundle r7) {
        Bundle r02 = new Bundle();
        r02.putInt("_val_type_", 1);
        r02.putInt("_list_size_", r6.size());
        int r1 = 0;
    L4:
        if (r1 >= r6.size()) goto L6;
        writeValue("_list_item_" + r1, r6.get(r1), r02);
        r1 = r1 + 1;
        goto L4
    L6:
        r7.putBundle(r5, r02);
    }
}
