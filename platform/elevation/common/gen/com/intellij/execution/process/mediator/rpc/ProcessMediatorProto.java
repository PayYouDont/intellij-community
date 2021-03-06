// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: processMediator.proto

package com.intellij.execution.process.mediator.rpc;

public final class ProcessMediatorProto {
  private ProcessMediatorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_Handshake_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_Handshake_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_QuotaState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_QuotaState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_QuotaStateActive_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_QuotaStateActive_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_QuotaOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_QuotaOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_OpenHandleReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_OpenHandleReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_CreateProcessRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_CreateProcessRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_CreateProcessReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_CreateProcessReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_DestroyProcessRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_DestroyProcessRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_AwaitTerminationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_AwaitTerminationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_AwaitTerminationReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_AwaitTerminationReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_FileHandle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_FileHandle_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_DataChunk_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_DataChunk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_ReadStreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_ReadStreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_WriteStreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_WriteStreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_CommandLine_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_CommandLine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_intellij_process_mediator_rpc_CommandLine_EnvironEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_intellij_process_mediator_rpc_CommandLine_EnvironEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025processMediator.proto\022\035intellij.proces" +
      "s.mediator.rpc\032\033google/protobuf/empty.pr" +
      "oto\"5\n\tHandshake\022\014\n\004port\030\001 \001(\r\022\r\n\005token\030" +
      "\002 \001(\014\022\013\n\003pid\030\003 \001(\004\"\205\002\n\nQuotaState\022B\n\rquo" +
      "ta_options\030\001 \001(\0132+.intellij.process.medi" +
      "ator.rpc.QuotaOptions\022+\n\tstate_new\030\002 \001(\013" +
      "2\026.google.protobuf.EmptyH\000\022G\n\014state_acti" +
      "ve\030\003 \001(\0132/.intellij.process.mediator.rpc" +
      ".QuotaStateActiveH\000\022/\n\rstate_expired\030\004 \001" +
      "(\0132\026.google.protobuf.EmptyH\000B\014\n\nStateOne" +
      "of\"&\n\020QuotaStateActive\022\022\n\nelapsed_ms\030\001 \001" +
      "(\003\"=\n\014QuotaOptions\022\025\n\rtime_limit_ms\030\001 \001(" +
      "\003\022\026\n\016is_refreshable\030\002 \001(\010\"$\n\017OpenHandleR" +
      "eply\022\021\n\thandle_id\030\001 \001(\004\"k\n\024CreateProcess" +
      "Request\022\021\n\thandle_id\030\001 \001(\004\022@\n\014command_li" +
      "ne\030\002 \001(\0132*.intellij.process.mediator.rpc" +
      ".CommandLine\"!\n\022CreateProcessReply\022\013\n\003pi" +
      "d\030\001 \001(\004\"P\n\025DestroyProcessRequest\022\021\n\thand" +
      "le_id\030\001 \001(\004\022\r\n\005force\030\002 \001(\010\022\025\n\rdestroy_gr" +
      "oup\030\003 \001(\010\",\n\027AwaitTerminationRequest\022\021\n\t" +
      "handle_id\030\001 \001(\004\"*\n\025AwaitTerminationReply" +
      "\022\021\n\texit_code\030\001 \001(\r\"+\n\nFileHandle\022\021\n\than" +
      "dle_id\030\001 \001(\004\022\n\n\002fd\030\002 \001(\r\"\033\n\tDataChunk\022\016\n" +
      "\006buffer\030\001 \001(\014\"N\n\021ReadStreamRequest\0229\n\006ha" +
      "ndle\030\001 \001(\0132).intellij.process.mediator.r" +
      "pc.FileHandle\"\242\001\n\022WriteStreamRequest\022;\n\006" +
      "handle\030\001 \001(\0132).intellij.process.mediator" +
      ".rpc.FileHandleH\000\0229\n\005chunk\030\002 \001(\0132(.intel" +
      "lij.process.mediator.rpc.DataChunkH\000B\024\n\022" +
      "FileHandleOrBuffer\"\201\002\n\013CommandLine\022\017\n\007co" +
      "mmand\030\001 \003(\t\022\023\n\013working_dir\030\002 \001(\t\022\017\n\007in_f" +
      "ile\030\003 \001(\t\022\020\n\010out_file\030\004 \001(\t\022\020\n\010err_file\030" +
      "\005 \001(\t\022\035\n\025redirect_error_stream\030\006 \001(\010\022H\n\007" +
      "environ\030\007 \003(\01327.intellij.process.mediato" +
      "r.rpc.CommandLine.EnvironEntry\032.\n\014Enviro" +
      "nEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\0012\370" +
      "\001\n\006Daemon\022R\n\013AdjustQuota\022+.intellij.proc" +
      "ess.mediator.rpc.QuotaOptions\032\026.google.p" +
      "rotobuf.Empty\022^\n\027ListenQuotaStateUpdates" +
      "\022\026.google.protobuf.Empty\032).intellij.proc" +
      "ess.mediator.rpc.QuotaState0\001\022:\n\010Shutdow" +
      "n\022\026.google.protobuf.Empty\032\026.google.proto" +
      "buf.Empty2\216\005\n\016ProcessManager\022V\n\nOpenHand" +
      "le\022\026.google.protobuf.Empty\032..intellij.pr" +
      "ocess.mediator.rpc.OpenHandleReply0\001\022w\n\r" +
      "CreateProcess\0223.intellij.process.mediato" +
      "r.rpc.CreateProcessRequest\0321.intellij.pr" +
      "ocess.mediator.rpc.CreateProcessReply\022^\n" +
      "\016DestroyProcess\0224.intellij.process.media" +
      "tor.rpc.DestroyProcessRequest\032\026.google.p" +
      "rotobuf.Empty\022\200\001\n\020AwaitTermination\0226.int" +
      "ellij.process.mediator.rpc.AwaitTerminat" +
      "ionRequest\0324.intellij.process.mediator.r" +
      "pc.AwaitTerminationReply\022\\\n\013WriteStream\022" +
      "1.intellij.process.mediator.rpc.WriteStr" +
      "eamRequest\032\026.google.protobuf.Empty(\0010\001\022j" +
      "\n\nReadStream\0220.intellij.process.mediator" +
      ".rpc.ReadStreamRequest\032(.intellij.proces" +
      "s.mediator.rpc.DataChunk0\001BE\n+com.intell" +
      "ij.execution.process.mediator.rpcB\024Proce" +
      "ssMediatorProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_intellij_process_mediator_rpc_Handshake_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_intellij_process_mediator_rpc_Handshake_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_Handshake_descriptor,
        new java.lang.String[] { "Port", "Token", "Pid", });
    internal_static_intellij_process_mediator_rpc_QuotaState_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_intellij_process_mediator_rpc_QuotaState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_QuotaState_descriptor,
        new java.lang.String[] { "QuotaOptions", "StateNew", "StateActive", "StateExpired", "StateOneof", });
    internal_static_intellij_process_mediator_rpc_QuotaStateActive_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_intellij_process_mediator_rpc_QuotaStateActive_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_QuotaStateActive_descriptor,
        new java.lang.String[] { "ElapsedMs", });
    internal_static_intellij_process_mediator_rpc_QuotaOptions_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_intellij_process_mediator_rpc_QuotaOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_QuotaOptions_descriptor,
        new java.lang.String[] { "TimeLimitMs", "IsRefreshable", });
    internal_static_intellij_process_mediator_rpc_OpenHandleReply_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_intellij_process_mediator_rpc_OpenHandleReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_OpenHandleReply_descriptor,
        new java.lang.String[] { "HandleId", });
    internal_static_intellij_process_mediator_rpc_CreateProcessRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_intellij_process_mediator_rpc_CreateProcessRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_CreateProcessRequest_descriptor,
        new java.lang.String[] { "HandleId", "CommandLine", });
    internal_static_intellij_process_mediator_rpc_CreateProcessReply_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_intellij_process_mediator_rpc_CreateProcessReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_CreateProcessReply_descriptor,
        new java.lang.String[] { "Pid", });
    internal_static_intellij_process_mediator_rpc_DestroyProcessRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_intellij_process_mediator_rpc_DestroyProcessRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_DestroyProcessRequest_descriptor,
        new java.lang.String[] { "HandleId", "Force", "DestroyGroup", });
    internal_static_intellij_process_mediator_rpc_AwaitTerminationRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_intellij_process_mediator_rpc_AwaitTerminationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_AwaitTerminationRequest_descriptor,
        new java.lang.String[] { "HandleId", });
    internal_static_intellij_process_mediator_rpc_AwaitTerminationReply_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_intellij_process_mediator_rpc_AwaitTerminationReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_AwaitTerminationReply_descriptor,
        new java.lang.String[] { "ExitCode", });
    internal_static_intellij_process_mediator_rpc_FileHandle_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_intellij_process_mediator_rpc_FileHandle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_FileHandle_descriptor,
        new java.lang.String[] { "HandleId", "Fd", });
    internal_static_intellij_process_mediator_rpc_DataChunk_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_intellij_process_mediator_rpc_DataChunk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_DataChunk_descriptor,
        new java.lang.String[] { "Buffer", });
    internal_static_intellij_process_mediator_rpc_ReadStreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_intellij_process_mediator_rpc_ReadStreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_ReadStreamRequest_descriptor,
        new java.lang.String[] { "Handle", });
    internal_static_intellij_process_mediator_rpc_WriteStreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_intellij_process_mediator_rpc_WriteStreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_WriteStreamRequest_descriptor,
        new java.lang.String[] { "Handle", "Chunk", "FileHandleOrBuffer", });
    internal_static_intellij_process_mediator_rpc_CommandLine_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_intellij_process_mediator_rpc_CommandLine_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_CommandLine_descriptor,
        new java.lang.String[] { "Command", "WorkingDir", "InFile", "OutFile", "ErrFile", "RedirectErrorStream", "Environ", });
    internal_static_intellij_process_mediator_rpc_CommandLine_EnvironEntry_descriptor =
      internal_static_intellij_process_mediator_rpc_CommandLine_descriptor.getNestedTypes().get(0);
    internal_static_intellij_process_mediator_rpc_CommandLine_EnvironEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_intellij_process_mediator_rpc_CommandLine_EnvironEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
