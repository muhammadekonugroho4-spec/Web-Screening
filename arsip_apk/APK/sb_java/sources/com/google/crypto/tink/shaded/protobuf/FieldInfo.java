package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Internal;

@CheckReturnValue
/* loaded from: classes6.dex */
final class FieldInfo implements Comparable<FieldInfo> {
    private final java.lang.reflect.Field cachedSizeField;
    private final boolean enforceUtf8;
    private final Internal.EnumVerifier enumVerifier;
    private final java.lang.reflect.Field field;
    private final int fieldNumber;
    private final Object mapDefaultEntry;
    private final Class<?> messageClass;
    private final OneofInfo oneof;
    private final Class<?> oneofStoredType;
    private final java.lang.reflect.Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final FieldType type;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.FieldInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType = null;

        static {
            int[] r02 = new int[FieldType.values().length];
            $SwitchMap$com$google$protobuf$FieldType = r02;
            r02[FieldType.MESSAGE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
        L12:
            $SwitchMap$com$google$protobuf$FieldType[FieldType.GROUP.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L14:
            $SwitchMap$com$google$protobuf$FieldType[FieldType.MESSAGE_LIST.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
        L18:
            $SwitchMap$com$google$protobuf$FieldType[FieldType.GROUP_LIST.ordinal()] = 4;     // Catch: NoSuchFieldError -> L11
            return;
        }
    }

    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private Object mapDefaultEntry;
        private OneofInfo oneof;
        private Class<?> oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private FieldType type;

        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public FieldInfo build() {
            OneofInfo r2 = this.oneof;
            if (r2 != null) goto L5;
            Object r02 = this.mapDefaultEntry;
            if (r02 != null) goto L9;
            java.lang.reflect.Field r4 = this.presenceField;
            if (r4 != null) goto L13;
            Internal.EnumVerifier r03 = this.enumVerifier;
            if (r03 == null) goto L26;
            java.lang.reflect.Field r1 = this.cachedSizeField;
            if (r1 != null) goto L25;
            return FieldInfo.forFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, r03);
        L25:
            return FieldInfo.forPackedFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, r03, r1);
        L26:
            java.lang.reflect.Field r04 = this.cachedSizeField;
            if (r04 != null) goto L31;
            return FieldInfo.forField(this.field, this.fieldNumber, this.type, this.enforceUtf8);
        L31:
            return FieldInfo.forPackedField(this.field, this.fieldNumber, this.type, r04);
        L13:
            if (this.required == false) goto L17;
            return FieldInfo.forProto2RequiredField(this.field, this.fieldNumber, this.type, r4, this.presenceMask, this.enforceUtf8, this.enumVerifier);
        L17:
            return FieldInfo.forProto2OptionalField(this.field, this.fieldNumber, this.type, r4, this.presenceMask, this.enforceUtf8, this.enumVerifier);
        L9:
            return FieldInfo.forMapField(this.field, this.fieldNumber, r02, this.enumVerifier);
        L5:
            return FieldInfo.forOneofMemberField(this.fieldNumber, this.type, r2, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field r1) {
            this.cachedSizeField = r1;
            return this;
        }

        public Builder withEnforceUtf8(boolean r1) {
            this.enforceUtf8 = r1;
            return this;
        }

        public Builder withEnumVerifier(Internal.EnumVerifier r1) {
            this.enumVerifier = r1;
            return this;
        }

        public Builder withField(java.lang.reflect.Field r2) {
            if (this.oneof != null) goto L7;
            this.field = r2;
            return this;
        L7:
            throw new IllegalStateException("Cannot set field when building a oneof.");
        }

        public Builder withFieldNumber(int r1) {
            this.fieldNumber = r1;
            return this;
        }

        public Builder withMapDefaultEntry(Object r1) {
            this.mapDefaultEntry = r1;
            return this;
        }

        public Builder withOneof(OneofInfo r2, Class<?> r3) {
            if (this.field != null) goto L9;
            if (this.presenceField != null) goto L9;
            this.oneof = r2;
            this.oneofStoredType = r3;
            return this;
        L9:
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }

        public Builder withPresence(java.lang.reflect.Field r2, int r3) {
            this.presenceField = (java.lang.reflect.Field) Internal.checkNotNull(r2, "presenceField");
            this.presenceMask = r3;
            return this;
        }

        public Builder withRequired(boolean r1) {
            this.required = r1;
            return this;
        }

        public Builder withType(FieldType r1) {
            this.type = r1;
            return this;
        }

        private Builder() {
        }
    }

    private FieldInfo(java.lang.reflect.Field r1, int r2, FieldType r3, Class<?> r4, java.lang.reflect.Field r5, int r6, boolean r7, boolean r8, OneofInfo r9, Class<?> r10, Object r11, Internal.EnumVerifier r12, java.lang.reflect.Field r13) {
        this.field = r1;
        this.type = r3;
        this.messageClass = r4;
        this.fieldNumber = r2;
        this.presenceField = r5;
        this.presenceMask = r6;
        this.required = r7;
        this.enforceUtf8 = r8;
        this.oneof = r9;
        this.oneofStoredType = r10;
        this.mapDefaultEntry = r11;
        this.enumVerifier = r12;
        this.cachedSizeField = r13;
    }

    private static void checkFieldNumber(int r3) {
        if (r3 <= 0) goto L5;
        return;
    L5:
        throw new IllegalArgumentException("fieldNumber must be positive: " + r3);
    }

    public static FieldInfo forField(java.lang.reflect.Field r14, int r15, FieldType r16, boolean r17) {
        checkFieldNumber(r15);
        Internal.checkNotNull(r14, "field");
        Internal.checkNotNull(r16, "fieldType");
        if (r16 == FieldType.MESSAGE_LIST) goto L9;
        if (r16 == FieldType.GROUP_LIST) goto L9;
        return new FieldInfo(r14, r15, r16, null, null, 0, false, r17, null, null, null, null, null);
    L9:
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public static FieldInfo forFieldWithEnumVerifier(java.lang.reflect.Field r15, int r16, FieldType r17, Internal.EnumVerifier r18) {
        checkFieldNumber(r16);
        Internal.checkNotNull(r15, "field");
        return new FieldInfo(r15, r16, r17, null, null, 0, false, false, null, null, null, r18, null);
    }

    public static FieldInfo forMapField(java.lang.reflect.Field r15, int r16, Object r17, Internal.EnumVerifier r18) {
        Internal.checkNotNull(r17, "mapDefaultEntry");
        checkFieldNumber(r16);
        Internal.checkNotNull(r15, "field");
        return new FieldInfo(r15, r16, FieldType.MAP, null, null, 0, false, true, null, null, r17, r18, null);
    }

    public static FieldInfo forOneofMemberField(int r14, FieldType r15, OneofInfo r16, Class<?> r17, boolean r18, Internal.EnumVerifier r19) {
        checkFieldNumber(r14);
        Internal.checkNotNull(r15, "fieldType");
        Internal.checkNotNull(r16, "oneof");
        Internal.checkNotNull(r17, "oneofStoredType");
        if (r15.isScalar() == false) goto L7;
        return new FieldInfo(null, r14, r15, null, null, 0, false, r18, r16, r17, null, r19, null);
    L7:
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + r14 + " is of type " + r15);
    }

    public static FieldInfo forPackedField(java.lang.reflect.Field r14, int r15, FieldType r16, java.lang.reflect.Field r17) {
        checkFieldNumber(r15);
        Internal.checkNotNull(r14, "field");
        Internal.checkNotNull(r16, "fieldType");
        if (r16 == FieldType.MESSAGE_LIST) goto L9;
        if (r16 == FieldType.GROUP_LIST) goto L9;
        return new FieldInfo(r14, r15, r16, null, null, 0, false, false, null, null, null, null, r17);
    L9:
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public static FieldInfo forPackedFieldWithEnumVerifier(java.lang.reflect.Field r15, int r16, FieldType r17, Internal.EnumVerifier r18, java.lang.reflect.Field r19) {
        checkFieldNumber(r16);
        Internal.checkNotNull(r15, "field");
        return new FieldInfo(r15, r16, r17, null, null, 0, false, false, null, null, null, r18, r19);
    }

    public static FieldInfo forProto2OptionalField(java.lang.reflect.Field r14, int r15, FieldType r16, java.lang.reflect.Field r17, int r18, boolean r19, Internal.EnumVerifier r20) {
        checkFieldNumber(r15);
        Internal.checkNotNull(r14, "field");
        Internal.checkNotNull(r16, "fieldType");
        Internal.checkNotNull(r17, "presenceField");
        if (r17 == null) goto L10;
        if (isExactlyOneBitSet(r18) == true) goto L10;
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + r18);
    L10:
        return new FieldInfo(r14, r15, r16, null, r17, r18, false, r19, null, null, null, r20, null);
    }

    public static FieldInfo forProto2RequiredField(java.lang.reflect.Field r14, int r15, FieldType r16, java.lang.reflect.Field r17, int r18, boolean r19, Internal.EnumVerifier r20) {
        checkFieldNumber(r15);
        Internal.checkNotNull(r14, "field");
        Internal.checkNotNull(r16, "fieldType");
        Internal.checkNotNull(r17, "presenceField");
        if (r17 == null) goto L10;
        if (isExactlyOneBitSet(r18) == true) goto L10;
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + r18);
    L10:
        return new FieldInfo(r14, r15, r16, null, r17, r18, true, r19, null, null, null, r20, null);
    }

    public static FieldInfo forRepeatedMessageField(java.lang.reflect.Field r15, int r16, FieldType r17, Class<?> r18) {
        checkFieldNumber(r16);
        Internal.checkNotNull(r15, "field");
        Internal.checkNotNull(r17, "fieldType");
        Internal.checkNotNull(r18, "messageClass");
        return new FieldInfo(r15, r16, r17, r18, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean isExactlyOneBitSet(int r1) {
        if (r1 != 0) goto L4;
        return false;
    L4:
        if ((r1 & (r1 - 1)) != 0) goto L9;
        return true;
    L9:
        return false;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(FieldInfo r1) {
        return compareTo2(r1);
    }

    public java.lang.reflect.Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    public Internal.EnumVerifier getEnumVerifier() {
        return this.enumVerifier;
    }

    public java.lang.reflect.Field getField() {
        return this.field;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public Class<?> getListElementType() {
        return this.messageClass;
    }

    public Object getMapDefaultEntry() {
        return this.mapDefaultEntry;
    }

    public Class<?> getMessageFieldClass() {
        int r02 = AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (r02 != 1) goto L5;
    L14:
        java.lang.reflect.Field r03 = this.field;
        if (r03 == null) goto L19;
        return r03.getType();
    L19:
        return this.oneofStoredType;
    L5:
        if (r02 == 2) goto L14;
        if (r02 == 3) goto L13;
        if (r02 == 4) goto L13;
        return null;
    L13:
        return this.messageClass;
    }

    public OneofInfo getOneof() {
        return this.oneof;
    }

    public Class<?> getOneofStoredType() {
        return this.oneofStoredType;
    }

    public java.lang.reflect.Field getPresenceField() {
        return this.presenceField;
    }

    public int getPresenceMask() {
        return this.presenceMask;
    }

    public FieldType getType() {
        return this.type;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public boolean isRequired() {
        return this.required;
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(FieldInfo r2) {
        return this.fieldNumber - r2.fieldNumber;
    }
}
