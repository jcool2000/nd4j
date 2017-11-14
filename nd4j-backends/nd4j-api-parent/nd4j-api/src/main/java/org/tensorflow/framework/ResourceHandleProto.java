// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/resource_handle.proto

package org.tensorflow.framework;

/**
 * <pre>
 * Protocol buffer representing a handle to a tensorflow resource. Handles are
 * not valid across executions, but can be serialized back and forth from within
 * a single run.
 * </pre>
 *
 * Protobuf opType {@code tensorflow.ResourceHandleProto}
 */
public  final class ResourceHandleProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.ResourceHandleProto)
    ResourceHandleProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceHandleProto.newBuilder() to construct.
  private ResourceHandleProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceHandleProto() {
    device_ = "";
    container_ = "";
    name_ = "";
    hashCode_ = 0L;
    maybeTypeName_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResourceHandleProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            device_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            container_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 32: {

            hashCode_ = input.readUInt64();
            break;
          }
          case 42: {
            String s = input.readStringRequireUtf8();

            maybeTypeName_ = s;
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
    return ResourceHandle.internal_static_tensorflow_ResourceHandleProto_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ResourceHandle.internal_static_tensorflow_ResourceHandleProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ResourceHandleProto.class, Builder.class);
  }

  public static final int DEVICE_FIELD_NUMBER = 1;
  private volatile Object device_;
  /**
   * <pre>
   * Unique opName for the device containing the resource.
   * </pre>
   *
   * <code>string device = 1;</code>
   */
  public String getDevice() {
    Object ref = device_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      device_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Unique opName for the device containing the resource.
   * </pre>
   *
   * <code>string device = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDeviceBytes() {
    Object ref = device_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      device_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTAINER_FIELD_NUMBER = 2;
  private volatile Object container_;
  /**
   * <pre>
   * Container in which this resource is placed.
   * </pre>
   *
   * <code>string container = 2;</code>
   */
  public String getContainer() {
    Object ref = container_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      container_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Container in which this resource is placed.
   * </pre>
   *
   * <code>string container = 2;</code>
   */
  public com.google.protobuf.ByteString
      getContainerBytes() {
    Object ref = container_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      container_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile Object name_;
  /**
   * <pre>
   * Unique opName of this resource.
   * </pre>
   *
   * <code>string opName = 3;</code>
   */
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Unique opName of this resource.
   * </pre>
   *
   * <code>string opName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HASH_CODE_FIELD_NUMBER = 4;
  private long hashCode_;
  /**
   * <pre>
   * Hash code for the opType of the resource. Is only valid in the same device
   * and in the same execution.
   * </pre>
   *
   * <code>uint64 hash_code = 4;</code>
   */
  public long getHashCode() {
    return hashCode_;
  }

  public static final int MAYBE_TYPE_NAME_FIELD_NUMBER = 5;
  private volatile Object maybeTypeName_;
  /**
   * <pre>
   * For debug-only, the opName of the opType pointed to by this handle, if
   * available.
   * </pre>
   *
   * <code>string maybe_type_name = 5;</code>
   */
  public String getMaybeTypeName() {
    Object ref = maybeTypeName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      maybeTypeName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * For debug-only, the opName of the opType pointed to by this handle, if
   * available.
   * </pre>
   *
   * <code>string maybe_type_name = 5;</code>
   */
  public com.google.protobuf.ByteString
      getMaybeTypeNameBytes() {
    Object ref = maybeTypeName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      maybeTypeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getDeviceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, device_);
    }
    if (!getContainerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, container_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (hashCode_ != 0L) {
      output.writeUInt64(4, hashCode_);
    }
    if (!getMaybeTypeNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, maybeTypeName_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDeviceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, device_);
    }
    if (!getContainerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, container_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (hashCode_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, hashCode_);
    }
    if (!getMaybeTypeNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, maybeTypeName_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ResourceHandleProto)) {
      return super.equals(obj);
    }
    ResourceHandleProto other = (ResourceHandleProto) obj;

    boolean result = true;
    result = result && getDevice()
        .equals(other.getDevice());
    result = result && getContainer()
        .equals(other.getContainer());
    result = result && getName()
        .equals(other.getName());
    result = result && (getHashCode()
        == other.getHashCode());
    result = result && getMaybeTypeName()
        .equals(other.getMaybeTypeName());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DEVICE_FIELD_NUMBER;
    hash = (53 * hash) + getDevice().hashCode();
    hash = (37 * hash) + CONTAINER_FIELD_NUMBER;
    hash = (53 * hash) + getContainer().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + HASH_CODE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHashCode());
    hash = (37 * hash) + MAYBE_TYPE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getMaybeTypeName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ResourceHandleProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ResourceHandleProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ResourceHandleProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ResourceHandleProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ResourceHandleProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ResourceHandleProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ResourceHandleProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ResourceHandleProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ResourceHandleProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ResourceHandleProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ResourceHandleProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ResourceHandleProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ResourceHandleProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Protocol buffer representing a handle to a tensorflow resource. Handles are
   * not valid across executions, but can be serialized back and forth from within
   * a single run.
   * </pre>
   *
   * Protobuf opType {@code tensorflow.ResourceHandleProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.ResourceHandleProto)
      ResourceHandleProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ResourceHandle.internal_static_tensorflow_ResourceHandleProto_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ResourceHandle.internal_static_tensorflow_ResourceHandleProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResourceHandleProto.class, Builder.class);
    }

    // Construct using org.tensorflow.framework.ResourceHandleProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      device_ = "";

      container_ = "";

      name_ = "";

      hashCode_ = 0L;

      maybeTypeName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ResourceHandle.internal_static_tensorflow_ResourceHandleProto_descriptor;
    }

    public ResourceHandleProto getDefaultInstanceForType() {
      return ResourceHandleProto.getDefaultInstance();
    }

    public ResourceHandleProto build() {
      ResourceHandleProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ResourceHandleProto buildPartial() {
      ResourceHandleProto result = new ResourceHandleProto(this);
      result.device_ = device_;
      result.container_ = container_;
      result.name_ = name_;
      result.hashCode_ = hashCode_;
      result.maybeTypeName_ = maybeTypeName_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ResourceHandleProto) {
        return mergeFrom((ResourceHandleProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ResourceHandleProto other) {
      if (other == ResourceHandleProto.getDefaultInstance()) return this;
      if (!other.getDevice().isEmpty()) {
        device_ = other.device_;
        onChanged();
      }
      if (!other.getContainer().isEmpty()) {
        container_ = other.container_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getHashCode() != 0L) {
        setHashCode(other.getHashCode());
      }
      if (!other.getMaybeTypeName().isEmpty()) {
        maybeTypeName_ = other.maybeTypeName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ResourceHandleProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ResourceHandleProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object device_ = "";
    /**
     * <pre>
     * Unique opName for the device containing the resource.
     * </pre>
     *
     * <code>string device = 1;</code>
     */
    public String getDevice() {
      Object ref = device_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        device_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Unique opName for the device containing the resource.
     * </pre>
     *
     * <code>string device = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceBytes() {
      Object ref = device_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        device_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Unique opName for the device containing the resource.
     * </pre>
     *
     * <code>string device = 1;</code>
     */
    public Builder setDevice(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      device_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique opName for the device containing the resource.
     * </pre>
     *
     * <code>string device = 1;</code>
     */
    public Builder clearDevice() {
      
      device_ = getDefaultInstance().getDevice();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique opName for the device containing the resource.
     * </pre>
     *
     * <code>string device = 1;</code>
     */
    public Builder setDeviceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      device_ = value;
      onChanged();
      return this;
    }

    private Object container_ = "";
    /**
     * <pre>
     * Container in which this resource is placed.
     * </pre>
     *
     * <code>string container = 2;</code>
     */
    public String getContainer() {
      Object ref = container_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        container_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Container in which this resource is placed.
     * </pre>
     *
     * <code>string container = 2;</code>
     */
    public com.google.protobuf.ByteString
        getContainerBytes() {
      Object ref = container_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        container_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Container in which this resource is placed.
     * </pre>
     *
     * <code>string container = 2;</code>
     */
    public Builder setContainer(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      container_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Container in which this resource is placed.
     * </pre>
     *
     * <code>string container = 2;</code>
     */
    public Builder clearContainer() {
      
      container_ = getDefaultInstance().getContainer();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Container in which this resource is placed.
     * </pre>
     *
     * <code>string container = 2;</code>
     */
    public Builder setContainerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      container_ = value;
      onChanged();
      return this;
    }

    private Object name_ = "";
    /**
     * <pre>
     * Unique opName of this resource.
     * </pre>
     *
     * <code>string opName = 3;</code>
     */
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Unique opName of this resource.
     * </pre>
     *
     * <code>string opName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Unique opName of this resource.
     * </pre>
     *
     * <code>string opName = 3;</code>
     */
    public Builder setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique opName of this resource.
     * </pre>
     *
     * <code>string opName = 3;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique opName of this resource.
     * </pre>
     *
     * <code>string opName = 3;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private long hashCode_ ;
    /**
     * <pre>
     * Hash code for the opType of the resource. Is only valid in the same device
     * and in the same execution.
     * </pre>
     *
     * <code>uint64 hash_code = 4;</code>
     */
    public long getHashCode() {
      return hashCode_;
    }
    /**
     * <pre>
     * Hash code for the opType of the resource. Is only valid in the same device
     * and in the same execution.
     * </pre>
     *
     * <code>uint64 hash_code = 4;</code>
     */
    public Builder setHashCode(long value) {
      
      hashCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Hash code for the opType of the resource. Is only valid in the same device
     * and in the same execution.
     * </pre>
     *
     * <code>uint64 hash_code = 4;</code>
     */
    public Builder clearHashCode() {
      
      hashCode_ = 0L;
      onChanged();
      return this;
    }

    private Object maybeTypeName_ = "";
    /**
     * <pre>
     * For debug-only, the opName of the opType pointed to by this handle, if
     * available.
     * </pre>
     *
     * <code>string maybe_type_name = 5;</code>
     */
    public String getMaybeTypeName() {
      Object ref = maybeTypeName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        maybeTypeName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * For debug-only, the opName of the opType pointed to by this handle, if
     * available.
     * </pre>
     *
     * <code>string maybe_type_name = 5;</code>
     */
    public com.google.protobuf.ByteString
        getMaybeTypeNameBytes() {
      Object ref = maybeTypeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        maybeTypeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * For debug-only, the opName of the opType pointed to by this handle, if
     * available.
     * </pre>
     *
     * <code>string maybe_type_name = 5;</code>
     */
    public Builder setMaybeTypeName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      maybeTypeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For debug-only, the opName of the opType pointed to by this handle, if
     * available.
     * </pre>
     *
     * <code>string maybe_type_name = 5;</code>
     */
    public Builder clearMaybeTypeName() {
      
      maybeTypeName_ = getDefaultInstance().getMaybeTypeName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For debug-only, the opName of the opType pointed to by this handle, if
     * available.
     * </pre>
     *
     * <code>string maybe_type_name = 5;</code>
     */
    public Builder setMaybeTypeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      maybeTypeName_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.ResourceHandleProto)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.ResourceHandleProto)
  private static final ResourceHandleProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ResourceHandleProto();
  }

  public static ResourceHandleProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceHandleProto>
      PARSER = new com.google.protobuf.AbstractParser<ResourceHandleProto>() {
    public ResourceHandleProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResourceHandleProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResourceHandleProto> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ResourceHandleProto> getParserForType() {
    return PARSER;
  }

  public ResourceHandleProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

