package androidx.camera.extensions.internal;

import android.hardware.camera2.CameraManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final a f6115f = null;

    /* renamed from: a, reason: collision with root package name */
    public final CameraManager f6116a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6117b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f6118c;
    public final Map d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f6119e;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f6115f = new a(null);
    }

    public b(CameraManager r2) {
        p.l(r2, "cameraManager");
        this.f6116a = r2;
        this.f6117b = new Object();
        this.f6118c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.f6119e = new LinkedHashMap();
    }
}
