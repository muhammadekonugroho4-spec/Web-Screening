package com.google.gson;

/* loaded from: classes6.dex */
public interface ReflectionAccessFilter {
    public static final ReflectionAccessFilter BLOCK_ALL_ANDROID = null;
    public static final ReflectionAccessFilter BLOCK_ALL_JAVA = null;
    public static final ReflectionAccessFilter BLOCK_ALL_PLATFORM = null;
    public static final ReflectionAccessFilter BLOCK_INACCESSIBLE_JAVA = null;

    public enum FilterResult extends Enum<FilterResult> {
        private static final /* synthetic */ FilterResult[] $VALUES = null;
        public static final FilterResult ALLOW = null;
        public static final FilterResult BLOCK_ALL = null;
        public static final FilterResult BLOCK_INACCESSIBLE = null;
        public static final FilterResult INDECISIVE = null;

        static {
            FilterResult r02 = new FilterResult("ALLOW", 0);
            ALLOW = r02;
            FilterResult r1 = new FilterResult("INDECISIVE", 1);
            INDECISIVE = r1;
            FilterResult r2 = new FilterResult("BLOCK_INACCESSIBLE", 2);
            BLOCK_INACCESSIBLE = r2;
            FilterResult r3 = new FilterResult("BLOCK_ALL", 3);
            BLOCK_ALL = r3;
            $VALUES = new FilterResult[]{r02, r1, r2, r3};
        }

        FilterResult(String r1, int r2) {
        }

        public static FilterResult valueOf(String r1) {
            return (FilterResult) Enum.valueOf(FilterResult.class, r1);
        }

        public static FilterResult[] values() {
            return (FilterResult[]) $VALUES.clone();
        }
    }

    static {
        BLOCK_INACCESSIBLE_JAVA = new AnonymousClass1();
        BLOCK_ALL_JAVA = new AnonymousClass2();
        BLOCK_ALL_ANDROID = new AnonymousClass3();
        BLOCK_ALL_PLATFORM = new AnonymousClass4();
    }

    FilterResult check(Class<?> r1);
}
