package com.google.protobuf;

/* loaded from: classes6.dex */
public enum ProtoSyntax extends java.lang.Enum<ProtoSyntax> {
    private static final /* synthetic */ ProtoSyntax[] $VALUES = null;
    public static final ProtoSyntax EDITIONS = null;
    public static final ProtoSyntax PROTO2 = null;
    public static final ProtoSyntax PROTO3 = null;

    static {
        ProtoSyntax r02 = new ProtoSyntax("PROTO2", 0);
        PROTO2 = r02;
        ProtoSyntax r1 = new ProtoSyntax("PROTO3", 1);
        PROTO3 = r1;
        ProtoSyntax r2 = new ProtoSyntax("EDITIONS", 2);
        EDITIONS = r2;
        $VALUES = new ProtoSyntax[]{r02, r1, r2};
    }

    ProtoSyntax(String r1, int r2) {
    }

    public static ProtoSyntax valueOf(String r1) {
        return (ProtoSyntax) java.lang.Enum.valueOf(ProtoSyntax.class, r1);
    }

    public static ProtoSyntax[] values() {
        return (ProtoSyntax[]) $VALUES.clone();
    }
}
