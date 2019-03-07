package example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Defining a Service, a Service can have multiple RPC operations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: Game.proto")
public final class TTTServiceGrpc {

  private TTTServiceGrpc() {}

  public static final String SERVICE_NAME = "example.grpc.TTTService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<example.grpc.Game.PlayRequest,
      example.grpc.Game.PlayResponse> getPlayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "play",
      requestType = example.grpc.Game.PlayRequest.class,
      responseType = example.grpc.Game.PlayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.grpc.Game.PlayRequest,
      example.grpc.Game.PlayResponse> getPlayMethod() {
    io.grpc.MethodDescriptor<example.grpc.Game.PlayRequest, example.grpc.Game.PlayResponse> getPlayMethod;
    if ((getPlayMethod = TTTServiceGrpc.getPlayMethod) == null) {
      synchronized (TTTServiceGrpc.class) {
        if ((getPlayMethod = TTTServiceGrpc.getPlayMethod) == null) {
          TTTServiceGrpc.getPlayMethod = getPlayMethod = 
              io.grpc.MethodDescriptor.<example.grpc.Game.PlayRequest, example.grpc.Game.PlayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "example.grpc.TTTService", "play"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.Game.PlayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.Game.PlayResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TTTServiceMethodDescriptorSupplier("play"))
                  .build();
          }
        }
     }
     return getPlayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.grpc.Game.CheckWinnerRequest,
      example.grpc.Game.CheckWinnerResponse> getCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "check",
      requestType = example.grpc.Game.CheckWinnerRequest.class,
      responseType = example.grpc.Game.CheckWinnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.grpc.Game.CheckWinnerRequest,
      example.grpc.Game.CheckWinnerResponse> getCheckMethod() {
    io.grpc.MethodDescriptor<example.grpc.Game.CheckWinnerRequest, example.grpc.Game.CheckWinnerResponse> getCheckMethod;
    if ((getCheckMethod = TTTServiceGrpc.getCheckMethod) == null) {
      synchronized (TTTServiceGrpc.class) {
        if ((getCheckMethod = TTTServiceGrpc.getCheckMethod) == null) {
          TTTServiceGrpc.getCheckMethod = getCheckMethod = 
              io.grpc.MethodDescriptor.<example.grpc.Game.CheckWinnerRequest, example.grpc.Game.CheckWinnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "example.grpc.TTTService", "check"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.Game.CheckWinnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.Game.CheckWinnerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TTTServiceMethodDescriptorSupplier("check"))
                  .build();
          }
        }
     }
     return getCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.grpc.Game.CurrentBoardRequest,
      example.grpc.Game.CurrentBoardResponse> getBoardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "board",
      requestType = example.grpc.Game.CurrentBoardRequest.class,
      responseType = example.grpc.Game.CurrentBoardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.grpc.Game.CurrentBoardRequest,
      example.grpc.Game.CurrentBoardResponse> getBoardMethod() {
    io.grpc.MethodDescriptor<example.grpc.Game.CurrentBoardRequest, example.grpc.Game.CurrentBoardResponse> getBoardMethod;
    if ((getBoardMethod = TTTServiceGrpc.getBoardMethod) == null) {
      synchronized (TTTServiceGrpc.class) {
        if ((getBoardMethod = TTTServiceGrpc.getBoardMethod) == null) {
          TTTServiceGrpc.getBoardMethod = getBoardMethod = 
              io.grpc.MethodDescriptor.<example.grpc.Game.CurrentBoardRequest, example.grpc.Game.CurrentBoardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "example.grpc.TTTService", "board"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.Game.CurrentBoardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.Game.CurrentBoardResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TTTServiceMethodDescriptorSupplier("board"))
                  .build();
          }
        }
     }
     return getBoardMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TTTServiceStub newStub(io.grpc.Channel channel) {
    return new TTTServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TTTServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TTTServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TTTServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TTTServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static abstract class TTTServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public void play(example.grpc.Game.PlayRequest request,
        io.grpc.stub.StreamObserver<example.grpc.Game.PlayResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayMethod(), responseObserver);
    }

    /**
     */
    public void check(example.grpc.Game.CheckWinnerRequest request,
        io.grpc.stub.StreamObserver<example.grpc.Game.CheckWinnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckMethod(), responseObserver);
    }

    /**
     */
    public void board(example.grpc.Game.CurrentBoardRequest request,
        io.grpc.stub.StreamObserver<example.grpc.Game.CurrentBoardResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBoardMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.grpc.Game.PlayRequest,
                example.grpc.Game.PlayResponse>(
                  this, METHODID_PLAY)))
          .addMethod(
            getCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.grpc.Game.CheckWinnerRequest,
                example.grpc.Game.CheckWinnerResponse>(
                  this, METHODID_CHECK)))
          .addMethod(
            getBoardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.grpc.Game.CurrentBoardRequest,
                example.grpc.Game.CurrentBoardResponse>(
                  this, METHODID_BOARD)))
          .build();
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class TTTServiceStub extends io.grpc.stub.AbstractStub<TTTServiceStub> {
    private TTTServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TTTServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TTTServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TTTServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public void play(example.grpc.Game.PlayRequest request,
        io.grpc.stub.StreamObserver<example.grpc.Game.PlayResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void check(example.grpc.Game.CheckWinnerRequest request,
        io.grpc.stub.StreamObserver<example.grpc.Game.CheckWinnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void board(example.grpc.Game.CurrentBoardRequest request,
        io.grpc.stub.StreamObserver<example.grpc.Game.CurrentBoardResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBoardMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class TTTServiceBlockingStub extends io.grpc.stub.AbstractStub<TTTServiceBlockingStub> {
    private TTTServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TTTServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TTTServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TTTServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public example.grpc.Game.PlayResponse play(example.grpc.Game.PlayRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlayMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.grpc.Game.CheckWinnerResponse check(example.grpc.Game.CheckWinnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.grpc.Game.CurrentBoardResponse board(example.grpc.Game.CurrentBoardRequest request) {
      return blockingUnaryCall(
          getChannel(), getBoardMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class TTTServiceFutureStub extends io.grpc.stub.AbstractStub<TTTServiceFutureStub> {
    private TTTServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TTTServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TTTServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TTTServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<example.grpc.Game.PlayResponse> play(
        example.grpc.Game.PlayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.grpc.Game.CheckWinnerResponse> check(
        example.grpc.Game.CheckWinnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.grpc.Game.CurrentBoardResponse> board(
        example.grpc.Game.CurrentBoardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBoardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY = 0;
  private static final int METHODID_CHECK = 1;
  private static final int METHODID_BOARD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TTTServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TTTServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLAY:
          serviceImpl.play((example.grpc.Game.PlayRequest) request,
              (io.grpc.stub.StreamObserver<example.grpc.Game.PlayResponse>) responseObserver);
          break;
        case METHODID_CHECK:
          serviceImpl.check((example.grpc.Game.CheckWinnerRequest) request,
              (io.grpc.stub.StreamObserver<example.grpc.Game.CheckWinnerResponse>) responseObserver);
          break;
        case METHODID_BOARD:
          serviceImpl.board((example.grpc.Game.CurrentBoardRequest) request,
              (io.grpc.stub.StreamObserver<example.grpc.Game.CurrentBoardResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TTTServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TTTServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return example.grpc.Game.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TTTService");
    }
  }

  private static final class TTTServiceFileDescriptorSupplier
      extends TTTServiceBaseDescriptorSupplier {
    TTTServiceFileDescriptorSupplier() {}
  }

  private static final class TTTServiceMethodDescriptorSupplier
      extends TTTServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TTTServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TTTServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TTTServiceFileDescriptorSupplier())
              .addMethod(getPlayMethod())
              .addMethod(getCheckMethod())
              .addMethod(getBoardMethod())
              .build();
        }
      }
    }
    return result;
  }
}
