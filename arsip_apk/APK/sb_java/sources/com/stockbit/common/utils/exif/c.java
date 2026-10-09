package com.stockbit.common.utils.exif;

import com.clevertap.android.sdk.Constants;
import com.stockbit.common.extension.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f62303a = null;

    static {
        f62303a = new c();
    }

    public c() {
    }

    public final Map a(String r4, Collection r5) {
        p.l(r4, "imageUri");
        p.l(r5, Constants.KEY_TAGS);
        LinkedHashMap r02 = new LinkedHashMap();
        androidx.exifinterface.media.a r1 = new androidx.exifinterface.media.a(r4);
        Iterator r42 = r5.iterator();
    L4:
        if (r42.hasNext() == false) goto L9;
        String r52 = (String) r42.next();
        String r2 = r1.k(r52);
        if (r2 == null) goto L4;
        r02.put(r52, r2);
        goto L4
    L9:
        return r02;
    }

    public final void b(String r2, Collection r3) {
        p.l(r2, "imageUri");
        p.l(r3, Constants.KEY_TAGS);
        e.a(new androidx.exifinterface.media.a(r2), r3);
    }
}
