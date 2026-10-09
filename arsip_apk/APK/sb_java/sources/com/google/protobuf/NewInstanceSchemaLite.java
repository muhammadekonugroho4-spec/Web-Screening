package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes6.dex */
final class NewInstanceSchemaLite implements NewInstanceSchema {
    public NewInstanceSchemaLite() {
    }

    @Override // com.google.protobuf.NewInstanceSchema
    public Object newInstance(Object r1) {
        return ((GeneratedMessageLite) r1).newMutableInstance();
    }
}
