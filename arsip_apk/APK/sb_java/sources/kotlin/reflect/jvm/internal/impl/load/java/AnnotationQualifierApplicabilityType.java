package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes3.dex */
public enum AnnotationQualifierApplicabilityType extends Enum<AnnotationQualifierApplicabilityType> {
    public static final AnnotationQualifierApplicabilityType FIELD = null;
    public static final AnnotationQualifierApplicabilityType METHOD_RETURN_TYPE = null;
    public static final AnnotationQualifierApplicabilityType TYPE_PARAMETER = null;
    public static final AnnotationQualifierApplicabilityType TYPE_PARAMETER_BOUNDS = null;
    public static final AnnotationQualifierApplicabilityType TYPE_USE = null;
    public static final AnnotationQualifierApplicabilityType VALUE_PARAMETER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AnnotationQualifierApplicabilityType[] f178398a = null;
    private final String javaTarget;

    static {
        METHOD_RETURN_TYPE = new AnnotationQualifierApplicabilityType("METHOD_RETURN_TYPE", 0, "METHOD");
        VALUE_PARAMETER = new AnnotationQualifierApplicabilityType("VALUE_PARAMETER", 1, "PARAMETER");
        FIELD = new AnnotationQualifierApplicabilityType("FIELD", 2, "FIELD");
        TYPE_USE = new AnnotationQualifierApplicabilityType("TYPE_USE", 3, "TYPE_USE");
        TYPE_PARAMETER_BOUNDS = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
        TYPE_PARAMETER = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER", 5, "TYPE_PARAMETER");
        f178398a = a();
    }

    AnnotationQualifierApplicabilityType(String r1, int r2, String r3) {
        this.javaTarget = r3;
    }

    public static final /* synthetic */ AnnotationQualifierApplicabilityType[] a() {
        return new AnnotationQualifierApplicabilityType[]{METHOD_RETURN_TYPE, VALUE_PARAMETER, FIELD, TYPE_USE, TYPE_PARAMETER_BOUNDS, TYPE_PARAMETER};
    }

    public static AnnotationQualifierApplicabilityType valueOf(String r1) {
        return (AnnotationQualifierApplicabilityType) Enum.valueOf(AnnotationQualifierApplicabilityType.class, r1);
    }

    public static AnnotationQualifierApplicabilityType[] values() {
        return (AnnotationQualifierApplicabilityType[]) f178398a.clone();
    }

    public final String getJavaTarget() {
        return this.javaTarget;
    }
}
