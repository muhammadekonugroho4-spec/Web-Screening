package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class JsonPrimitive extends JsonElement {
    private final Object value;

    public JsonPrimitive(Boolean r1) {
        Objects.requireNonNull(r1);
        this.value = r1;
    }

    private static boolean isIntegral(JsonPrimitive r2) {
        Object r22 = r2.value;
        if ((r22 instanceof Number) == false) goto L18;
        Number r23 = (Number) r22;
        if ((r23 instanceof BigInteger) == false) goto L7;
        return true;
    L7:
        if ((r23 instanceof Long) == false) goto L9;
        return true;
    L9:
        if ((r23 instanceof Integer) == false) goto L11;
        return true;
    L11:
        if ((r23 instanceof Short) == false) goto L13;
        return true;
    L13:
        if ((r23 instanceof Byte) == true) goto L22;
        return false;
    L22:
        return true;
    L18:
        return false;
    }

    @Override // com.google.gson.JsonElement
    public JsonPrimitive deepCopy() {
        return this;
    }

    public boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L39:
        return false;
    L8:
        if (JsonPrimitive.class != r7.getClass()) goto L39;
        JsonPrimitive r72 = (JsonPrimitive) r7;
        if (this.value != null) goto L17;
        if (r72.value != null) goto L15;
        return true;
    L15:
        return false;
    L17:
        if (isIntegral(this) == true) goto L19;
    L24:
        Object r2 = this.value;
        if ((r2 instanceof Number) == false) goto L38;
        if ((r72.value instanceof Number) == false) goto L38;
        double r22 = getAsNumber().doubleValue();
        double r4 = r72.getAsNumber().doubleValue();
        if (r22 != r4) goto L31;
    L36:
        return true;
    L31:
        if (Double.isNaN(r22) == true) goto L33;
    L35:
        return false;
    L33:
        if (Double.isNaN(r4) == false) goto L35;
    L38:
        return r2.equals(r72.value);
    L19:
        if (isIntegral(r72) == false) goto L24;
        if (getAsNumber().longValue() != r72.getAsNumber().longValue()) goto L23;
        return true;
    L23:
        return false;
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        Object r02 = this.value;
        if ((r02 instanceof BigDecimal) == false) goto L7;
        return (BigDecimal) r02;
    L7:
        return new BigDecimal(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        Object r02 = this.value;
        if ((r02 instanceof BigInteger) == false) goto L7;
        return (BigInteger) r02;
    L7:
        return new BigInteger(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        if (isBoolean() == false) goto L7;
        return ((Boolean) this.value).booleanValue();
    L7:
        return Boolean.parseBoolean(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        if (isNumber() == false) goto L7;
        return getAsNumber().byteValue();
    L7:
        return Byte.parseByte(getAsString());
    }

    @Override // com.google.gson.JsonElement
    @Deprecated
    public char getAsCharacter() {
        String r02 = getAsString();
        if (r02.isEmpty() == true) goto L7;
        return r02.charAt(0);
    L7:
        throw new UnsupportedOperationException("String value is empty");
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        if (isNumber() == false) goto L7;
        return getAsNumber().doubleValue();
    L7:
        return Double.parseDouble(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        if (isNumber() == false) goto L7;
        return getAsNumber().floatValue();
    L7:
        return Float.parseFloat(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        if (isNumber() == false) goto L7;
        return getAsNumber().intValue();
    L7:
        return Integer.parseInt(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        if (isNumber() == false) goto L7;
        return getAsNumber().longValue();
    L7:
        return Long.parseLong(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        Object r02 = this.value;
        if ((r02 instanceof Number) == false) goto L7;
        return (Number) r02;
    L7:
        if ((r02 instanceof String) == false) goto L11;
        return new LazilyParsedNumber((String) r02);
    L11:
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        if (isNumber() == false) goto L7;
        return getAsNumber().shortValue();
    L7:
        return Short.parseShort(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        Object r02 = this.value;
        if ((r02 instanceof String) == false) goto L7;
        return (String) r02;
    L7:
        if (isNumber() == false) goto L11;
        return getAsNumber().toString();
    L11:
        if (isBoolean() == false) goto L15;
        return ((Boolean) this.value).toString();
    L15:
        throw new AssertionError("Unexpected value type: " + this.value.getClass());
    }

    public int hashCode() {
        if (this.value != null) goto L7;
        return 31;
    L7:
        if (isIntegral(this) == false) goto L11;
        long r2 = getAsNumber().longValue();
    L10:
        return (int) ((r2 >>> 32) ^ r2);
    L11:
        Object r02 = this.value;
        if ((r02 instanceof Number) == false) goto L15;
        r2 = Double.doubleToLongBits(getAsNumber().doubleValue());
        goto L10
    L15:
        return r02.hashCode();
    }

    public boolean isBoolean() {
        return this.value instanceof Boolean;
    }

    public boolean isNumber() {
        return this.value instanceof Number;
    }

    public boolean isString() {
        return this.value instanceof String;
    }

    @Override // com.google.gson.JsonElement
    public /* bridge */ /* synthetic */ JsonElement deepCopy() {
        return deepCopy();
    }

    public JsonPrimitive(Number r1) {
        Objects.requireNonNull(r1);
        this.value = r1;
    }

    public JsonPrimitive(String r1) {
        Objects.requireNonNull(r1);
        this.value = r1;
    }

    public JsonPrimitive(Character r1) {
        Objects.requireNonNull(r1);
        this.value = r1.toString();
    }
}
