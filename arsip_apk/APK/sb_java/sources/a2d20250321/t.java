package a2d20250321;

import android.graphics.PointF;
import android.graphics.RectF;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public RectF f1643a;

    /* renamed from: b, reason: collision with root package name */
    public float f1644b;

    /* renamed from: c, reason: collision with root package name */
    public float f1645c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f1646e;

    /* renamed from: f, reason: collision with root package name */
    public float f1647f;

    /* renamed from: g, reason: collision with root package name */
    public float f1648g;

    /* renamed from: h, reason: collision with root package name */
    public float f1649h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1650i;

    /* renamed from: j, reason: collision with root package name */
    public PointF[] f1651j;

    /* renamed from: k, reason: collision with root package name */
    public RectF f1652k;

    /* renamed from: l, reason: collision with root package name */
    public RectF f1653l;

    /* renamed from: m, reason: collision with root package name */
    public RectF f1654m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1655n;

    public static class a {
        public static t a(JSONObject r8) {
            t r02 = new t();     // Catch: Exception -> L10
            r02.f1648g = (float) r8.optDouble("leftEyeOpenProb");     // Catch: Exception -> L10
            r02.f1649h = (float) r8.optDouble("rightEyeOpenProb");     // Catch: Exception -> L10
            r02.f1647f = (float) r8.optDouble("mouthOpenProb");     // Catch: Exception -> L10
            r02.f1646e = (float) r8.optDouble("faceQuality");     // Catch: Exception -> L10
            r02.f1644b = (float) r8.optDouble("yaw");     // Catch: Exception -> L10
            r02.f1645c = (float) r8.optDouble("pitch");     // Catch: Exception -> L10
            r02.d = (float) r8.optDouble("roll");     // Catch: Exception -> L10
            JSONArray r1 = r8.optJSONArray("faceBoundingbox");     // Catch: Exception -> L10
            int r3 = 0;
            r02.f1643a.left = (float) r1.optDouble(0);     // Catch: Exception -> L10
            r02.f1643a.top = (float) r1.optDouble(1);     // Catch: Exception -> L10
            r02.f1643a.right = (float) r1.optDouble(2);     // Catch: Exception -> L10
            r02.f1643a.bottom = (float) r1.optDouble(3);     // Catch: Exception -> L10
            r02.f1650i = r8.optBoolean("isFrontal", false);     // Catch: Exception -> L10
            r02.f1652k = t.c(r8, "leftEyeRect");     // Catch: Exception -> L10
            r02.f1653l = t.c(r8, "rightEyeRect");     // Catch: Exception -> L10
            r02.f1654m = t.c(r8, "mouthRect");     // Catch: Exception -> L10
            JSONArray r82 = r8.optJSONArray("landmark");     // Catch: Exception -> L10
            if ((r82.length() % 2) != 0) goto L9;
            t.e(r02, new PointF[r82.length() / 2]);     // Catch: Exception -> L10
            int r12 = 0;
        L5:
            if (r3 >= (r82.length() / 2)) goto L9;
            t.d(r02)[r3] = new PointF();     // Catch: Exception -> L10
            t.d(r02)[r3].x = (float) r82.optDouble(r12);     // Catch: Exception -> L10
            t.d(r02)[r3].y = (float) r82.optDouble(r12 + 1);     // Catch: Exception -> L10
            r12 = r12 + 2;
            r3 = r3 + 1;
        L9:
            return r02;
        L10:
            return null;
        }
    }

    public t() {
        this.f1644b = 0.0f;
        this.f1645c = 0.0f;
        this.d = 0.0f;
        this.f1646e = 0.0f;
        this.f1647f = -1.0f;
        this.f1648g = -1.0f;
        this.f1649h = -1.0f;
        this.f1655n = false;
        this.f1643a = new RectF();
    }

    public static RectF b(JSONObject r2, String r3) {
        JSONArray r22 = r2.optJSONArray(r3);
        if (r22 != null) goto L5;
        return null;
    L5:
        if (r22.length() != 4) goto L11;
        RectF r32 = new RectF();
        r32.left = (float) r22.optDouble(0);
        r32.top = (float) r22.optDouble(1);
        r32.right = (float) r22.optDouble(2);
        r32.bottom = (float) r22.optDouble(3);
        return r32;
    L11:
        return null;
    }

    public static /* synthetic */ RectF c(JSONObject r02, String r1) {
        return b(r02, r1);
    }

    public static /* synthetic */ PointF[] d(t r02) {
        return r02.f1651j;
    }

    public static /* synthetic */ PointF[] e(t r02, PointF[] r1) {
        r02.f1651j = r1;
        return r1;
    }

    public float a() {
        return Math.max(this.f1648g, this.f1649h);
    }

    public String toString() {
        return "FaceInfo{ position=" + this.f1643a.toShortString() + ", yaw=" + this.f1644b + ", faceQuality=" + this.f1646e + ", mouthOpenProb=" + this.f1647f + "}";
    }
}
