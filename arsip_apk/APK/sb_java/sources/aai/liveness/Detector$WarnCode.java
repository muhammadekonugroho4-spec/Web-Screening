package aai.liveness;

/* loaded from: classes.dex */
public enum Detector$WarnCode extends Enum<Detector$WarnCode> {
    public static final Detector$WarnCode ERROR_FACEMISSING = null;
    public static final Detector$WarnCode ERROR_MUCHMOTION = null;
    public static final Detector$WarnCode ERROR_MULTIPLEFACES = null;
    public static final Detector$WarnCode FACECAPTURE = null;
    public static final Detector$WarnCode FACEINACTION = null;
    public static final Detector$WarnCode FACELARGE = null;
    public static final Detector$WarnCode FACEMISSING = null;
    public static final Detector$WarnCode FACENOTCENTER = null;
    public static final Detector$WarnCode FACENOTFRONTAL = null;
    public static final Detector$WarnCode FACENOTSTILL = null;
    public static final Detector$WarnCode FACESMALL = null;
    public static final Detector$WarnCode OK = null;
    public static final Detector$WarnCode OK_ACTIONDONE = null;
    public static final Detector$WarnCode OK_COUNTING = null;
    public static final Detector$WarnCode OK_DEFAULT = null;
    public static final Detector$WarnCode WARN_EYE_OCCLUSION = null;
    public static final Detector$WarnCode WARN_FACE_BIAS_BOTTOM = null;
    public static final Detector$WarnCode WARN_FACE_BIAS_LEFT = null;
    public static final Detector$WarnCode WARN_FACE_BIAS_RIGHT = null;
    public static final Detector$WarnCode WARN_FACE_BIAS_UP = null;
    public static final Detector$WarnCode WARN_LARGE_YAW = null;
    public static final Detector$WarnCode WARN_MOTION = null;
    public static final Detector$WarnCode WARN_MOUTH_OCCLUSION = null;
    public static final Detector$WarnCode WARN_MOUTH_OCCLUSION_IN_MOTION = null;
    public static final Detector$WarnCode WARN_MULTIPLEFACES = null;
    public static final Detector$WarnCode WARN_TOOLIGHT = null;
    public static final Detector$WarnCode WARN_WEAKLIGHT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Detector$WarnCode[] f1658a = null;

    static {
        FACEMISSING = new Detector$WarnCode("FACEMISSING", 0);
        FACELARGE = new Detector$WarnCode("FACELARGE", 1);
        FACESMALL = new Detector$WarnCode("FACESMALL", 2);
        FACENOTCENTER = new Detector$WarnCode("FACENOTCENTER", 3);
        FACENOTFRONTAL = new Detector$WarnCode("FACENOTFRONTAL", 4);
        FACENOTSTILL = new Detector$WarnCode("FACENOTSTILL", 5);
        WARN_MULTIPLEFACES = new Detector$WarnCode("WARN_MULTIPLEFACES", 6);
        WARN_EYE_OCCLUSION = new Detector$WarnCode("WARN_EYE_OCCLUSION", 7);
        WARN_MOUTH_OCCLUSION = new Detector$WarnCode("WARN_MOUTH_OCCLUSION", 8);
        FACECAPTURE = new Detector$WarnCode("FACECAPTURE", 9);
        FACEINACTION = new Detector$WarnCode("FACEINACTION", 10);
        OK_ACTIONDONE = new Detector$WarnCode("OK_ACTIONDONE", 11);
        ERROR_MULTIPLEFACES = new Detector$WarnCode("ERROR_MULTIPLEFACES", 12);
        ERROR_FACEMISSING = new Detector$WarnCode("ERROR_FACEMISSING", 13);
        ERROR_MUCHMOTION = new Detector$WarnCode("ERROR_MUCHMOTION", 14);
        OK_COUNTING = new Detector$WarnCode("OK_COUNTING", 15);
        OK_DEFAULT = new Detector$WarnCode("OK_DEFAULT", 16);
        WARN_MOTION = new Detector$WarnCode("WARN_MOTION", 17);
        WARN_LARGE_YAW = new Detector$WarnCode("WARN_LARGE_YAW", 18);
        WARN_MOUTH_OCCLUSION_IN_MOTION = new Detector$WarnCode("WARN_MOUTH_OCCLUSION_IN_MOTION", 19);
        WARN_FACE_BIAS_RIGHT = new Detector$WarnCode("WARN_FACE_BIAS_RIGHT", 20);
        WARN_FACE_BIAS_LEFT = new Detector$WarnCode("WARN_FACE_BIAS_LEFT", 21);
        WARN_FACE_BIAS_BOTTOM = new Detector$WarnCode("WARN_FACE_BIAS_BOTTOM", 22);
        WARN_FACE_BIAS_UP = new Detector$WarnCode("WARN_FACE_BIAS_UP", 23);
        WARN_WEAKLIGHT = new Detector$WarnCode("WARN_WEAKLIGHT", 24);
        WARN_TOOLIGHT = new Detector$WarnCode("WARN_TOOLIGHT", 25);
        OK = new Detector$WarnCode("OK", 26);
        f1658a = a();
    }

    Detector$WarnCode(String r1, int r2) {
    }

    public static /* synthetic */ Detector$WarnCode[] a() {
        return new Detector$WarnCode[]{FACEMISSING, FACELARGE, FACESMALL, FACENOTCENTER, FACENOTFRONTAL, FACENOTSTILL, WARN_MULTIPLEFACES, WARN_EYE_OCCLUSION, WARN_MOUTH_OCCLUSION, FACECAPTURE, FACEINACTION, OK_ACTIONDONE, ERROR_MULTIPLEFACES, ERROR_FACEMISSING, ERROR_MUCHMOTION, OK_COUNTING, OK_DEFAULT, WARN_MOTION, WARN_LARGE_YAW, WARN_MOUTH_OCCLUSION_IN_MOTION, WARN_FACE_BIAS_RIGHT, WARN_FACE_BIAS_LEFT, WARN_FACE_BIAS_BOTTOM, WARN_FACE_BIAS_UP, WARN_WEAKLIGHT, WARN_TOOLIGHT, OK};
    }

    public static Detector$WarnCode valueOf(int r02) {
        switch(r02) {
            case 0: goto L56;
            case 1: goto L54;
            case 2: goto L52;
            case 3: goto L50;
            case 4: goto L48;
            case 5: goto L46;
            case 6: goto L44;
            case 7: goto L42;
            case 8: goto L40;
            case 9: goto L38;
            case 10: goto L36;
            case 11: goto L34;
            case 12: goto L32;
            case 13: goto L30;
            case 14: goto L28;
            case 15: goto L26;
            case 16: goto L24;
            case 17: goto L22;
            case 18: goto L20;
            case 19: goto L4;
            case 20: goto L18;
            case 21: goto L16;
            case 22: goto L14;
            case 23: goto L12;
            case 24: goto L10;
            case 25: goto L8;
            case 26: goto L6;
            default: goto L4;
        };
    L4:
        return OK_DEFAULT;
    L6:
        return WARN_FACE_BIAS_UP;
    L8:
        return WARN_FACE_BIAS_BOTTOM;
    L10:
        return WARN_FACE_BIAS_LEFT;
    L12:
        return WARN_FACE_BIAS_RIGHT;
    L14:
        return WARN_TOOLIGHT;
    L16:
        return WARN_WEAKLIGHT;
    L18:
        return WARN_MOUTH_OCCLUSION_IN_MOTION;
    L20:
        return WARN_LARGE_YAW;
    L22:
        return WARN_MOTION;
    L24:
        return OK_COUNTING;
    L26:
        return ERROR_MUCHMOTION;
    L28:
        return ERROR_FACEMISSING;
    L30:
        return ERROR_MULTIPLEFACES;
    L32:
        return OK_ACTIONDONE;
    L34:
        return FACEINACTION;
    L36:
        return FACECAPTURE;
    L38:
        return WARN_MOUTH_OCCLUSION;
    L40:
        return WARN_EYE_OCCLUSION;
    L42:
        return WARN_MULTIPLEFACES;
    L44:
        return FACENOTSTILL;
    L46:
        return FACENOTFRONTAL;
    L48:
        return FACENOTCENTER;
    L50:
        return FACESMALL;
    L52:
        return FACELARGE;
    L54:
        return FACEMISSING;
    L56:
        return OK;
    }

    public static Detector$WarnCode[] values() {
        return (Detector$WarnCode[]) f1658a.clone();
    }

    public static Detector$WarnCode valueOf(String r1) {
        return (Detector$WarnCode) Enum.valueOf(Detector$WarnCode.class, r1);
    }
}
