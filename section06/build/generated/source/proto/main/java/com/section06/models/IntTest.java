// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: type_int.proto

package com.section06.models;

/**
 * Protobuf type {@code IntTest}
 */
public  final class IntTest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:IntTest)
    IntTestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IntTest.newBuilder() to construct.
  private IntTest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IntTest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IntTest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IntTest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            dataInt32_ = input.readInt32();
            break;
          }
          case 16: {

            dataInt64_ = input.readInt64();
            break;
          }
          case 24: {

            dataUint32_ = input.readUInt32();
            break;
          }
          case 32: {

            dataUint64_ = input.readUInt64();
            break;
          }
          case 40: {

            dataSint32_ = input.readSInt32();
            break;
          }
          case 48: {

            dataSint64_ = input.readSInt64();
            break;
          }
          case 61: {

            dataFixed32_ = input.readFixed32();
            break;
          }
          case 65: {

            dataFixed64_ = input.readFixed64();
            break;
          }
          case 77: {

            dataSfixed32_ = input.readSFixed32();
            break;
          }
          case 81: {

            dataSfixed64_ = input.readSFixed64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.section06.models.TypeInt.internal_static_IntTest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.section06.models.TypeInt.internal_static_IntTest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.section06.models.IntTest.class, com.section06.models.IntTest.Builder.class);
  }

  public static final int DATA_INT32_FIELD_NUMBER = 1;
  private int dataInt32_;
  /**
   * <code>int32 data_int32 = 1;</code>
   * @return The dataInt32.
   */
  public int getDataInt32() {
    return dataInt32_;
  }

  public static final int DATA_INT64_FIELD_NUMBER = 2;
  private long dataInt64_;
  /**
   * <code>int64 data_int64 = 2;</code>
   * @return The dataInt64.
   */
  public long getDataInt64() {
    return dataInt64_;
  }

  public static final int DATA_UINT32_FIELD_NUMBER = 3;
  private int dataUint32_;
  /**
   * <code>uint32 data_uint32 = 3;</code>
   * @return The dataUint32.
   */
  public int getDataUint32() {
    return dataUint32_;
  }

  public static final int DATA_UINT64_FIELD_NUMBER = 4;
  private long dataUint64_;
  /**
   * <code>uint64 data_uint64 = 4;</code>
   * @return The dataUint64.
   */
  public long getDataUint64() {
    return dataUint64_;
  }

  public static final int DATA_SINT32_FIELD_NUMBER = 5;
  private int dataSint32_;
  /**
   * <code>sint32 data_sint32 = 5;</code>
   * @return The dataSint32.
   */
  public int getDataSint32() {
    return dataSint32_;
  }

  public static final int DATA_SINT64_FIELD_NUMBER = 6;
  private long dataSint64_;
  /**
   * <code>sint64 data_sint64 = 6;</code>
   * @return The dataSint64.
   */
  public long getDataSint64() {
    return dataSint64_;
  }

  public static final int DATA_FIXED32_FIELD_NUMBER = 7;
  private int dataFixed32_;
  /**
   * <code>fixed32 data_fixed32 = 7;</code>
   * @return The dataFixed32.
   */
  public int getDataFixed32() {
    return dataFixed32_;
  }

  public static final int DATA_FIXED64_FIELD_NUMBER = 8;
  private long dataFixed64_;
  /**
   * <code>fixed64 data_fixed64 = 8;</code>
   * @return The dataFixed64.
   */
  public long getDataFixed64() {
    return dataFixed64_;
  }

  public static final int DATA_SFIXED32_FIELD_NUMBER = 9;
  private int dataSfixed32_;
  /**
   * <code>sfixed32 data_sfixed32 = 9;</code>
   * @return The dataSfixed32.
   */
  public int getDataSfixed32() {
    return dataSfixed32_;
  }

  public static final int DATA_SFIXED64_FIELD_NUMBER = 10;
  private long dataSfixed64_;
  /**
   * <code>sfixed64 data_sfixed64 = 10;</code>
   * @return The dataSfixed64.
   */
  public long getDataSfixed64() {
    return dataSfixed64_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (dataInt32_ != 0) {
      output.writeInt32(1, dataInt32_);
    }
    if (dataInt64_ != 0L) {
      output.writeInt64(2, dataInt64_);
    }
    if (dataUint32_ != 0) {
      output.writeUInt32(3, dataUint32_);
    }
    if (dataUint64_ != 0L) {
      output.writeUInt64(4, dataUint64_);
    }
    if (dataSint32_ != 0) {
      output.writeSInt32(5, dataSint32_);
    }
    if (dataSint64_ != 0L) {
      output.writeSInt64(6, dataSint64_);
    }
    if (dataFixed32_ != 0) {
      output.writeFixed32(7, dataFixed32_);
    }
    if (dataFixed64_ != 0L) {
      output.writeFixed64(8, dataFixed64_);
    }
    if (dataSfixed32_ != 0) {
      output.writeSFixed32(9, dataSfixed32_);
    }
    if (dataSfixed64_ != 0L) {
      output.writeSFixed64(10, dataSfixed64_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataInt32_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, dataInt32_);
    }
    if (dataInt64_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, dataInt64_);
    }
    if (dataUint32_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, dataUint32_);
    }
    if (dataUint64_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, dataUint64_);
    }
    if (dataSint32_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt32Size(5, dataSint32_);
    }
    if (dataSint64_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt64Size(6, dataSint64_);
    }
    if (dataFixed32_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed32Size(7, dataFixed32_);
    }
    if (dataFixed64_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(8, dataFixed64_);
    }
    if (dataSfixed32_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeSFixed32Size(9, dataSfixed32_);
    }
    if (dataSfixed64_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeSFixed64Size(10, dataSfixed64_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.section06.models.IntTest)) {
      return super.equals(obj);
    }
    com.section06.models.IntTest other = (com.section06.models.IntTest) obj;

    if (getDataInt32()
        != other.getDataInt32()) return false;
    if (getDataInt64()
        != other.getDataInt64()) return false;
    if (getDataUint32()
        != other.getDataUint32()) return false;
    if (getDataUint64()
        != other.getDataUint64()) return false;
    if (getDataSint32()
        != other.getDataSint32()) return false;
    if (getDataSint64()
        != other.getDataSint64()) return false;
    if (getDataFixed32()
        != other.getDataFixed32()) return false;
    if (getDataFixed64()
        != other.getDataFixed64()) return false;
    if (getDataSfixed32()
        != other.getDataSfixed32()) return false;
    if (getDataSfixed64()
        != other.getDataSfixed64()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATA_INT32_FIELD_NUMBER;
    hash = (53 * hash) + getDataInt32();
    hash = (37 * hash) + DATA_INT64_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDataInt64());
    hash = (37 * hash) + DATA_UINT32_FIELD_NUMBER;
    hash = (53 * hash) + getDataUint32();
    hash = (37 * hash) + DATA_UINT64_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDataUint64());
    hash = (37 * hash) + DATA_SINT32_FIELD_NUMBER;
    hash = (53 * hash) + getDataSint32();
    hash = (37 * hash) + DATA_SINT64_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDataSint64());
    hash = (37 * hash) + DATA_FIXED32_FIELD_NUMBER;
    hash = (53 * hash) + getDataFixed32();
    hash = (37 * hash) + DATA_FIXED64_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDataFixed64());
    hash = (37 * hash) + DATA_SFIXED32_FIELD_NUMBER;
    hash = (53 * hash) + getDataSfixed32();
    hash = (37 * hash) + DATA_SFIXED64_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDataSfixed64());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.section06.models.IntTest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.section06.models.IntTest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.section06.models.IntTest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.section06.models.IntTest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.section06.models.IntTest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.section06.models.IntTest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.section06.models.IntTest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.section06.models.IntTest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.section06.models.IntTest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.section06.models.IntTest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.section06.models.IntTest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.section06.models.IntTest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.section06.models.IntTest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code IntTest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:IntTest)
      com.section06.models.IntTestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.section06.models.TypeInt.internal_static_IntTest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.section06.models.TypeInt.internal_static_IntTest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.section06.models.IntTest.class, com.section06.models.IntTest.Builder.class);
    }

    // Construct using com.section06.models.IntTest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      dataInt32_ = 0;

      dataInt64_ = 0L;

      dataUint32_ = 0;

      dataUint64_ = 0L;

      dataSint32_ = 0;

      dataSint64_ = 0L;

      dataFixed32_ = 0;

      dataFixed64_ = 0L;

      dataSfixed32_ = 0;

      dataSfixed64_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.section06.models.TypeInt.internal_static_IntTest_descriptor;
    }

    @java.lang.Override
    public com.section06.models.IntTest getDefaultInstanceForType() {
      return com.section06.models.IntTest.getDefaultInstance();
    }

    @java.lang.Override
    public com.section06.models.IntTest build() {
      com.section06.models.IntTest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.section06.models.IntTest buildPartial() {
      com.section06.models.IntTest result = new com.section06.models.IntTest(this);
      result.dataInt32_ = dataInt32_;
      result.dataInt64_ = dataInt64_;
      result.dataUint32_ = dataUint32_;
      result.dataUint64_ = dataUint64_;
      result.dataSint32_ = dataSint32_;
      result.dataSint64_ = dataSint64_;
      result.dataFixed32_ = dataFixed32_;
      result.dataFixed64_ = dataFixed64_;
      result.dataSfixed32_ = dataSfixed32_;
      result.dataSfixed64_ = dataSfixed64_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.section06.models.IntTest) {
        return mergeFrom((com.section06.models.IntTest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.section06.models.IntTest other) {
      if (other == com.section06.models.IntTest.getDefaultInstance()) return this;
      if (other.getDataInt32() != 0) {
        setDataInt32(other.getDataInt32());
      }
      if (other.getDataInt64() != 0L) {
        setDataInt64(other.getDataInt64());
      }
      if (other.getDataUint32() != 0) {
        setDataUint32(other.getDataUint32());
      }
      if (other.getDataUint64() != 0L) {
        setDataUint64(other.getDataUint64());
      }
      if (other.getDataSint32() != 0) {
        setDataSint32(other.getDataSint32());
      }
      if (other.getDataSint64() != 0L) {
        setDataSint64(other.getDataSint64());
      }
      if (other.getDataFixed32() != 0) {
        setDataFixed32(other.getDataFixed32());
      }
      if (other.getDataFixed64() != 0L) {
        setDataFixed64(other.getDataFixed64());
      }
      if (other.getDataSfixed32() != 0) {
        setDataSfixed32(other.getDataSfixed32());
      }
      if (other.getDataSfixed64() != 0L) {
        setDataSfixed64(other.getDataSfixed64());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.section06.models.IntTest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.section06.models.IntTest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int dataInt32_ ;
    /**
     * <code>int32 data_int32 = 1;</code>
     * @return The dataInt32.
     */
    public int getDataInt32() {
      return dataInt32_;
    }
    /**
     * <code>int32 data_int32 = 1;</code>
     * @param value The dataInt32 to set.
     * @return This builder for chaining.
     */
    public Builder setDataInt32(int value) {
      
      dataInt32_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 data_int32 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataInt32() {
      
      dataInt32_ = 0;
      onChanged();
      return this;
    }

    private long dataInt64_ ;
    /**
     * <code>int64 data_int64 = 2;</code>
     * @return The dataInt64.
     */
    public long getDataInt64() {
      return dataInt64_;
    }
    /**
     * <code>int64 data_int64 = 2;</code>
     * @param value The dataInt64 to set.
     * @return This builder for chaining.
     */
    public Builder setDataInt64(long value) {
      
      dataInt64_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 data_int64 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataInt64() {
      
      dataInt64_ = 0L;
      onChanged();
      return this;
    }

    private int dataUint32_ ;
    /**
     * <code>uint32 data_uint32 = 3;</code>
     * @return The dataUint32.
     */
    public int getDataUint32() {
      return dataUint32_;
    }
    /**
     * <code>uint32 data_uint32 = 3;</code>
     * @param value The dataUint32 to set.
     * @return This builder for chaining.
     */
    public Builder setDataUint32(int value) {
      
      dataUint32_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 data_uint32 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataUint32() {
      
      dataUint32_ = 0;
      onChanged();
      return this;
    }

    private long dataUint64_ ;
    /**
     * <code>uint64 data_uint64 = 4;</code>
     * @return The dataUint64.
     */
    public long getDataUint64() {
      return dataUint64_;
    }
    /**
     * <code>uint64 data_uint64 = 4;</code>
     * @param value The dataUint64 to set.
     * @return This builder for chaining.
     */
    public Builder setDataUint64(long value) {
      
      dataUint64_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 data_uint64 = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataUint64() {
      
      dataUint64_ = 0L;
      onChanged();
      return this;
    }

    private int dataSint32_ ;
    /**
     * <code>sint32 data_sint32 = 5;</code>
     * @return The dataSint32.
     */
    public int getDataSint32() {
      return dataSint32_;
    }
    /**
     * <code>sint32 data_sint32 = 5;</code>
     * @param value The dataSint32 to set.
     * @return This builder for chaining.
     */
    public Builder setDataSint32(int value) {
      
      dataSint32_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint32 data_sint32 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataSint32() {
      
      dataSint32_ = 0;
      onChanged();
      return this;
    }

    private long dataSint64_ ;
    /**
     * <code>sint64 data_sint64 = 6;</code>
     * @return The dataSint64.
     */
    public long getDataSint64() {
      return dataSint64_;
    }
    /**
     * <code>sint64 data_sint64 = 6;</code>
     * @param value The dataSint64 to set.
     * @return This builder for chaining.
     */
    public Builder setDataSint64(long value) {
      
      dataSint64_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint64 data_sint64 = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataSint64() {
      
      dataSint64_ = 0L;
      onChanged();
      return this;
    }

    private int dataFixed32_ ;
    /**
     * <code>fixed32 data_fixed32 = 7;</code>
     * @return The dataFixed32.
     */
    public int getDataFixed32() {
      return dataFixed32_;
    }
    /**
     * <code>fixed32 data_fixed32 = 7;</code>
     * @param value The dataFixed32 to set.
     * @return This builder for chaining.
     */
    public Builder setDataFixed32(int value) {
      
      dataFixed32_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed32 data_fixed32 = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataFixed32() {
      
      dataFixed32_ = 0;
      onChanged();
      return this;
    }

    private long dataFixed64_ ;
    /**
     * <code>fixed64 data_fixed64 = 8;</code>
     * @return The dataFixed64.
     */
    public long getDataFixed64() {
      return dataFixed64_;
    }
    /**
     * <code>fixed64 data_fixed64 = 8;</code>
     * @param value The dataFixed64 to set.
     * @return This builder for chaining.
     */
    public Builder setDataFixed64(long value) {
      
      dataFixed64_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 data_fixed64 = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataFixed64() {
      
      dataFixed64_ = 0L;
      onChanged();
      return this;
    }

    private int dataSfixed32_ ;
    /**
     * <code>sfixed32 data_sfixed32 = 9;</code>
     * @return The dataSfixed32.
     */
    public int getDataSfixed32() {
      return dataSfixed32_;
    }
    /**
     * <code>sfixed32 data_sfixed32 = 9;</code>
     * @param value The dataSfixed32 to set.
     * @return This builder for chaining.
     */
    public Builder setDataSfixed32(int value) {
      
      dataSfixed32_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sfixed32 data_sfixed32 = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataSfixed32() {
      
      dataSfixed32_ = 0;
      onChanged();
      return this;
    }

    private long dataSfixed64_ ;
    /**
     * <code>sfixed64 data_sfixed64 = 10;</code>
     * @return The dataSfixed64.
     */
    public long getDataSfixed64() {
      return dataSfixed64_;
    }
    /**
     * <code>sfixed64 data_sfixed64 = 10;</code>
     * @param value The dataSfixed64 to set.
     * @return This builder for chaining.
     */
    public Builder setDataSfixed64(long value) {
      
      dataSfixed64_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sfixed64 data_sfixed64 = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataSfixed64() {
      
      dataSfixed64_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:IntTest)
  }

  // @@protoc_insertion_point(class_scope:IntTest)
  private static final com.section06.models.IntTest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.section06.models.IntTest();
  }

  public static com.section06.models.IntTest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IntTest>
      PARSER = new com.google.protobuf.AbstractParser<IntTest>() {
    @java.lang.Override
    public IntTest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IntTest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IntTest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IntTest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.section06.models.IntTest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
