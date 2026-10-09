package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class JsonWriter implements Closeable, Flushable, AutoCloseable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS = null;
    private static final String[] REPLACEMENT_CHARS = null;
    private static final Pattern VALID_JSON_NUMBER_PATTERN = null;
    private String deferredName;
    private boolean htmlSafe;
    private String indent;
    private boolean lenient;
    private final Writer out;
    private String separator;
    private boolean serializeNulls;
    private int[] stack;
    private int stackSize;

    static {
        VALID_JSON_NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
        REPLACEMENT_CHARS = new String[128];
        int r02 = 0;
    L4:
        if (r02 > 31) goto L6;
        REPLACEMENT_CHARS[r02] = String.format("\\u%04x", new Object[]{Integer.valueOf(r02)});
        r02 = r02 + 1;
        goto L4
    L6:
        String[] r03 = REPLACEMENT_CHARS;
        r03[34] = "\\\"";
        r03[92] = "\\\\";
        r03[9] = "\\t";
        r03[8] = "\\b";
        r03[10] = "\\n";
        r03[13] = "\\r";
        r03[12] = "\\f";
        String[] r04 = (String[]) r03.clone();
        HTML_SAFE_REPLACEMENT_CHARS = r04;
        r04[60] = "\\u003c";
        r04[62] = "\\u003e";
        r04[38] = "\\u0026";
        r04[61] = "\\u003d";
        r04[39] = "\\u0027";
    }

    public JsonWriter(Writer r2) {
        this.stack = new int[32];
        this.stackSize = 0;
        push(6);
        this.separator = ":";
        this.serializeNulls = true;
        Objects.requireNonNull(r2, "out == null");
        this.out = r2;
    }

    private void beforeName() throws IOException {
        int r02 = peek();
        if (r02 != 5) goto L6;
        this.out.write(44);
    L7:
        newline();
        replaceTop(4);
        return;
    L6:
        if (r02 == 3) goto L7;
        throw new IllegalStateException("Nesting problem.");
    }

    private void beforeValue() throws IOException {
        int r02 = peek();
        if (r02 == 1) goto L23;
        if (r02 != 2) goto L6;
        this.out.append(',');
        newline();
        return;
    L6:
        if (r02 != 4) goto L8;
        this.out.append(this.separator);
        replaceTop(5);
        return;
    L8:
        if (r02 == 6) goto L17;
        if (r02 != 7) goto L16;
        if (this.lenient == true) goto L17;
        throw new IllegalStateException("JSON must have only one top-level value.");
    L16:
        throw new IllegalStateException("Nesting problem.");
    L17:
        replaceTop(7);
        return;
    L23:
        replaceTop(2);
        newline();
    }

    private JsonWriter close(int r2, int r3, char r4) throws IOException {
        int r02 = peek();
        if (r02 == r3) goto L9;
        if (r02 == r2) goto L9;
        throw new IllegalStateException("Nesting problem.");
    L9:
        if (this.deferredName != null) goto L16;
        this.stackSize--;
        if (r02 != r3) goto L13;
        newline();
    L13:
        this.out.write(r4);
        return this;
    L16:
        throw new IllegalStateException("Dangling name: " + this.deferredName);
    }

    private static boolean isTrustedNumberType(Class<? extends Number> r1) {
        if (r1 != Integer.class) goto L5;
        return true;
    L5:
        if (r1 != Long.class) goto L7;
        return true;
    L7:
        if (r1 != Double.class) goto L9;
        return true;
    L9:
        if (r1 != Float.class) goto L11;
        return true;
    L11:
        if (r1 != Byte.class) goto L13;
        return true;
    L13:
        if (r1 != Short.class) goto L15;
        return true;
    L15:
        if (r1 != BigDecimal.class) goto L17;
        return true;
    L17:
        if (r1 != BigInteger.class) goto L19;
        return true;
    L19:
        if (r1 != AtomicInteger.class) goto L21;
        return true;
    L21:
        if (r1 == AtomicLong.class) goto L35;
        return false;
    L35:
        return true;
    }

    private void newline() throws IOException {
        if (this.indent == null) goto L8;
        this.out.write(10);
        int r02 = this.stackSize;
        int r1 = 1;
    L6:
        if (r1 >= r02) goto L10;
        this.out.write(this.indent);
        r1 = r1 + 1;
        goto L6
    L10:
        return;
    }

    private JsonWriter open(int r1, char r2) throws IOException {
        beforeValue();
        push(r1);
        this.out.write(r2);
        return this;
    }

    private int peek() {
        int r02 = this.stackSize;
        if (r02 == 0) goto L7;
        return this.stack[r02 - 1];
    L7:
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void push(int r4) {
        int r02 = this.stackSize;
        int[] r1 = this.stack;
        if (r02 != r1.length) goto L5;
        this.stack = Arrays.copyOf(r1, r02 * 2);
    L5:
        int[] r03 = this.stack;
        int r12 = this.stackSize;
        this.stackSize = r12 + 1;
        r03[r12] = r4;
    }

    private void replaceTop(int r3) {
        this.stack[this.stackSize - 1] = r3;
    }

    private void string(String r9) throws IOException {
        if (this.htmlSafe == false) goto L5;
        String[] r02 = HTML_SAFE_REPLACEMENT_CHARS;
    L6:
        this.out.write(34);
        int r1 = r9.length();
        int r3 = 0;
        int r4 = 0;
    L7:
        if (r3 >= r1) goto L23;
        char r5 = r9.charAt(r3);
        if (r5 >= 128) goto L14;
        String r52 = r02[r5];
        if (r52 == null) goto L22;
    L19:
        if (r4 >= r3) goto L21;
        this.out.write(r9, r4, r3 - r4);
    L21:
        this.out.write(r52);
        r4 = r3 + 1;
    L22:
        r3 = r3 + 1;
        goto L7
    L14:
        if (r5 != 8232) goto L17;
        r52 = "\\u2028";
        goto L19
    L17:
        if (r5 != 8233) goto L22;
        r52 = "\\u2029";
        goto L19
    L23:
        if (r4 >= r1) goto L25;
        this.out.write(r9, r4, r1 - r4);
    L25:
        this.out.write(34);
        return;
    L5:
        r02 = REPLACEMENT_CHARS;
        goto L6
    }

    private void writeDeferredName() throws IOException {
        if (this.deferredName == null) goto L6;
        beforeName();
        string(this.deferredName);
        this.deferredName = null;
        return;
    }

    public JsonWriter beginArray() throws IOException {
        writeDeferredName();
        return open(1, '[');
    }

    public JsonWriter beginObject() throws IOException {
        writeDeferredName();
        return open(3, '{');
    }

    public JsonWriter endArray() throws IOException {
        return close(1, 2, ']');
    }

    public JsonWriter endObject() throws IOException {
        return close(3, 5, '}');
    }

    public void flush() throws IOException {
        if (this.stackSize == 0) goto L7;
        this.out.flush();
        return;
    L7:
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        return this.lenient;
    }

    public JsonWriter jsonValue(String r2) throws IOException {
        if (r2 == null) goto L4;
        writeDeferredName();
        beforeValue();
        this.out.append(r2);
        return this;
    L4:
        return nullValue();
    }

    public JsonWriter name(String r2) throws IOException {
        Objects.requireNonNull(r2, "name == null");
        if (this.deferredName != null) goto L11;
        if (this.stackSize == 0) goto L9;
        this.deferredName = r2;
        return this;
    L9:
        throw new IllegalStateException("JsonWriter is closed.");
    L11:
        throw new IllegalStateException();
    }

    public JsonWriter nullValue() throws IOException {
        if (this.deferredName != null) goto L5;
    L9:
        beforeValue();
        this.out.write("null");
        return this;
    L5:
        if (this.serializeNulls == false) goto L7;
        writeDeferredName();
        goto L9
    L7:
        this.deferredName = null;
        return this;
    }

    public final void setHtmlSafe(boolean r1) {
        this.htmlSafe = r1;
    }

    public final void setIndent(String r2) {
        if (r2.length() != 0) goto L6;
        this.indent = null;
        this.separator = ":";
        return;
    L6:
        this.indent = r2;
        this.separator = ": ";
    }

    public final void setLenient(boolean r1) {
        this.lenient = r1;
    }

    public final void setSerializeNulls(boolean r1) {
        this.serializeNulls = r1;
    }

    public JsonWriter value(String r1) throws IOException {
        if (r1 == null) goto L4;
        writeDeferredName();
        beforeValue();
        string(r1);
        return this;
    L4:
        return nullValue();
    }

    public JsonWriter value(boolean r2) throws IOException {
        writeDeferredName();
        beforeValue();
        Writer r02 = this.out;
        if (r2 == false) goto L5;
        String r22 = "true";
    L6:
        r02.write(r22);
        return this;
    L5:
        r22 = "false";
        goto L6
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
        int r02 = this.stackSize;
        if (r02 > 1) goto L10;
        if (r02 == 1) goto L6;
    L7:
        this.stackSize = 0;
        return;
    L6:
        if (this.stack[r02 - 1] == 7) goto L7;
    L10:
        throw new IOException("Incomplete document");
    }

    public JsonWriter value(Boolean r2) throws IOException {
        if (r2 == null) goto L4;
        writeDeferredName();
        beforeValue();
        Writer r02 = this.out;
        if (r2.booleanValue() == false) goto L8;
        String r22 = "true";
    L9:
        r02.write(r22);
        return this;
    L8:
        r22 = "false";
        goto L9
    L4:
        return nullValue();
    }

    public JsonWriter value(float r4) throws IOException {
        writeDeferredName();
        if (this.lenient == false) goto L5;
    L11:
        beforeValue();
        this.out.append(Float.toString(r4));
        return this;
    L5:
        if (Float.isNaN(r4) == true) goto L10;
        if (Float.isInfinite(r4) == false) goto L11;
    L10:
        throw new IllegalArgumentException("Numeric values must be finite, but was " + r4);
    }

    public JsonWriter value(double r4) throws IOException {
        writeDeferredName();
        if (this.lenient == false) goto L5;
    L11:
        beforeValue();
        this.out.append(Double.toString(r4));
        return this;
    L5:
        if (Double.isNaN(r4) == true) goto L10;
        if (Double.isInfinite(r4) == false) goto L11;
    L10:
        throw new IllegalArgumentException("Numeric values must be finite, but was " + r4);
    }

    public JsonWriter value(long r2) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(Long.toString(r2));
        return this;
    }

    public JsonWriter value(Number r5) throws IOException {
        if (r5 == null) goto L4;
        writeDeferredName();
        String r02 = r5.toString();
        if (r02.equals("-Infinity") == true) goto L20;
        if (r02.equals("Infinity") == true) goto L20;
        if (r02.equals("NaN") == true) goto L20;
        Class<?> r52 = r5.getClass();
        if (isTrustedNumberType(r52) == false) goto L15;
    L21:
        beforeValue();
        this.out.append(r02);
        return this;
    L15:
        if (VALID_JSON_NUMBER_PATTERN.matcher(r02).matches() == true) goto L21;
        throw new IllegalArgumentException("String created by " + r52 + " is not a valid JSON number: " + r02);
    L20:
        if (this.lenient == true) goto L21;
        throw new IllegalArgumentException("Numeric values must be finite, but was " + r02);
    L4:
        return nullValue();
    }
}
