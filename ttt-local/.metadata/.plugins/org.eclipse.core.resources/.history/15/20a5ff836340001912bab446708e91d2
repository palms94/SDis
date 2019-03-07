package example.grpc.server;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GameServiceImpl extends HelloWorldServiceGrpc.HelloWorldServiceImplBase {

	@Override
	public void greeting(Game.HelloRequest request, StreamObserver<Game.HelloResponse> responseObserver) {

		// HelloRequest has auto-generated toString method that shows its contents
		System.out.println(request);

		// You must use a builder to construct a new Protobuffer object
		HelloWorld.HelloResponse response = HelloWorld.HelloResponse.newBuilder()
				.setGreeting("Hello " + request.getName()).build();

		// Use responseObserver to send a single response back
		responseObserver.onNext(response);

		// When you are done, you must call onCompleted
		responseObserver.onCompleted();
	}

}
