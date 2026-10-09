package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.core.G;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f4319a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f4320b = null;

    static {
        HashMap r02 = new HashMap();
        f4319a = r02;
        HashMap r1 = new HashMap();
        f4320b = r1;
        G r3 = G.d;
        r02.put(1L, r3);
        r1.put(r3, Collections.singletonList(1L));
        r02.put(2L, G.f4809f);
        r1.put((G) r02.get(2L), Collections.singletonList(2L));
        G r32 = G.f4810g;
        r02.put(4L, r32);
        r1.put(r32, Collections.singletonList(4L));
        G r33 = G.f4811h;
        r02.put(8L, r33);
        r1.put(r33, Collections.singletonList(8L));
        List r03 = Arrays.asList(new Long[]{64L, 128L, 16L, 32L});
        Iterator r12 = r03.iterator();
    L4:
        if (r12.hasNext() == false) goto L6;
        Long r2 = (Long) r12.next();
        f4319a.put(r2, G.f4812i);
        goto L4
    L6:
        f4320b.put(G.f4812i, r03);
        List r04 = Arrays.asList(new Long[]{1024L, 2048L, 256L, 512L});
        Iterator r13 = r04.iterator();
    L8:
        if (r13.hasNext() == false) goto L10;
        Long r22 = (Long) r13.next();
        f4319a.put(r22, G.f4813j);
        goto L8
    L10:
        f4320b.put(G.f4813j, r04);
    }

    public static Long a(G r2, DynamicRangeProfiles r3) {
        List r22 = (List) f4320b.get(r2);
        if (r22 == null) goto L10;
        Set r32 = c.a(r3);
        Iterator r23 = r22.iterator();
    L6:
        if (r23.hasNext() == false) goto L15;
        Long r02 = (Long) r23.next();
        if (r32.contains(r02) == false) goto L6;
        return r02;
    L15:
        return null;
    L10:
        return null;
    }

    public static G b(long r1) {
        return (G) f4319a.get(Long.valueOf(r1));
    }
}
