// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.section05.models;

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Address_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_CarsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_CarsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014person.proto\":\n\007Address\022\023\n\013postal_code" +
      "\030\001 \001(\t\022\014\n\004pref\030\002 \001(\t\022\014\n\004city\030\003 \001(\t\"\374\001\n\006P" +
      "erson\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\036\n\nbloo" +
      "d_type\030\003 \001(\0162\n.BloodType\022\031\n\007address\030\004 \001(" +
      "\0132\010.Address\022\016\n\006phones\030\005 \003(\t\022\037\n\004cars\030\006 \003(" +
      "\0132\021.Person.CarsEntry\022\026\n\014company_code\030\007 \001" +
      "(\tH\000\022\026\n\014company_name\030\010 \001(\tH\000\032+\n\tCarsEntr" +
      "y\022\013\n\003key\030\001 \001(\005\022\r\n\005value\030\002 \001(\t:\0028\001B\016\n\014com" +
      "pany_info*l\n\tBloodType\022\026\n\022BLOOD_TYPE_UNK" +
      "NOWN\020\000\022\020\n\014BLOOD_TYPE_A\020\001\022\020\n\014BLOOD_TYPE_B" +
      "\020\002\022\020\n\014BLOOD_TYPE_O\020\004\022\021\n\rBLOOD_TYPE_AB\020\005B" +
      "\030\n\024com.section05.modelsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Address_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Address_descriptor,
        new java.lang.String[] { "PostalCode", "Pref", "City", });
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Name", "Age", "BloodType", "Address", "Phones", "Cars", "CompanyCode", "CompanyName", "CompanyInfo", });
    internal_static_Person_CarsEntry_descriptor =
      internal_static_Person_descriptor.getNestedTypes().get(0);
    internal_static_Person_CarsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_CarsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}