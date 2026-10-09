package androidx.glance.appwidget.action;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/glance/appwidget/action/ActionTrampolineType;", "", "(Ljava/lang/String;I)V", "ACTIVITY", "BROADCAST", "SERVICE", "FOREGROUND_SERVICE", "CALLBACK", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum ActionTrampolineType extends Enum<ActionTrampolineType> {
    public static final ActionTrampolineType ACTIVITY = null;
    public static final ActionTrampolineType BROADCAST = null;
    public static final ActionTrampolineType CALLBACK = null;
    public static final ActionTrampolineType FOREGROUND_SERVICE = null;
    public static final ActionTrampolineType SERVICE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ActionTrampolineType[] f24894a = null;

    static {
        ACTIVITY = new ActionTrampolineType("ACTIVITY", 0);
        BROADCAST = new ActionTrampolineType("BROADCAST", 1);
        SERVICE = new ActionTrampolineType("SERVICE", 2);
        FOREGROUND_SERVICE = new ActionTrampolineType("FOREGROUND_SERVICE", 3);
        CALLBACK = new ActionTrampolineType("CALLBACK", 4);
        f24894a = a();
    }

    ActionTrampolineType(String r1, int r2) {
    }

    public static final /* synthetic */ ActionTrampolineType[] a() {
        return new ActionTrampolineType[]{ACTIVITY, BROADCAST, SERVICE, FOREGROUND_SERVICE, CALLBACK};
    }

    public static ActionTrampolineType valueOf(String r1) {
        return (ActionTrampolineType) Enum.valueOf(ActionTrampolineType.class, r1);
    }

    public static ActionTrampolineType[] values() {
        return (ActionTrampolineType[]) f24894a.clone();
    }
}
