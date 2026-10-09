package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f21097a;

    public d() {
        this.f21097a = new HashMap();
    }

    public float a(Object r3, String r4, int r5) {
        if (this.f21097a.containsKey(r3) == true) goto L5;
        return Float.NaN;
    L5:
        HashMap r32 = (HashMap) this.f21097a.get(r3);
        if (r32 != null) goto L8;
    L17:
        return Float.NaN;
    L8:
        if (r32.containsKey(r4) == false) goto L17;
        float[] r33 = (float[]) r32.get(r4);
        if (r33 != null) goto L14;
        return Float.NaN;
    L14:
        if (r33.length <= r5) goto L17;
        return r33[r5];
    }

    public void b(Object r3, String r4, int r5, float r6) {
        if (this.f21097a.containsKey(r3) == true) goto L6;
        HashMap r02 = new HashMap();
        float[] r1 = new float[r5 + 1];
        r1[r5] = r6;
        r02.put(r4, r1);
        this.f21097a.put(r3, r02);
        return;
    L6:
        HashMap r03 = (HashMap) this.f21097a.get(r3);
        if (r03 != null) goto L10;
        r03 = new HashMap();
    L10:
        if (r03.containsKey(r4) == true) goto L13;
        float[] r12 = new float[r5 + 1];
        r12[r5] = r6;
        r03.put(r4, r12);
        this.f21097a.put(r3, r03);
        return;
    L13:
        float[] r32 = (float[]) r03.get(r4);
        if (r32 != null) goto L17;
        r32 = new float[0];
    L17:
        if (r32.length > r5) goto L19;
        r32 = Arrays.copyOf(r32, r5 + 1);
    L19:
        r32[r5] = r6;
        r03.put(r4, r32);
    }
}
