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
    comments = "Source: HelloWorld.proto")
public final class TTTServiceGrpc {

  private TTTServiceGrpc() {}

  public static final String SERVICE_NAME = "example.grpc.TTTService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<example.grpc.HelloWorld.Player1,
      example.grpc.HelloWorld.Player2> getPlay1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "play1",
      requestType = example.grpc.HelloWorld.Player1.class,
      responseType = example.grpc.HelloWorld.Player2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.grpc.HelloWorld.Player1,
      example.grpc.HelloWorld.Player2> getPlay1Method() {
    io.grpc.MethodDescriptor<example.grpc.HelloWorld.Player1, example.grpc.HelloWorld.Player2> getPlay1Method;
    if ((getPlay1Method = TTTServiceGrpc.getPlay1Method) == null) {
      synchronized (TTTServiceGrpc.class) {
        if ((getPlay1Method = TTTServiceGrpc.getPlay1Method) == null) {
          TTTServiceGrpc.getPlay1Method = getPlay1Method = 
              io.grpc.MethodDescriptor.<example.grpc.HelloWorld.Player1, example.grpc.HelloWorld.Player2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "example.grpc.TTTService", "play1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.HelloWorld.Player1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.HelloWorld.Player2.getDefaultInstance()))
                  .setSchemaDescriptor(new TTTServiceMethodDescriptorSupplier("play1"))
                  .build();
          }
        }
     }
     return getPlay1Method;
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
    public void play1(example.grpc.HelloWorld.Player1 request,
        io.grpc.stub.StreamObserver<example.grpc.HelloWorld.Player2> responseObserver) {
      asyncUnimplementedUnaryCall(getPlay1Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlay1Method(),
            asyncUnaryCall(
              new MethodHandlers<
                example.grpc.HelloWorld.Player1,
                example.grpc.HelloWorld.Player2>(
                  this, METHODID_PLAY1)))
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
    public void play1(example.grpc.HelloWorld.Player1 request,
        io.grpc.stub.StreamObserver<example.grpc.HelloWorld.Player2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlay1Method(), getCallOptions()), request, responseObserver);
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
    public example.grpc.HelloWorld.Player2 play1(example.grpc.HelloWorld.Player1 request) {
      return blockingUnaryCall(
          getChannel(), getPlay1Method(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<example.grpc.HelloWorld.Player2> play1(
        example.grpc.HelloWorld.Player1 request) {
      return futureUnaryCall(
          getChannel().newCall(getPlay1Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY1 = 0;

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
        case METHODID_PLAY1:
          serviceImpl.play1((example.grpc.HelloWorld.Player1) request,
              (io.grpc.stub.StreamObserver<example.grpc.HelloWorld.Player2>) responseObserver);
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
      return example.grpc.HelloWorld.getDescriptor();
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
              .addMethod(getPlay1Method())
              .build();
        }
      }
    }
    return result;
  }
}
