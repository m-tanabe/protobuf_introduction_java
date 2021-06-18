// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.section05.models;

/**
 * Protobuf enum {@code BloodType}
 */
public enum BloodType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BLOOD_TYPE_UNKNOWN = 0;</code>
   */
  BLOOD_TYPE_UNKNOWN(0),
  /**
   * <code>BLOOD_TYPE_A = 1;</code>
   */
  BLOOD_TYPE_A(1),
  /**
   * <code>BLOOD_TYPE_B = 2;</code>
   */
  BLOOD_TYPE_B(2),
  /**
   * <code>BLOOD_TYPE_O = 4;</code>
   */
  BLOOD_TYPE_O(4),
  /**
   * <code>BLOOD_TYPE_AB = 5;</code>
   */
  BLOOD_TYPE_AB(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BLOOD_TYPE_UNKNOWN = 0;</code>
   */
  public static final int BLOOD_TYPE_UNKNOWN_VALUE = 0;
  /**
   * <code>BLOOD_TYPE_A = 1;</code>
   */
  public static final int BLOOD_TYPE_A_VALUE = 1;
  /**
   * <code>BLOOD_TYPE_B = 2;</code>
   */
  public static final int BLOOD_TYPE_B_VALUE = 2;
  /**
   * <code>BLOOD_TYPE_O = 4;</code>
   */
  public static final int BLOOD_TYPE_O_VALUE = 4;
  /**
   * <code>BLOOD_TYPE_AB = 5;</code>
   */
  public static final int BLOOD_TYPE_AB_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static BloodType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BloodType forNumber(int value) {
    switch (value) {
      case 0: return BLOOD_TYPE_UNKNOWN;
      case 1: return BLOOD_TYPE_A;
      case 2: return BLOOD_TYPE_B;
      case 4: return BLOOD_TYPE_O;
      case 5: return BLOOD_TYPE_AB;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BloodType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BloodType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BloodType>() {
          public BloodType findValueByNumber(int number) {
            return BloodType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.section05.models.PersonOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final BloodType[] VALUES = values();

  public static BloodType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private BloodType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:BloodType)
}

