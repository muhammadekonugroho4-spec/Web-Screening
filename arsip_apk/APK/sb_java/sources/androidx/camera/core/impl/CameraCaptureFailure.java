package androidx.camera.core.impl;

/* loaded from: classes.dex */
public class CameraCaptureFailure {

    /* renamed from: a, reason: collision with root package name */
    public final Reason f5164a;

    public enum Reason extends Enum<Reason> {
        public static final Reason ERROR = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Reason[] f5165a = null;

        static {
            ERROR = new Reason("ERROR", 0);
            f5165a = a();
        }

        Reason(String r1, int r2) {
        }

        public static /* synthetic */ Reason[] a() {
            return new Reason[]{ERROR};
        }

        public static Reason valueOf(String r1) {
            return (Reason) Enum.valueOf(Reason.class, r1);
        }

        public static Reason[] values() {
            return (Reason[]) f5165a.clone();
        }
    }

    public CameraCaptureFailure(Reason r1) {
        this.f5164a = r1;
    }

    public Object a() {
        return null;
    }

    public Reason b() {
        return this.f5164a;
    }
}
