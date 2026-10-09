package com.google.protobuf;

/* loaded from: classes6.dex */
final class ExtensionRegistryFactory {
    static final Class<?> EXTENSION_REGISTRY_CLASS = null;
    static final String FULL_REGISTRY_CLASS_NAME = "com.google.protobuf.ExtensionRegistry";

    static {
        EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    }

    public ExtensionRegistryFactory() {
    }

    public static ExtensionRegistryLite create() {
        ExtensionRegistryLite r02 = invokeSubclassFactory("newInstance");
        if (r02 == null) goto L6;
        return r02;
    L6:
        return new ExtensionRegistryLite();
    }

    public static ExtensionRegistryLite createEmpty() {
        ExtensionRegistryLite r02 = invokeSubclassFactory("getEmptyRegistry");
        if (r02 == null) goto L6;
        return r02;
    L6:
        return ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
    }

    private static final ExtensionRegistryLite invokeSubclassFactory(String r2) {
        Class<?> r02 = EXTENSION_REGISTRY_CLASS;
        if (r02 != null) goto L8;
        return null;
    L8:
        return (ExtensionRegistryLite) r02.getDeclaredMethod(r2, null).invoke(null, null);
    L7:
        return null;
    }

    public static boolean isFullRegistry(ExtensionRegistryLite r1) {
        Class<?> r02 = EXTENSION_REGISTRY_CLASS;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.isAssignableFrom(r1.getClass()) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static Class<?> reflectExtensionRegistry() {
        return Class.forName(FULL_REGISTRY_CLASS_NAME);
    L4:
        return null;
    }
}
