package com.stockbit.domain.model.entity.discover;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0006\u0010$\u001a\u00020\u0003J\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u00060"}, d2 = {"Lcom/stockbit/domain/model/entity/discover/DiscoverMarketIndexItem;", "Landroid/os/Parcelable;", "parent", "", Constants.KEY_ID, "", "symbol", AppMeasurementSdk.ConditionalUserProperty.NAME, "percent", "change", "last", "marketCap", "valuema20", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getParent", "()I", "getId", "()Ljava/lang/String;", "getSymbol", "getName", "getPercent", "getChange", "getLast", "getMarketCap", "getValuema20", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DiscoverMarketIndexItem implements Parcelable {
    public static final Parcelable.Creator<DiscoverMarketIndexItem> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f82727a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82728b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82729c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82730e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82731f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82732g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82733h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82734i;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final DiscoverMarketIndexItem a(Parcel r12) {
            p.l(r12, "parcel");
            return new DiscoverMarketIndexItem(r12.readInt(), r12.readString(), r12.readString(), r12.readString(), r12.readString(), r12.readString(), r12.readString(), r12.readString(), r12.readString());
        }

        public final DiscoverMarketIndexItem[] b(int r1) {
            return new DiscoverMarketIndexItem[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public DiscoverMarketIndexItem(int r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        p.l(r3, Constants.KEY_ID);
        p.l(r4, "symbol");
        p.l(r5, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r6, "percent");
        p.l(r7, "change");
        p.l(r8, "last");
        p.l(r9, "marketCap");
        p.l(r10, "valuema20");
        this.f82727a = r2;
        this.f82728b = r3;
        this.f82729c = r4;
        this.d = r5;
        this.f82730e = r6;
        this.f82731f = r7;
        this.f82732g = r8;
        this.f82733h = r9;
        this.f82734i = r10;
    }

    public final String a() {
        return this.f82731f;
    }

    public final String b() {
        return this.f82728b;
    }

    public final String c() {
        return this.f82732g;
    }

    public final String d() {
        return this.f82733h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DiscoverMarketIndexItem) == true) goto L8;
        return false;
    L8:
        DiscoverMarketIndexItem r52 = (DiscoverMarketIndexItem) r5;
        if (this.f82727a == r52.f82727a) goto L12;
        return false;
    L12:
        if (p.g(this.f82728b, r52.f82728b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82729c, r52.f82729c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82730e, r52.f82730e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82731f, r52.f82731f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82732g, r52.f82732g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82733h, r52.f82733h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f82734i, r52.f82734i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f82730e;
    }

    public final String g() {
        return this.f82729c;
    }

    public final String h() {
        return this.f82734i;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f82727a) * 31) + this.f82728b.hashCode()) * 31) + this.f82729c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82730e.hashCode()) * 31) + this.f82731f.hashCode()) * 31) + this.f82732g.hashCode()) * 31) + this.f82733h.hashCode()) * 31) + this.f82734i.hashCode();
    }

    public String toString() {
        return "DiscoverMarketIndexItem(parent=" + this.f82727a + ", id=" + this.f82728b + ", symbol=" + this.f82729c + ", name=" + this.d + ", percent=" + this.f82730e + ", change=" + this.f82731f + ", last=" + this.f82732g + ", marketCap=" + this.f82733h + ", valuema20=" + this.f82734i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f82727a);
        r1.writeString(this.f82728b);
        r1.writeString(this.f82729c);
        r1.writeString(this.d);
        r1.writeString(this.f82730e);
        r1.writeString(this.f82731f);
        r1.writeString(this.f82732g);
        r1.writeString(this.f82733h);
        r1.writeString(this.f82734i);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ DiscoverMarketIndexItem(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, kotlin.jvm.internal.i r12) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0000: ARITH (r12v1 ?? I:??[int, boolean]) = (r11v0 ?? I:??[int, boolean, short, byte, char]) & (1 ??[boolean, int, float, short, byte, char]) A[DECLARE_VAR] in method: com.stockbit.domain.model.entity.discover.DiscoverMarketIndexItem.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void, file: classes8.dex
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
            java.lang.String r0 = ""
            if (r12 == 0) goto Lc
            r3 = r0
        Lc:
            r12 = r11 & 4
            if (r12 == 0) goto L11
            r4 = r0
        L11:
            r12 = r11 & 8
            if (r12 == 0) goto L16
            r5 = r0
        L16:
            r12 = r11 & 16
            if (r12 == 0) goto L1b
            r6 = r0
        L1b:
            r12 = r11 & 32
            if (r12 == 0) goto L20
            r7 = r0
        L20:
            r12 = r11 & 64
            if (r12 == 0) goto L25
            r8 = r0
        L25:
            r12 = r11 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L2a
            r9 = r0
        L2a:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L39
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
            goto L43
        L39:
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
        L43:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stockbit.domain.model.entity.discover.DiscoverMarketIndexItem.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
