// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: type_wrapper.proto

package com.section05.models;

public final class TypeWrapper {
  private TypeWrapper() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WrapperIntTest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WrapperIntTest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022type_wrapper.proto\032\036google/protobuf/wr" +
      "appers.proto\"B\n\016WrapperIntTest\0220\n\013data_c" +
      "int32\030\001 \001(\0132\033.google.protobuf.Int32Value" +
      "B\030\n\024com.section05.modelsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_WrapperIntTest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WrapperIntTest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WrapperIntTest_descriptor,
        new java.lang.String[] { "DataCint32", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
