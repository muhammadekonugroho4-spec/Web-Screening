package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class ExtensionRegistryLite {
    static final ExtensionRegistryLite EMPTY_REGISTRY_LITE = null;
    static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile ExtensionRegistryLite emptyRegistry;
    private final Map<ObjectIntPair, GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber;

    public static class ExtensionClassHolder {
        static final Class<?> INSTANCE = null;

        static {
            INSTANCE = resolveExtensionClass();
        }

        private ExtensionClassHolder() {
        }

        public static Class<?> resolveExtensionClass() {
            return Class.forName(ExtensionRegistryLite.EXTENSION_CLASS_NAME);
        L4:
            return null;
        }
    }

    public static final class ObjectIntPair {
        private final int number;
        private final Object object;

        public ObjectIntPair(Object r1, int r2) {
            this.object = r1;
            this.number = r2;
        }

        public boolean equals(Object r4) {
            if ((r4 instanceof ObjectIntPair) == true) goto L5;
            return false;
        L5:
            ObjectIntPair r42 = (ObjectIntPair) r4;
            if (this.object == r42.object) goto L8;
        L11:
            return false;
        L8:
            if (this.number != r42.number) goto L11;
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }
    }

    static {
        EMPTY_REGISTRY_LITE = new ExtensionRegistryLite(true);
    }

    public ExtensionRegistryLite() {
        this.extensionsByNumber = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        if (doFullRuntimeInheritanceCheck == false) goto L5;
        ExtensionRegistryLite r02 = emptyRegistry;
        if (r02 == null) goto L9;
        return r02;
    L9:
        monitor-enter(ExtensionRegistryLite.class);
        ExtensionRegistryLite r03 = emptyRegistry;     // Catch: Throwable -> L13
        if (r03 != null) goto L15;
        r03 = ExtensionRegistryFactory.createEmpty();     // Catch: Throwable -> L13
        emptyRegistry = r03;     // Catch: Throwable -> L13
    L15:
        monitor-exit(ExtensionRegistryLite.class);     // Catch: Throwable -> L13
        return r03;
    L13:
        th = move-exception;
        throw th;
    L5:
        return EMPTY_REGISTRY_LITE;
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static ExtensionRegistryLite newInstance() {
        if (doFullRuntimeInheritanceCheck == false) goto L7;
        return ExtensionRegistryFactory.create();
    L7:
        return new ExtensionRegistryLite();
    }

    public static void setEagerlyParseMessageSets(boolean r02) {
        eagerlyParseMessageSets = r02;
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> r5) {
        this.extensionsByNumber.put(new ObjectIntPair(r5.getContainingTypeDefaultInstance(), r5.getNumber()), r5);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType r3, int r4) {
        return (GeneratedMessageLite.GeneratedExtension) this.extensionsByNumber.get(new ObjectIntPair(r3, r4));
    }

    public ExtensionRegistryLite getUnmodifiable() {
        return new ExtensionRegistryLite(this);
    }

    public ExtensionRegistryLite(ExtensionRegistryLite r2) {
        if (r2 != EMPTY_REGISTRY_LITE) goto L6;
        this.extensionsByNumber = Collections.EMPTY_MAP;
        return;
    L6:
        this.extensionsByNumber = Collections.unmodifiableMap(r2.extensionsByNumber);
    }

    public final void add(ExtensionLite<?, ?> r4) {
        if (GeneratedMessageLite.GeneratedExtension.class.isAssignableFrom(r4.getClass()) == false) goto L6;
        add((GeneratedMessageLite.GeneratedExtension) r4);
    L6:
        if (doFullRuntimeInheritanceCheck == true) goto L8;
        return;
    L8:
        if (ExtensionRegistryFactory.isFullRegistry(this) == false) goto L17;
        getClass().getMethod("add", new Class[]{ExtensionClassHolder.INSTANCE}).invoke(this, new Object[]{r4});     // Catch: Exception -> L11
        return;
    L11:
        e = move-exception;
        throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", new Object[]{r4}), e);
    }

    public ExtensionRegistryLite(boolean r1) {
        this.extensionsByNumber = Collections.EMPTY_MAP;
    }
}
