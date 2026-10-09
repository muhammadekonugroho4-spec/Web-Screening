package com.stockbit.dto.emitten;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003Js\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006)"}, d2 = {"Lcom/stockbit/dto/emitten/EmittenIndexItemDTO;", "", "parent", "", Constants.KEY_ID, "", "symbol", AppMeasurementSdk.ConditionalUserProperty.NAME, "percent", "change", "last", "marketcap", "valuema20", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getParent", "()I", "getId", "()Ljava/lang/String;", "getSymbol", "getName", "getPercent", "getChange", "getLast", "getMarketcap", "getValuema20", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EmittenIndexItemDTO {

    @SerializedName("change")
    private final String change;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final String f88649id;

    @SerializedName("last")
    private final String last;

    @SerializedName("marketcap")
    private final String marketcap;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("parent")
    private final int parent;

    @SerializedName("percent")
    private final String percent;

    @SerializedName("symbol")
    private final String symbol;

    @SerializedName("valuema20")
    private final String valuema20;

    public EmittenIndexItemDTO() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public final String a() {
        return this.change;
    }

    public final String b() {
        return this.f88649id;
    }

    public final String c() {
        return this.last;
    }

    public final String d() {
        return this.marketcap;
    }

    public final String e() {
        return this.name;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof EmittenIndexItemDTO) == true) goto L8;
        return false;
    L8:
        EmittenIndexItemDTO r52 = (EmittenIndexItemDTO) r5;
        if (this.parent == r52.parent) goto L12;
        return false;
    L12:
        if (p.g(this.f88649id, r52.f88649id) == true) goto L15;
        return false;
    L15:
        if (p.g(this.symbol, r52.symbol) == true) goto L18;
        return false;
    L18:
        if (p.g(this.name, r52.name) == true) goto L21;
        return false;
    L21:
        if (p.g(this.percent, r52.percent) == true) goto L24;
        return false;
    L24:
        if (p.g(this.change, r52.change) == true) goto L27;
        return false;
    L27:
        if (p.g(this.last, r52.last) == true) goto L30;
        return false;
    L30:
        if (p.g(this.marketcap, r52.marketcap) == true) goto L33;
        return false;
    L33:
        if (p.g(this.valuema20, r52.valuema20) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final int f() {
        return this.parent;
    }

    public final String g() {
        return this.percent;
    }

    public final String h() {
        return this.symbol;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.parent) * 31;
        String r1 = this.f88649id;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.symbol;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.name;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.percent;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.change;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (r06 + r110) * 31;
        String r111 = this.last;
        if (r111 != null) goto L25;
        int r112 = 0;
    L26:
        int r08 = (r07 + r112) * 31;
        String r113 = this.marketcap;
        if (r113 != null) goto L29;
        int r114 = 0;
    L30:
        int r09 = (r08 + r114) * 31;
        String r115 = this.valuema20;
        if (r115 == null) goto L35;
        r2 = r115.hashCode();
    L35:
        return r09 + r2;
    L29:
        r114 = r113.hashCode();
        goto L30
    L25:
        r112 = r111.hashCode();
        goto L26
    L21:
        r110 = r19.hashCode();
        goto L22
    L17:
        r18 = r17.hashCode();
        goto L18
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.valuema20;
    }

    public String toString() {
        return "EmittenIndexItemDTO(parent=" + this.parent + ", id=" + this.f88649id + ", symbol=" + this.symbol + ", name=" + this.name + ", percent=" + this.percent + ", change=" + this.change + ", last=" + this.last + ", marketcap=" + this.marketcap + ", valuema20=" + this.valuema20 + ")";
    }

    public EmittenIndexItemDTO(int r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        this.parent = r1;
        this.f88649id = r2;
        this.symbol = r3;
        this.name = r4;
        this.percent = r5;
        this.change = r6;
        this.last = r7;
        this.marketcap = r8;
        this.valuema20 = r9;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ EmittenIndexItemDTO(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, kotlin.jvm.internal.i r12) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0000: ARITH (r12v1 ?? I:??[int, boolean]) = (r11v0 ?? I:??[int, boolean, short, byte, char]) & (1 ??[boolean, int, float, short, byte, char]) A[DECLARE_VAR] in method: com.stockbit.dto.emitten.EmittenIndexItemDTO.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void, file: classes8.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:355)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:323)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:286)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.ArgType.getPrimitiveType()" because "type" is null
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:554)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 31 more
            */
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L5
            r2 = 0
        L5:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto Lb
            r3 = r0
        Lb:
            r12 = r11 & 4
            if (r12 == 0) goto L10
            r4 = r0
        L10:
            r12 = r11 & 8
            if (r12 == 0) goto L15
            r5 = r0
        L15:
            r12 = r11 & 16
            if (r12 == 0) goto L1a
            r6 = r0
        L1a:
            r12 = r11 & 32
            if (r12 == 0) goto L1f
            r7 = r0
        L1f:
            r12 = r11 & 64
            if (r12 == 0) goto L24
            r8 = r0
        L24:
            r12 = r11 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L29
            r9 = r0
        L29:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L38
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L42
        L38:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L42:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stockbit.dto.emitten.EmittenIndexItemDTO.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
