// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: field_oneof.proto

package com.section06.models;

public final class FieldOneof {
  private FieldOneof() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Company_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Company_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021field_oneof.proto\"I\n\007Company\022\026\n\014compan" +
      "y_code\030\001 \001(\005H\000\022\026\n\014company_name\030\002 \001(\tH\000B\016" +
      "\n\014company_infoB\030\n\024com.section06.modelsP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Company_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Company_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Company_descriptor,
        new java.lang.String[] { "CompanyCode", "CompanyName", "CompanyInfo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
