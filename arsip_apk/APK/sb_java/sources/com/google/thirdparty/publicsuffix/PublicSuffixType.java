package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@Beta
@GwtCompatible
/* loaded from: classes6.dex */
public enum PublicSuffixType extends Enum<PublicSuffixType> {
    private static final /* synthetic */ PublicSuffixType[] $VALUES = null;
    public static final PublicSuffixType PRIVATE = null;
    public static final PublicSuffixType REGISTRY = null;
    private final char innerNodeCode;
    private final char leafNodeCode;

    private static /* synthetic */ PublicSuffixType[] $values() {
        return new PublicSuffixType[]{PRIVATE, REGISTRY};
    }

    static {
        PRIVATE = new PublicSuffixType("PRIVATE", 0, ':', ',');
        REGISTRY = new PublicSuffixType("REGISTRY", 1, '!', '?');
        $VALUES = $values();
    }

    PublicSuffixType(String r1, int r2, char r3, char r4) {
        this.innerNodeCode = r3;
        this.leafNodeCode = r4;
    }

    public static PublicSuffixType fromCode(char r5) {
        PublicSuffixType[] r02 = values();
        int r1 = r02.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L11;
        PublicSuffixType r3 = r02[r2];
        if (r3.getInnerNodeCode() == r5) goto L10;
        if (r3.getLeafNodeCode() == r5) goto L10;
        r2 = r2 + 1;
    L10:
        return r3;
    L11:
        StringBuilder r12 = new StringBuilder(38);
        r12.append("No enum corresponding to given code: ");
        r12.append(r5);
        throw new IllegalArgumentException(r12.toString());
    }

    public static PublicSuffixType valueOf(String r1) {
        return (PublicSuffixType) Enum.valueOf(PublicSuffixType.class, r1);
    }

    public static PublicSuffixType[] values() {
        return (PublicSuffixType[]) $VALUES.clone();
    }

    public char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    public char getLeafNodeCode() {
        return this.leafNodeCode;
    }
}
