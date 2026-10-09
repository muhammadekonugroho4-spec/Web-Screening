package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f31597a = null;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31598a = null;

        static {
            int[] r02 = new int[JsonReader.Token.values().length];
            f31598a = r02;
            r02[JsonReader.Token.NUMBER.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L10:
            f31598a[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L12:
            f31598a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;     // Catch: NoSuchFieldError -> L9
            return;
        }
    }

    static {
        f31597a = JsonReader.a.a(new String[]{"x", "y"});
    }

    public static PointF a(JsonReader r4, float r5) {
        r4.beginArray();
        float r02 = (float) r4.nextDouble();
        float r1 = (float) r4.nextDouble();
    L4:
        if (r4.k() == JsonReader.Token.END_ARRAY) goto L6;
        r4.skipValue();
        goto L4
    L6:
        r4.endArray();
        return new PointF(r02 * r5, r1 * r5);
    }

    public static PointF b(JsonReader r3, float r4) {
        float r02 = (float) r3.nextDouble();
        float r1 = (float) r3.nextDouble();
    L4:
        if (r3.hasNext() == false) goto L7;
        r3.skipValue();
        goto L4
    L7:
        return new PointF(r02 * r4, r1 * r4);
    }

    public static PointF c(JsonReader r4, float r5) {
        r4.beginObject();
        float r02 = 0.0f;
        float r1 = 0.0f;
    L4:
        if (r4.hasNext() == false) goto L12;
        int r2 = r4.n(f31597a);
        if (r2 != 0) goto L8;
        r02 = g(r4);
        goto L4
    L8:
        if (r2 != 1) goto L9;
        r1 = g(r4);
        goto L4
    L9:
        r4.t();
        r4.skipValue();
        goto L4
    L12:
        r4.endObject();
        return new PointF(r02 * r5, r1 * r5);
    }

    public static int d(JsonReader r6) {
        r6.beginArray();
        int r02 = (int) (r6.nextDouble() * 255.0d);
        int r1 = (int) (r6.nextDouble() * 255.0d);
        int r2 = (int) (r6.nextDouble() * 255.0d);
    L4:
        if (r6.hasNext() == false) goto L6;
        r6.skipValue();
        goto L4
    L6:
        r6.endArray();
        return Color.argb(Constants.MAX_HOST_LENGTH, r02, r1, r2);
    }

    public static PointF e(JsonReader r2, float r3) {
        int r02 = a.f31598a[r2.k().ordinal()];
        if (r02 == 1) goto L15;
        if (r02 == 2) goto L13;
        if (r02 != 3) goto L11;
        return c(r2, r3);
    L11:
        throw new IllegalArgumentException("Unknown point starts with " + r2.k());
    L13:
        return a(r2, r3);
    L15:
        return b(r2, r3);
    }

    public static List f(JsonReader r3, float r4) {
        ArrayList r02 = new ArrayList();
        r3.beginArray();
    L4:
        if (r3.k() != JsonReader.Token.BEGIN_ARRAY) goto L6;
        r3.beginArray();
        r02.add(e(r3, r4));
        r3.endArray();
        goto L4
    L6:
        r3.endArray();
        return r02;
    }

    public static float g(JsonReader r3) {
        JsonReader.Token r02 = r3.k();
        int r1 = a.f31598a[r02.ordinal()];
        if (r1 == 1) goto L15;
        if (r1 != 2) goto L13;
        r3.beginArray();
        float r03 = (float) r3.nextDouble();
    L8:
        if (r3.hasNext() == false) goto L10;
        r3.skipValue();
        goto L8
    L10:
        r3.endArray();
        return r03;
    L13:
        throw new IllegalArgumentException("Unknown value for token of type " + r02);
    L15:
        return (float) r3.nextDouble();
    }
}
