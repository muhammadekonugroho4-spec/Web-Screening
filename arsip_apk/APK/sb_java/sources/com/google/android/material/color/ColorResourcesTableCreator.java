package com.google.android.material.color;

import android.content.Context;
import android.util.Pair;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.perf.util.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* loaded from: classes5.dex */
final class ColorResourcesTableCreator {
    private static final byte ANDROID_PACKAGE_ID = 1;
    private static final PackageInfo ANDROID_PACKAGE_INFO = null;
    private static final byte APPLICATION_PACKAGE_ID = Byte.MAX_VALUE;
    private static final Comparator<ColorResource> COLOR_RESOURCE_COMPARATOR = null;
    private static final short HEADER_TYPE_PACKAGE = 512;
    private static final short HEADER_TYPE_RES_TABLE = 2;
    private static final short HEADER_TYPE_STRING_POOL = 1;
    private static final short HEADER_TYPE_TYPE = 513;
    private static final short HEADER_TYPE_TYPE_SPEC = 514;
    private static final String RESOURCE_TYPE_NAME_COLOR = "color";
    private static byte typeIdColor;

    public static class ColorResource {
        private final short entryId;
        private final String name;
        private final byte packageId;
        private final byte typeId;
        private final int value;

        public ColorResource(int r1, String r2, int r3) {
            this.name = r2;
            this.value = r3;
            this.entryId = (short) (65535 & r1);
            this.typeId = (byte) ((r1 >> 16) & Constants.MAX_HOST_LENGTH);
            this.packageId = (byte) ((r1 >> 24) & Constants.MAX_HOST_LENGTH);
        }

        public static /* synthetic */ short access$000(ColorResource r02) {
            return r02.entryId;
        }

        public static /* synthetic */ String access$100(ColorResource r02) {
            return r02.name;
        }

        public static /* synthetic */ int access$1400(ColorResource r02) {
            return r02.value;
        }

        public static /* synthetic */ byte access$200(ColorResource r02) {
            return r02.typeId;
        }

        public static /* synthetic */ byte access$300(ColorResource r02) {
            return r02.packageId;
        }
    }

    public static class PackageChunk {
        private static final short HEADER_SIZE = 288;
        private static final int PACKAGE_NAME_MAX_LENGTH = 128;
        private final ResChunkHeader header;
        private final StringPoolChunk keyStrings;
        private final PackageInfo packageInfo;
        private final TypeSpecChunk typeSpecChunk;
        private final StringPoolChunk typeStrings;

        public PackageChunk(PackageInfo r3, List<ColorResource> r4) {
            this.packageInfo = r3;
            this.typeStrings = new StringPoolChunk(false, generateTypeStrings(r4));
            this.keyStrings = new StringPoolChunk(true, generateKeyStrings(r4));
            this.typeSpecChunk = new TypeSpecChunk(r4);
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_PACKAGE, HEADER_SIZE, getChunkSize());
        }

        private String[] generateKeyStrings(List<ColorResource> r4) {
            String[] r02 = new String[r4.size()];
            int r1 = 0;
        L4:
            if (r1 >= r4.size()) goto L6;
            r02[r1] = ColorResource.access$100(r4.get(r1));
            r1 = r1 + 1;
            goto L4
        L6:
            return r02;
        }

        private String[] generateTypeStrings(List<ColorResource> r5) {
            int r1 = 0;
            if (r5.isEmpty() == true) goto L11;
            int r52 = ColorResource.access$200(r5.get(0));
            String[] r02 = new String[r52];
        L5:
            int r2 = r52 - 1;
            if (r1 >= r2) goto L8;
            StringBuilder r22 = new StringBuilder();
            r22.append("?");
            int r3 = r1 + 1;
            r22.append(r3);
            r02[r1] = r22.toString();
            r1 = r3;
            goto L5
        L8:
            r02[r2] = "color";
            return r02;
        L11:
            return new String[0];
        }

        public int getChunkSize() {
            return ((this.typeStrings.getChunkSize() + 288) + this.keyStrings.getChunkSize()) + this.typeSpecChunk.getChunkSizeWithTypeChunk();
        }

        public void writeTo(ByteArrayOutputStream r5) throws IOException {
            this.header.writeTo(r5);
            r5.write(ColorResourcesTableCreator.access$500(PackageInfo.access$1000(this.packageInfo)));
            char[] r02 = PackageInfo.access$1100(this.packageInfo).toCharArray();
            int r2 = 0;
        L4:
            if (r2 >= 128) goto L10;
            if (r2 >= r02.length) goto L8;
            r5.write(ColorResourcesTableCreator.access$1200(r02[r2]));
        L9:
            r2 = r2 + 1;
            goto L4
        L8:
            r5.write(ColorResourcesTableCreator.access$1200(0));
            goto L9
        L10:
            r5.write(ColorResourcesTableCreator.access$500(288));
            r5.write(ColorResourcesTableCreator.access$500(0));
            r5.write(ColorResourcesTableCreator.access$500(this.typeStrings.getChunkSize() + 288));
            r5.write(ColorResourcesTableCreator.access$500(0));
            r5.write(ColorResourcesTableCreator.access$500(0));
            this.typeStrings.writeTo(r5);
            this.keyStrings.writeTo(r5);
            this.typeSpecChunk.writeTo(r5);
        }
    }

    public static class PackageInfo {

        /* renamed from: id, reason: collision with root package name */
        private final int f38031id;
        private final String name;

        public PackageInfo(int r1, String r2) {
            this.f38031id = r1;
            this.name = r2;
        }

        public static /* synthetic */ int access$1000(PackageInfo r02) {
            return r02.f38031id;
        }

        public static /* synthetic */ String access$1100(PackageInfo r02) {
            return r02.name;
        }
    }

    public static class ResChunkHeader {
        private final int chunkSize;
        private final short headerSize;
        private final short type;

        public ResChunkHeader(short r1, short r2, int r3) {
            this.type = r1;
            this.headerSize = r2;
            this.chunkSize = r3;
        }

        public void writeTo(ByteArrayOutputStream r2) throws IOException {
            r2.write(ColorResourcesTableCreator.access$600(this.type));
            r2.write(ColorResourcesTableCreator.access$600(this.headerSize));
            r2.write(ColorResourcesTableCreator.access$500(this.chunkSize));
        }
    }

    public static class ResEntry {
        private static final byte DATA_TYPE_AARRGGBB = 28;
        private static final short ENTRY_SIZE = 8;
        private static final short FLAG_PUBLIC = 2;
        private static final int SIZE = 16;
        private static final short VALUE_SIZE = 8;
        private final int data;
        private final int keyStringIndex;

        public ResEntry(int r1, int r2) {
            this.keyStringIndex = r1;
            this.data = r2;
        }

        public void writeTo(ByteArrayOutputStream r4) throws IOException {
            r4.write(ColorResourcesTableCreator.access$600(8));
            r4.write(ColorResourcesTableCreator.access$600(2));
            r4.write(ColorResourcesTableCreator.access$500(this.keyStringIndex));
            r4.write(ColorResourcesTableCreator.access$600(8));
            r4.write(new byte[]{0, 28});
            r4.write(ColorResourcesTableCreator.access$500(this.data));
        }
    }

    public static class ResTable {
        private static final short HEADER_SIZE = 12;
        private final ResChunkHeader header;
        private final List<PackageChunk> packageChunks;
        private final int packageCount;
        private final StringPoolChunk stringPool;

        public ResTable(Map<PackageInfo, List<ColorResource>> r5) {
            this.packageChunks = new ArrayList();
            this.packageCount = r5.size();
            this.stringPool = new StringPoolChunk(new String[0]);
            Iterator<Map.Entry<PackageInfo, List<ColorResource>>> r52 = r5.entrySet().iterator();
        L4:
            if (r52.hasNext() == false) goto L6;
            Map.Entry<PackageInfo, List<ColorResource>> r02 = r52.next();
            List<ColorResource> r1 = r02.getValue();
            Collections.sort(r1, ColorResourcesTableCreator.access$400());
            this.packageChunks.add(new PackageChunk(r02.getKey(), r1));
            goto L4
        L6:
            this.header = new ResChunkHeader(2, 12, getOverallSize());
        }

        private int getOverallSize() {
            Iterator<PackageChunk> r02 = this.packageChunks.iterator();
            int r1 = 0;
        L4:
            if (r02.hasNext() == false) goto L7;
            r1 = r1 + r02.next().getChunkSize();
            goto L4
        L7:
            return (this.stringPool.getChunkSize() + 12) + r1;
        }

        public void writeTo(ByteArrayOutputStream r3) throws IOException {
            this.header.writeTo(r3);
            r3.write(ColorResourcesTableCreator.access$500(this.packageCount));
            this.stringPool.writeTo(r3);
            Iterator<PackageChunk> r02 = this.packageChunks.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            r02.next().writeTo(r3);
            goto L4
        }
    }

    public static class StringPoolChunk {
        private static final int FLAG_UTF8 = 256;
        private static final short HEADER_SIZE = 28;
        private static final int STYLED_SPAN_LIST_END = -1;
        private final int chunkSize;
        private final ResChunkHeader header;
        private final int stringCount;
        private final List<Integer> stringIndex;
        private final List<byte[]> strings;
        private final int stringsPaddingSize;
        private final int stringsStart;
        private final int styledSpanCount;
        private final List<Integer> styledSpanIndex;
        private final List<List<StringStyledSpan>> styledSpans;
        private final int styledSpansStart;
        private final boolean utf8Encode;

        public StringPoolChunk(String... r2) {
            this(false, r2);
        }

        private Pair<byte[], List<StringStyledSpan>> processString(String r3) {
            if (this.utf8Encode == false) goto L5;
            byte[] r32 = ColorResourcesTableCreator.access$800(r3);
        L7:
            return new Pair(r32, Collections.EMPTY_LIST);
        L5:
            r32 = ColorResourcesTableCreator.access$900(r3);
            goto L7
        }

        public int getChunkSize() {
            return this.chunkSize;
        }

        public void writeTo(ByteArrayOutputStream r4) throws IOException {
            this.header.writeTo(r4);
            r4.write(ColorResourcesTableCreator.access$500(this.stringCount));
            r4.write(ColorResourcesTableCreator.access$500(this.styledSpanCount));
            if (this.utf8Encode == false) goto L5;
            int r02 = 256;
        L6:
            r4.write(ColorResourcesTableCreator.access$500(r02));
            r4.write(ColorResourcesTableCreator.access$500(this.stringsStart));
            r4.write(ColorResourcesTableCreator.access$500(this.styledSpansStart));
            Iterator<Integer> r03 = this.stringIndex.iterator();
        L8:
            if (r03.hasNext() == false) goto L10;
            r4.write(ColorResourcesTableCreator.access$500(r03.next().intValue()));
            goto L8
        L10:
            Iterator<Integer> r04 = this.styledSpanIndex.iterator();
        L12:
            if (r04.hasNext() == false) goto L14;
            r4.write(ColorResourcesTableCreator.access$500(r04.next().intValue()));
            goto L12
        L14:
            Iterator<byte[]> r05 = this.strings.iterator();
        L16:
            if (r05.hasNext() == false) goto L18;
            r4.write(r05.next());
            goto L16
        L18:
            int r06 = this.stringsPaddingSize;
            if (r06 <= 0) goto L21;
            r4.write(new byte[r06]);
        L21:
            Iterator<List<StringStyledSpan>> r07 = this.styledSpans.iterator();
        L23:
            if (r07.hasNext() == false) goto L29;
            Iterator<StringStyledSpan> r1 = r07.next().iterator();
        L26:
            if (r1.hasNext() == false) goto L28;
            r1.next().writeTo(r4);
            goto L26
        L28:
            r4.write(ColorResourcesTableCreator.access$500(-1));
            goto L23
        L29:
            return;
        L5:
            r02 = 0;
            goto L6
        }

        public StringPoolChunk(boolean r9, String... r10) {
            this.stringIndex = new ArrayList();
            this.styledSpanIndex = new ArrayList();
            this.strings = new ArrayList();
            this.styledSpans = new ArrayList();
            this.utf8Encode = r9;
            int r92 = r10.length;
            int r02 = 0;
            int r1 = 0;
            int r2 = 0;
        L3:
            if (r1 >= r92) goto L5;
            Pair<byte[], List<StringStyledSpan>> r3 = processString(r10[r1]);
            this.stringIndex.add(Integer.valueOf(r2));
            Object r4 = r3.first;
            r2 = r2 + ((byte[]) r4).length;
            this.strings.add((byte[]) r4);
            this.styledSpans.add((List) r3.second);
            r1 = r1 + 1;
            goto L3
        L5:
            Iterator<List<StringStyledSpan>> r93 = this.styledSpans.iterator();
            int r12 = 0;
        L7:
            if (r93.hasNext() == false) goto L13;
            List<StringStyledSpan> r32 = r93.next();
            Iterator<StringStyledSpan> r42 = r32.iterator();
        L10:
            if (r42.hasNext() == false) goto L12;
            StringStyledSpan r5 = r42.next();
            this.stringIndex.add(Integer.valueOf(r2));
            r2 = r2 + StringStyledSpan.access$700(r5).length;
            this.strings.add(StringStyledSpan.access$700(r5));
            goto L10
        L12:
            this.styledSpanIndex.add(Integer.valueOf(r12));
            r12 = r12 + ((r32.size() * 12) + 4);
            goto L7
        L13:
            int r94 = r2 % 4;
            if (r94 != 0) goto L16;
            int r95 = 0;
        L17:
            this.stringsPaddingSize = r95;
            int r33 = this.strings.size();
            this.stringCount = r33;
            this.styledSpanCount = this.strings.size() - r10.length;
            if ((this.strings.size() - r10.length) <= 0) goto L20;
            boolean r43 = true;
        L21:
            if (r43 == true) goto L23;
            this.styledSpanIndex.clear();
            this.styledSpans.clear();
        L23:
            int r34 = ((r33 * 4) + 28) + (this.styledSpanIndex.size() * 4);
            this.stringsStart = r34;
            int r22 = r2 + r95;
            if (r43 == false) goto L26;
            int r96 = r34 + r22;
        L27:
            this.styledSpansStart = r96;
            int r35 = r34 + r22;
            if (r43 == false) goto L30;
            r02 = r12;
        L30:
            int r36 = r35 + r02;
            this.chunkSize = r36;
            this.header = new ResChunkHeader(1, HEADER_SIZE, r36);
            return;
        L26:
            r96 = 0;
            goto L27
        L20:
            r43 = false;
            goto L21
        L16:
            r95 = 4 - r94;
            goto L17
        }
    }

    public static class StringStyledSpan {
        private int firstCharacterIndex;
        private int lastCharacterIndex;
        private int nameReference;
        private byte[] styleString;

        private StringStyledSpan() {
        }

        public static /* synthetic */ byte[] access$700(StringStyledSpan r02) {
            return r02.styleString;
        }

        public void writeTo(ByteArrayOutputStream r2) throws IOException {
            r2.write(ColorResourcesTableCreator.access$500(this.nameReference));
            r2.write(ColorResourcesTableCreator.access$500(this.firstCharacterIndex));
            r2.write(ColorResourcesTableCreator.access$500(this.lastCharacterIndex));
        }
    }

    public static class TypeChunk {
        private static final byte CONFIG_SIZE = 64;
        private static final short HEADER_SIZE = 84;
        private static final int OFFSET_NO_ENTRY = -1;
        private final byte[] config;
        private final int entryCount;
        private final ResChunkHeader header;
        private final int[] offsetTable;
        private final ResEntry[] resEntries;

        public TypeChunk(List<ColorResource> r6, Set<Short> r7, int r8) {
            byte[] r1 = new byte[64];
            this.config = r1;
            this.entryCount = r8;
            short r2 = 0;
            r1[0] = 64;
            this.resEntries = new ResEntry[r6.size()];
            int r02 = 0;
        L4:
            if (r02 >= r6.size()) goto L6;
            this.resEntries[r02] = new ResEntry(r02, ColorResource.access$1400(r6.get(r02)));
            r02 = r02 + 1;
            goto L4
        L6:
            this.offsetTable = new int[r8];
            int r62 = 0;
        L7:
            if (r2 >= r8) goto L13;
            if (r7.contains(Short.valueOf(r2)) == false) goto L11;
            this.offsetTable[r2] = r62;
            r62 = r62 + 16;
        L12:
            r2 = (short) (r2 + 1);
            goto L7
        L11:
            this.offsetTable[r2] = -1;
            goto L12
        L13:
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_TYPE, HEADER_SIZE, getChunkSize());
        }

        private int getEntryStart() {
            return getOffsetTableSize() + 84;
        }

        private int getOffsetTableSize() {
            return this.offsetTable.length * 4;
        }

        public int getChunkSize() {
            return getEntryStart() + (this.resEntries.length * 16);
        }

        public void writeTo(ByteArrayOutputStream r7) throws IOException {
            this.header.writeTo(r7);
            int r1 = 0;
            r7.write(new byte[]{ColorResourcesTableCreator.access$1300(), 0, 0, 0});
            r7.write(ColorResourcesTableCreator.access$500(this.entryCount));
            r7.write(ColorResourcesTableCreator.access$500(getEntryStart()));
            r7.write(this.config);
            int[] r2 = this.offsetTable;
            int r3 = r2.length;
            int r4 = 0;
        L3:
            if (r4 >= r3) goto L5;
            r7.write(ColorResourcesTableCreator.access$500(r2[r4]));
            r4 = r4 + 1;
            goto L3
        L5:
            ResEntry[] r22 = this.resEntries;
            int r32 = r22.length;
        L6:
            if (r1 >= r32) goto L8;
            r22[r1].writeTo(r7);
            r1 = r1 + 1;
            goto L6
        }
    }

    public static class TypeSpecChunk {
        private static final short HEADER_SIZE = 16;
        private static final int SPEC_PUBLIC = 1073741824;
        private final int entryCount;
        private final int[] entryFlags;
        private final ResChunkHeader header;
        private final TypeChunk typeChunk;

        public TypeSpecChunk(List<ColorResource> r6) {
            this.entryCount = ColorResource.access$000(r6.get(r6.size() - 1)) + 1;
            HashSet r02 = new HashSet();
            Iterator<ColorResource> r1 = r6.iterator();
        L4:
            if (r1.hasNext() == false) goto L6;
            r02.add(Short.valueOf(ColorResource.access$000(r1.next())));
            goto L4
        L6:
            this.entryFlags = new int[this.entryCount];
            short r12 = 0;
        L8:
            if (r12 >= this.entryCount) goto L13;
            if (r02.contains(Short.valueOf(r12)) == false) goto L12;
            this.entryFlags[r12] = 1073741824;
        L12:
            r12 = (short) (r12 + 1);
            goto L8
        L13:
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_TYPE_SPEC, 16, getChunkSize());
            this.typeChunk = new TypeChunk(r6, r02, this.entryCount);
        }

        private int getChunkSize() {
            return (this.entryCount * 4) + 16;
        }

        public int getChunkSizeWithTypeChunk() {
            return getChunkSize() + this.typeChunk.getChunkSize();
        }

        public void writeTo(ByteArrayOutputStream r6) throws IOException {
            this.header.writeTo(r6);
            int r1 = 0;
            r6.write(new byte[]{ColorResourcesTableCreator.access$1300(), 0, 0, 0});
            r6.write(ColorResourcesTableCreator.access$500(this.entryCount));
            int[] r2 = this.entryFlags;
            int r3 = r2.length;
        L3:
            if (r1 >= r3) goto L5;
            r6.write(ColorResourcesTableCreator.access$500(r2[r1]));
            r1 = r1 + 1;
            goto L3
        L5:
            this.typeChunk.writeTo(r6);
        }
    }

    static {
        ANDROID_PACKAGE_INFO = new PackageInfo(1, com.clevertap.android.sdk.Constants.KEY_ANDROID);
        COLOR_RESOURCE_COMPARATOR = new AnonymousClass1();
    }

    private ColorResourcesTableCreator() {
    }

    public static /* synthetic */ byte[] access$1200(char r02) {
        return charToByteArray(r02);
    }

    public static /* synthetic */ byte access$1300() {
        return typeIdColor;
    }

    public static /* synthetic */ Comparator access$400() {
        return COLOR_RESOURCE_COMPARATOR;
    }

    public static /* synthetic */ byte[] access$500(int r02) {
        return intToByteArray(r02);
    }

    public static /* synthetic */ byte[] access$600(short r02) {
        return shortToByteArray(r02);
    }

    public static /* synthetic */ byte[] access$800(String r02) {
        return stringToByteArrayUtf8(r02);
    }

    public static /* synthetic */ byte[] access$900(String r02) {
        return stringToByteArray(r02);
    }

    private static byte[] charToByteArray(char r3) {
        return new byte[]{(byte) (r3 & 255), (byte) ((r3 >> '\b') & Constants.MAX_HOST_LENGTH)};
    }

    private static byte[] concat(byte[]... r7) {
        int r02 = r7.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r3 = r3 + r7[r2].length;
        r2 = r2 + 1;
        goto L3
    L5:
        byte[] r03 = new byte[r3];
        int r22 = r7.length;
        int r32 = 0;
        int r4 = 0;
    L6:
        if (r32 >= r22) goto L8;
        byte[] r5 = r7[r32];
        System.arraycopy(r5, 0, r03, r4, r5.length);
        r4 = r4 + r5.length;
        r32 = r32 + 1;
        goto L6
    L8:
        return r03;
    }

    public static byte[] create(Context r8, Map<Integer, Integer> r9) throws IOException {
        if (r9.entrySet().isEmpty() == true) goto L30;
        PackageInfo r02 = new PackageInfo(WorkQueueKt.MASK, r8.getPackageName());
        HashMap r1 = new HashMap();
        Iterator<Map.Entry<Integer, Integer>> r92 = r9.entrySet().iterator();
        ColorResource r3 = null;
    L6:
        if (r92.hasNext() == false) goto L23;
        Map.Entry<Integer, Integer> r32 = r92.next();
        ColorResource r4 = new ColorResource(r32.getKey().intValue(), r8.getResources().getResourceEntryName(r32.getKey().intValue()), r32.getValue().intValue());
        if (r8.getResources().getResourceTypeName(r32.getKey().intValue()).equals("color") == false) goto L22;
        if (ColorResource.access$300(r4) != 1) goto L13;
        PackageInfo r33 = ANDROID_PACKAGE_INFO;
    L16:
        if (r1.containsKey(r33) == true) goto L18;
        r1.put(r33, new ArrayList());
    L18:
        ((List) r1.get(r33)).add(r4);
        r3 = r4;
        goto L6
    L13:
        if (ColorResource.access$300(r4) != Byte.MAX_VALUE) goto L20;
        r33 = r02;
        goto L16
    L20:
        throw new IllegalArgumentException("Not supported with unknown package id: " + ColorResource.access$300(r4));
    L22:
        throw new IllegalArgumentException("Non color resource found: name=" + ColorResource.access$100(r4) + ", typeId=" + Integer.toHexString(ColorResource.access$200(r4) & UnsignedBytes.MAX_VALUE));
    L23:
        byte r82 = ColorResource.access$200(r3);
        typeIdColor = r82;
        if (r82 == 0) goto L28;
        ByteArrayOutputStream r83 = new ByteArrayOutputStream();
        new ResTable(r1).writeTo(r83);
        return r83.toByteArray();
    L28:
        throw new IllegalArgumentException("No color resources found for harmonization.");
    L30:
        throw new IllegalArgumentException("No color resources provided for harmonization.");
    }

    private static byte[] encodeLengthUtf8(short r5) {
        if (r5 <= 127) goto L7;
        return new byte[]{(byte) ((127 & (r5 >> 8)) | 128), (byte) (r5 & 255)};
    L7:
        return new byte[]{(byte) (r5 & 255)};
    }

    private static byte[] intToByteArray(int r5) {
        return new byte[]{(byte) (r5 & Constants.MAX_HOST_LENGTH), (byte) ((r5 >> 8) & Constants.MAX_HOST_LENGTH), (byte) ((r5 >> 16) & Constants.MAX_HOST_LENGTH), (byte) ((r5 >> 24) & Constants.MAX_HOST_LENGTH)};
    }

    private static byte[] shortToByteArray(short r3) {
        return new byte[]{(byte) (r3 & 255), (byte) ((r3 >> 8) & Constants.MAX_HOST_LENGTH)};
    }

    private static byte[] stringToByteArray(String r9) {
        char[] r92 = r9.toCharArray();
        int r02 = r92.length * 2;
        byte[] r1 = new byte[r02 + 4];
        byte[] r2 = shortToByteArray((short) r92.length);
        r1[0] = r2[0];
        r1[1] = r2[1];
        int r22 = 0;
    L4:
        if (r22 >= r92.length) goto L6;
        byte[] r5 = charToByteArray(r92[r22]);
        int r6 = r22 * 2;
        r1[r6 + 2] = r5[0];
        r1[r6 + 3] = r5[1];
        r22 = r22 + 1;
        goto L4
    L6:
        r1[r02 + 2] = 0;
        r1[r02 + 3] = 0;
        return r1;
    }

    private static byte[] stringToByteArrayUtf8(String r4) {
        byte[] r02 = r4.getBytes(StandardCharsets.UTF_8);
        return concat(new byte[][]{encodeLengthUtf8((short) r4.length()), encodeLengthUtf8((short) r02.length), r02, new byte[]{0}});
    }
}
