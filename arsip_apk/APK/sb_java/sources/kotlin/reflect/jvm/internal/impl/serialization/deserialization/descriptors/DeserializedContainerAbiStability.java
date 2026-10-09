package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* loaded from: classes3.dex */
public enum DeserializedContainerAbiStability extends Enum<DeserializedContainerAbiStability> {
    public static final DeserializedContainerAbiStability FIR_UNSTABLE = null;
    public static final DeserializedContainerAbiStability IR_UNSTABLE = null;
    public static final DeserializedContainerAbiStability STABLE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DeserializedContainerAbiStability[] f179800a = null;

    static {
        STABLE = new DeserializedContainerAbiStability("STABLE", 0);
        FIR_UNSTABLE = new DeserializedContainerAbiStability("FIR_UNSTABLE", 1);
        IR_UNSTABLE = new DeserializedContainerAbiStability("IR_UNSTABLE", 2);
        f179800a = a();
    }

    DeserializedContainerAbiStability(String r1, int r2) {
    }

    public static final /* synthetic */ DeserializedContainerAbiStability[] a() {
        return new DeserializedContainerAbiStability[]{STABLE, FIR_UNSTABLE, IR_UNSTABLE};
    }

    public static DeserializedContainerAbiStability valueOf(String r1) {
        return (DeserializedContainerAbiStability) Enum.valueOf(DeserializedContainerAbiStability.class, r1);
    }

    public static DeserializedContainerAbiStability[] values() {
        return (DeserializedContainerAbiStability[]) f179800a.clone();
    }
}
