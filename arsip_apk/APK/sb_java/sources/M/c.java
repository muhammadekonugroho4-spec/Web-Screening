package M;

import com.gojek.ojosdk.Ojo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f956a = null;

    static {
        int[] r02 = new int[Ojo.Status.values().length];
        r02[Ojo.Status.PASS.ordinal()] = 1;     // Catch: NoSuchFieldError -> L60
    L133:
        r02[Ojo.Status.NO_ISSUE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L61
    L145:
        r02[Ojo.Status.UNKNOWN.ordinal()] = 3;     // Catch: NoSuchFieldError -> L62
    L153:
        r02[Ojo.Status.CAPTURE_WINDOW_STARTED.ordinal()] = 4;     // Catch: NoSuchFieldError -> L63
    L157:
        r02[Ojo.Status.FRAUD.ordinal()] = 5;     // Catch: NoSuchFieldError -> L64
    L161:
        r02[Ojo.Status.AURORA_FLASHING.ordinal()] = 6;     // Catch: NoSuchFieldError -> L65
    L167:
        r02[Ojo.Status.AURORA_INFERENCE.ordinal()] = 7;     // Catch: NoSuchFieldError -> L66
    L183:
        r02[Ojo.Status.AURORA_RESTART.ordinal()] = 8;     // Catch: NoSuchFieldError -> L67
    L191:
        r02[Ojo.Status.LIVENESS_FAILED.ordinal()] = 9;     // Catch: NoSuchFieldError -> L68
    L193:
        r02[Ojo.Status.ENV_BRIGHT_FAILED.ordinal()] = 10;     // Catch: NoSuchFieldError -> L69
    L199:
        r02[Ojo.Status.FACE_NOT_DETECTED.ordinal()] = 11;     // Catch: NoSuchFieldError -> L70
    L215:
        r02[Ojo.Status.CARD_NOT_DETECTED.ordinal()] = 12;     // Catch: NoSuchFieldError -> L71
    L223:
        r02[Ojo.Status.TOO_NEAR.ordinal()] = 13;     // Catch: NoSuchFieldError -> L72
    L115:
        r02[Ojo.Status.TOO_FAR.ordinal()] = 14;     // Catch: NoSuchFieldError -> L73
    L121:
        r02[Ojo.Status.CROPPED.ordinal()] = 15;     // Catch: NoSuchFieldError -> L74
    L141:
        r02[Ojo.Status.BLOCKED.ordinal()] = 16;     // Catch: NoSuchFieldError -> L75
    L151:
        r02[Ojo.Status.LOWLIGHT.ordinal()] = 17;     // Catch: NoSuchFieldError -> L76
    L155:
        r02[Ojo.Status.HIGHLIGHT.ordinal()] = 18;     // Catch: NoSuchFieldError -> L77
    L163:
        r02[Ojo.Status.BACKLIGHT.ordinal()] = 19;     // Catch: NoSuchFieldError -> L78
    L175:
        r02[Ojo.Status.FIX_LIGHTING.ordinal()] = 20;     // Catch: NoSuchFieldError -> L79
    L185:
        r02[Ojo.Status.BLUR.ordinal()] = 21;     // Catch: NoSuchFieldError -> L80
    L187:
        r02[Ojo.Status.FACE_DROPPED.ordinal()] = 22;     // Catch: NoSuchFieldError -> L81
    L195:
        r02[Ojo.Status.MULTIPLE_FACES.ordinal()] = 23;     // Catch: NoSuchFieldError -> L82
    L207:
        r02[Ojo.Status.MOTION_DETECTED.ordinal()] = 24;     // Catch: NoSuchFieldError -> L83
    L217:
        r02[Ojo.Status.ROTATION_DETECTED.ordinal()] = 25;     // Catch: NoSuchFieldError -> L84
    L219:
        r02[Ojo.Status.EYES_CLOSED.ordinal()] = 26;     // Catch: NoSuchFieldError -> L85
    L117:
        r02[Ojo.Status.EYES_BLOCKED.ordinal()] = 27;     // Catch: NoSuchFieldError -> L86
    L131:
        r02[Ojo.Status.BLINK_EYES.ordinal()] = 28;     // Catch: NoSuchFieldError -> L87
    L143:
        r02[Ojo.Status.EYE_BLINK_FAILED.ordinal()] = 29;     // Catch: NoSuchFieldError -> L88
    L147:
        r02[Ojo.Status.AURORA_RETRIES_FAILED.ordinal()] = 30;     // Catch: NoSuchFieldError -> L89
    L159:
        r02[Ojo.Status.TIME_EXPIRED_NO_FACE.ordinal()] = 31;     // Catch: NoSuchFieldError -> L90
    L169:
        r02[Ojo.Status.TIME_EXPIRED_NO_CARD.ordinal()] = 32;     // Catch: NoSuchFieldError -> L91
    L177:
        r02[Ojo.Status.TIME_EXPIRED_MULTIPLE_FACE.ordinal()] = 33;     // Catch: NoSuchFieldError -> L92
    L179:
        r02[Ojo.Status.TIME_EXPIRED_TOO_NEAR.ordinal()] = 34;     // Catch: NoSuchFieldError -> L93
    L189:
        r02[Ojo.Status.TIME_EXPIRED_TOO_FAR.ordinal()] = 35;     // Catch: NoSuchFieldError -> L94
    L201:
        r02[Ojo.Status.TIME_EXPIRED_CROPPED.ordinal()] = 36;     // Catch: NoSuchFieldError -> L95
    L209:
        r02[Ojo.Status.TIME_EXPIRED_BLOCKED.ordinal()] = 37;     // Catch: NoSuchFieldError -> L96
    L211:
        r02[Ojo.Status.TIME_EXPIRED_LOWLIGHT.ordinal()] = 38;     // Catch: NoSuchFieldError -> L97
    L221:
        r02[Ojo.Status.TIME_EXPIRED_HIGHLIGHT.ordinal()] = 39;     // Catch: NoSuchFieldError -> L98
    L123:
        r02[Ojo.Status.TIME_EXPIRED_BACKLIGHT.ordinal()] = 40;     // Catch: NoSuchFieldError -> L99
    L135:
        r02[Ojo.Status.TIME_EXPIRED_LIGHTING.ordinal()] = 41;     // Catch: NoSuchFieldError -> L100
    L137:
        r02[Ojo.Status.TIME_EXPIRED_BLUR.ordinal()] = 42;     // Catch: NoSuchFieldError -> L101
    L149:
        r02[Ojo.Status.TIME_EXPIRED_OTHERS.ordinal()] = 43;     // Catch: NoSuchFieldError -> L102
    L165:
        r02[Ojo.Status.LOAD_MODEL_FAILED.ordinal()] = 44;     // Catch: NoSuchFieldError -> L103
    L171:
        r02[Ojo.Status.TIME_EXPIRED_DAMAGED.ordinal()] = 45;     // Catch: NoSuchFieldError -> L104
    L173:
        r02[Ojo.Status.DAMAGED.ordinal()] = 46;     // Catch: NoSuchFieldError -> L105
    L181:
        r02[Ojo.Status.MOUTH_BLINK_FAILED.ordinal()] = 47;     // Catch: NoSuchFieldError -> L106
    L197:
        r02[Ojo.Status.TIME_EXPIRED_NOT_STEADY.ordinal()] = 48;     // Catch: NoSuchFieldError -> L107
    L203:
        r02[Ojo.Status.TIME_EXPIRED_NOT_IN_CENTER.ordinal()] = 49;     // Catch: NoSuchFieldError -> L108
    L205:
        r02[Ojo.Status.TIME_EXPIRED_ROTATION.ordinal()] = 50;     // Catch: NoSuchFieldError -> L109
    L213:
        r02[Ojo.Status.MOTION_EYES.ordinal()] = 51;     // Catch: NoSuchFieldError -> L110
    L119:
        r02[Ojo.Status.MOTION_MOUTH.ordinal()] = 52;     // Catch: NoSuchFieldError -> L111
    L127:
        r02[Ojo.Status.MOUTH_OPEN.ordinal()] = 53;     // Catch: NoSuchFieldError -> L112
    L129:
        r02[Ojo.Status.MOUTH_BLOCKED.ordinal()] = 54;     // Catch: NoSuchFieldError -> L113
    L139:
        r02[Ojo.Status.BLINK_MOUTH.ordinal()] = 55;     // Catch: NoSuchFieldError -> L114
    L58:
        f956a = r02;
    }
}
